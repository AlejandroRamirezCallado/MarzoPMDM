package com.marzopmdm;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by alejandro on 27/2/18.
 */

public class FireBaseAdmin {
    private FirebaseAuth mAuth;
    public FireBaseAdminListener listener;
    public FirebaseUser user;

    public FireBaseAdmin(){

        mAuth = FirebaseAuth.getInstance();
       // database = FirebaseDatabase.getInstance();
       // myRefRaiz= database.getReference();
    }


}
