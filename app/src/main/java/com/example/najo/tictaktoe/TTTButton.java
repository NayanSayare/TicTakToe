package com.example.najo.tictaktoe;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;

public class TTTButton extends AppCompatButton{
    private int player = MainActivity.NO_PLAYER;

    public TTTButton(Context context){
        super(context);
        setBackgroundResource(R.drawable.button_bg);
    }

    public void setPlayer(int player) {
        this.player = player;
        if(player == MainActivity.PLAYER_O){
            setText("O");
            setTextColor(getResources().getColor(R.color.colorDark));
            setTextSize(60);
        }else if(player == MainActivity.PLAYER_X){
            setText("X");
            setTextColor(getResources().getColor(R.color.colorDark));
            setTextSize(60);
        }
        setEnabled(false);
    }

    public int getPlayer() {
        return player;
    }

    public boolean isEmpty(){
        return player == MainActivity.NO_PLAYER;
    }
}
