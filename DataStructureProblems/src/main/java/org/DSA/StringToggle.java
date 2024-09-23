package org.DSA;

public class StringToggle {

    static String convertUpperLower(String chr){
        char[] arr= chr.toCharArray();
        for(int i=0; i<chr.length(); i++){
            char ch= arr[i];
            if(ch >= 'A' && ch <= 'Z'){
                arr[i] = (char) (ch+32);
            }else if(ch >= 'a' && ch <= 'z'){
                arr[i] = (char) (ch-32);
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String ch= "HelLO";
        String result= convertUpperLower(ch);
        System.out.println(result);
    }
}
