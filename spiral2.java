
import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n =3;
        int left = 0;

        int right = n-1;
        int top =0;
        int bottom = n-1;
        int[][] matrix = new int[n][n];
        int num = 1;
        while(top<=bottom && left<=right){

            for(int i =left;i<=right;i++){
                matrix[top][i] = num;
                num++;
            }
            top++;
            for(int i= top ; i<=bottom;i++){
                matrix[i][right] = num;
                num++;
            }
            right--;
            if(top<= bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = num;
                    num++;
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = num;
                    num++;
                }
                left++;
            }


        }

        System.out.print(matrix[0][0]);
        System.out.print(matrix[0][1]);
        System.out.println(matrix[0][2]);
        System.out.println("--");

        System.out.print(matrix[1][0]);
        System.out.print(matrix[1][1]);
        System.out.println(matrix[1][2]);
        System.out.println("--");
        System.out.print(matrix[2][0]);
        System.out.print(matrix[2][1]);
        System.out.println(matrix[2][2]);




    }}


//    public void generateMatrix(int n) {
//         int left = 0;
//         int right = n-1;
//         int top =0;
//         int bottom = n-1;
//         int[][] matrix = new int[n][n];
//
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.println(matrix[i][j]);
//             }
//
//         }
//
//
//    }
//}
