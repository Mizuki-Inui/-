package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button inputButton,lineButton,puzzleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setScreenLine();
    }
    private void setScreenLine(){//一覧画面への遷移
        setContentView(R.layout.activity_main);
        inputButton = (Button) findViewById(R.id.input);
        inputButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setScreenInput();
            }
        });
        puzzleButton = (Button) findViewById(R.id.puzzle);
        puzzleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setScreenPuzzle();
            }
        });
    }
    private void setScreenInput(){//入力画面への遷移
        setContentView(R.layout.input_screen);
        lineButton = (Button) findViewById(R.id.line2);
        lineButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setScreenLine();
            }
        });
        puzzleButton = (Button) findViewById(R.id.puzzle2);
        puzzleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setScreenPuzzle();
            }
        });
    }
    private void setScreenPuzzle(){//パズル画面への遷移
        setContentView(R.layout.puzzle_screen);
        lineButton = (Button) findViewById(R.id.line4);
        lineButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setScreenLine();
            }
        });
        inputButton = (Button) findViewById(R.id.input3);
        inputButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setScreenInput();
            }
        });
    }
}
