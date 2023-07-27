package _Task1;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    Map<String, Integer> productList = new HashMap<>();

    public Map<String, Integer> productList (){
        this.productList.put("orange", 12);
        this.productList.put("banana", 25);
        this.productList.put("lemon", 8);
        this.productList.put("pineapple", 13);
        this.productList.put("grape", 9);
        return productList;
    }

    public Map<String, Integer> updateProductList(){
        this.productList.put("orange", 12);
        this.productList.put("banana", 14);
        this.productList.put("plum", 15);
        this.productList.put("lemon", 8);
        this.productList.put("pineapple", 13);
        this.productList.put("grape", 9);
        return productList;
    }

}
