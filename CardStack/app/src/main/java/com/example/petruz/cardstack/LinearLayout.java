package com.example.petruz.cardstack;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.Stack;

public class LinearLayout extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    private static String H = "heart";
    private static String C = "clove";
    private static String D = "diamonds";
    private static String S = "space";

    protected ImageView imageView;

    public Stack<Card> cardStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Log.d(TAG, "on create");

       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        Card c = new Card(5, Card.Suit.HEART);
        Card c2 = new Card(6, Card.Suit.SPACE);
        Card c3 = new Card(1, Card.Suit.CLOVE);
        Card c4 = new Card(11, Card.Suit.DIAMONDS);
        Card c5 = new Card(12, Card.Suit.DIAMONDS);
        Card c6 = new Card(13, Card.Suit.SPACE);
        Card c7 = new Card (2, Card.Suit.HEART);


        cardStack.push(c3);
        cardStack.push(c4);
        cardStack.push(c5);
        cardStack.push(c6);
        cardStack.push(c);
        cardStack.push(c7);
        cardStack.push(c2);

        Collections.shuffle(cardStack);

        newCard();

    }

    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "on start");
    }


    public void changeLayout(View view)
    {
        // setContentView(R.layout.relativelayout);

    }

    public void changeCard(View view)
    {
        newCard();
    }

    private void newCard()
    {
        ViewGroup layout = (ViewGroup) findViewById(R.id.suits);
        layout.removeAllViews();


        Card topCard = cardStack.pop();

        TextView numTv = (TextView) findViewById(R.id.num);
        ImageView smallImg = (ImageView) findViewById(R.id.smallSuit);

        TextView numTv2 = (TextView) findViewById(R.id.num2);
        ImageView smallImg2 = (ImageView) findViewById(R.id.smallSuit2);

        Log.d(TAG, "change card");
        numTv.setText(topCard.cardNr);
        numTv.setTextColor(topCard.cardColor);
        smallImg.setImageResource(topCard.suit);

        numTv2.setText(topCard.cardNr);
        numTv2.setTextColor(topCard.cardColor);
        smallImg2.setImageResource(topCard.suit);




        for(int i = 0; i<topCard.nr; i++)
        {
            imageView = new ImageView(this);
            imageView.setImageResource(topCard.suit);
            layout.addView(imageView);
        }
    }
}
