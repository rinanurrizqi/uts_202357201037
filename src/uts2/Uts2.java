/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts2;

/**
 *
 * @author UsEr
 */
public class Uts2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(bestFriend("he headed to the store", 'h', 'e'));//True
        System.out.println(bestFriend("abcdee", 'e', 'e'));//False
        
        System.out.println(bestFriend("abacaba", 'a', 'b'));//False
        System.out.println(bestFriend("ab", 'a', 'b'));//True
    }
    public static boolean bestFriend(String str, char a, char b){
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==a){
                if (i==str.length()-1 ||str.charAt(i+1)!=b){
                    return false;
                }
            }
        }
        return true;
    }
    
}
