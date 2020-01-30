package com.example.apptreino.ui.ui.clientlist;

import com.example.apptreino.ui.model.Cliente;

import java.util.Comparator;



public class NameComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
