package marketShoppingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class  ProductsService <T> implements Methods{

    Scanner scan = new Scanner(System.in);
    ArrayList<Vegetables> vgtList = new ArrayList<>();
    ArrayList<Fruit> frtList = new ArrayList<>();
    ArrayList<Beverages> bvgList = new ArrayList<>();


    @Override
    public void list() {

        System.out.println("Which product do you want to list? \n" +
                "1 ==> Vegetables \n" +
                "2 ==> Fruit \n" +
                "3 ==> Beverages");
        int response = scan.nextInt();
        scan.nextLine();
        if(response==1){
            for(Vegetables w : vgtList){
                System.out.println("-------------------");
                System.out.println("Vegetable name : " + w.getName());
                System.out.println("Vegetable price : " + w.getPrice());
                System.out.println("Vegetable stock : " + w.getStock());
                System.out.println("--------------------");
            }
        } else if (response ==2) {
            for(Fruit w : frtList){
                System.out.println("-------------------");
                System.out.println("Fruit name : " + w.getName());
                System.out.println("Fruit price : " + w.getPrice());
                System.out.println("Fruit stock : " + w.getStock());
                System.out.println("--------------------");
            }
        } else if (response ==3) {
            for(Beverages w : bvgList){
                System.out.println("-------------------");
                System.out.println("Beverage name : " + w.getName());
                System.out.println("Beverage price : " + w.getPrice());
                System.out.println("Beverage stock : " + w.getStock());
                System.out.println("--------------------");
            }
        }


    }



    @Override
    public void add() {
        System.out.println("Please enter product category : \n" +
                "1 ==> Vegetable, \n" +
                "2 ==> Fruit, \n" +
                "3 ==> Beverage");
        int ans = scan.nextInt();
        scan.nextLine();
        if(ans == 1){
            System.out.println("Enter vegetable name: ");
            String name = scan.nextLine();

            System.out.println("Enter vegetable price: ");
            Double price = scan.nextDouble();

            System.out.println("Enter vegetable stock: ");
            Integer stock = scan.nextInt();
            scan.nextLine();

            Vegetables vgt = new Vegetables(name, price,stock);
            vgtList.add(vgt);

        }else if(ans == 2){
            System.out.println("Enter fruit name: ");
            String name = scan.nextLine();

            System.out.println("Enter fruit price: ");
            Double price = scan.nextDouble();

            System.out.println("Enter fruit stock: ");
            Integer stock = scan.nextInt();
            scan.nextLine();

            Fruit frt = new Fruit(name, price,stock);
            frtList.add(frt);
        }else if(ans == 3){
            System.out.println("Enter beverage name: ");
            String name = scan.nextLine();

            System.out.println("Enter beverage price: ");
            Double price = scan.nextDouble();

            System.out.println("Enter beverage stock: ");
            Integer stock = scan.nextInt();
            scan.nextLine();

            Beverages bvg = new Beverages(name, price,stock);
            bvgList.add(bvg);
        }

    }
}
