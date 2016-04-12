package com.example.android.sunshine.app;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/**
 * Created by prashant on 12/4/16.
 */
public interface DetailFragment extends View.OnCreateContextMenuListener {
    void onCreateOptionMenu(Menu menu, MenuInflater inflater);
}
