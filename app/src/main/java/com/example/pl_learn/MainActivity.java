package com.example.pl_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    PL[] pls = new PL[]{new PL("Java", null), new PL("C#", null),
        new PL("JS", null)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView)findViewById(R.id.pl_list_gridview);
        PlCardAdapter cardAdapter = new PlCardAdapter(this, pls);
        gridView.setAdapter(cardAdapter);
    }
}