import java.util.Scanner;
public class Diem {
public static void main(String[] args) {
	double xA, yA;	// tọa độ điểm A
	double xB, yB;	// tọa độ điểm B
	double dodaiAB;	// độ dài đoạn thắng AB
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập tọa độ điểm A: ");
	System.out.println("Nhập hoành độ:");
	    xA = scanner.nextDouble();
	System.out.println("Nhập tung độ: ");
	    yA = scanner.nextDouble();
		
	System.out.println("\nNhập tọa độ điểm B: ");
	System.out.println("Nhập hoành độ: ");
	    xB = scanner.nextDouble();
	System.out.println("Nhập tung độ: ");
	    yB = scanner.nextDouble();
	    dodaiAB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
	System.out.println("Độ dài đoạn thắng AB là: " + dodaiAB);
}
}