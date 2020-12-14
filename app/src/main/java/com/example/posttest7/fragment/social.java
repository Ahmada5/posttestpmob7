package com.example.posttest7.fragment;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.posttest7.R;

public class social extends Fragment {
    ImageButton masukig, masukyt, masukmap, masukweb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_social, container, false);

        masukig = view.findViewById(R.id.IG);
        masukyt = view.findViewById(R.id.YT);
        masukmap = view.findViewById(R.id.MAPS);
        masukweb = view.findViewById(R.id.CHROME);

        masukig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/ahmada_404/"));
                startActivity(intent);
            }
        });
        masukyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCFlNmpHc2LNLDtjcHYapkQA?view_as=subscriber"));
                startActivity(intent);
            }
        });
        masukmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.id/maps/dir/-7.9716969,110.2807468/Universitas+Ahmad+Dahlan+-+Kampus+4,+Jalan+Ringroad+Selatan,+Kragilan,+Tamanan,+Bantul,+Daerah+Istimewa+Yogyakarta/@-7.9712541,110.2825894,14.56z/data=!4m9!4m8!1m0!1m5!1m1!1s0x2e7a5701a2ae1c23:0x173dbeeddc56d9e!2m2!1d110.3831212!2d-7.8332349!3e0"));
                startActivity(intent);
            }
        });
        masukweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://tif.uad.ac.id"));
                startActivity(intent);
            }
        });

        return null;
    }
}