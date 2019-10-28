/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercise6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chuỗi yêu cầu: ");
        String s=sc.nextLine();
        System.out.println("Input : "+s);
        
        System.out.println("Output :"+s.replaceAll("(.+?)\\1+"," REPEAT"));
        
    }
    
}
