package com.example.touhou_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

public class SelectionActivity extends Activity {
    private String selectedCharacter;
    private String selectedDifficulty;
    private String selectedStage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        // define buttons
        Button buttonReimu = findViewById(R.id.button_reimu);
        Button buttonMarisa = findViewById(R.id.button_Marisa);
        Button buttonEasy = findViewById(R.id.button_easy);
        Button buttonNormal = findViewById(R.id.button_normal);
        Button buttonHard = findViewById(R.id.button_hard);
        Button buttonStage1 = findViewById(R.id.button_stage1);
        Button buttonStage2 = findViewById(R.id.button_stage2);
        Button buttonStage3 = findViewById(R.id.button_stage3);
        Button buttonStage4 = findViewById(R.id.button_stage4);
        Button buttonStage5 = findViewById(R.id.button_stage5);
        Button buttonStartGame = findViewById(R.id.button_start_game);

        // select character
        buttonReimu.setOnClickListener(v -> selectedCharacter = "Reimu");
        buttonMarisa.setOnClickListener(v -> selectedCharacter = "Marisa");

        // select difficulty
        buttonEasy.setOnClickListener(v -> selectedDifficulty = "Easy");
        buttonNormal.setOnClickListener(v -> selectedDifficulty = "Normal");
        buttonHard.setOnClickListener(v -> selectedDifficulty = "Hard");

        // select stage
        buttonStage1.setOnClickListener(v -> selectedStage = "STAGE 1");
        buttonStage2.setOnClickListener(v -> selectedStage = "STAGE 2");
        buttonStage3.setOnClickListener(v -> selectedStage = "STAGE 3");
        buttonStage4.setOnClickListener(v -> selectedStage = "STAGE 4");
        buttonStage5.setOnClickListener(v -> selectedStage = "STAGE 5");

        // start game
        buttonStartGame.setOnClickListener(v -> {
            Intent intent = new Intent(SelectionActivity.this, GameView.class);
            intent.putExtra("selectedCharacter", selectedCharacter);
            intent.putExtra("selectedDifficulty", selectedDifficulty);
            intent.putExtra("selectedStage", selectedStage);
            startActivity(intent);
        })
    }


}
