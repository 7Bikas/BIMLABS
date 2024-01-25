/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orchid;


public class StringExample {
    public static void main(String[] args) {
        String str= "Hello guys";
        //length
        System.out.println("Length :"+str.length());
        //toupper
        System.out.println(str.toUpperCase());
        //to lower 
        System.out.println(str.toLowerCase());
        //charat
        System.out.println("Index 7 ="+str.charAt(7));
        //replace 
        System.out.println(str.replace('H','i' ));
        //equals
        System.out.println(str.equals("I am bikas "));
        //endWith
        System.out.println(str.endsWith("rohan"));
    }
    
}
