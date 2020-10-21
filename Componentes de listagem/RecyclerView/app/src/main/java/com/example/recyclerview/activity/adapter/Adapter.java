package com.example.recyclerview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewholder> {

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        Converter o layout em objeto View
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewholder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {

        holder.titulo.setText("Título de teste");
        holder.genero.setText("Comédia");
        holder.ano.setText("2017");

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewholder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView ano;
        TextView genero;


        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero= itemView.findViewById(R.id.textGenero);



        }
    }

}
