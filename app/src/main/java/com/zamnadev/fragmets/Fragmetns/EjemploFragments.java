package com.zamnadev.fragmets.Fragmetns;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zamnadev.fragmets.R;

public class EjemploFragments extends Fragment {

    private onEjemplooFragment listener;

    public EjemploFragments() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ejemplo_fragment,container,false);

        ((Button) view.findViewById(R.id.btnFragmentUno))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listener.invocarFragment();
                    }
                });

        return view;
    }

    public interface onEjemplooFragment
    {
        void invocarFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (EjemploFragments.onEjemplooFragment) context;
        } catch (Exception ex) {
            Log.e("Error","No se implemento la interfaz");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
