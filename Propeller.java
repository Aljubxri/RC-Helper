package com.example.rchelperfinalproject;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Propeller extends Fragment {
    RadioGroup prop_radiogroup;
    RadioButton prop_2cycle, prop_4cycle;
    TextView prop_output;
    EditText prop_input;


    public Propeller() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_propeller, container, false);
        // Inflate the layout for this fragment
        return v;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        prop_radiogroup  = getView().findViewById(R.id.prop_radiogroup);
        prop_2cycle = getView().findViewById(R.id.prop_2cycleradio);
        prop_4cycle = getView().findViewById(R.id.prop_4cycleradio);
        prop_output = getView().findViewById(R.id.prop_output);
        prop_input = getView().findViewById(R.id.prop_input);
        prop_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                try{
                    double input = Double.parseDouble(prop_input.getText().toString());
                    String output = "";
                    if(checkedId == R.id.prop_2cycleradio){
                        if (input > 3.5 ){
                            output = "Please make sure you are using a valid 2-Cycle engine size.";
                            prop_output.setText(output);
                        }
                        else if(input >= 2.7){
                            output = "22x8, 22x10, 22x12, 24x8, 24x10, 24x12";
                            prop_output_helper(output);
                        }
                        else if(input >= 2.1){
                            output = "20x8, 20x10";
                            prop_output_helper(output);
                        }
                        else if(input >= 1.8){
                            output = "18x8, 18x10, 20x6, 20x8";
                            prop_output_helper(output);
                        }
                        else if(input >= 1.5){
                            output = "16x8, 16x10, 18x6, 18x8";
                            prop_output_helper(output);
                        }
                        else if (input >= 1.20){
                            output = "14x8, 15x8, 16x6";
                            prop_output_helper(output);
                        }
                        else if(input >= 1.08){
                            output = "14x8, 15x8, 16x6";
                            prop_output_helper(output);
                        }
                        else if (input >= .90){
                            output = "13x6, 13x8, 13x10, 14x6, 14x8";
                            prop_output_helper(output);
                        }
                        else if (input >= .71 && input<.80){
                            output ="12x6, 12x8, 13x6, 13x8, 13x10, 14x8";
                            prop_output_helper(output);
                        }
                        else if (input >= .60){
                            output = "11x5, 11x6, 11x7, 11x7.5, 11x8, 11x9, 11x10";
                            prop_output_helper(output);
                        }
                        else if (input >= .45 && input<.50){
                            output = "10x7, 10x8, 11x4, 11x5, 11x6, 11x7, 11x7.5";
                            prop_output_helper(output);
                        }
                        else if(input >= .40){
                            output = "9.5x6, 10x4, 10x5, 10x6, 10x7, 10x8, 10x9";
                            prop_output_helper(output);
                        }
                        else if (input >= .29 && input<.35){
                            output = "9x6, 9x7, 9x8, 9.5x6 10x4, 10x5, 10x6";
                            prop_output_helper(output);
                        }
                        else if (input >= .20 && input<.25){
                            output = "8x6, 8x7, 9x4, 9x5";
                            prop_output_helper(output);
                        }
                        else if (input>= .15){
                            output = "7x6, 8x3, 8x4, 8x5, 8x6, 8x7";
                            prop_output_helper(output);
                        }
                        else if (input >=.09){
                            output = "7x3, 7x4, 7x5, 7x6";
                            prop_output_helper(output);
                        }
                        else if (input >= .049 && input<.051){
                            output="5.5x4, 5.5x4.5, 6x3, 6x3.5, 6x4";
                            prop_output_helper(output);
                        }
                        else{
                            output = "Please make sure you are using a valid 2-Cycle engine size.";
                            prop_output.setText(output);

                        }
                    } else if (checkedId == R.id.prop_4cycleradio){

                        if (input > 2.11){
                            output = "Please make sure you are using a valid 4-Cycle engine size.";
                            prop_output.setText(output);
                        }
                        else if (input >= 2.10){
                            output = "14x8, 15x8, 15x10, 16x8";
                            prop_output_helper(output);
                        }
                        else if (input >= .90 ){
                            output = "12x8, 13x8, 14x6";
                            prop_output_helper(output);
                        }
                        else if (input >= .60){
                            output = "11x8, 11x9, 12x6, 13x6";
                            prop_output_helper(output);
                        }
                        else if (input >= .40){
                            output = "11x6, 12x6";
                            prop_output_helper(output);
                        }
                        else if (input >= .20 && input<.25){
                            output = "9x4, 9x5, 9x6, 9x7";
                            prop_output_helper(output);
                        }
                        else {
                            output = "Please make sure you are using a valid 4-Cycle engine size.";
                            prop_output.setText(output);
                        }

                    }

                }catch(Exception e){

                }
            }
        });


    }
    public void prop_output_helper(String output){
        String result = "";
        result = "\nPropeller(s) recommended:\n Ex: Disk diameter x Propeller pitch\n" + output;
        prop_output.setText(result);
    }

}

