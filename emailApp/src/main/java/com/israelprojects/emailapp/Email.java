/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.israelprojects.emailapp;

import java.util.Scanner;

/**
 *
 * @author Akeila
 */
public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private int mailboxCapacity = 500;
   private String department;
   private String alternateEmail;
   private final  String  companyName = "fun";
   private final int defaultPasswordLength = 10;
   private String email;
   
   //constructor to receive first name and last name
   public Email(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName; 
       System.out.println(" Email Created");
       
       //Call a method that ask for and sets the depatment 
       this.department = setDepartment();
       
       
       //Call a method that returns a random password
       this.password  = randomPassword(defaultPasswordLength);
       System.out.println("Password " + this.password);
       
       //Genarate email
       this.email = emailGenarator() ;
       
   }
   //ask for the department 
   private String setDepartment(){
       System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for other\nEnter Department Code: ");
       Scanner input = new Scanner(System.in);
       int depChoice = input.nextInt();
       switch (depChoice){
           case 1 -> {
               return "Sales";
           }
           case 2 -> {
               return "Development";
           }
           case 3 -> {
               return "Accounting";
           }
           default -> {
               return "";
           }
           
       }
       
   }
   
   
   //Genarate a random password 
   private String randomPassword(int length){
       String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
       char[] password = new char[length];
       for (int i = 0; i<length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
           
       }
       return new String (password);
   }
   
   //create the Email
   private String emailGenarator(){
       String email = this.firstName + "." + this.lastName + "@" + this.department + "." + this.companyName ;
       return email;
   }
   
   //set mailboxCapasity
   public void setmailboxCapasity(int capacity){
       this.mailboxCapacity = capacity;
   }
   
   //set the alternate email
   public void setAlternativeEmail(String email){
       this.email = email;
   }
   
   //change the password 
   public void setPassword(String password){
       this.password = password;
       System.out.println("Password was change ");
   }
   
   public int getMailboxCapacity(){ return this.mailboxCapacity ;}
   public String getAlternateEmail(){ return this.alternateEmail;}
   public String getPassword() { return this.password;}
   
   
   public String show(){
       return " User Name: " + firstName + " " +lastName +
              "----- Email: " + email +
              "----- Department: " + department +
              "----- Company Name: " + companyName + 
              "----- Mail Box Capacity: " + mailboxCapacity ;
   }
}
