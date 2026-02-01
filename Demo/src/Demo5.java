import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so: ");
        double n = sc.nextDouble();

        if(n>0){
            double can = Math.sqrt(n);
            System.out.println("Can bac hai cua " + n + " la: " + can);
        }else{
            System.out.println("Khong phai la so duong!");
        }

        sc.close();
    }
}
