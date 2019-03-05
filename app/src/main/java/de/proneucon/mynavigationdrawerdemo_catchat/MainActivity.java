package de.proneucon.mynavigationdrawerdemo_catchat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TRANSACTIONS
        //Zum start soll das inboxFragment angezeigt werden:
        Fragment fragment = new InboxFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //hinzufügen des Fragments
        transaction.add(R.id.content_frame , fragment);
        transaction.commit();

    }
}
