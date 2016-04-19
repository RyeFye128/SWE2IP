package com.example.ryan.geolbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView headerImage = new ImageView(this);

        Button rockIdentification = (Button) findViewById(R.id.rockIdent);
        Button rockLookup = (Button)findViewById(R.id.rockLookup);
        Button mineralLookup = (Button) findViewById(R.id.mineralLookup);

        rockIdentification.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button temp = (Button)v;
        switch(temp.getText().toString())
        {
            case "Rock Identification":
                //stuff
                Intent intent = new Intent(MainActivity.this, ChooseFlowChart.class);
                startActivity(intent);

                break;
            case "Rock Lookup":
                //Premium
                break;
            case "Mienral Lookup":
                //Premium
                break;
        }
    }
}
