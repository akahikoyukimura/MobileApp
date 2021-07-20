package com.example.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Models.MainModel;
import com.example.myapplication.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder>{

    ArrayList<MainModel> list;
    Context context;

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public viewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_main_animal,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull viewholder holder, int position) {

        final MainModel model=list.get(position);
        holder.img.setImageResource(model.getImage());
        holder.type.setText(model.getType());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView type,price,description;

        public viewholder(@NonNull @NotNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.imageView);
            type=itemView.findViewById(R.id.type);
            price=itemView.findViewById(R.id.price);
            description=itemView.findViewById(R.id.description);
        }
    }
}
