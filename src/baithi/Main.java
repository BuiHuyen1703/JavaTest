 package baithi;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		String FullName, Address, Phone;
		int luongCoban; 
		float tax;
		ArrayList<Customer> danhsach = new ArrayList<Customer>();
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Nhap so luong khach hang:");
			int n = input.nextInt();
			for(int i=1; i<=n ; i++) {
				input.nextLine();
				System.out.println("Nhap thong tin cua khach hang thu "+i);
				System.out.println("Ho va ten:");
				FullName = input.nextLine();
				System.out.println("Dia chi:");
				Address = input.nextLine();
				System.out.println("So dien thoai:");
				Phone = input.nextLine();
				System.out.println("luong co ban:");
				luongCoban = input.nextInt();
				System.out.println("Thuế:");
				tax = input.nextFloat();
				Customer deTails = new Customer(FullName, Address, Phone, luongCoban, tax);
				danhsach.add(deTails);
			}
		}
		for(Customer kaka : danhsach) {
			System.out.println("Thong tin cua khach hang:");
			System.out.println(kaka.toString());
	}
	}
}

