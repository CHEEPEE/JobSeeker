package com.jobseeker.jobseeker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JobSeekerRegistration extends AppCompatActivity {
Button saveRegistration;
EditText fAddress,fcity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_seeker_registration);
        fAddress = (EditText) findViewById(R.id.field_address);
        fcity = (EditText) findViewById(R.id.fiel_city);
        saveRegistration = (Button) findViewById(R.id.saveProfile);
        saveRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateForm();
            }
        });

    }


    private boolean validateForm(){
        boolean validate = true;


        String address = fAddress.getText().toString();
        if (TextUtils.isEmpty(address)) {
            fAddress.setError("Required.");
            validate = false;
        } else {
            fAddress.setError(null);
        }
        String city = fcity.getText().toString();
        if (TextUtils.isEmpty(city)) {
            fcity.setError("Required.");
            validate = false;
        } else {
            fcity.setError(null);
        }
        return validate;
    }
}
