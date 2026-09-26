public class conditionals {
    public static void main(String[] args){
//        int age =10;
//        if (age>= 18){
//            System.out.println("You are eligible to vote");
//        }


//     int score= 45;
//      if (score>=50) {
//          System.out.println("pass");
//      }else{
//              System.out.println("fail");
//          }

//        int accuracy= 78;
//        if (accuracy>=90){
//            System.out.println("Excellent");
//        }else if( accuracy >=75){
//            System.out.println("Good");
//        }else if(accuracy >=60){
//            System.out.println("Average");
//        }
//        else{
//                System.out.println("Needs Improvement");
//            }

        // nested if else

        int age= 18;
        char gender= 'M';
        if (gender== 'M'){
            System.out.println("You are a male");
            if(age>18){
                System.out.println("You are a male and age > 18");
            }else{
                System.out.println("You are a male and age <=18");
            }
        }else{
            System.out.println("You are not a male");
            if(age> 18){
                System.out.println( "You are not a male and age >18");
            }else{
                System.out.println("You are not a male and age <=18");
            }
        }

    }
}
