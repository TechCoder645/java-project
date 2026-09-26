import javax.crypto.spec.PSource;
import java.sql.SQLOutput;

public class datatype {
    public static void main(String[] args){
        // numeric DT - short, byte,int, long
        byte num1=127;
        System.out.println(num1);
        short num2= 3227;
        System.out.println(num2);
        int num3=400;
        System.out.println(num3);
        long num4=2345788;
        System.out.println(num4);

        //floating DT
        float num5= 3.142345f;
        System.out.println(num5);
        double num6=3.13565788889;
        System.out.println(num6);

        // other- char ,boolean
        boolean eligibleToVote= true;
        System.out.println(eligibleToVote);
        char firstCharacter='a'; // if we use char value we nedd to use single qotion i.e ''  .
        System.out.println("my first characteris:"+(char)( firstCharacter+2));

    }
}
