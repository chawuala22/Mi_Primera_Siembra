package com.example.unimag.miprimercultivo;


import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Suelo_Arcilloso extends Fragment {


    View mView;

    Button Bmeters;



    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mView=inflater.inflate(R.layout.fragment_suelo__arcilloso, container, false);

        Bmeters=(Button)mView.findViewById(R.id.butonarcilla);
        Bmeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( getContext() ,Example_Arcilloso.class);
                startActivity(intent);
            }
        });





        return mView;
    }


}
