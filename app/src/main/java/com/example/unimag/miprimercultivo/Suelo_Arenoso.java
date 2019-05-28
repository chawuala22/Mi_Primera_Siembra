package com.example.unimag.miprimercultivo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;


public class Suelo_Arenoso extends Fragment {
    View mView;

    Button Bmeters;



    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

            mView=inflater.inflate(R.layout.fragment_suelo__arenoso, container, false);

                   Bmeters=(Button)mView.findViewById(R.id.buttonarenoso);
            Bmeters.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent( getContext() ,Example_Arenoso.class);
                    startActivity(intent);
                }
            });





            return mView;
    }




}
