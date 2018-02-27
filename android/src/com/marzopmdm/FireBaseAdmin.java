package com.marzopmdm;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
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

    public void setListener(FireBaseAdminListener listener){

        this.listener=listener;
    }

    public void registerConEmailYPassword(String email, String pass, Activity activity){
        mAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //Log.d("FirebaseAdmin", "createUserWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (task.isSuccessful()) {
                            user = FirebaseAuth.getInstance().getCurrentUser();
                            listener.fireBaseAdmin_RegisterOK(true);
                        }
                        else {
                            listener.fireBaseAdmin_RegisterOK(false);
                        }


                    }
                });
    }



}
