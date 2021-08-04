package com.example.android.piechartsample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    PieChart pieChart;
    int[] colorClassArray = new int[]{Color.RED, Color.MAGENTA, Color.BLACK, Color.BLUE, Color.DKGRAY, Color.YELLOW, Color.GREEN};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = findViewById(R.id.pieChart);

        PieDataSet pieDataSet = new PieDataSet(dataValues1(), "");
        pieDataSet.setColors(colorClassArray);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.invalidate();

    }

    private ArrayList<PieEntry> dataValues1(){
        ArrayList<PieEntry> dataVals = new ArrayList<>();

        dataVals.add(new PieEntry(15, "Sun"));
        dataVals.add(new PieEntry(28, "Mon"));
        dataVals.add(new PieEntry(13, "Tue"));
        dataVals.add(new PieEntry(56, "Wed"));
        dataVals.add(new PieEntry(35, "Thu"));
        dataVals.add(new PieEntry(64, "Fri"));
        dataVals.add(new PieEntry(32, "Sat"));
        return dataVals;
    }
}