import java.util.Scanner;
public class TinhTong {
    public static void main (String[] args) {
        int num, Sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        num = sc.nextInt();
        for(int i = 1; i<= num; ++i)
        {
            Sum += i;

        }
        System.out.println("Tổng từ 1 đến " + num +" là: \n" + Sum);
    }
    
}
