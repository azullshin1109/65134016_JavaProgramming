import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String hoTen;
        int tuoi;

        System.out.print("Nhap Ho va Ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();

        System.out.printf("%s năm nay %d tuoi", hoTen, tuoi);
//        System.out.println(hoTen + " năm nay " + tuoi +" tuoi ");
    }
}
