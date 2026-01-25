import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();

        double chuVi = (dai+rong)*2;
        double dienTich = dai*rong;
        double canhNho = Math.min(dai, rong);

        System.out.println("Chu Vi: "+chuVi);
        System.out.println("Dien tich: "+dienTich);
        System.out.println("Canh Nho: "+canhNho);
    }
}

