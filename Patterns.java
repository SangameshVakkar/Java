// video by "  Solve any pattern questions with this trick "

public class Patterns {
    public static void main(String[] args) {
        pattern(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        numpattern(5);
        pattern5(5);
        rombus(5);
    }



    static void pattern(int n ){
        for (int i=1 ; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }




    static void pattern2(int n){
        for (int row=1; row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }




    static void pattern3(int n){
        for (int i=1;i<=n;i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }




    static void pattern4 (int n){
       for (int i=n;i>=1;i--){
           for (int j=1;j<=i;j++){
               System.out.print("& ");
           }
           System.out.println();
       }
       System.out.println("\n\n");
    }




    static void numpattern(int m){
        for (int i=1;i<=m;i++){
            for (int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println("\n\n");
    }





    static void pattern5 (int m){
        for (int row =1 ; row<=2*m;row++){
            int totalColsInRows = row >m ?  2* m - row : row  ;
            for (int cols=1; cols<=totalColsInRows; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\n\n");
    }




    static void rombus(int m){
        for (int row =1 ; row<=2*m;row++){
            int totalColsInRows = row >m ?  2* m - row : row  ;
            int spaces = m-totalColsInRows;
            for (int s =0; s< spaces; s++){
                System.out.print(" ");
            }
            
            for (int cols=1; cols<=totalColsInRows; cols++){
                // System.out.print(cols + " ");
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
