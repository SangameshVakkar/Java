package InterviewPrograms;

import java.util.Scanner;

public class P01_ReverseString {
    public static void main(String[] args) {
        LogicOne();
        System.out.println("\n");
        LogicTwo();

    }
    static void LogicOne(){
        Scanner s1= new Scanner(System.in);
        String str1;
        System.out.print("Enter String for LogicOne: ");
        str1=s1.nextLine();
        String rev1= "";
        int len1 = str1.length();
        for (int i= len1 -1 ; i>=0;i--){
            rev1 = rev1+str1.charAt(i);
        }
        System.out.print("Logic one: "+rev1);
        System.out.println("\n"+len1);

    }
    static void LogicTwo(){
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
    }
}
