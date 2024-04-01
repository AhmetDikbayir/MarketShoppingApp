package marketShoppingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class AppRunner {
    public static void main(String[] args) {

        ProductsService prService = new ProductsService();
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        do{
            System.out.println("Welcome our shopping mall!");
            System.out.println("PLease choose any operation");
            System.out.println("1 ==> Add Product");
            System.out.println("2 ==> List Product");
            System.out.println("0 ==> EXIT");
            selection = scan.nextInt();
            scan.nextLine();
            switch (selection){
                case 1:
                    prService.add();
                    break;
                case 2:
                    prService.list();
                    break;
                case 0:
                    System.out.println("Thank you Have a good day!!");
                    //System.exit(0);
                    break;
            }
        }while (selection != 0);


    }
}
