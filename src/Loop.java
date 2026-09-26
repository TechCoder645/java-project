public class Loop {
    public static void main(){
//        for(int i=*; i<=5; i++) {      // for loop example
//            System.out.println(i);
//        }

        // Nested loop
        for (int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
