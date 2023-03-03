/*
5) Escreva um programa que inverta os caracteres de um string.
*/

public class Reverse {
    public static void main(String[] args) {
        String alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(reverse(alf));
        
    }
    
    static String reverse(String alf){
        char [] reverse = new char [alf.length()];
        String reverseString = "";
        for (int i = 0; i < alf.length(); i++){
            reverse[i] = alf.charAt(i);
        }
        
        for (int j = alf.length() - 1; j >= 0; j--){
            reverseString = reverseString + reverse[j];
        }
        
        return reverseString;
    }
}