/**
 * File name: $({name}.java
 * Short description:
 * IST 242 Assignment:In class
 *
 * @author HIMANI VOMMI
 * @version 1.16.19
 */
package Model;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hvomm
 */
public class CreateAccount {

    private String username;
    private String password;
    private double balance;
    private Date dateCreated;
    private String securityQuestion;
    private String securityAnswer;
    private String email;
    private ArrayList<Date> transactions;

    Scanner scanner = new Scanner(System.in);
    Date date = new Date();

    // Instance Variables -- define your private data
    // Constructors
    public CreateAccount() {
        System.out.println("Enter a username: ");
        username = scanner.next();
        
       
        do {
            checkPassword();
        } while (checkPassword() < 0);
       
            //System.out.println("Enter a password: ");
        
        System.out.println("Enter a balance: ");
        balance = scanner.nextDouble();

        dateCreated = new Date();

        System.out.println("Enter a security question: ");
        securityQuestion = scanner.next();

        System.out.println("Enter the answer: ");
        securityAnswer = scanner.next();
        
        System.out.println("Enter the email: ");
        email = scanner.next();
        
        //new Account
        System.out.println("Data collected!");
            toString();
        //Account acct = new Account(username, password, email, securityQuestion, securityAnswer, balance);
//        // initialize default values
    }

    public CreateAccount(String username, String password, double balance, Date dateCreated, String securityQuestion, String securityAnswer, String email, ArrayList<Date> transactions) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.dateCreated = dateCreated;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.email = email;
        this.transactions = transactions;
    }

    // Set methods - one set method for each instance variable defined above
    //             - purpose is to pass in a value stored in the private variable
    // Get methods - one get method for each instance variable defined above
    //             - purpose is to return the value stored in the private variable
    // Additional methods -- such as for calculation, display
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        System.out.println(password);
        return password;
    }

    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Date> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Date> transactions) {
        this.transactions = transactions;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        System.out.println("Name: " + this.getUsername());
        System.out.println("Password: " + password);
        System.out.println("Security Q: " + getSecurityQuestion());
        System.out.println("sec a: " + getSecurityAnswer());
        System.out.println("balance: " + getBalance());
        System.out.println("date created: " + getDateCreated().toString());
        System.out.println("Email " + getEmail());
        
        return "";
    }

    public int checkPassword() {
        int result = -1;
        int min = 8;
        int max = 16;
        int digit = 0;
        int special = 0;
        int upCount = 0;
        int loCount = 0;
        String newPassword;
        Scanner scan = new Scanner(System.in);
  
        System.out.println(" Password must be at least " + min + " characters:");
                System.out.println(" You need at least one upper case character:");
                System.out.println(" You need at least one digit:");
                System.out.println(" You need at least one special character:");
        System.out.println(" Enter Your Password:");
        
        newPassword = scan.nextLine();
        if (newPassword.length() >= min && newPassword.length() <= max) {
            for (int i = 0; i < newPassword.length(); i++) {
                char c = newPassword.charAt(i);
                if (Character.isUpperCase(c)) {
                    upCount++;
                }
                if (Character.isLowerCase(c)) {
                    loCount++;
                }
                if (Character.isDigit(c)) {
                    digit++;
                }
                if (c >= 33 && c <= 46 || c == 64) {
                    special++;
                }
            }
            if (special >= 1 && loCount >= 1 && upCount >= 1 && digit >= 1) {
                System.out.println("Password is good:");
                password = newPassword;
                result = 0;
           
                
            }
            
        }
        
        else {

        if (newPassword.length() < min) {

            for (int i = 0; i < newPassword.length(); i++) {
                char c = newPassword.charAt(i);
                if (Character.isLowerCase(c)) {
                    loCount++;
                }
            }

            if (loCount > 0) {
                System.out.println(" Password must be at least " + min + " characters:");
                System.out.println(" You need at least one upper case character:");
                System.out.println(" You need at least one digit:");
                System.out.println(" You need at least one special character:");
               result = -1;
            }
        } else if (newPassword.length() < min && upCount > 1) {
            for (int i = 0; i < newPassword.length(); i++) {
                char c = newPassword.charAt(i);
                if (Character.isLowerCase(c)) {
                    loCount++;
                }
                if (Character.isUpperCase(c)) {
                    upCount++;
                }
            }
            if (loCount > 0 && upCount > 0) {
                System.out.println(" Password must be at least " + min + " characters:");
                System.out.println(" You need at least one digit:");
                System.out.println(" You need at least one special character:");
                result = -1;
          
            }
        }
        if (newPassword.length() > max || newPassword.length() >= max && upCount > 1 && loCount > 1 && digit > 1) {
            System.out.println(" Password is too long. Limit is " + max + " characters:");
            System.out.println(" You need at least one special character:");
            result = -1;
         

        }
        if (newPassword.length() >= min && newPassword.length() <= max && loCount > 0 && upCount > 0 && digit > 0 && special == 0) {
            System.out.println(" You need at least a special character");
            result = -1;
            
        }
        if (newPassword.length() >= min && newPassword.length() <= max && loCount > 0 && upCount > 0 && digit == 0 && special == 0) {
            System.out.println(" You need at least one digit:");
            System.out.println(" You need at least one special character:");
            result = -1;
        
        }
       }
        

        password = newPassword;
        return result;
         
    }
}


