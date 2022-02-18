package InterviewPrograms;

import java.util.Scanner;

public class P05_NumOfVowelsAndConsonants {
    // creating method
     public static void numOfVowelsAndConsonants() {
         Scanner s1= new Scanner(System.in);        // creating object for user input
         System.out.print("Enter the string: ");    // User entering string
         String str=s1.nextLine();                  // user defined string to str
         int vowels = 0;        // empty variables for vowels
         int consonants = 0;    // empty variables for consonants

         String r1=str.toLowerCase();   // converting srt to lowercase


         for (int i = 0; i < r1.length(); i++) {
             char c1 = str.charAt(i);
             if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
                 vowels++;
             } else {
                 consonants++;
             }
         }
         System.out.println("Num of vowels: " + vowels);
         System.out.println("Num of consonants: " + consonants);
     }
    public static void main(String[] args) {
        numOfVowelsAndConsonants();
    }

}
