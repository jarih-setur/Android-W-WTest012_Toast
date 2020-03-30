package com.example.wtest012_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnToastLong(View view)  {
        Button btn = (Button) view;
        TextView tv = findViewById(R.id.tvHelloWorld);
        tv.setText(btn.getText());
        Toast.makeText(this,"Text of sender: "+btn.getText(),Toast.LENGTH_LONG).show();
    }

    public void btnToastShort(View view)  {
        Button btn = (Button) view;
        TextView tv = findViewById(R.id.tvHelloWorld);
        tv.setText(btn.getText());
        Toast.makeText(this,"Text of sender: "+btn.getText(),Toast.LENGTH_SHORT).show();
    }
}
