import java.util.Scanner;
public class KTSoNguyenTo {
    boolean KTSNT (int n) {
    for(int i = 2; i<= Math.sqrt(n) ; i++)
    {
        if ( n%i ==0) 
        {
            return false;
        }
    }
    return true;
}
public static void main(String args[]) {
    Scanner output = new Scanner(System.in);
    System.out.printf("Nhập vào số :");
    int n = output.nextInt();
    KTSoNguyenTo SNT = new KTSoNguyenTo();
    if(SNT.KTSNT(n)) {
        System.out.printf("Số : " + n + " là số nguyên tố");
    } else {
        System.out.printf(" Số : " + n + " không phải là số nguyên tố");
    }
}
}
