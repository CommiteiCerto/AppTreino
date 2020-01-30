package com.example.apptreino.ui.ui.clientlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptreino.CadastroActivity;
import com.example.apptreino.R;
import com.example.apptreino.ui.adapter.Adapter;
import com.example.apptreino.ui.model.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Cliente> clienteList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerClientes);

        // Listagem de clientes
        this.criarCliente();

        Collections.sort(clienteList, new NameComparator());

        // Configurar adapter
        Adapter adapter = new Adapter(clienteList);

        // Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }

    public void abrirTelaCadastro(View view){
        // Evento de click no botao para ir ate a tela de cadastro
        startActivity(new Intent(this, CadastroActivity.class));

    }

    public void criarCliente(){

        Cliente cliente = new Cliente("Carlos");
        this.clienteList.add(cliente);

        cliente = new Cliente("José");
        this.clienteList.add(cliente);

        cliente = new Cliente("Pedro");
        this.clienteList.add(cliente);

        cliente = new Cliente("João");
        this.clienteList.add(cliente);

        cliente = new Cliente("Maria");
        this.clienteList.add(cliente);

        cliente = new Cliente("Rosa");
        this.clienteList.add(cliente);

        cliente = new Cliente("Adriana");
        this.clienteList.add(cliente);

        cliente = new Cliente("Juka");
        this.clienteList.add(cliente);

        cliente = new Cliente("Zeca");
        this.clienteList.add(cliente);

        cliente = new Cliente("Rubinho");
        this.clienteList.add(cliente);

        cliente = new Cliente("Bernardinho");
        this.clienteList.add(cliente);

        cliente = new Cliente("Alan");
        this.clienteList.add(cliente);

        cliente = new Cliente("Davi");
        this.clienteList.add(cliente);

    }



}
