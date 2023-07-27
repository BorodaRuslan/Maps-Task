package _Task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserData {

    public LinkedHashMap<String, String> contacts = new LinkedHashMap<>(Map.of("Tom", "tom@mail.com", "Lisa", "lisa@mail.com",
            "Alice", "alisa@mail.com", "Denis", "den@mail.com"));
    public LinkedHashMap<String, String> getAllContacts(){
        return this.contacts;
    }

    public LinkedHashMap<String, String> updateContacts(String name, String email){
        contacts.replace(name, email);
        return contacts;

    }
}
