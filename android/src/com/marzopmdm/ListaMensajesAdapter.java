package com.marzopmdm;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by alejandro on 27/2/18.
 */

public class ListaMensajesAdapter extends RecyclerView.Adapter<MensajeViewHolder> {
    @Override
    public MensajeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MensajeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class MensajeViewHolder extends RecyclerView.ViewHolder {

    public MensajeViewHolder(View itemView) {
        super(itemView);
    }
}
