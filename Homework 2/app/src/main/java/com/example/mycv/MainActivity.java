package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.strictmode.ImplicitDirectBootViolation;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.nameInput);
        EditText age = findViewById(R.id.ageInput);
        EditText job = findViewById(R.id.jobInput);
        EditText number = findViewById(R.id.phoneNumberInput);
        EditText email = findViewById(R.id.emailInput);
        Button next = findViewById(R.id.nextBtn);


        

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.length() == 0)
                {
                    name.setError("Please Enter Your Name!");}
                else {
                    if (age.length() == 0)
                    {
                        age.setError("Please Enter Your Age!");}
                    else{
                        if (job.length() == 0)
                        {
                            job.setError("Please Enter Your Job!");}
                        else{
                            if (number.length() == 0)
                            {
                                number.setError("Please Enter Your Phone Number!");}
                            else{
                                if (email.length() == 0)
                                {
                                    email.setError("Please Enter Your Email!");}
                                else{
                                    String n = name.getText().toString();
                                    int a = Integer.parseInt(age.getText().toString());
                                    String j = job.getText().toString();
                                    int no = Integer.parseInt(number.getText().toString());
                                    String e = email.getText().toString();


                                    Intent plane = new Intent(MainActivity.this, Page2.class);

                                    plane.putExtra("name1", n);
                                    plane.putExtra("age1", a);
                                    plane.putExtra("job1", j);
                                    plane.putExtra("number1", no);
                                    plane.putExtra("email1", e);

                                    startActivity(plane);


                    }}}}}

            }
        });

    }
}