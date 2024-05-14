/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2;

/**
 *
 * @author UsEr
 */
public class arithmophobia {
    public static void main(String[] args) {
        String phrase = "Arithmophobia";
        
        if (phrase.matches(".*\\d+.*")){
            System.out.println("Angka yang ditakuti");
        }else {
            System.out.println("");
        }
        
        if (phrase.contains("13")){
            System.out.println("Bukan angka 13");
        }else {
            System.out.println("Angka 13 tidak membuatku takut");
        }
    }
}
