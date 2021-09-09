package ChuThuong_Hoa;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server =new ServerSocket(9700);
			System.out.println("server dc tao");
			Socket client = server.accept();
			Scanner getdata=new Scanner(client.getInputStream());
			PrintStream outdata=new PrintStream(client.getOutputStream());
			outdata.println("nhap chuoi: ");
			String ten=getdata.nextLine();
			String chuoi=ten.toUpperCase();
					//StringBuffer(ten).reverse().toString();
			outdata.println(chuoi);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}


}

