/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2;

/**
 *
 * @author UsEr
 */
public class shortestword {
    public static void main(String[] args) {
        String input = "This is a simple test string";
        int shortestLength = findShortestWordLength(input);
        System.out.println("The length of the shortest word is: " + shortestLength);
    }
    public static int findShortestWordLength(String str){
        String[] words = str.split("");
        int minLength = Integer.MAX_VALUE;
        
        for(String word : words){
            if(word.length()<minLength){
                minLength = word.length();
            }
        }
        return minLength;
    }
}
