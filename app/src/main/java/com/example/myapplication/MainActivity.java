package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv_deck, iv_card1, iv_card2, iv_card3, iv_card4, iv_card5, iv_card6;
    List<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_deck = findViewById(R.id.iv_deck);
        iv_card1 = findViewById(R.id.iv_card1);
        iv_card2 = findViewById(R.id.iv_card2);
        iv_card3 = findViewById(R.id.iv_card3);
        iv_card4 = findViewById(R.id.iv_card4);
        iv_card5 = findViewById(R.id.iv_card5);
        iv_card6 = findViewById(R.id.iv_card6);

        iv_card1.setVisibility(View.INVISIBLE);
        iv_card2.setVisibility(View.INVISIBLE);
        iv_card3.setVisibility(View.INVISIBLE);
        iv_card4.setVisibility(View.INVISIBLE);
        iv_card5.setVisibility(View.INVISIBLE);
        iv_card6.setVisibility(View.INVISIBLE);


        cards = new ArrayList<>();

        cards.add(109); //nine of clubs
        cards.add(110);//ten of clubs
        cards.add(112);//jack of clubs
        cards.add(113);//queen of clubs
        cards.add(114);//king of clubs
        cards.add(111);//ace of clubs
        cards.add(209); //nine of diamonds
        cards.add(210);//ten of diamonds
        cards.add(212);//jhack of diamonds
        cards.add(213);//queen of diamonds
        cards.add(214);//king of diamonds
        cards.add(211);//ace of diamonds
        cards.add(309); //nine of clubs
        cards.add(310);//ten of hearts
        cards.add(312);//jhack of hearts
        cards.add(313);//queen of hearts
        cards.add(314);//king of hearts
        cards.add(311);//ace of hearts
        cards.add(409); //nine of spades
        cards.add(410);//ten of spades
        cards.add(412);//jhack of spades
        cards.add(413);//queen of spades
        cards.add(414);//king of spades
        cards.add(411);//ace of spades


        iv_deck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(cards);
                assigntImages(cards.get(0), iv_card1);
                assigntImages(cards.get(1), iv_card2);
                assigntImages(cards.get(2), iv_card3);
                assigntImages(cards.get(3), iv_card4);
                assigntImages(cards.get(4), iv_card5);
                assigntImages(cards.get(5), iv_card6);

                iv_card1.setVisibility(View.VISIBLE);
                iv_card2.setVisibility(View.VISIBLE);
                iv_card3.setVisibility(View.VISIBLE);
                iv_card4.setVisibility(View.VISIBLE);
                iv_card5.setVisibility(View.VISIBLE);
                iv_card6.setVisibility(View.VISIBLE);
            }
        });
    }
//thưa thầy vì quá nhiều là bài nên em chỉ lấy 24 lá trong trổng số 52 là đồng thời thay vì rút 3 lá em tăng lên 6 lá

    public void assigntImages(int card, ImageView image) {
        switch (card) {
            case 109:
                image.setImageResource(R.drawable.clubsnine);
                break;
            case 110:
                image.setImageResource(R.drawable.clubs10);
                break;
            case 112:
                image.setImageResource(R.drawable.jacksclubs);
                break;
            case 113:
                image.setImageResource(R.drawable.queen_of_clubs);
                break;
            case 114:
                image.setImageResource(R.drawable.king_of_clubs);
                break;
            case 111:
                image.setImageResource(R.drawable.ace_of_clubs);
                break;
            case 209:
                image.setImageResource(R.drawable.diamondsnine);
                break;
            case 210:
                image.setImageResource(R.drawable.diamonds10);
                break;
            case 212:
                image.setImageResource(R.drawable.jack_of_diamonds);
                break;
            case 213:
                image.setImageResource(R.drawable.queen_of_diamonds);
                break;
            case 214:
                image.setImageResource(R.drawable.king_of_diamonds);
                break;
            case 211:
                image.setImageResource(R.drawable.ace_of_diamonds);
                break;

            case 309:
                image.setImageResource(R.drawable.heartss9);
                break;
            case 310:
                image.setImageResource(R.drawable.hearts10);
                break;
            case 312:
                image.setImageResource(R.drawable.jack_of_hearts);
                break;
            case 313:
                image.setImageResource(R.drawable.queen_of_hearts);
                break;
            case 314:
                image.setImageResource(R.drawable.king_of_hearts);
                break;
            case 311:
                image.setImageResource(R.drawable.ace_of_hearts);
                break;
            case 409:
                image.setImageResource(R.drawable.spaden9);
                break;
            case 410:
                image.setImageResource(R.drawable.spades10);
                break;
            case 412:
                image.setImageResource(R.drawable.jack_of_spades);
                break;
            case 413:
                image.setImageResource(R.drawable.queen_of_spades);
                break;
            case 414:
                image.setImageResource(R.drawable.king_of_spades);
                break;
            case 411:
                image.setImageResource(R.drawable.ace_of_spades);
                break;
        }
    }

}






