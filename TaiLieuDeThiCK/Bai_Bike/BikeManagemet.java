import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BikeManagemet {
    private Bike [] bikes;
    int n;

    public BikeManagemet(){

    }

    public void converListToString ()  {
        File file = new File("input.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        n = sc.nextInt();
        bikes = new Bike[n];
        while ( sc.hasNext()) {
            for ( int i = 0; i < n; i++ ) {
               sc.nextLine();
                String name = sc.nextLine();
                String brand = sc.nextLine();
                double price = sc.nextDouble();
                int quality = sc.nextInt();
                bikes[i] = new Bike(name, brand, price, quality);
            }
            sc.nextLine();
        }
        //PrintStream ps = new PrintStream(new File("printPhone"));
        for ( int i = 0; i < n; i++ ) {
            //ps.println(phones[i].toString());
            System.out.println(bikes[i].toString());
        }
    }


    public void getSoldOutItems() {

        for ( int i = 0; i < n; i++ ) {
            if ( bikes[i].getQuantily()==0) {
                System.out.println(bikes[i].toString());
            }
        }
    }
    public void SortByPrice() {
        Bike tmp = new Bike();
        for ( int i = 0; i < n-1; i++ ) {
            for(int j=i+1; j < n; j++ ) {
                if ( bikes[i].getPrice() > bikes[j].getPrice()) {
                    tmp = bikes[i];
                    bikes[i] = bikes[j];
                    bikes[j] = tmp;
                }
                if ( bikes[i].getPrice() == bikes[j].getPrice()) {
                    if( bikes[i].getName().compareTo(bikes[j].getName())>0) {
                        tmp = bikes[i];
                        bikes[i] = bikes[j];
                        bikes[j] = tmp;
                    }
                }
            }
        }
        for ( int i = 0; i < n; i++ ) {
            System.out.println(bikes[i].toString());
        }
    }





    public static void main(String[] args) throws IOException {
        BikeManagemet bikeManagemet = new BikeManagemet();
        bikeManagemet.converListToString();
        System.out.println("Tra ra sp cos so luong = 0 : ");
        bikeManagemet.getSoldOutItems();
        System.out.println("Danh sach da sx : ");
        bikeManagemet.SortByPrice();
    }
}
