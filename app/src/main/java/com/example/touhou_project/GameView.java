package com.example.touhou_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class GameView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        String selectedCharacter = intent.getStringExtra("selectedCharacter");
        String selectedDifficulty = intent.getStringExtra("selectedDifficulty");
        String selectedStage = intent.getStringExtra("selectedStage");

        // initialize the game according to those variables

    }
}
