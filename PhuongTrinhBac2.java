import java.util.Scanner;
public class PhuongTrinhBac2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Hệ số bậc 2 a = ");
        float a = PhuongTrinhBac2.scanner.nextFloat();
        System.out.print("Hệ số bậc 1 b = ");
        float b = PhuongTrinhBac2.scanner.nextFloat();
        System.out.print("Hệ tự do c = ");
        float c = scanner.nextFloat();
        PhuongTrinhBac2.GiaiPT(a,b,c);
    }
    public static void GiaiPT(float a, float b, float c) {
        if (a==0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");

            } else {
                System.out.println("Phương trình có 1 nghiệm kép: " + "x= " + (-c/b));
            }
            return;

        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0 ) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println(" PT có 2 nghiệm là: "
                + "x1 = " + x1 + " và x2 = " + x2);

        } else if (delta ==0) {
            x1 = (-b / (2 * a));
            System.out.println("PT có nghiệm kép: "
                + "x1 = x2 = " + x1);

        } else {
            System.out.println("PT vô nghiệm");
        }
    }
    }

