package com.example.demo.problem3.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo.R;
import com.google.android.material.snackbar.Snackbar;


public class SnackbarFactory {

    public static Snackbar createSnackbar(Context context, View view, String message) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
        ViewGroup group = (ViewGroup) snackbar.getView();
        group.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        return snackbar;
    }
}