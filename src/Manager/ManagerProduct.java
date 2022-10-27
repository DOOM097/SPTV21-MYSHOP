package Manager;

import Entity.Buyer;
import Entity.Product;
import java.util.Scanner;


public class ManagerProduct {
    private Scanner scanner;

    public ManagerProduct() {
        this.scanner = new Scanner(System.in);
    }

    public Product addproduct() {
        Product product = new Product();
        System.out.println("Введите название продукта");
        product.setProductName(scanner.nextLine());
        System.out.println("Введите цену продукта (целыми числами)");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Количество товара");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();
        return product;
    }

//    private Buyer[] createBuyer(int countBuyersInProduct) {
//        Buyer[] buyers = new Buyer[countBuyersInProduct];
//        for (int i = 0; i < countBuyersInProduct; i++) {
//            Buyer buyer = new Buyer();
//            System.out.print("Имя покупателя "+(i+1)+": ");
//            buyer.setFirstname(scanner.nextLine());
//            System.out.print("Фамилия покупателя "+(i+1)+": ");
//            buyer.setLastname(scanner.nextLine());
//            buyers[i] = buyer;
//        }
//        return buyers;
//    }

    public void printListProducts(Product[] products){
        System.out.println("Продукты: ");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.printf(i+1+". "+
                    "%s"
                    ,product.getProductName());
        }
        System.out.println();
    }

}