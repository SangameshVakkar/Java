public  class ArrayPatterns {
    
    public static void main(String[] args) {
        int m=4;
        int n=5;
        for (int i=1 ; i <=m;i++){
            for (int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n ");
        //hollow rectangle
        for (int k=1;k<=m;k++){
            for (int l=1; l<=n; l++){
                if (k==1 || l==1 || k==m || l==n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        // piramid

        for (int x=m;x>=1;x--){
            for (int j=1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("\n");

        for (int c=1;c<=m;c++){

            for (int d =1; d<=m-c;d++){
                System.out.print(" ");
            }

            for (int e=1; e<=c; e++){
                System.out.print("*");
            }
            System.out.println();
            

        }
    }
}