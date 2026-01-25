//Nhap tu ban phim
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap diem mon A: ");
        double a = sc.nextDouble();

        System.out.print("Nhap diem mon B: ");
        double b = sc.nextDouble();

        System.out.print("Nhap diem mon C: ");
        double c = sc.nextDouble();

        double diemTB=(a*2+b+c)/4;

        System.out.println("Diem TB: "+diemTB);
    }
}
