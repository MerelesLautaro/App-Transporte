package com.lautadev.demoapptransporte;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.List;

public class MyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    private List<MyData> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        swipeRefreshLayout = findViewById(R.id.swipe_refresh_layout);
        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataList = new ArrayList<>();
        adapter = new MyAdapter(dataList);
        recyclerView.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // Llama a tu método para cargar datos desde la API aquí
                loadDataFromAPI();
            }
        });

        // Carga inicial de datos
        loadDataFromAPI();
    }

    private void loadDataFromAPI() {
        // Aquí llamas a tu API para obtener datos y actualizar la lista
        // Por ejemplo:
        // dataList = api.getData();
        // adapter.notifyDataSetChanged();
        // swipeRefreshLayout.setRefreshing(false);
    }
}