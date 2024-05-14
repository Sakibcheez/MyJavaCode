/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code2024;

/**
 *
 * @author SAKIB AHMED
 */
public class Parse {
    
    public static void main(String[] args) {
        
        int x =Integer.parseInt("9");    // integr to nteger 
      double c = Double.parseDouble("5"); //integer to double
      int b = Integer.parseInt("444",16); // hexa to integer ,(hex number,base) 
      int d = Integer.parseInt("77",8); // octal to integer 
      int e = Integer.parseInt("010001",2);   // binary to integr 

      System.out.println(x);
      System.out.println(c);
      System.out.println(b);
        System.out.println(d); 
        System.out.println(e);
         
    }
 //what is parse ?   
 //    static int parseInt(String s)
//static int parseInt(String s, int radix)
    //s − This is a string representation of decimal.

//radix − This would be used to convert String s into integer.

    
    
}
