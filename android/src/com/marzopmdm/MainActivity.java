package com.marzopmdm;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    LoginFragment loginFragment;
    RegisterFragment registerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
class MainActivityEvents implements  LoginFragmentListener, RegisterFragmentListener,FireBaseAdminListener{
    MainActivity mainActivity;

    @Override
    public void fireBaseAdmin_RegisterOK(boolean blOK) {

    }

    @Override
    public void fireBaseAdmin_LoginOK(boolean blOK) {

    }

    @Override
    public void loginFragmentLoginButtonClicked(String sUser, String sPassword) {

    }

    @Override
    public void loginFragmentRegisterButtonClicked() {

    }

    @Override
    public void registerFragmentBtnAceptarClicked(String sUser, String sPass) {

    }

    @Override
    public void registerFragmentBtnCancelarClicked() {

    }
}

