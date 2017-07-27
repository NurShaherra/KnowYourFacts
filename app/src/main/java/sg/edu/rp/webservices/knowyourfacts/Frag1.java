package sg.edu.rp.webservices.knowyourfacts;


import android.app.AlarmManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {
    Button btnColor, btnReadLater;



    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        btnColor = (Button) view.findViewById(R.id.btnChangeClr);


        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] colours = {"#FF0000", "#800000"};
                Random random = new Random();
                int index = random.nextInt(colours.length);
                String color = colours[index];
                getView().setBackgroundColor(Color.parseColor(color));


            }
        });

        btnReadLater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AlarmManager alarm =
            }
        });

        return view;


    }

}
