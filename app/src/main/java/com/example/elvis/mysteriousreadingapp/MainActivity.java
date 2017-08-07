package com.example.elvis.mysteriousreadingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static boolean activeLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        /*
        loadPersistent State code will be here, will check to see if there is an associated account with the app
        activeLogin will be true, if there is no associated account (No active login or the user logged out)
        continue to run the code to process a login
        */

        if(activeLogin)
            setContentView(R.layout.activity_main);
        else
        {
            /*
            Process User Login Credentials (include security for SQL Injections as time allows)
             */
            EditText libraryNumEdit = (EditText) findViewById(R.id.libraryNumberEdit);
            int libraryNum = Integer.parseInt(libraryNumEdit.getText().toString());

            EditText passwordEdit = (EditText) findViewById(R.id.passwordEdit);
            String passw = passwordEdit.getText().toString();

            /*
            Connect to Google Firebase DB and query it for validating user credentials
            If 0 results, modify the TextViews to show that there is an issue
            If login successful ONLY 1 RESULT, then set the associated account
            Update the internal file to reflect the user's information on the Firebase DB (Badges, Books Read, Etc.)
            Commit the change to the internal file (SQLite DB)
            Then change content view to the main page
             */

        }


    }
}
