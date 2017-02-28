package com.hackingbuzz.viewpager3tab1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Fragment2 extends Fragment {

    private Toolbar toolbar;
    private ImageView back_button, appicon, icon;
    private TextView title;
    private LinearLayout back;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment2, container, false);

        return v;
    }



    }























