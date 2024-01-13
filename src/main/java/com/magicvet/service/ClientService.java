package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientService {

    private static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static String FIRST_LAST_NAME_PATTERN = "[A-Z][a-z]{1,}(-[A-Z][a-z]*)?";

    public Client registerNewClient(){
        Client client = null;

        System.out.println("PLease provide client details.");
        System.out.print("Email:");
        String email = Main.SCANNER.nextLine();
        if(isEmailValid(email)){
            client = buildClient(email);
            System.out.println("New client: " + client.getFirstName() + " " + client.getLastName() + " (" + client.getEmail() + ")");
        } else {
            System.out.println("Provided email is invalid");
        }
        return client;
    }
    private static Client buildClient(String email) {
        Client client = new Client();
        client.setEmail(email);


        client.setFirstName(buildFirstLastName("First name: "));
        client.setLastName(buildFirstLastName("Last name: "));

        return client;
    }

    private static String buildFirstLastName(String msg){
        System.out.print(msg);
        String name = Main.SCANNER.nextLine();
        while (!isNameValid(name)){
            System.out.print(msg);
            name = Main.SCANNER.nextLine();
        }
        return name;
    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private static boolean isNameValid(String name) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
