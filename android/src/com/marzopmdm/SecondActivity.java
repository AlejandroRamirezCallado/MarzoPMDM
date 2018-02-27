package com.marzopmdm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.GenericTypeIndicator;

import java.util.ArrayList;
import java.util.Map;

public class SecondActivity extends AppCompatActivity {
   ListaMensajeFragment listaMensajeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SecondActivityEvents events = new SecondActivityEvents(this);
        DataHolder.instance.fireBaseAdmin.setListener(events);

        listaMensajeFragment=(ListaMensajeFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentListaMensajes);

        DataHolder.instance.fireBaseAdmin.descargarYObservarRama("messages");


    }

}
class SecondActivityEvents implements FireBaseAdminListener{
    SecondActivity secondActivity;

    public SecondActivityEvents(SecondActivity secondActivity){
        this.secondActivity=secondActivity;
    }





        @Override
    public void fireBaseAdmin_RegisterOK(boolean blOK) {

    }

    @Override
    public void fireBaseAdmin_LoginOK(boolean blOK) {

    }

    @Override
    public void fireBaseAdmin_RamaDescargargada(String rama, DataSnapshot dataSnapshot) {
        Log.v("SecondActivity", rama + "----" + dataSnapshot);



    }
}
