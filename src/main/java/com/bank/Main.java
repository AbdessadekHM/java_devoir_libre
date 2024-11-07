package com.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.time.Instant;
public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque("12321", "maroc");
        Client client1 = new Client("1", "Abdessadek", "Hmiddouch", "marrakech", "2343", "abdessadek6082@gmail.com");
        Client client2 = new Client("2", "Abdessadek", "Hmiddouch", "marrakech", "2343", "abdessadek6082@gmail.com");
        Date currentDate = new Date();
        Instant instant = Instant.now();
        
        client1.addCompte("43214", "mad", currentDate , currentDate, banque);
        client2.addCompte("3r343", "mad", currentDate , currentDate, banque);
        List<Compte> comptes = new ArrayList<>();
        comptes.add(client2.comptes.get(0));
        client1.comptes.get(0).AddTransaction("dfadsf", instant , comptes );

        System.out.println(client1.toJson());
        System.out.println(banque.toJson());



    }
}