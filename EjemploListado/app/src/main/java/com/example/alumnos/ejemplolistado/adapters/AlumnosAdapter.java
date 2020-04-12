package com.example.alumnos.ejemplolistado.adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.alumnos.ejemplolistado.R;
import com.example.alumnos.ejemplolistado.beans.Alumno;

import java.util.List;

public class AlumnosAdapter extends ArrayAdapter<Alumno> {
    private Context context;
    private int resource;
    private List<Alumno> objects;

    public AlumnosAdapter(@NonNull Context context, int resource, @NonNull List<Alumno> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    private class ViewHolder{
        TextView txtItemNombre;
        TextView txtItemApr;
        TextView txtItemNota;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item = convertView;
        ViewHolder viewHolder;

        if(item == null){
            //nuevo
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            item = layoutInflater.inflate(resource,null);
            viewHolder = new ViewHolder();

            viewHolder.txtItemNombre = item.findViewById(R.id.txtItemNombre);
            viewHolder.txtItemApr = item.findViewById(R.id.txtItemApr);
            viewHolder.txtItemNota = item.findViewById(R.id.txtItemNota);

            item.setTag(viewHolder);
        }else{
            //recupero
            viewHolder = (ViewHolder) item.getTag();
        }

        Alumno alumno = objects.get(position);
        viewHolder.txtItemNombre.setText(alumno.getNombre());
        viewHolder.txtItemNota.setText(String.valueOf(alumno.getNota()));
        viewHolder.txtItemApr.setText(!alumno.isAprobado() ? "Suspenso" : "Aprobado");
        return item;
    }
}
