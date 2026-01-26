import java.util.Scanner;
public class Bai10_1_Them {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double canNang, chieuCao, BMI;

        System.out.print("Nhap can nang(kg): ");
        canNang = sc.nextDouble();

        System.out.print("Nhap chieu cao(m): ");
        chieuCao = sc.nextDouble();

        BMI = canNang / Math.pow(chieuCao, 2);

        System.out.printf("Chi so BMI: %.2f\n", BMI);

        if(BMI < 18.5){
            System.out.println("Tinh trang: Gay!");
        } else if (BMI < 25){
            System.out.println("Tinh trang: Binh thuong!");
        } else if (BMI < 30){
            System.out.println("Tinh trang: Thua can!");
        }else{
            System.out.println("Tinh trang: Beo phi!");
        }
    }
}
