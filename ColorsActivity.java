package com.example.android.miwok;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Vermelho", "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("Verde", "chokokki", R.drawable.color_green));
        words.add(new Word("Marron", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("Cinza", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("Preto", "kululli", R.drawable.color_black));
        words.add(new Word("Branco", "kelelli", R.drawable.color_white));
        words.add(new Word("Amarelo Empoeirado", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("Amarelo Mostarda", "chiwiiṭә", R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
