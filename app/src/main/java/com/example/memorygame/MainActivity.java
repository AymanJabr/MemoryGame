package com.example.memorygame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    //Create a TextView and an ImageView for both texts and for all pictures (pretty sure there is a better way to do this)
    TextView tv_p1,tv_p2;
    ImageView iv_11, iv_12, iv_13, iv_14,iv_21, iv_22, iv_23, iv_24,iv_31, iv_32, iv_33, iv_34;

    //Create an int for every image, and a CardsArray with a number for each image
    int image101, image102, image103, image104,image105, image106,image201, image202, image203, image204, image205, image206;
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};


    //Create values that are going to be used in the games, and initialize some of them
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getReferences();
        setTags();
        getFrontofCards();

        //Shuffles the images' values
        Collections.shuffle(Arrays.asList(cardsArray));

        //Changes the color of the second player as he is inactive
        tv_p2.setTextColor(Color.GRAY);

        setOnClickListeners();





    }

    //Makes all the buttons respond to being clicked on
    public void setOnClickListeners(){
        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_11, theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_12, theCard);

            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_13, theCard);

            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_14, theCard);

            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_21, theCard);

            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_22, theCard);

            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_23, theCard);

            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_24, theCard);

            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_31, theCard);

            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_32, theCard);

            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_33, theCard);

            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Returns the integer value of the string that we passed to each view in setTags()
                int theCard = Integer.parseInt((String)v.getTag());
                
                getCardImage(iv_34, theCard);

            }
        });

    }


    //Checks to which image the entered card belongs to and fixes the appropriate image to it.
    public void getCardImage(ImageView IV, int theCard){
        if(cardsArray[theCard] == 101){
            IV.setImageResource(image101);
        }else if(cardsArray[theCard] == 102){
            IV.setImageResource(image102);
        }else if(cardsArray[theCard] == 103){
            IV.setImageResource(image103);
        }else if(cardsArray[theCard] == 104){
            IV.setImageResource(image104);
        }else if(cardsArray[theCard] == 105){
            IV.setImageResource(image105);
        }else if(cardsArray[theCard] == 106){
            IV.setImageResource(image106);
        }else if(cardsArray[theCard] == 202){
            IV.setImageResource(image202);
        }else if(cardsArray[theCard] == 203){
            IV.setImageResource(image203);
        }else if(cardsArray[theCard] == 204){
            IV.setImageResource(image204);
        }else if(cardsArray[theCard] == 205){
            IV.setImageResource(image205);
        }else if(cardsArray[theCard] == 206){
            IV.setImageResource(image206);
        }else if(cardsArray[theCard] == 201){
            IV.setImageResource(image201);
        }

        //? Checks which Image is selected and stores it in a temporary variable.
        if(cardNumber == 1){
            firstCard = cardsArray[theCard];
            if(firstCard > 200){
                firstCard -= 100;}
            cardNumber = 2;
            clickedFirst = theCard;//Stores the value of the card that is clicked first
            IV.setEnabled(false);//Whatever card is clicked is disabled
        } else if(cardNumber == 2){
            secondCard = cardsArray[theCard];
            if(secondCard > 200){
                secondCard -= 100;}
            cardNumber = 1;
            clickedSecond = theCard;//Stores the value of the card that is clicked first

            //All cards are disabled
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);


            Handler handler = new Handler();
            //Waits a second from the moment the second card is clicked to execute
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //NEEDS RENAMING
                    //?Checks if the selected images are equal
                    calculate();
                }
            },1000);

        }
    }

    public void calculate(){
        //If selected cards are equal, set them to invisible and add a point.
        if (firstCard == secondCard){
            if(clickedFirst == 0)iv_11.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 1)iv_12.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 2)iv_13.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 3)iv_14.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 4)iv_21.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 5)iv_22.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 6)iv_23.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 7)iv_24.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 8)iv_31.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 9)iv_32.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 10)iv_33.setVisibility(View.INVISIBLE);
            else if(clickedFirst == 11)iv_34.setVisibility(View.INVISIBLE);

            if(clickedSecond == 0)iv_11.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 1)iv_12.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 2)iv_13.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 3)iv_14.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 4)iv_21.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 5)iv_22.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 6)iv_23.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 7)iv_24.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 8)iv_31.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 9)iv_32.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 10)iv_33.setVisibility(View.INVISIBLE);
            else if(clickedSecond == 11)iv_34.setVisibility(View.INVISIBLE);

            if(turn == 1) {
                playerPoints += 1;
                tv_p1.setText("P1: " + playerPoints);
            }else if(turn == 2){
                cpuPoints += 1;
                tv_p2.setText("P2: " + cpuPoints);
            }
        } else {//Resets how the game looks
            iv_11.setImageResource(R.drawable.ic_back);
            iv_12.setImageResource(R.drawable.ic_back);
            iv_13.setImageResource(R.drawable.ic_back);
            iv_14.setImageResource(R.drawable.ic_back);
            iv_21.setImageResource(R.drawable.ic_back);
            iv_22.setImageResource(R.drawable.ic_back);
            iv_23.setImageResource(R.drawable.ic_back);
            iv_24.setImageResource(R.drawable.ic_back);
            iv_31.setImageResource(R.drawable.ic_back);
            iv_32.setImageResource(R.drawable.ic_back);
            iv_33.setImageResource(R.drawable.ic_back);
            iv_34.setImageResource(R.drawable.ic_back);

            //Changes the turns of the players if they get the answer wrong
            if(turn == 1){
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            } else if(turn == 2){
                turn = 1;
                tv_p1.setTextColor(Color.BLACK);
                tv_p2.setTextColor(Color.GRAY);
            }
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        //Checks if the game is over
        checkifOver();
    }

    public void checkifOver(){
        if(iv_11.getVisibility() == View.INVISIBLE && iv_12.getVisibility() == View.INVISIBLE
         && iv_13.getVisibility() == View.INVISIBLE && iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE && iv_22.getVisibility() == View.INVISIBLE
                && iv_23.getVisibility() == View.INVISIBLE && iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE && iv_32.getVisibility() == View.INVISIBLE
                && iv_33.getVisibility() == View.INVISIBLE && iv_34.getVisibility() == View.INVISIBLE){

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("GAME OVER! \nP1: "+ playerPoints + "\nP2: " + cpuPoints).setCancelable(false)
            .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }
    }

    //Get a reference to the TextViews and the ImageViews, and assign them to the previous defined values
    public void getReferences(){
        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);

        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);

        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);
    }

    //Assigns the tags to each of the ImageViews for later referencing
    public void setTags(){
        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
    }

    //Gets the ids of the image source files
    public void getFrontofCards(){
        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_image205;
        image206 = R.drawable.ic_image206;
    }
}
