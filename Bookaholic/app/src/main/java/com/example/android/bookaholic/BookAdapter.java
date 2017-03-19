package com.example.android.bookaholic;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Preethi on 11/6/16.
 */

public class BookAdapter extends ArrayAdapter<Book> {


    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books   is the list of earthquakes, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Book currentBook = getItem(position);

        // Find the TextView with view ID magnitude
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the magnitude of the current earthquake in that TextView
        titleView.setText(currentBook.getmTitle());


// Find the TextView with view ID magnitude
        TextView authorView = (TextView) listItemView.findViewById(R.id.authors);
        // Display the magnitude of the current earthquake in that TextView
        authorView.setText(currentBook.getmAuthor());


        // Add authors to the list view
        titleView.setText(currentBook.getmTitle());


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
