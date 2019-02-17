package Account;

//THE MAIN ACCOUNT
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Account {

    private String username = "";
    private String password = "";
    private String email = "";
    private String securityQuestion = "";
    private String securityAnswer = "";
    private double balance = 0;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    //no arg constructor
    Account() {
    }

    //constructor with two arguments int id and double balance
    Account(String username, String password, String email,
            String securityQuestion, String securityAnswer, double balance) {
        this.balance = balance;
        this.username = username;
        this.password = password;
        this.email = email;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        
       
    }

    //methods 
    //Getters
    //returns the date
    public Date getDateCreated() {

        return dateCreated;
    }

    public boolean resetPassword(String newPassword, String repeatPassword){

        if (newPassword.equals(repeatPassword)) {
            this.password = newPassword;
        } else 
            return false;
        return true;
    }

    public void resetSecurityQuestion (String securityQuestion, String securityAnswer){
        
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }
    
    //returns the balance
    public double getBalance() {

        return balance;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPasword(){
        return password;
    }
    

    //Setters
    //withdraws money from the account
    public void withdraw() {
        double withdrawal;
        Scanner in = new Scanner(System.in);

        //check for negative numbers and balance < withdraw
        do {

            System.out.println("Enter the amount to be withdrawn from the account:(Enter a possitive decimal)");
            withdrawal = in.nextDouble();

        } while (withdrawal > balance || withdrawal < 0);

        withdraw(withdrawal);

    }

    public void withdraw(double withdrawal) {

        balance -= withdrawal;
    }

    //deposits money into the account
    public void deposit() {

        double deposit;
        Scanner in = new Scanner(System.in);

        //check for negative numbers
        do {

            System.out.println("Enter the amount to be deposited to the account:(Enter a possitive decimal)");
            deposit = in.nextDouble();

        } while (deposit < 0);

        balance += deposit;

    }

    public void deposit(double deposit) {

        balance += deposit;
    }


 public static void main(String[] args) {
     
      //System.out.println("Successfull wahahahahah muahahahahha");
 }  
}
