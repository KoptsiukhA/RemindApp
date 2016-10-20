package bel.kaistra.remindapp.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bel.kaistra.remindapp.R;

public class IdeasFragment extends AbstractTabFragment {
    public static final int LAYOUT = R.layout.fragment_example;

    public static IdeasFragment getInstance(Context context) {
        Bundle args = new Bundle();
        IdeasFragment ideasFragment = new IdeasFragment();
        ideasFragment.setArguments(args);
        ideasFragment.setContext(context);
        ideasFragment.setTitle(context.getString(R.string.tab_item_ideas));
        return ideasFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }


}
