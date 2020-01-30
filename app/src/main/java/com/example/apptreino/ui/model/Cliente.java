package com.example.apptreino.ui.model;

import androidx.annotation.NonNull;

public class Cliente {
    private String name;

    public Cliente(){

    }

    public Cliente(String name) {
        this.name = name;

    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

}
