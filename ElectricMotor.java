package com.example.rchelperfinalproject;

import android.os.Bundle;
import android.view.Gravity;
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
public class ElectricMotor extends Fragment{

    Button e1b, e2b, e3b, e4b;
    EditText e1et, e1et2, e2et, e2et2, e3et, e3et2, e4et, e4et2;
    TextView e1result, e2result, e3result, e4result;

    public ElectricMotor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_electricmotor, container, false);
        // Inflate the layout for this fragment




        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //code here

        //Equation 1
        e1b  = getView().findViewById(R.id.e1button);
        e1et = getView().findViewById(R.id.e1_KV);
        e1et2 = getView().findViewById(R.id.e1_volts);
        e1result = getView().findViewById(R.id.e1_result);
        e1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp1, temp2, temp3 = 0;
                    temp1 = Double.parseDouble(e1et.getText().toString());
                    temp2 = Double.parseDouble(e1et2.getText().toString());
                    temp3 = temp1 * temp2;
                    String result = String.format("%.2f",temp3);
                    result = result + "\n RPM";
                    e1result.setText(result);
                }catch (Exception e){
                    Toast.makeText(getActivity(),"Please enter integers or decimals in both fields!",Toast.LENGTH_LONG).show();
                }



            }
        });
        //Equation 2
        e2b  = getView().findViewById(R.id.e2_button);
        e2et = getView().findViewById(R.id.e2_amps);
        e2et2 = getView().findViewById(R.id.e2_volts);
        e2result = getView().findViewById(R.id.e2_result);
        e2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double temp1, temp2, temp3 = 0.0;
                    temp1 = Double.parseDouble(e2et.getText().toString());
                    temp2 = Double.parseDouble(e2et2.getText().toString());
                    temp3 = temp1 * temp2;
                    String result = String.format("%.2f",temp3);
                    result = result + "\n Watts";
                    e2result.setText(result);

                }catch (Exception e){
                    Toast.makeText(getActivity(),"Please enter integers or decimals in both fields!",Toast.LENGTH_LONG).show();
                }
            }
        });
        //Equation 3
        e3b  = getView().findViewById(R.id.e3_button);
        e3et = getView().findViewById(R.id.e3_volts);
        e3et2 = getView().findViewById(R.id.e3_watts);
        e3result = getView().findViewById(R.id.e3_result);
        e3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double temp1, temp2, temp3 = 0.0;
                    temp1 = Double.parseDouble(e3et.getText().toString());
                    temp2 = Double.parseDouble(e3et2.getText().toString());
                    temp3 = temp1/temp2;
                    String result = String.format("%.2f",temp3);
                    result = result + "\n Amps";
                    e3result.setText(result);

                }catch(Exception e){
                    Toast.makeText(getActivity(),"Please enter integers or decimals in both fields!",Toast.LENGTH_LONG).show();
                }
            }
        });
        //Equation 4
        e4b  = getView().findViewById(R.id.e4_button);
        e4et = getView().findViewById(R.id.e4_rpm);
        e4et2 = getView().findViewById(R.id.e4_kv);
        e4result = getView().findViewById(R.id.e4_result);
        e4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double temp1, temp2, temp3 = 0.0;
                    temp1 = Double.parseDouble(e4et.getText().toString());
                    temp2 = Double.parseDouble(e4et2.getText().toString());
                    temp3 = temp1/temp2;
                    String result = String.format("%.2f",temp3);
                    result = result + "\n Volts";
                    e4result.setText(result);

                }catch(Exception e){
                    Toast.makeText(getActivity(),"Please enter integers or decimals in both fields!",Toast.LENGTH_LONG).show();
                }
            }
        });


    }





}

