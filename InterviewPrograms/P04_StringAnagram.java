package InterviewPrograms;

import java.util.Arrays;

/*  String Anagrams --> An anagram of a string is another string that contains the same characters,
    only the order of characters can be different.
*/

public class P04_StringAnagram {

    // Creating a method
    static boolean isAnagram(String s1,String s2){
        String str1 =s1.replaceAll("\\s","");           // replacing the white spaces in case there one
        String str2 = s2.replaceAll("\\s","");          // replacing the white spaces in case there one

        if (str1.length() != str2.length()){             //both strings length are equal are not, if not it returns false.
            return  false;
        }
        else{                                               // if the conditions returns true,
            char[] c1 = str1.toLowerCase().toCharArray();    // converting the string to lower case and to array
            char[] c2 =str2.toLowerCase().toCharArray();     // converting the string to lower case and to array

            Arrays.sort(c1);                        // Sorting the both arrays.
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);        // if  above arrays are equal, it returns true, else false
        }
    }

    public static void main(String[] args) {
        //  calling the method to main method by using print function.
        System.out.println(isAnagram("LISTEN","SILENT"));
        System.out.println(isAnagram("LIVES","ELVIS"));
        System.out.println(isAnagram("LIVES","ELVI  S"));
        System.out.println(isAnagram("LIVES","LEWIS"));

    }

}
