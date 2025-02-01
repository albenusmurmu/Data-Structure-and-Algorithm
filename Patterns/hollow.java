package Patterns;

public class hollow {
    public static void hollow(int totRaws, int totCols){
        for(int i = 1; i<=totRaws; i++){

            for(int j = 1; j<=totCols; j++){
                if(i == 1 || i == totRaws || j == 1 || j == totCols){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public  static void  main(String args[]){
        hollow(4,5);
    }
}
