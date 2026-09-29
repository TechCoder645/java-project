public class method {

    // Your custom method
    public static void print2kaTable() {
     for(int i=1; i<=10; i++){
         int ans =2*i;
         System.out.println("->"+ ans);
     }
    }

    public static void main(String[] args) {
        // Calling the method inside main
        System.out.println("hi");
        print2kaTable();
        System.out.println("bye" +
                "");
    }
}