package com.example.windows.aplikasimakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView rvMakanan;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rvMakanan = findViewById(R.id.rv_makanan);
        rvMakanan.setHasFixedSize(true);

        list.addAll(MakananData.getListData());
        showRecyclerCardView();
    }
    private void showRecyclerCardView() {
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        CardViewMakananAdapter cardViewSenjataAdapter = new CardViewMakananAdapter(list);
        rvMakanan.setAdapter(cardViewSenjataAdapter);
    }
}
