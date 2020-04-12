package com.example.alumnos.grupos;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumnos.grupos.beans.Band;

import java.util.List;

public class BandAdapter extends ArrayAdapter<Band> {
    private Context context;
    private int resource;
    private List<Band> objects;

    public BandAdapter(@NonNull Context context, int resource, @NonNull List<Band> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    private class ViewHolder {
        ImageView imageViewLogo;
        TextView textViewBandName;
        TextView textViewBio;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item = convertView;
        ViewHolder viewHolder;
        if (item == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            item = layoutInflater.inflate(resource, null);

            viewHolder = new ViewHolder();
            viewHolder.imageViewLogo = item.findViewById(R.id.imageViewLogo);
            viewHolder.textViewBandName = item.findViewById(R.id.textViewBandName);
            viewHolder.textViewBio = item.findViewById(R.id.textViewBio);

            item.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) item.getTag();
        }

        viewHolder.textViewBandName.setText(objects.get(position).getName());
        viewHolder.textViewBio.setText(objects.get(position).getBio());
        viewHolder.imageViewLogo.setImageResource(objects.get(position).getLogo());
        return item;
    }
}
