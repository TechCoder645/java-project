import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
//        //  taking input in arrays
//        int arr[]= new int[5];
//        Scanner sc= new Scanner(System.in);
//        int n=  arr.length;
//        for(int i=0; i<=n-1; i++) {
//            System.out.println("provide input for index "+i);
//            arr[i] = sc.nextInt();
//        }
//        // Print we ude for each loop
//        System.out.println("for your array contains");
//        for(int val:arr){
//
//            System.out.println(val);
//        }

        // 2d arrays
        //decalartion
        int [][] arr;
        // allocation
        arr= new int[3][4];
        //int
        int[][] brr={
                {1,2},{2,3},{3,4},{4,5}
        };
       // System.out.println(brr[0][0]);
        int rowLength= brr.length;
        int colLength= brr[0].length;

        for(int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
            for(int colIndex=0; colIndex<=colLength-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex]+ " ");
            }
            System.out.println();
        }

    }
}
