package de.proneucon.mynavigationdrawerdemo_catchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);


        // ->Beschaffen der Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        // ->hinzufügen der Toolbar in die SupportActionBar
        setSupportActionBar(toolbar);

    }
}
