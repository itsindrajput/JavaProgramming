public class SqPattern {
    public static void main(String []args){
        for (int i=1; i<=6; i++){
            if(i>=2 && i<=5){
                System.out.print("*");
                for(int j = 1; j<=4; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            else {
                for(int k=1; k<=6; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
