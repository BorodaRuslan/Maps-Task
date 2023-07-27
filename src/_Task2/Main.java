package _Task2;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProviderProduct product = new ProviderProduct();
        printProduct(searchProduct(product.getAllProducts()));

    }
    public static String searchProduct(Map<String, Integer> listProduct){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone model");
        String phoneModel = scanner.nextLine();

        if (!listProduct.containsKey(phoneModel)){
            return phoneModel + " not found";
        } else {
            return phoneModel + " price: " + listProduct.get(phoneModel) + " $";
        }
    }

    public static void printProduct(String product){
        System.out.println(product);
    }
}
