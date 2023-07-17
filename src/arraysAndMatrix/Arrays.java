package arraysAndMatrix;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args){

        // multiplication of matrix
        matrixMultiplication();

        // subArray of an Array
        subArray();

        int[] arr = {1,45,2,3,7,6,59,23,56,8,6,23,569,87,512,45,123,
                548,12,565,2,541,548,9,845,444,8,7,45,78,546,894,564,
                158,456,98,4,7,78,6,8,45,123,4,86,254,4,441,21,51,512,8,7};

        // second-largest number in Array
        secondLargest(arr);

        // third-Smallest number in array
        thirdSmallest(arr);

        //Matrix
        matrix();

    }

    // matrix multiplication
    public static void matrixMultiplication(){

        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{10,11},{20,21},{30,31}};

        int m = a.length;
        int n = b[0].length;
        int p = a[0].length;


        int[][] ans = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = 0;
                for(int k=0;k<p;k++){
                    ans[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    // subArray of an Array
    public static void subArray(){

        int[] arr = {2,5,7,4,9,8,3,6,9,1,4,6,5};
        int[] ans = new int[6];

        int j = 0;
        for(int i=4;i<=9;i++){
            ans[j] = arr[i];
            j++;
        }

        System.out.println();
        System.out.println("subArray of the Array");

        for(int i : ans){
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void secondLargest(int[] arr){

        int max = Integer.MIN_VALUE;
        int secondMax = max-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println();
        System.out.println("Second Largest Number is : " + secondMax);
    }

    public static void thirdSmallest(int[] arr){

        int min = Integer.MAX_VALUE;
        int secondMin = min + 1;
        int thirdMin = secondMin + 1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                thirdMin = secondMin;
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] < secondMin){
                thirdMin = secondMin;
                secondMin = arr[i];
            }
            else if(arr[i] < thirdMin){
                thirdMin = arr[i];
            }
        }

        System.out.println("Third Smallest number is : " + thirdMin);
        System.out.println();
    }


    public static void matrix(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter height of matrix : ");
        int m = sc.nextInt();
        System.out.println("please enter width of matrix : ");
        int n = sc.nextInt();
        System.out.println("please enter elements of the matrix");

        int[][] mat = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        printFirstRow(mat,m,n);

        printLastColumn(mat,m,n);

        diagonalTopLeft(mat,m,n);

        diagonalTopRight(mat,m,n);

    }

    public static void printFirstRow(int[][] mat, int m, int n){

        System.out.println("First row of matrix");
        for(int i=0;i<n;i++){
            System.out.print(mat[0][i] + " ");
        }
        System.out.println();
    }

    public static void printLastColumn(int[][] mat, int m, int n){

        System.out.println("Last Column of matrix");
        for(int i=0;i<m;i++){
            System.out.print(mat[i][n-1] + " ");
        }
        System.out.println();
    }

    public static void diagonalTopLeft(int[][] mat, int m, int n){

        System.out.println("Horizontal diagonal from topLeft to bottomRight");
        int j = 0;
        for(int i=0;i<m;i++){
            System.out.print(mat[i][j] + " ");
            j++;
        }
        System.out.println();
    }

    public static void diagonalTopRight(int[][] mat, int m, int n){

        System.out.println("Horizontal diagonal from topRight to bottomLeft");
        int j = 0;
        for(int i=m-1;i>=0;i--){
            System.out.print(mat[j][i] + " ");
            j++;
        }
        System.out.println();
    }
}
