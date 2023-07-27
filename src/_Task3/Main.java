package _Task3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UserСontacts userСontacts = new UserСontacts();

        Map<String, String> allContacts = userСontacts.getAllContacts();
        allContacts.forEach( (k, v) -> System.out.println(k + " " + v));

        System.out.println("___________");
        Map<String, String> update = userСontacts.updateContacts("Tom", "tomasdev@glob.net");
        update.forEach((k,v)-> System.out.println(k + " " + v));


    }
}
