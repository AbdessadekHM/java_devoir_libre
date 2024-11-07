package com.bank;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface JsonConverter {
    default String toJson(){
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            return objectMapper.writeValueAsString(this);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}