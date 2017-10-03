package com.example.petruz.cardstack;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

import static android.R.attr.type;
import static com.example.petruz.cardstack.Card.Suit.CLOVE;
import static com.example.petruz.cardstack.Card.Suit.DIAMONDS;
import static com.example.petruz.cardstack.Card.Suit.HEART;
import static com.example.petruz.cardstack.Card.Suit.SPACE;

/**
 * Created by Petruz on 02/10/17.
 */

public class Card
{
    public String cardNr;
    public int cardColor;
    public int suit;
    public int nr;

    Card(int c, Suit s)
    {
        nr = c;
        if(nr == 1)
        {
            cardNr = "A";
        }
        else if (nr == 11)
        {
            cardNr ="J";
        }
        else if (nr == 12)
        {
            cardNr ="Q";
        }
        else if (nr == 13)
        {
            cardNr ="K";
        }
        else
        {
            cardNr = cardNr.valueOf(nr);
        }

        if (s  == HEART)
        {
            cardColor = Color.parseColor("#FF2200");
            suit = R.mipmap.heart;
        }
        else if(s == DIAMONDS)
        {
            cardColor = Color.parseColor("#FF2200");
            suit = R.mipmap.diamond;
        }
        else if (s == SPACE)
        {
            cardColor = Color.parseColor("#000000");
            suit = R.mipmap.space;
        }
        else if (s == CLOVE)
        {
            cardColor = Color.parseColor("#000000");
            suit = R.mipmap.clove;
        }
/*
        for(int i = 0; i<nr; i++)
        {
            View view = (View)findViewById(R.layout.suits);

            ImageView imageView = new ImageView(this);

            imageView.setImageResource(suit);
        }*/



    }

    public enum Suit {
        HEART, SPACE, CLOVE, DIAMONDS;
    }

}
