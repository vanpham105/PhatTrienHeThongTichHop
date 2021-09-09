package ChuThuong_Hoa;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket client =new Socket("LocalHost",9700);
			System.out.println(" client dc tao");
			
			Scanner getdata= new Scanner(client.getInputStream());
			PrintStream outdata=new PrintStream(client.getOutputStream());
			System.out.println("server " +getdata.nextLine());
			Scanner nhap= new Scanner(System.in);
			String ten=nhap.nextLine();
			outdata.println(ten);
			System.out.println(getdata.nextLine());
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

