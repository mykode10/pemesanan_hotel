package com.example.vindi.latihan.activity;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vindi.latihan.HistoryAdapter;
import com.example.vindi.latihan.R;
import com.example.vindi.latihan.pojo.History;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private HistoryAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<History> histories = new ArrayList<>();



   C
