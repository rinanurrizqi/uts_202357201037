/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2;

/**
 *
 * @author UsEr
 */
public class IPaddress {
    public static void main(String[] args) {
        System.out.println(countIPAddresses("10.0.0.0", "10.0.0.50"));
        System.out.println(countIPAddresses("10.0.0.0", "10.0.1.0"));
        System.out.println(countIPAddresses("20.0.0.10", "20.0.1.0"));
    }
    public static int countIPAddresses(String startIP, String endIP){
        int start = ipToInt(startIP);
        int end = ipToInt(endIP);
        return end - start;
    }
    private static int ipToInt(String ipAddress){
        String[]parts = ipAddress.split("\\.");
        int result = 0;
        for(int i=0; i<4; i++){
            result|= Integer.parseInt(parts[i]) << (24 - (8*i));
                }
                return result;
    }
}
