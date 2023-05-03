package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private RecyclerView;
    private ArrayList<Bergen> Berg;
    private RecyclerViewAdapter Adaptern;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask(this).execute(JSON_URL);

        RecyclerView = findViewById(R.id.RecyclerViewId);
        Berg = new ArrayList<Bergen>();
        Adaptern = new RecyclerViewAdapter(Berg);
        RecyclerView.setAdapter(Adaptern);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onPostExecute(String json) {
    Gson gson = new Gson();
    Type type = new TypeToken<ArrayList<Bergen>>() {}.getType();
    private String json;
    ArrayList<Bergen> data = gson.fromJson(json, type);
    Bergen.addAll(data);
    Adaptern.notifyDataSetChanged();
    }
}
