package InterviewPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str= "GADAG";
        String str2;
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter String for LogicTwo: ");
        str2=s2.nextLine();
        String rev2="";
        int len2 = str2.length();
        for (int i =0; i<len2;i++){
            rev2=str2.charAt(i)+rev2;
        }
        System.out.print("Results for LogicTwo: "+rev2);
        if (str.equals(rev2)){
            System.out.println("\n"+str2+" --> its a palidrome");
        }
        else {
            System.out.println("\n"+str2+" --> not a palidrome");
        }


    }
}
