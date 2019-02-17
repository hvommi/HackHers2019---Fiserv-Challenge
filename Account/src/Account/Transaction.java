/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.Date;

public class Transaction {
    
    private String category;
    private double amount;
    private Date dateCreated;
    
     Transaction(){
    }
    
    Transaction(String category, double amount){
        this.category = category;
        this.amount = amount;
        dateCreated = new Date();
    }
    
    String getCategory(){
        return category;
    }
    
    double getAmount(){
        return amount;
    }
    
    Date getDate(){
        return dateCreated;
    }
      

}
