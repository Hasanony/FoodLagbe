package com.example.foodlagbe.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodlagbe.Helperclass;
import com.example.foodlagbe.MainActivity;
import com.example.foodlagbe.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {
    EditText signupName,signupEmail,signupUsername,signupPassword;
    TextView loginRedirectText;
    Button signupbutton;
    FirebaseDatabase database;
    DatabaseReference reference;
    private DatabaseReference currentUser;

    /*@Override
    public void onStart() {
        super.onStart();

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        currentUser=database.getReference();
        if(currentUser != null){
            Intent intent=new Intent(Register.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);
        signupName=findViewById(R.id.signup_name);
        signupEmail=findViewById(R.id.signup_email);
        signupUsername=findViewById(R.id.signup_username);
        signupPassword=findViewById(R.id.signup_pass);
        signupbutton=findViewById(R.id.signup_button);
        loginRedirectText=findViewById(R.id.loginRedirectText);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database=FirebaseDatabase.getInstance();
                reference=database.getReference("users");


                String name=signupName.getText().toString();
                String email=signupEmail.getText().toString();
                String username=signupUsername.getText().toString();
                String password=signupPassword.getText().toString();


                Helperclass helperclass=new Helperclass(name,email,username,password);
                reference.child(name).setValue(helperclass);

                Toast.makeText(Register.this,"You have Register successfully",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(Register.this,Login.class);
                startActivity(intent);

            }
        });
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });

    }



}