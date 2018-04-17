package com.lawalvilla.tictactoeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseXorO extends AppCompatActivity {

    private Button button_X;
    private Button button_O;
    private Button button_play_against_computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_x_or_o);

        button_X = (Button) findViewById(R.id.button_X);
        button_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseBoardX();
            }
        });


        button_O = (Button) findViewById(R.id.button_O);
        button_O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseBoardO();
            }
        });

        button_play_against_computer = (Button) findViewById(R.id.button_play_against_computer);
        button_play_against_computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayAgainstComp();
            }
        });
    }

    public void openChooseBoardX(){
        Intent intent = new Intent(this,BoardThreeByThreeX.class);
        startActivity(intent);
    }

    public void openChooseBoardO(){
        Intent intent = new Intent(this,BoardThreeByThreeO.class);
        startActivity(intent);
    }

    public void openPlayAgainstComp(){
        Intent intent = new Intent(this,MainAgainstComputer.class);
        startActivity(intent);
    }
}
