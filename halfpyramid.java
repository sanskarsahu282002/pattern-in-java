import java.util.Scanner;

public class halfpyramid {
    public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
        {
            int i,j;
            for( i = 1;i<=5;i++){
                for (j=1;j<=6-i;j++)
                {
                System.out.print('*');
                }
                System.out.println();

            }
        }
    }
}
