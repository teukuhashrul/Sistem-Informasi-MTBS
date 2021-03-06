package com.example.sisteminformasimtbs.view.petunjuk;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.sisteminformasimtbs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PetunjukMenu_Fragment extends Fragment implements View.OnClickListener {
    private LinearLayout btn_Definisi;
    private LinearLayout btn_Fungsi ;
    private LinearLayout btn_Tahapan;

    private LinearLayout btn_Kembali ;

    public PetunjukMenu_Fragment() {
        // Required empty public constructor
    }

    public static PetunjukMenu_Fragment newInstance(){
        PetunjukMenu_Fragment res = new PetunjukMenu_Fragment();
        return res;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View res =  inflater.inflate(R.layout.fragment_petunjuk_menu_, container, false);
        this.btn_Definisi = res.findViewById(R.id.btn_Definisi);
        this.btn_Definisi.setOnClickListener(this);

        this.btn_Fungsi = res.findViewById(R.id.btn_Fungsi);
        this.btn_Fungsi.setOnClickListener(this);

        this.btn_Tahapan = res.findViewById(R.id.btn_Tahapan);
        this.btn_Tahapan.setOnClickListener(this);

        this.btn_Kembali = res.findViewById(R.id.btn_Kembali);
        this.btn_Kembali.setOnClickListener(this);

        return res;
    }

    @Override
    public void onClick(View view) {
         Petunjuk_Activity activity = (Petunjuk_Activity) getActivity();
        if(view.getId() == this.btn_Tahapan.getId()){
            activity.goToPetunjukTahapan();
        }else if(view.getId() == this.btn_Fungsi.getId()){
            activity.goToPetunjukFungsi();
        }else if(view.getId() ==this.btn_Definisi.getId()){
            activity.goToPetunjukDefinisi();
        }else if(view == this.btn_Kembali){
            getActivity().finish();
        }
    }
}
