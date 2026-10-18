public class BasicMaths {
//    public static void printDigits(int num){
//        // agar mere num=0, toh main rukiaunga
//        // agar mere num=!, toh main processing krta hu
//
//        while(num !=0){
//            int digit = num %10;
//            System.out.println(digit);
//            // last remove digit
//            num =num/10;
//        }
//    }

//    // count digit of all number
//    public static int countDigits(int num){
//       int count=0;
//        while(num !=0){
//            int digit = num %10;
//            count++;
//            // last remove digit
//            num =num/10;
//        }
//        return count;
//    }

//    // sum of digit of number
//    // count digit of all number
//    public static int sumDigits(int num){
//        int sum=0;
//        while(num !=0){
//            int digit = num %10;
//            sum= sum+ digit;
//            // last remove digit
//            num =num/10;
//        }
//        return sum;
//    }
//    static  int reverseNum(int num){             //this code also include in palindrom
//        int revNum=0;
//        // ans= ans*10+currentDigit
//        while (num!=0){
//            int digit=num%10;
//            //reverse num cal as a formula
//            revNum= revNum*10+digit;
//            // last digit remove karna pdega num me se
//            num= num/10;
//        }
//        return revNum;
//    }
//
//    static boolean isPalindrome(int num) {
//        int originalNum = num;
//        int reversedNum = reverseNum(num);
//
//        if (originalNum == reversedNum) {
//            System.out.println("It is a palindrome");
//            return true;
//        } else {
//            System.out.println("It is not a palindrome");
//            return false;
//        }
//    }

//    //armstrongNumber abc=a^3+b^3+c^3
//    static boolean isArmstrongNumber(int num){
//        int sum= 0;
//        int originalNum= num;
//        while (num !=0){
//            int digit= num%10;
//            int cubeOfDigit= digit* digit*digit;
//            sum=sum+cubeOfDigit;
//            // digit remove from num
//            num =num/10;
//        }
//        if(sum==originalNum){
//            return true;
//        }else {
//            return false;
//        }
//    }

//    // perfect number
//    static boolean checkPerfectNumber(int num){
//        int sum=1;
//        for(int i=2; i*i<=num; i++){
//            if(num %i==0){
//               // i ne num ko perfctly divide krdia h
//               //tph ab factor pair kya banega
//               //1st factor ->i
//               // 2nd factor -> num/i
//               int firstFactor=i;
//               int secondFactor= num/i;
//               sum= sum+firstFactor+ secondFactor;
//            }
//        }
//        if(sum==num){
//            return true;
//        }else {
//            return false;
//        }
//    }
// Check whether a number is prime
static boolean isPrimeOrNot(int num) {

    if (num < 2) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;
}

    // Print all prime numbers from 1 to n

    static  void  printAllPrimes(int n){
        // print all prime number from 1 to n
        // 1 is not a prime number
        for(int num=2; num<=n; num++){
            boolean isPrime= isPrimeOrNot(num);
            if(isPrime==true){
                System.out.println(num);
            }
        }
    }

    public static void main(){
//        int num= 53127;
//        printDigits(num);

//        int num= 53127;
//        int ans = countDigits(num);     for count digit
//        System.out.println(ans);


//        int num= 53127;
//       int sum = sumDigits(num);   for sum digit
//       System.out.println(sum);

//        int num= 53127;
//        int revNum= reverseNum(num);
//        System.out.println(revNum);
//
//        boolean ans=isPalindrome(121);
//        System.out.println(ans);
//        System.out.println( isArmstrongNumber(153));
//        System.out.println(checkPerfectNumber(6));
        printAllPrimes(10);
    }
}
