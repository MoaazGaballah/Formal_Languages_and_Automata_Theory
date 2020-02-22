/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author Moaaz
 */
public class q {

    public static void q1(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'b') {
                System.out.println("False");
                return;
            }
        }
        if (str.charAt(0) != 'a') {
            System.out.println("Rejected");
            return;
        }
        if (str.charAt(1) !='b') {
            System.out.println("Rejected");
            return;
        }
        System.out.println("Accepted");
    }
    public static void q3(String str){
        String status = "Rejected";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                System.out.println("False");
                return;
            }
        }
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == '0' && str.charAt(i+1) == '0' && str.charAt(i+2) == '0') {
                status = "Accepted";
            }
        }
        System.out.println(status);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "ab";
        q1(str1);
        String str2 = "011000";
        q3(str2);
    }

}
