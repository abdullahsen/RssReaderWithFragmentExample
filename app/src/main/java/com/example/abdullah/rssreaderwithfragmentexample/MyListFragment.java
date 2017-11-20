package com.example.abdullah.rssreaderwithfragmentexample;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by abdullah on 20.11.2017.
 */

public class MyListFragment extends Fragment {

    private OnItemSelectedListener listener;

    public interface OnItemSelectedListener{
        public void onRssSelected(String link);

    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rsslist_overview,container,false);
        Button button = (Button) view.findViewById(R.id.updateButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail("fake");
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnItemSelectedListener){
            listener = (OnItemSelectedListener)context;
        }else{
            throw new ClassCastException(context.toString()+" MyListFragment.OnItemSelectedListener interfacenin implement" +
                    " edilmesi gerekir");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    private void updateDetail(String fake) {

        String newTime =String.valueOf(System.currentTimeMillis());
        listener.onRssSelected(newTime);
    }
}
