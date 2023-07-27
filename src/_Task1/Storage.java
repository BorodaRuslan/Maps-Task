package _Task1;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    public Map<String, Integer> productList (){
        Map<String, Integer> productList = new HashMap<>();
        productList.put("orange", 12);
        productList.put("banana", 25);
        productList.put("lemon", 8);
        productList.put("pineapple", 13);
        productList.put("grape", 9);
        return productList;
    }

    public Map<String, Integer> updateProductList(){
        Map<String, Integer> updateProductList = new HashMap<>();
        updateProductList.put("orange", 12);
        updateProductList.put("banana", 14);
        updateProductList.put("plum", 15);
        updateProductList.put("lemon", 8);
        updateProductList.put("pineapple", 13);
        updateProductList.put("grape", 9);
        return updateProductList;
    }

}
