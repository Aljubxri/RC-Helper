package com.example.rchelperfinalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class CGFinder extends Fragment {
    Button cg_button;
    TextView cg_output;
    EditText cg_r, cg_s, cg_t;


    public CGFinder() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_cgfinder, container, false);
        // Inflate the layout for this fragment
        return v;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //code here
        cg_button  = getView().findViewById(R.id.cg_button);
        cg_output = getView().findViewById(R.id.cg_result);
        cg_r = getView().findViewById(R.id.cg_r);
        cg_s = getView().findViewById(R.id.cg_s);
        cg_t = getView().findViewById(R.id.cg_t);

        cg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double r,s,t,temp = 0;
                    r = Double.parseDouble(cg_r.getText().toString());
                    s = Double.parseDouble(cg_s.getText().toString());
                    t = Double.parseDouble(cg_t.getText().toString());
                    temp =((r*r+r*t+t*t)/(6*(r+t)))+(s*(r+2*t)/(3*(r+t)));
                    String result = String.format("%.2f",temp);
                    result = "Center of Gravity (cm): " + result;

                    cg_output.setText(result);


                }catch(Exception e){
                    Toast.makeText(getActivity(),"Please enter integers or decimals",Toast.LENGTH_LONG).show();

                }
            }
        });



    }



}

