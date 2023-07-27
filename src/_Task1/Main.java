package _Task1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.println("Initial data:");
        showProductList(storage.productList());
        System.out.println("\nUpdated data:");
        showProductList(storage.updateProductList());

    }
    public static void showProductList(Map<String, Integer> productList){
        StringBuilder stringBuilder = new StringBuilder();
        int cont = 1;
        for (Map.Entry<String, Integer> products: productList.entrySet()){
            System.out.println(cont + ") "+products.getKey() + ", " + products.getValue() + " kg");
            cont++;
        }
    }
}
