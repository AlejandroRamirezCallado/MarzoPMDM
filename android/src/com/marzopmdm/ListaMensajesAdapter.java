package com.marzopmdm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alejandro on 27/2/18.
 */

public class ListaMensajesAdapter extends RecyclerView.Adapter<MensajeViewHolder> {
    @Override
    public MensajeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.celda_mensaje_layout, null);
        MensajeViewHolder mensajeViewHolder = new MensajeViewHolder(view);
        return mensajeViewHolder;
    }

    @Override
    public void onBindViewHolder(MensajeViewHolder holder, int position) {
        holder.textomensaje.setText("Posicion"+position);
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

class MensajeViewHolder extends RecyclerView.ViewHolder {
    public TextView textomensaje;

    public MensajeViewHolder(View itemView) {
        super(itemView);
    }
}
