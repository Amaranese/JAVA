package example.com.gruposmusica;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.List;

public class ListaGrupoAdapter extends ArrayAdapter<Grupo> implements AdapterView.OnItemClickListener {

    static class ViewHolder {
        TextView tvNombre;
        TextView tvDescripcion;
        ImageView ivImagen;
    }

    public ListaGrupoAdapter(Context context, List<Grupo> grupos) {
        super(context, 0, grupos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Grupo grupo = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_grupo, parent, false);
        }
        // Lookup view for data population
        TextView tvNombre = (TextView) convertView.findViewById(R.id.tvNombre);
        TextView tvDescripcion = (TextView) convertView.findViewById(R.id.tvDescripcion);
        ImageView ivImagen = (ImageView) convertView.findViewById(R.id.ivImagen);
        // Populate the data into the template view using the data object

        tvNombre.setText(grupo.getNombre());
        tvDescripcion.setText(grupo.getDescripcion());

        if(grupo.getImagen().contains("http://"))
            grupo.setImagen(grupo.getImagen().replace("http://","https://"));

        // la foto ahora...
        new DownloadImageTask(ivImagen).execute(grupo.getImagen());

        // Return the completed view to render on screen
        return convertView;
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }
        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
            }
            return mIcon;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Grupo grupo = getItem(position);

        Intent intent = new Intent(getContext(),DetalleActivity.class);
        intent.putExtra("grupo",grupo);
        getContext().startActivity(intent);

    }

}
