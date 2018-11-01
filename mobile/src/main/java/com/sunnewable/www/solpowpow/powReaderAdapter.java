package com.sunnewable.www.solpowpow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import java.util.ArrayList;

public class powReaderAdapter extends RecyclerView.Adapter<powerReaderHolder> {

    private Context context;
    private ArrayList<PowReader> power;

    public powReaderAdapter(Context context, ArrayList<PowReader> power ){
        this.context =context;
        this.power = power;
    }

    @NonNull
    @Override
    public powerReaderHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row, parent , false);
        return new powerReaderHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull powerReaderHolder holder, int pos) {
        PowReader Temp = power.get(pos);
        holder.setInfo(Temp);
    }

    @Override
    public int getItemCount() {
        return power.size();
    }
}

