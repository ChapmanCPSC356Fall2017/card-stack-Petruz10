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
    public Stack<Card> cardStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        //1-14 in the loops to get nr 1-13 instead of 0-12
        for(int i =1; i<14; i++)
        {
            Card c = new Card(i, Card.Suit.HEART);
            cardStack.push(c);
        }

        for(int i =1; i<14; i++)
        {
            Card c = new Card(i, Card.Suit.SPACE);
            cardStack.push(c);
        }

        for(int i =1; i<14; i++)
        {
            Card c = new Card(i, Card.Suit.DIAMONDS);
            cardStack.push(c);
        }

        for(int i =1; i<14; i++)
        {
            Card c = new Card(i, Card.Suit.CLOVE);
            cardStack.push(c);
        }

        Collections.shuffle(cardStack);
    }

    protected void onStart()
    {
        super.onStart();
        newCard();
        Log.d(TAG, "onStart");
    }

    public void changeCard(View view)
    {
        newCard();
    }

    private void newCard()
    {
        ViewGroup layout = (ViewGroup) findViewById(R.id.suits);
        layout.removeAllViews();

        if(cardStack.empty())
        {
            finish();
            return;
        }

        Card topCard = cardStack.pop();

        TextView numTv = (TextView) findViewById(R.id.num);
        ImageView smallImg = (ImageView) findViewById(R.id.smallSuit);

        TextView numTv2 = (TextView) findViewById(R.id.num2);
        ImageView smallImg2 = (ImageView) findViewById(R.id.smallSuit2);

        numTv.setText(topCard.cardNr);
        numTv.setTextColor(topCard.cardColor);
        smallImg.setImageResource(topCard.suit);

        numTv2.setText(topCard.cardNr);
        numTv2.setTextColor(topCard.cardColor);
        smallImg2.setImageResource(topCard.suit);

        for(int i = 0; i<topCard.nr; i++)
        {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(topCard.suit);
            layout.addView(imageView);
        }
    }
}
