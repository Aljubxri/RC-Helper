package com.example.rchelperfinalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Muffler extends Fragment {
    RadioGroup muffler_radiogroup;
    RadioButton muffler_enya, muffler_magnum, muffler_thunder, muffler_ys;
    TextView muffler_engine,muffler_crank, muffler_thread;

    public Muffler() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_muffler, container, false);
        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        muffler_radiogroup  = getView().findViewById(R.id.muffler_radiogroup);
        muffler_enya = getView().findViewById(R.id.muffler_enyaradio);
        muffler_magnum = getView().findViewById(R.id.muffler_magnumradio);
        muffler_thunder = getView().findViewById(R.id.muffler_Os);
        muffler_ys = getView().findViewById(R.id.muffler_YSradio);
        muffler_engine = getView().findViewById(R.id.muffler_engine);
        muffler_crank = getView().findViewById(R.id.muffler_crank);
        muffler_thread = getView().findViewById(R.id.muffler_thread);

        muffler_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String engineinfo,crankinfo,threadinfo = "";
                try{
                    if(checkedId == R.id.muffler_enyaradio){
                     engineinfo = "35-4C\n" +
                             "40-4C\n" +
                             "41-4C\n" +
                             "46-4C\n" +
                             "53-4C\n" +
                             "60-4C\n" +
                             "80-4C\n" +
                             "90-4C\n" +
                             "120-4C\n" +
                             "R120-4C\n" +
                             "155-4C\n";
                     crankinfo = "1/4\"-28\n" +
                             "1/4\"-28\n" +
                             "1/4\"-28\n" +
                             "1/4\"-28\n" +
                             "1/4\"-28\n" +
                             "M7x1.0\n" +
                             "M7x1.0\n" +
                             "M7x1.0\n" +
                             "M7x1.0\n" +
                             "M8x1.0\n" +
                             "M8x1.0\n";
                     threadinfo = "M10x0.75\n" +
                             "M10x0.75\n" +
                             "M10x0.75\n" +
                             "M10x0.75\n" +
                             "M10x0.75\n" +
                             "M10x0.75\n" +
                             "M10x0.75\n" +
                             "M11x0.75\n" +
                             "M11x0.75\n" +
                             "M11x0.75\n" +
                             "M11x0.75\n";
                     mufflerhelper(engineinfo,crankinfo,threadinfo);

                    }
                    else if (checkedId == R.id.muffler_magnumradio){
                        engineinfo = "XLFS-30AR\n" +
                                "XLFS-52AR\n" +
                                "XLFS-61AR\n" +
                                "XLFS-70AR\n" +
                                "XLFS-80AR\n" +
                                "XLFS-91AR\n" +
                                "XLFS-120AR\n" +
                                "XLFS-180AR\n";
                        crankinfo = "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "5/16\"-24\n" +
                                "5/16\"-24\n" +
                                "5/16\"-24\n" +
                                "5/16\"-24\n" +
                                "5/16\"-24\n";
                        threadinfo = "M10x1.0\n" +
                                "M10x0.75\n" +
                                "M10x0.75\n" +
                                "M11x0.75\n" +
                                "M11x0.75\n" +
                                "M11x0.75\n" +
                                "M14x0.75\n" +
                                "M14x0.75\n";
                        mufflerhelper(engineinfo,crankinfo,threadinfo);

                    }
                    else if (checkedId == R.id.muffler_Os){
                        engineinfo = "FS-20\n" +
                                "FS-26S\n" +
                                "FS-30S\n" +
                                "FS-40\n" +
                                "FS-40S\n" +
                                "FS-48S\n" +
                                "FS-52S\n" +
                                "FS-56 Alpha\n" +
                                "FS-60\n" +
                                "FS-61\n" +
                                "FS-62V\n" +
                                "FS-70S , SII\n" +
                                "FS-70U\n" +
                                "FS-72 Alpha\n" ;
                        crankinfo = "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "1/4\"-28\n" +
                                "5/16\"-24\n" +
                                "5/16\"-24\n" +
                                "1/4\"-28\n" +
                                "5/16\"-24\n" +
                                "1/4\"-28\n" +
                                "1/4\"-28\n"  ;
                        threadinfo = "M9x0.75\n" +
                                "M9x0.75\n" +
                                "M9x0.75\n" +
                                "M10x0.75\n" +
                                "M10x0.75\n" +
                                "M10x0.75\n" +
                                "M10x0.75\n" +
                                "M10x0.75\n" +
                                "M10x0.75\n" +
                                "M10x0.75\n" +
                                "M10x0.75\n" +
                                "M11x0.75\n" +
                                "M11x0.75\n" +
                                "M11x0.75\n";
                        mufflerhelper(engineinfo,crankinfo,threadinfo);

                    }
                    else if (checkedId == R.id.muffler_YSradio){
                        engineinfo = "FZ-53\n" +
                                "FZ-63\n" +
                                "FZ-70\n" +
                                "FZ-91\n" +
                                "FZ-110\n" +
                                "FZ-115\n"+
                                "FZ-120\n" +
                                "FZ-140\n" +
                                "FZ-160\n" +
                                "FZ-170\n" +
                                "FZ-175\n";

                        crankinfo = "M6x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n" +
                                "M8x1.0\n";
                        threadinfo = "M11x0.75\n" +
                                "M11x0.75\n" +
                                "M11x0.75\n" +
                                "M13x1.0\n" +
                                "M13x1.0\n" +
                                "M13x1.0\n" +
                                "M13x1.0\n" +
                                "M13x1.0\n" +
                                "M13x1.0\n" +
                                "M13x1.0\n" +
                                "M13x1.0\n";
                        mufflerhelper(engineinfo,crankinfo,threadinfo);

                    }

                }catch(Exception e){

                }
            }
        });



    }
    public void mufflerhelper(String eng,String cran,String thrd){
        muffler_engine.setText("Engine:\n"+eng);
        muffler_crank.setText("Crank shaft thread:\n"+cran);
        muffler_thread.setText("Muffler thread:\n"+thrd);
    }

}

