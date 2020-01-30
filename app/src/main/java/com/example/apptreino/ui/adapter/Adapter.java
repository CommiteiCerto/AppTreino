package com.example.apptreino.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptreino.R;
import com.example.apptreino.ui.model.Cliente;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Cliente> clienteList;

    public Adapter(List<Cliente> list){
        this.clienteList = list;
    }



    // Método para criar as visualizacoes
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Converter xml em um objeto do tipo view para exibir na lista
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista_cliente, parent, false);
       // Instanciando o objeto
        return new MyViewHolder(itemLista);
    }
    // Exibe as visualizacoes
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Cliente cliente = clienteList.get(position);
        holder.nomeCliente.setText(cliente.getName());

    }
     // Retorna a quantidade de itens que serao exibidos
    @Override
    public int getItemCount() {
        return clienteList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nomeCliente;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeCliente = itemView.findViewById(R.id.textNomeCliente);
        }
    }

}
