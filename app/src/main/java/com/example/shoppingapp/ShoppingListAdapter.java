package com.example.shoppingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ShoppingListAdapter extends ArrayAdapter<ShoppingItem> {

    public ShoppingListAdapter(Context context, ArrayList<ShoppingItem> shoppingItems) {
        super(context, 0, shoppingItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ShoppingItem shoppingItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        ImageView ivItemImage = convertView.findViewById(R.id.groceryImage);
        TextView tvItemName = convertView.findViewById(R.id.title);
        TextView tvItemDescription = convertView.findViewById(R.id.description);

        ivItemImage.setImageResource(shoppingItem.getImageID());
        tvItemName.setText(shoppingItem.getTitle());
        tvItemDescription.setText(shoppingItem.getDescription());

        return convertView;
    }
}
