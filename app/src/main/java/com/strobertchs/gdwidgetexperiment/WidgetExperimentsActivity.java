package com.strobertchs.gdwidgetexperiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class WidgetExperimentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_experiments);
        Toast.makeText(getApplicationContext(), "Click \"Left Button\" to cycle text visibility", Toast.LENGTH_LONG).show();
    }
    public void toggleVisibility(View view)
    {
        TextView text = (TextView) findViewById(R.id.textView);
        switch (text.getVisibility())
        {
            case View.VISIBLE:
                text.setVisibility(View.INVISIBLE);
                break;
            case View.INVISIBLE:
                text.setVisibility(View.GONE);
                break;
            default:
                text.setVisibility(View.VISIBLE);
        }
    }
}
