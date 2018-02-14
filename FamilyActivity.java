package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Pai", "әpә", R.drawable.family_father));
        words.add(new Word("Mãe", "әṭa", R.drawable.family_mother));
        words.add(new Word("Filho", "angsi", R.drawable.family_son));
        words.add(new Word("Filha", "tune", R.drawable.family_daughter));
        words.add(new Word("Irmão mais velho", "taachi", R.drawable.family_older_brother));
        words.add(new Word("Irmão mais novo", "chalitti", R.drawable.family_younger_brother));
        words.add(new Word("Irmã mais velha", "teṭe", R.drawable.family_older_sister));
        words.add(new Word("Irmã mais nova", "kolliti", R.drawable.family_younger_sister));
        words.add(new Word("Vó", "ama", R.drawable.family_grandmother));
        words.add(new Word("Vô", "paapa", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
