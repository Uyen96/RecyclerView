package com.example.uyen.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    HeroAdapter mHeroAdapter;
    List<Hero> mHeros = new ArrayList<>() ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createData();
        mRecyclerView = findViewById(R.id.recycler_view);
        mHeroAdapter = new HeroAdapter(this,mHeros);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mHeroAdapter);


    }

    private void createData() {

        Hero hero = new Hero("Bat Man", R.drawable.bat_man);
        mHeros.add(hero);
        hero = new Hero("Captain America", R.drawable.captain_america);
        mHeros.add(hero);
        hero = new Hero("Spider Man", R.drawable.spide_man);
        mHeros.add(hero);
        hero = new Hero("Werewolves", R.drawable.werewolves);
        mHeroAdapter.notifyDataSetChanged();

    }


}
