package com.marzopmdm;

import com.google.firebase.database.DataSnapshot;

/**
 * Created by alejandro on 27/2/18.
 */

public interface FireBaseAdminListener {
    public void fireBaseAdmin_RegisterOK(boolean blOK);
    public void fireBaseAdmin_LoginOK(boolean blOK);
    public void fireBaseAdmin_RamaDescargargada(String rama, DataSnapshot dataSnapshot);
}
