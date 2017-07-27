package sg.edu.rp.webservices.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {
    Button btnColor;
    ImageView img;


    public Frag2() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_2, container, false);
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        btnColor = (Button) view.findViewById(R.id.btnChangeClr);
        img = (ImageView) view.findViewById(R.id.myZoomageView);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] colours = {"#FF0000", "#800000", "#000000"};
                Random random = new Random();
                int index = random.nextInt(colours.length);
                String color = colours[index];
                getView().setBackgroundColor(Color.parseColor(color));

            }
        });

//        String imageUrl = "http://square.github.io/picasso/static/sample.png";
//        Picasso.with(Frag2.this).load(imageUrl).into(img);

        return view;


    }



}
