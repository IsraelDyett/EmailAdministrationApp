/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.israelprojects.emailapp;

import java.util.Scanner;
/**
 *
 * @author Akeila
 */
public class EmailApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name[] = input.nextLine().split(" ",2);
        
        //System.out.println("hello " + name[0]+ name[1]);
        Email email1 = new Email(name[0], name[1]);
        
        System.out.println("Do you want to change your password [Y] or [N]: ");
        String changePassword = input.nextLine();
        if ("Y".equals(changePassword) || "y".equals(changePassword)){
            System.out.println("Please enter your new password: ");
            String password = input.nextLine();
            email1.setPassword(password);
        }
      
        System.out.println(email1.show());
    }
}
