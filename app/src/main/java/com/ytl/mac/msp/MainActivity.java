package com.ytl.mac.msp;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();


    private FactBook factBook = new FactBook();
    private ColorWheal colorWheel = new ColorWheal();

    private TextView mfactTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the view form the layout file to the corresponding variables
        mfactTextView = findViewById(R.id.NumTextView2);
        showFactButton = findViewById(R.id.showBtn);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = factBook.getFact();
                mfactTextView.setText(fact);

                Random randomGenerator = new Random();
                int randomColor = randomGenerator.nextInt(256);

                int color = colorWheel.getColor();

                findViewById(R.id.myGame).setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        });
        //showFactButton.setOnClickListener(listener);

        Toast.makeText(this, "Yay! ", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "We're loggin from the onCreate() method! ohohoh");


    }





    public void theToastBtn(View view){

        //Toast myToast = Toast.makeText(this, "Hey toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hey Toast", Toast.LENGTH_SHORT).show();

    }

    public void addCount(View view){

        TextView myText = findViewById(R.id.NumTextView);
        myText.setText("hey update text");
    }

}
