package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        ImageView moreButton = (ImageView) findViewById(R.id.moreButton);

        // Set a click listener on that View
        moreButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SubmenuActivity}
                Intent moreIntent = new Intent(PlaylistsActivity.this,SubmenuActivity.class);

                // Start the new activity
                startActivity(moreIntent);
            }
        });

        ImageView moreButtonViewList = (ImageView) findViewById(R.id.moreBtnViewList);

        // Set a click listener on that View
        moreButtonViewList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SubmenuActivityActivity}
                Intent moreIntent = new Intent(PlaylistsActivity.this,SubmenuActivity.class);

                // Start the new activity
                startActivity(moreIntent);
            }
        });

        ImageView moreBtnViewList2 = (ImageView) findViewById(R.id.moreBtnViewList2);

        // Set a click listener on that View
        moreBtnViewList2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SubmenuActivityActivity}
                Intent moreIntent = new Intent(PlaylistsActivity.this,SubmenuActivity.class);

                // Start the new activity
                startActivity(moreIntent);
            }
        });

    }
}
