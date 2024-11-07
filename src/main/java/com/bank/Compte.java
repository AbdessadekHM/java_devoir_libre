package com.bank;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
public class Compte implements JsonConverter{
    @Getter private String numCompte, devise;
    @Getter private String dateCreated, dateUpdated;
    @Getter List<Transaction> transactions = new ArrayList<>();
    @Getter Banque banque;

    public Compte(String numCompte, String devise, Date dateCreated, Date dateUpdated, Banque banque){
        this.numCompte = numCompte;
        this.devise = devise;
        this.banque = banque;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        this.dateCreated = formatter.format(dateUpdated);
        this.dateUpdated = formatter.format(dateUpdated);
    }

    @SuppressWarnings("unchecked")
    public void AddTransaction(String reference, Instant timeStamp,List<Compte> comptes){
        List<Compte> newComptes = new ArrayList<>();
        newComptes.add(this);
        newComptes.addAll(comptes);
        Transaction transaction = new Transaction(reference, timeStamp, newComptes);
        transactions.add(transaction);
    }



}