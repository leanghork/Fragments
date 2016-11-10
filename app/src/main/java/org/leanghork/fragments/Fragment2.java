package org.leanghork.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by leanghork on 11/10/16.
 */

public class Fragment2 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_2, container, false);

        return view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }


}
