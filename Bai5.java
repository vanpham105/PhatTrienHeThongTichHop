import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử trong dãy: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double Sduong = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Số thứ "+(i+1)+" là: ");
            	arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
        	if(arr[i]>0) {
        		Sduong = Sduong + arr[i];
        	}
        }
        System.out.printf("Tổng các số nguyên dương là : %.2f", Sduong);
    }
}
