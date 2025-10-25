package com.example.shoppingapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ShoppingItem> shoppinglist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the shopping list
        shoppinglist = new ArrayList<>();
        populateShoppingList();

        // Find the ListView
        ListView lvShoppingList = findViewById(R.id.shoppingListView);

        // Create the adapter
        ShoppingListAdapter adapter = new ShoppingListAdapter(this, shoppinglist);

        // Set the adapter to the ListView
        lvShoppingList.setAdapter(adapter);
    }

    private void populateShoppingList() {
        Resources res = getResources();

        // For now, we hardcode the items. Later, this could come from a database or API.
        // Make sure you have 'apples', 'bananas', and 'dragonfruits' in your res/drawable folder
        // and the corresponding string resources.
        ShoppingItem appleItem = new ShoppingItem(R.drawable.apples, res.getString(R.string.apple_title), res.getString(R.string.apple_desc));
        ShoppingItem bananaItem = new ShoppingItem(R.drawable.bananas, res.getString(R.string.banana_title), res.getString(R.string.banana_desc));
        ShoppingItem dragonfruitItem = new ShoppingItem(R.drawable.dragonfruits, res.getString(R.string.dragonfruit_title), res.getString(R.string.dragonfruit_desc));

        // Add the items to the list
        shoppinglist.add(appleItem);
        shoppinglist.add(bananaItem);
        shoppinglist.add(dragonfruitItem);

    }
}
