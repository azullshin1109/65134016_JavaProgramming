import java.util.Random;

public class Demo4_1 {
    public static void main(String[] args){
        Random rd = new Random();

        int n = rd.nextInt(8)+5;

        System.out.println("So ngau nhien: "+n);
        System.out.println("Can bac hai: "+ Math.sqrt(n));
    }
}
