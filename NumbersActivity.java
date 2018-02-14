package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Um", "lutti", R.drawable.number_one));
        words.add(new Word("Dois", "otiiko", R.drawable.number_two));
        words.add(new Word("Três", "tolookosu", R.drawable.number_three));
        words.add(new Word("Quatro", "oyyisa", R.drawable.number_four));
        words.add(new Word("Cinco", "massokka", R.drawable.number_five));
        words.add(new Word("Seis", "temmokka", R.drawable.number_six));
        words.add(new Word("Sete", "kenekaku", R.drawable.number_seven));
        words.add(new Word("Oito", "kawinta", R.drawable.number_eight));
        words.add(new Word("Nove", "wo'e", R.drawable.number_nine));
        words.add(new Word("Dez", "na'aacha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
                mMediaPlayer.start();
            }
        });
    }
}