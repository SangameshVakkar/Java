package InterviewPrograms;

import java.util.Scanner;

public class P03_OccurrenceOfString {
    public static void main(String[] args) {
        methodOne();
    }
    static  void methodOne(){
        Scanner s1= new Scanner(System.in);
        String str;
        int count=0;
        char grep='g';
        System.out.print("Enter String: ");
        str= s1.nextLine();

        int len= str.length();

        for (int i=0 ; i<len ; i++){
            if (str.charAt(i)==grep){
                count++;
            }
        }
        System.out.println("The occerrence of the char is: "+ count);
    }
}
