package com.bank;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
public class Client implements JsonConverter, Serializable{
    @Getter private String numClient,nom,prenom,address,phone,email;
    @Getter List<Compte> comptes = new ArrayList<>();
    
    public Client(String numClient, String nom, String prenom, String address, String phone, String email){
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public void addCompte(String numCompte, String devise, Date dateCreated, Date dateUpdated, Banque banque){
        Compte compte = new Compte(numCompte,devise,dateCreated,dateUpdated, banque);
        comptes.add(compte);
    }


}