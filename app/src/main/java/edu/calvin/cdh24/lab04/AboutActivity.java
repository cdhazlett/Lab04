package edu.calvin.cdh24.lab04;

/* This is the about activity for lab04, CS262, Fall 2016.  This app shows a separate activity
   after clicking a menu item.

   @author: Christiaan Hazlett
   @version: 1.0
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    // onCreate runs when the activity is shown
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        // Change the title of the activity
        setTitle("Lab04 - About");
    }
}
