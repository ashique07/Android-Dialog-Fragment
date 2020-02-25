package com.hfad.dialogfragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//Use onCreateView when the entire view of the dialog is going to be defined via custom XML.
// Use onCreateDialog when you just need to construct and configure a standard Dialog class (such as AlertDialog) to display.

public class CustomDialogFragment extends DialogFragment {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        //ALL the stuff
        View rootView = inflater.inflate(R.layout.fragment_edit_name, container,
                false);

        setCancelable(false);

        getDialog().setTitle("DialogFragment Tutorial");


        return rootView;
    }


}
