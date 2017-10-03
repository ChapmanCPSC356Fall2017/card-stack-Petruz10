package com.example.petruz.cardstack;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Petruz on 02/10/17.
 */

public class Card
{
    public String cardNr;
    public int cardColor;
    public int suit;
    public int nr;

    Card(int c, String type)
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

        if (type == "heart")
        {
            cardColor = Color.parseColor("#FF2200");
            suit = R.mipmap.heart;
        }
        else if(type == "diamonds")
        {
            cardColor = Color.parseColor("#FF2200");
            suit = R.mipmap.heart;
        }
        else if (type == "space")
        {
            cardColor = Color.parseColor("#000000");
            suit = R.mipmap.space;
        }
        else if (type == "clove")
        {
            cardColor = Color.parseColor("#000000");
            suit = R.mipmap.space;
        }
/*
        for(int i = 0; i<nr; i++)
        {
            View view = (View)findViewById(R.layout.suits);

            ImageView imageView = new ImageView(this);

            imageView.setImageResource(suit);
        }*/

    }

}
