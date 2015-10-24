package com.lymno.myfridge.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.lymno.myfridge.R;
import com.lymno.myfridge.barcode_scanner.ScannerFragment;
import com.lymno.myfridge.barcode_scanner.ScannerFragmentActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Andre on 24.10.2015.
 */
public class TwoButtonsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflated=inflater.inflate(R.layout.two_buttons_fragment,container,false);
        ButterKnife.bind(inflated);
        inflated.findViewById(R.id.no_code).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ScannerFragmentActivity) getActivity()).openFragment(new FragmentInputProduct());
            }
        });

        inflated.findViewById(R.id.input_code).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ScannerFragmentActivity) getActivity()).openFragment(new FragmentInPutCode());
            }
        });
        return inflated;
    }


}
