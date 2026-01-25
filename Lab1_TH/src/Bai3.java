import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh khoi lap phuong: ");
        double a = sc.nextDouble();

        double theTich = Math.pow(a, 3);

        System.out.println("The tich KLP: "+theTich);
    }
}
