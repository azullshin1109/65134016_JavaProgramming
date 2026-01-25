import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten sinh vien: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double diemTb = sc.nextDouble();

        System.out.println("HoTen: "+ hoTen);
        System.out.println("DiemTB: "+ diemTb);
    }
}
