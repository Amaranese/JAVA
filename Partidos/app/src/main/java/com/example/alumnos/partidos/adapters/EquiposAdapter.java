package com.example.alumnos.partidos.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.alumnos.partidos.R;
import com.example.alumnos.partidos.beans.Partido;

import java.util.List;

/**
 * EquiposAdapter
 */

public class EquiposAdapter extends ArrayAdapter<Partido>{
    private Context context;
    private int resource;
    private List<Partido> objects;

    public EquiposAdapter(@NonNull Context context, int resource, @NonNull List<Partido> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    private class ViewHolder{
        TextView txtEqu1;
        TextView txtEqu2;
        TextView txtGoles1;
        TextView txtGoles2;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item = convertView;
        ViewHolder viewHolder;
        if(item == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            item = layoutInflater.inflate(resource,null);
            viewHolder = new ViewHolder();
            viewHolder.txtEqu1 = item.findViewById(R.id.txtEqu1);
            viewHolder.txtEqu2 = item.findViewById(R.id.txtEqu2);
            viewHolder.txtGoles1 = item.findViewById(R.id.txtGoles1);
            viewHolder.txtGoles2 = item.findViewById(R.id.txtGoles2);

            item.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) item.getTag();
        }

        Partido partido = objects.get(position);
        viewHolder.txtEqu1.setText(partido.getEquipo1());
        viewHolder.txtEqu2.setText(partido.getEquipo2());
        viewHolder.txtGoles1.setText(String.valueOf(partido.getGoles1()));
        viewHolder.txtGoles2.setText(String.valueOf(partido.getGoles2()));
        return item;
    }
}
