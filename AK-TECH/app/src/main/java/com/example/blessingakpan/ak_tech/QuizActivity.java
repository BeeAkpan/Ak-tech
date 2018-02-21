package com.example.blessingakpan.ak_tech;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    int score = 0;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //to get intent from the previous activity
        name = getIntent().getExtras().getString("Name");
        Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();


    }

    public void submit(View view) {

        boolean answer1 = answern1();
        boolean answer2 = answern2();
        boolean answer3 = answern3();
        boolean answer4 = answern4();
        boolean answer5 = answern5();
        boolean answer6 = answern6();
        boolean answer7 = answern7();
        boolean answer8 = answern8();
        boolean answer9 = answern9();
        boolean answer10 = answern10();
        boolean answer11 = answern11();
        boolean answer12 = answern12();
        boolean answer13 = answern13();
        boolean answer14 = answern14();
        boolean answer15 = answern15();
        boolean answer16 = answern16();
        boolean answer17 = answern17();
        boolean answer18 = answern18();
        boolean answer19 = answern19();
        boolean answer20 = answern20();
        boolean answer21 = answern21();
        boolean answer22 = answern22();
        boolean answer23 = answern23();
        boolean answer24 = answern24();
        boolean answer25 = answern25();
        boolean answer26 = answern26();
        boolean answer27 = answern27();
        boolean answer28 = answern28();
        boolean answer29 = answern29();
        boolean answer30 = answern30();

        int theScore = calculateScore(answer1, answer4, answer7, answer12, answer13, answer17, answer21, answer22, answer25, answer30);
        String scoreMessage = createAccessSummary (name, theScore);
        Toast.makeText(this, scoreMessage, Toast.LENGTH_SHORT).show();

        score = 0;

    }
    public void reset(View view) {
        finish();
        //startActivity(getIntent());
    }


    private boolean answern1() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_1);
        boolean answern1 = myAnswer.isChecked();
        return answern1;
    }

    private boolean answern2() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_1);
        boolean answern2 = myAnswer.isChecked();
        return answern2;
    }

    private boolean answern3() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_1);
        boolean answern3 = myAnswer.isChecked();
        return answern3;
    }

    private boolean answern4() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_2);
        boolean answern4 = myAnswer.isChecked();
        return answern4;
    }

    private boolean answern5() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_2);
        boolean answern5 = myAnswer.isChecked();
        return answern5;
    }

    private boolean answern6() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_2);
        boolean answern6 = myAnswer.isChecked();
        return answern6;
    }

    private boolean answern7() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_3);
        boolean answern7 = myAnswer.isChecked();
        return answern7;
    }

    private boolean answern8() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_3);
        boolean answern8 = myAnswer.isChecked();
        return answern8;
    }

    private boolean answern9() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_3);
        boolean answern9 = myAnswer.isChecked();
        return answern9;
    }

    private boolean answern10() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_4);
        boolean answern10 = myAnswer.isChecked();
        return answern10;
    }

    private boolean answern11() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_4);
        boolean answern11 = myAnswer.isChecked();
        return answern11;
    }

    private boolean answern12() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_4);
        boolean answern12 = myAnswer.isChecked();
        return answern12;
    }

    private boolean answern13() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_5);
        boolean answern13 = myAnswer.isChecked();
        return answern13;
    }

    private boolean answern14() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_5);
        boolean answern14 = myAnswer.isChecked();
        return answern14;
    }

    private boolean answern15() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_5);
        boolean answern15 = myAnswer.isChecked();
        return answern15;
    }

    private boolean answern16() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_6);
        boolean answern16 = myAnswer.isChecked();
        return answern16;
    }

    private boolean answern17() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_6);
        boolean answern17 = myAnswer.isChecked();
        return answern17;
    }

    private boolean answern18() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_6);
        boolean answern18 = myAnswer.isChecked();
        return answern18;
    }

    private boolean answern19() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_7);
        boolean answern19 = myAnswer.isChecked();
        return answern19;
    }

    private boolean answern20() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_7);
        boolean answern20 = myAnswer.isChecked();
        return answern20;
    }

    private boolean answern21() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_7);
        boolean answern21 = myAnswer.isChecked();
        return answern21;
    }

    private boolean answern22() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_8);
        boolean answern22 = myAnswer.isChecked();
        return answern22;
    }

    private boolean answern23() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_8);
        boolean answern23 = myAnswer.isChecked();
        return answern23;
    }

    private boolean answern24() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_8);
        boolean answern24 = myAnswer.isChecked();
        return answern24;
    }

    private boolean answern25() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_9);
        boolean answern25 = myAnswer.isChecked();
        return answern25;
    }

    private boolean answern26() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_9);
        boolean answern26 = myAnswer.isChecked();
        return answern26;
    }

    private boolean answern27() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_9);
        boolean answern27 = myAnswer.isChecked();
        return answern27;
    }

    private boolean answern28() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer1_10);
        boolean answern28 = myAnswer.isChecked();
        return answern28;
    }

    private boolean answern29() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer2_10);
        boolean answern29 = myAnswer.isChecked();
        return answern29;
    }

    private boolean answern30() {
        RadioButton myAnswer = (RadioButton) findViewById(R.id.answer3_10);
        boolean answern30 = myAnswer.isChecked();
        return answern30;
    }

    private int calculateScore(boolean answer1, boolean answer4, boolean answer7, boolean answer12, boolean answer13, boolean answern1, boolean answern5, boolean answern9, boolean answern10, boolean answern15) {
        if (answern1) {
            score = score + 10;
        }
        if (answern4()) {
            score = score + 10;
        }
        if (answern7()) {
            score = score + 10;
        }
        if (answern12()) {
            score = score + 10;
        }
        if (answern13()) {
            score = score + 10;
        }
        if (answern17()) {
            score = score + 10;
        }
        if (answern21()) {
            score = score + 10;
        }
        if (answern22()) {
            score = score + 10;
        }
        if (answern25()) {
            score = score + 10;
        }
        if (answern30()) {
            score = score + 10;
        }
        return score;
    }

    private String createAccessSummary(String name, int score) {
        String scoreMessage = "Name : " + name;
        scoreMessage = scoreMessage + "\n TOTAL SCORE " + score + "%";
        scoreMessage = scoreMessage + "\n thanks for participating ";
        return scoreMessage;
    }

}







