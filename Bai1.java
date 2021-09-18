import java.util.Scanner;
public class Bai1{
    public static void main(String[] args){
        Scanner total = new Scanner(System.in);
        String message;
        System.out.println("Nhập chuỗi kí tự: ");
        message = total.nextLine();
        System.out.println("KQ IN HOA: ");
        System.out.println(message.toUpperCase());
    }       
}