public class pattern {
    public static void main(String[] args) {
        //  for square pattern
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            // for each row -> n columns
//            for (int col = 1; col <= n; col++) {
//                // print star
//                System.out.print("* ");
//        }
//        // move next line or row
//        System.out.println();
//    }

//        // for rectange
//        int n = 3;
//        for (int row = 1; row <= n; row++) {
//            // for each row -> n columns
//            for (int col = 1; col <= 5; col++) {    // here we use col 5
//                // print star
//                System.out.print("* ");
//            }
//            // move next line or row
//            System.out.println();
//        }

//        // for triangle
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            // for each row -> variables columns
//            // formula -> col -> value of row
//            for (int col = 1; col <= row; col++) {
//                // print star
//                System.out.print("* ");
//            }
//            // move next line or row
//            System.out.println();
//        }

//        // soild rohmubs
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            // for each row -> spaces, stars
//
//            // spaces
//            for (int col = 1; col <= n-row; col++) {
//                System.out.print(" ");
//            }
//            // stars
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//            // move next line or row
//            System.out.println();
//        }

//        // inverted rectange
//        int n = 5;
//          for (int row = 1; row <= n; row++) {
//           // for each row -> variables columns
//           // formula
//            for (int col = 1; col <= n-row+1; col++) {
//                // print star
//               System.out.print("* ");
//          }
//          // move next line or row
//           System.out.println();
//      }

//        //pyramid pattern
//
//        int n=5;
//        for(int row=1; row<=n; row++){
//            // for each row -> variable colums
//            // space
//            for(int  col=1; col<=n-row; col++){
//                System.out.print(" ");
//            }
//            // stars
//            for(int col=1; col<=2*row-1; col++){
//                System.out.print(" *");
//            }
//            // move next line
//            System.out.println();
//            }

//        // inverted pyramid
//        int n=4;
//        for (int row=1; row<=n; row++) {
//            // for each row -> variable colums
//            // space
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print(" ");
//            }
//            // stars
//            for (int col = 1; col <= 2*n - 2*row + 1; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        // holow rectange
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row -> 6 columns
//            for (int col = 1; col <= 6; col++) {
//
//                if (row == 1 || row == n) {
//                    System.out.print("* ");
//                } else {
//
//                    // middle row
//                    if (col == 1) {
//                        System.out.print("* ");
//                    } else if (col == 6) {
//                        System.out.print("* ");
//                    } else {
//                        // middle column
//                        System.out.print("  ");
//                    }
//                }
//            }
//
//            // move to next row
//            System.out.println();
//        }

//        // hollow right angle triangle
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            if (row == 1 || row == n) {
//
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//
//            } else {
//
//                // First star
//                System.out.print("* ");
//
//                // Middle spaces
//                for (int col = 1; col <= row - 2; col++) {
//                    System.out.print("  ");
//                }
//
//                // Last star
//                System.out.print("* ");
//            }
//
//            // Move to next row
//            System.out.println();
//        }

//        // triangle using numeric value
//        int n=5;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                System.out.print(col+"");
//            }
//            System.out.println();
//        }
//
//        int n=5;
//        int count=1;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }
        // output
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        // triangle chacter pattern
        int n=5;
        char ch='A';
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        // output4

//        A
//        B C
//        D E F
//        G H I J
//        K L M N O

    }
    }