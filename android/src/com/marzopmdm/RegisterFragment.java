package com.marzopmdm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    public EditText etuserreg;
    public EditText etpassreg;
    public Button btnAceptar;
    public Button btnCancelar;

    public RegisterFragmentListener listener;



    public RegisterFragment() {
        // Required empty public constructor
    }
    public void setListener(RegisterFragmentListener listener){
        this.listener=listener;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);

        
    }

}
