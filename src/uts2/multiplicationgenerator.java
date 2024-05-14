/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2;

/**
 *
 * @author UsEr
 */
public class multiplicationgenerator {
    private final int a;
    private int b;
    
    public multiplicationgenerator(int a){
        this.a = a;
        this.b = 1;
    }
    public boolean hasNext(){
        return true;
    }
    public String next(){
        String result = a + "x" + b + "=" +(a*b);
        b++;
        return result;
    }
    public static void main(String[] args) {
        multiplicationgenerator generator = new multiplicationgenerator(4);
        
        for(int i=0; i<10; i++){
            System.out.println(generator.next());
        }
    }
}
