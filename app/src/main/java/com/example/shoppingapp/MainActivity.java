package com.example.shoppingapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ShoppingItem> shoppinglist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shoppinglist = new ArrayList<>();
        populateShoppingList();

        ListView lvShoppingList = findViewById(R.id.shoppingListView);

        lvShoppingList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailViewActivity.class);
                intent.putExtra("imageid", shoppinglist.get(position).getImageID());
                intent.putExtra("title", shoppinglist.get(position).getTitle());
                intent.putExtra("description", shoppinglist.get(position).getDescription());
                startActivity(intent);
            }
        });

        ShoppingListAdapter adapter = new ShoppingListAdapter(this, shoppinglist);

        lvShoppingList.setAdapter(adapter);
    }

    private void populateShoppingList() {
        Resources res = getResources();

        ShoppingItem appleItem = new ShoppingItem(R.drawable.apples, res.getString(R.string.apple_title), res.getString(R.string.apple_desc));
        ShoppingItem bananaItem = new ShoppingItem(R.drawable.bananas, res.getString(R.string.banana_title), res.getString(R.string.banana_desc));
        ShoppingItem dragonfruitItem = new ShoppingItem(R.drawable.dragonfruits, res.getString(R.string.dragonfruit_title), res.getString(R.string.dragonfruit_desc));

        shoppinglist.add(appleItem);
        shoppinglist.add(bananaItem);
        shoppinglist.add(dragonfruitItem);

    }
}
