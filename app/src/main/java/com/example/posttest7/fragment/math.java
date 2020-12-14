package com.example.posttest7.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.posttest7.R;

public class math extends Fragment {
    EditText tabung_jari, tabung_tinggi;
    Button hitung_volume, hitung_luas;
    TextView hasil_luas, hasil_volume;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_math,container,false);

        tabung_jari = view.findViewById(R.id.jari);
        tabung_tinggi = view.findViewById(R.id.tinggi);
        hitung_volume = view.findViewById(R.id.volume);
        hitung_luas = view.findViewById(R.id.luas);
        hasil_luas = view.findViewById(R.id.hasil_L);
        hasil_volume = view.findViewById(R.id.hasil_V);

        hitung_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double jarifix = Integer.parseInt(tabung_jari.getText().toString());
                    double tinggifix = Integer.parseInt(tabung_tinggi.getText().toString());
                    double hasilV = (3.14*jarifix*jarifix*tinggifix);
                    hasil_volume.setText(String.valueOf(hasilV));
            }
        });

        hitung_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jarifix = Integer.parseInt(tabung_jari.getText().toString());
                double tinggifix = Integer.parseInt(tabung_tinggi.getText().toString());
                double hasilL = (2*3.14*jarifix*(jarifix+tinggifix));
                hasil_volume.setText(String.valueOf(hasilL));

            }
        });
        return view;
    }
}