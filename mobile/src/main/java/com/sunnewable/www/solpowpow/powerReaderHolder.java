package com.sunnewable.www.solpowpow;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class powerReaderHolder extends RecyclerView.ViewHolder {
    private TextView idday, idtime, idpowin, idpowout, idpowtot;

    public powerReaderHolder(View itemView) {
        super(itemView);
        idday = itemView.findViewById(R.id.idday);
        idtime = itemView.findViewById(R.id.idtime);
        idpowin = itemView.findViewById(R.id.idpowin);
        idpowout = itemView.findViewById(R.id.idpowout);
        idpowtot = itemView.findViewById(R.id.idpowtot);
    }

    public void setInfo( PowReader pow){
        idday.setText(pow.getDay());
        idtime.setText(String.format(Locale.US," Time: %d ", pow.getTime()));
        idpowin.setText(String.format(Locale.US, "Power in: %d watts", pow.getPowin()));
        idpowout.setText(String.format(Locale.US,"Power out: %d watts", pow.getPowout()));
        idpowtot.setText(String.format(Locale.US,"Power total: %d watts", pow.getPowtot()));
    }


}
