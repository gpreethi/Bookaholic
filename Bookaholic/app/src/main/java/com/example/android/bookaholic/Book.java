package com.example.android.bookaholic; /**
 * Created by Preethi on 11/2/16.
 */


/**
 * An {@link Book} object contains information related to a single book listing.
 */
public class Book {


    private String mTitle;

    private String mAuthor;


    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }


    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public Book(String mTitle, String mAuthor) {

        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
    }
}
