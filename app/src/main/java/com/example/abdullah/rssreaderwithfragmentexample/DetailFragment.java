package com.example.abdullah.rssreaderwithfragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by abdullah on 20.11.2017.
 */

public class DetailFragment extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rssitem_detail,container,false);
        return view;
    }

    public void setText(String text){
        TextView textView = (TextView) getView().findViewById(R.id.detailsText);
        textView.setText(text);
    }
}
