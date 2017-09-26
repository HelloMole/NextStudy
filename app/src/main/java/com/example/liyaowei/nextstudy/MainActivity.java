package com.example.liyaowei.nextstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView = (TextView)findViewById(R.id.hello_World_Text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO 在这里加入初始化代码



        if(textView.getText().toString().equals("HelloWorld")){
            textView.setText("Stupid");
        }else{

        }
    }

    public void feature2(View view) {
        if (textView.getText().toString().equals("HelloWorld")) {
            textView.setText("helloWorld");
        } else {
            textView.setText("hhhhhh");
        }
    }


    public void feature1(View view) {
    }

}
