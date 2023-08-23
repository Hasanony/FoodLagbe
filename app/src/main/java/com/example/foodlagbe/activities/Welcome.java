package com.example.foodlagbe.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.foodlagbe.MainActivity;
import com.example.foodlagbe.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Welcome extends AppCompatActivity {
    FirebaseAuth mAuth;
    private DatabaseReference currentUser;

    /*@Override
    public void onStart() {
        super.onStart();

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        currentUser=database.getReference();
        if(currentUser != null){
            Intent intent=new Intent(Welcome.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);
        mAuth=FirebaseAuth.getInstance();
    }

    public void register(View view) {
        startActivity(new Intent(Welcome.this, Register.class));
    }

    public void login(View view) {
        startActivity(new Intent(Welcome.this, Login.class));
    }
}