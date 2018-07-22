package com.example.mypc.backgroundservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonStart;
    private Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = (Button) findViewById(R.id.start);
        buttonStop = (Button) findViewById(R.id.stop);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if (view == buttonStart)
        {
            startService(new Intent(this, Myservice.class));
        }
        else if (view == buttonStop)
        {
            stopService(new Intent(this, Myservice.class));
        }
    }
}
