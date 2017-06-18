package com.example.sda.kolkokrzyzyk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    boolean turn = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Button button = (Button) v;
        buttonClicked(button);
        youWin();
        buttonWasClicked();


    }

    private void toast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    public void buttonClicked(Button button) {
        if (turn) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        button.setClickable(false);
        turn = !turn;

    }

    private void buttonWasClicked(){
       if(!button1.isClickable()&&!button2.isClickable()&&!button3.isClickable()
             &&!button4.isClickable()&&!button5.isClickable()&&!button6.isClickable()
               &&!button7.isClickable()&&!button8.isClickable()&&!button9.isClickable());
    //     toast("This button was already clicked");
    }

    public void youWin() {
        boolean winner = false;

        if (button1.getText() == button2.getText() && button2.getText() == button3.getText() && !button1.isClickable())
            winner = true;
        else if (button4.getText() == button5.getText() && button5.getText() == button6.getText() && !button4.isClickable())
            winner = true;
        else if (button7.getText() == button8.getText() && button8.getText() == button9.getText() && !button7.isClickable())
            winner = true;
        else if (button1.getText() == button4.getText() && button4.getText() == button7.getText() && !button1.isClickable())
            winner = true;
        else if (button2.getText() == button5.getText() && button5.getText() == button8.getText() && !button2.isClickable())
            winner = true;
        else if (button3.getText() == button6.getText() && button6.getText() == button9.getText() && !button3.isClickable())
            winner = true;
        else if (button1.getText() == button5.getText() && button5.getText() == button9.getText() && !button1.isClickable())
            winner = true;
        else if (button7.getText() == button5.getText() && button5.getText() == button3.getText() && !button7.isClickable())
            winner = true;

        if (winner) {
            if (!turn) {
                toast("X has won");
            } else {
                toast("O has won");
            }
        }
    }
}
