package com.example.ryan.geolbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.ryan.geolbuddy.R.id.IgneousFlow;
import static com.example.ryan.geolbuddy.R.id.MetaFlow;
import static com.example.ryan.geolbuddy.R.id.SedimentaryFlow;

public class ChooseFlowChart extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_flow_chart);

        ImageButton ig = (ImageButton) findViewById(R.id.IgneousFlow);
        ImageButton sed = (ImageButton) findViewById(R.id.SedimentaryFlow);
        ImageButton meta = (ImageButton) findViewById(R.id.MetaFlow);

        ig.setOnClickListener(this);
        sed.setOnClickListener(this);
        meta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageButton temp = (ImageButton)v;
        switch(temp.getId())
        {
            case IgneousFlow:
                //stuff
                Intent intent = new Intent(ChooseFlowChart.this, IgneousFlowChart.class);
                startActivity(intent);
                break;

            case SedimentaryFlow:
                //
                Intent sedintent = new Intent(ChooseFlowChart.this, SedFlowChart.class);
                startActivity(sedintent);
                break;

            case MetaFlow:
                Intent metaintent = new Intent(ChooseFlowChart.this, MetaFlowChart.class);
                startActivity(metaintent);
                break;

        }
    }

}
