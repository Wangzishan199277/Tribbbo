package com.example.wangzishan.tribbbo.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.wangzishan.tribbbo.R;
import com.example.wangzishan.tribbbo.dribbble.Dribbble;
import com.example.wangzishan.tribbbo.dribbble.auth.Auth;
import com.example.wangzishan.tribbbo.dribbble.auth.AuthActivity;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wangzishan on 10/2/16.
 */
public class LoginActivity extends AppCompatActivity{
    @BindView(R.id.activity_login_btn) TextView loginBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        Dribbble.init(this);

        if(!Dribbble.isLoggedIn()){
            loginBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Auth.openAuthActivity(LoginActivity.this);
                }
            });
        }else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Auth.REQ_CODE && resultCode == RESULT_OK){
            final String authCode = data.getStringExtra(AuthActivity.KEY_CODE);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        String token = Auth.fetchAccessToken(authCode);

                        Dribbble.login(LoginActivity.this, token);
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }catch (IOException | JsonSyntaxException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
