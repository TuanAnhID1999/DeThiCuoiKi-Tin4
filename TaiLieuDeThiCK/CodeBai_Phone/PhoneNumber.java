package Phoneeee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Formatter;
import java.util.Scanner;

public class PhoneNumber {
	private Phone [] phones;
	private int n;
	public static void main(String[] args) throws FileNotFoundException {
		PhoneNumber pm = new PhoneNumber();
		pm.convertListtoString("phone");
		System.out.println("Tra ra sp cos so luong = 0 : ");
		pm.getSoldOutItems();
		System.out.println("Danh sach da sx : ");
		pm.SortByPrice();
	}
	
	public void convertListtoString (String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		n = sc.nextInt();
		phones = new Phone[n];
		while ( sc.hasNext()) {
			for ( int i = 0; i < n; i++ ) {
				sc.nextLine();
				String name = sc.nextLine();
				String brand = sc.nextLine();
				double price = sc.nextDouble();
				int quality = sc.nextInt();
				phones[i] = new Phone(name, brand, price, quality);
			}
			sc.nextLine();
		}
		//PrintStream ps = new PrintStream(new File("printPhone"));
		for ( int i = 0; i < n; i++ ) {
			//ps.println(phones[i].toString());
			System.out.println(phones[i].toString());
		}
		}
	public void getSoldOutItems() {
		
		for ( int i = 0; i < n; i++ ) {
			if ( phones[i].getQuality()==0) {
				System.out.println(phones[i].toString());
			}
		}
	}
	public void SortByPrice() {
		Phone tmp = new Phone();
		for ( int i = 0; i < n-1; i++ ) {
			for(int j=i+1; j < n; j++ ) {
				if ( phones[i].getPrice() > phones[j].getPrice()) {
					tmp = phones[i];
					phones[i] = phones[j];
					phones[j] = tmp;
				}
				if ( phones[i].getPrice() == phones[j].getPrice()) {
					if( phones[i].getName().compareTo(phones[j].getName())>0) {
						tmp = phones[i];
						phones[i] = phones[j];
						phones[j] = tmp;
					}
				}
			}
		}
		for ( int i = 0; i < n; i++ ) {
			System.out.println(phones[i].toString());
		}
	}
}
