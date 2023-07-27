package _Task2;

import java.util.HashMap;
import java.util.Map;

public class ProviderProduct {

    private final Map<String, Integer> product = Map.of("iPhone 11", 1000, "Galaxy Fold5", 1200,
            "Google pixel 6", 800, "Xiaomi redmi note 10", 400, "Motorola 256", 250);
    public Map<String, Integer> getAllProducts(){
        return this.product;
    }

}
