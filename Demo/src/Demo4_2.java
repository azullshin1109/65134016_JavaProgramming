import java.util.Scanner;
public class Demo4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a, b;

        System.out.print("Nhap a: ");
        a = sc.nextDouble();

        System.out.print("Nhap b: ");
        b = sc.nextDouble();

        double luythua = Math.pow(a, b);
        System.out.println("Luy thua a va b: " + luythua);

        double min = Math.min(a,b);
        System.out.println("Gia tri nho nhat cua 2 so la: " + min);
    }
}
