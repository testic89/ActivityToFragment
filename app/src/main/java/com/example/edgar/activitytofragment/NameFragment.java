package com.example.edgar.activitytofragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class NameFragment extends Fragment {

//    private Button btnGoToActivityUmur;

    public NameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        TextView textView = new TextView(getActivity());
        textView.setText("Hello, This is NameFragment");

        return textView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        btnGoToActivityUmur = view.findViewById(R.id.btn_go_to_umur);
//
//        btnGoToActivityUmur.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), UmurActivity.class);
//                Objects.requireNonNull(getActivity()).startActivity(intent);
//            }
//        });
    }
}
