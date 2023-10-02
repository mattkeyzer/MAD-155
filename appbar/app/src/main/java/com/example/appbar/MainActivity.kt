package com.example.appbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // The Toolbar defined in the layout has the id "my_toolbar".
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }
    class MyActivity : AppCompatActivity() {
        // ...
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.delete -> {
            Toast.makeText(this, "Delete message",
                Toast.LENGTH_LONG).show();
            // User chooses the "Settings" item. Show the app settings UI.
            true
        }

        R.id.bunny -> {
            Toast.makeText(this, "WOW Bunny!",
                Toast.LENGTH_LONG).show();
            // User chooses the "Favorite" action. Mark the current item as a
            // favorite.
            true
        }

        else -> {
            // The user's action isn't recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}