package com.osh.Quizapp.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;

    public String getResponse() {
        return response;
    }

}
