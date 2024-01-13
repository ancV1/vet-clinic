package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.ClientService;
import main.java.com.magicvet.service.PetService;

public class ApplicationRunner {

    private final ClientService clientService = new ClientService();
    private final PetService petService = new PetService();

    public void run(){
        if(Authenticator.auth()) {
            Client client = clientService.registerNewClient();

            if(client != null) {
                System.out.print("Do you want add a new pet now?(yes / no):");
                String answer = Main.SCANNER.nextLine();
                if(answer.equals("yes")){
                    System.out.println("Adding a new pet.");

                    Pet pet = petService.registerNewPet();
                    client.setPet(pet);

                    pet.setOwnerName(client.getFirstName() + " " + client.getLastName());
                    System.out.println("Pat has been added.");

                    System.out.println(client);
                }
            }
        }
    }
}
