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

import com.example.foodlagbe.MainActivity;
import com.example.foodlagbe.R;
import com.example.foodlagbe.ui.home.HomeFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class Login extends AppCompatActivity {
    EditText loginusername,loginpassword;
    Button loginbutton;
    TextView signupRedirect;
    private DatabaseReference currentUser;

    @Override
    public void onStart() {
        super.onStart();

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        currentUser=database.getReference();
        if(currentUser != null){
            Intent intent=new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        loginusername=findViewById(R.id.login_username);
        loginpassword=findViewById(R.id.login_pass);
        signupRedirect=findViewById(R.id.sigupRedirectText);
        loginbutton=findViewById(R.id.login_button);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!ValidUsername() | !ValidPassword()){

                }else {
                    checkuser();
                }
            }
        });

        signupRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,Register.class);
                startActivity(intent);

            }
        });
    }

    public  Boolean ValidUsername(){
        String val=loginusername.getText().toString();

        if(val.isEmpty()){
            loginusername.setError("Username cannot be empty");
            return false;
        }else{
            loginusername.setError(null);
            return true;
        }
    }

    public  Boolean ValidPassword(){
        String val=loginpassword.getText().toString();

        if(val.isEmpty()){
            loginpassword.setError("Password cannot be empty");
            return false;
        }else{
            loginpassword.setError(null);
            return true;
        }
    }

    public void checkuser(){
        String username=loginusername.getText().toString().trim();
        String userPassword=loginpassword.getText().toString().trim();
        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("users");
        Query checkUserDatabase=reference.orderByChild("username").equalTo(username);

        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    loginusername.setError(null);
                    String passwordFromDB=snapshot.child(username).child("password").getValue(String.class);

                    if(!Objects.equals(passwordFromDB,userPassword)){
                        loginusername.setError(null);
                        Toast.makeText(Login.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        loginpassword.setError("Invalid Password");
                        loginpassword.requestFocus();
                    }
                }else {
                    loginusername.setError("User does not exist");
                    loginusername.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }


}