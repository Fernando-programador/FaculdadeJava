/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaculdadeInicio;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class UsandoScanner {
   public static void main(String[] args) {
       
    // para usar o scanner digite scan e depois TAB atalho criado por mim
    Scanner sc = new Scanner(System.in);
    int a;
    double b;
    float c;
    String d;
    
    System.out.println("digite sua idade: ");
    a = Integer.parseInt(sc.nextLine());
    
    System.out.println("digite seu peso: ");
    b = Double.parseDouble(sc.nextLine());
    
    System.out.println("digite sua altura: ");
    c = Float.parseFloat(sc.nextLine());
    
    System.out.println("digite o seu nome");
    d = sc.nextLine();
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    
    
    
    sc.close();
    } 
}
