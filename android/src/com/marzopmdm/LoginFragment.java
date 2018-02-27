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
public class LoginFragment extends Fragment {

    public EditText etUsername;
    public EditText etPassword;
    public Button  btnLogin;
    public Button btnRegistrarse;

    public LoginFragmentEvents events;
    public LoginFragmentListener listener;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

}

class LoginFragmentEvents implements View.OnClickListener {

    private LoginFragment loginFragment;

    public LoginFragmentEvents(LoginFragment fragment) {

        this.loginFragment = fragment;
    }


    @Override
    public void onClick(View view) {
        
    }
}