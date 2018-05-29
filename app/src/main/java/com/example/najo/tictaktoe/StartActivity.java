package com.example.najo.tictaktoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    EditText player0 , playerX ;
    Button startGame ;
    String playerName0 , playerNameX ;
    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        player0 = findViewById(R.id.player0);
        playerX = findViewById(R.id.playerX);
        startGame = findViewById(R.id.button);

        playerName0 = player0.getText().toString();
        playerNameX = playerX.getText().toString();



    }

    public void startGame(View view) {
        Intent intent = new Intent(StartActivity.this,MainActivity.class);
        bundle.putString("PLAYER0" , player0.getText().toString());
        bundle.putString("PLAYERX" , playerX.getText().toString());
        intent.putExtras(bundle);
        //Toast.makeText(this, player0.getText().toString(), Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
