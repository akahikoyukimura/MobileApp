package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.myapplication.Adapters.MainAdapter;
import com.example.myapplication.Models.MainModel;
import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

class MainActivity extends AppCompatActivity{

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        System.out.println(binding);

        setContentView(binding.getRoot());

        ArrayList<MainModel> list=new ArrayList<>();
        list.add(new MainModel(R.drawable.chevre,"chèvre","5000","elever dans la compane"));
        list.add(new MainModel(R.drawable.m1,"mouton1","5500","elever dans la compane"));
        list.add(new MainModel(R.drawable.m2,"mouton2","2000","elever dans la compane"));
        list.add(new MainModel(R.drawable.m3,"mouton3","3500","elever dans la compane"));

        MainAdapter adapter=new MainAdapter(list,this);

        binding.recylerview.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);

    }
}