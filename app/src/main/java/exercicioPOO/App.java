
package exercicioPOO;

public class App {


    public static void main(String[] args) {
        Invoice inv = new Invoice(1, "mousePad", 20, 10.1f);
        
        System.out.println("quantidade total da compra é: " + inv.getInvoiceAmount());
    }
}
