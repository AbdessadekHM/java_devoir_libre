package com.bank;

import lombok.Getter;

public class Banque implements JsonConverter{
    @Getter private String id,pays;

    public Banque(String id, String pays){
        this.id = id;
        this.pays = pays;
    }
}