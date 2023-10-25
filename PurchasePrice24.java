import java.util.Scanner;

/**
 * PurchasePrice24
 */
public class PurchasePrice24 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int price, quantity;
        double discount=0.1, totalPrice, purchasePrice, totalDiscount;
        System.out.println("Input Price: ");
        price=input.nextInt();
        System.out.println("Input quantity: ");
        quantity=input.nextInt();
        totalPrice=price*quantity;
        totalDiscount=totalPrice*discount;
        purchasePrice=totalPrice-totalDiscount;
        System.out.print("Total discount: "+ totalDiscount);
        System.out.print("Final purchase price: "+purchasePrice);
    }
}