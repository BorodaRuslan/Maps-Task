package _Task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UserData data = new UserData();
        System.out.println("Initial contacts:");
        printContact(data.getAllContacts());
        System.out.println("Updated contacts:");
        printContact(data.updateContacts("Tom", "tomasdev@glob.net"));

    }
    public static void printContact(LinkedHashMap<String, String> contact){
        int count = 1;
        for (Map.Entry<String, String> cont: contact.entrySet()){
            System.out.println(count + ") " + cont.getKey() + " " + cont.getValue());
            count++;
        }

    }
}
