package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        TextView Name = findViewById(R.id.nameOutput);
        TextView Age = findViewById(R.id.ageOutput);
        TextView Job = findViewById(R.id.jobOutput);
        TextView Number = findViewById(R.id.phoneNumberOutput);
        TextView Email = findViewById(R.id.emailOutput);
        Bundle bundle = getIntent().getExtras();
        String n2 = bundle.getString("name1");
        int a2 = bundle.getInt("age1");
        String j2 = bundle.getString("job1");
        int no2 = bundle.getInt("number1");
        String e2 = bundle.getString("email1");
        Name.setText(n2);
        Age.setText(String.valueOf(a2));
        Job.setText(j2);
        Number.setText(String.valueOf(no2));
        Email.setText(e2);

    }
}