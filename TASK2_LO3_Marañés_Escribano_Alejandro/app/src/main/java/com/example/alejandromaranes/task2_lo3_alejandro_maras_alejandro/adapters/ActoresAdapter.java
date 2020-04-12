package com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.R;
import com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.beans.Actor;

import java.util.List;


public class ActoresAdapter extends ArrayAdapter<Actor>{

    private final Context context;
    private int resource;
    private List<Actor> objects;

    public ActoresAdapter(@NonNull Context context, int resource, @NonNull List<Actor> objects) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    private class ViewHolder{
        TextView txtActor1;
        TextView txtActor2;
        TextView txtHombre;
        TextView txtMujer;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View item = convertView;
        ViewHolder viewHolder;
        if(item == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            item = layoutInflater.inflate(resource,null);
            viewHolder = new ViewHolder();
            viewHolder.txtActor1 = item.findViewById(R.id.txtActor1);
            viewHolder.txtActor2 = item.findViewById(R.id.txtActor2);
            viewHolder.txtHombre = item.findViewById(R.id.txtHombre);
            viewHolder.txtMujer  = item.findViewById(R.id.txtMujer);

            item.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) item.getTag();
        }
        Actor actor = objects.get(position);
        viewHolder.txtActor1.setText(actor.getActor1());
        viewHolder.txtActor2.setText(actor.getActor2());
        viewHolder.txtHombre.setText(String.valueOf(actor.getHombre()));
        viewHolder.txtMujer.setText(String.valueOf(actor.getMujer()));
        return item;
    }
}
