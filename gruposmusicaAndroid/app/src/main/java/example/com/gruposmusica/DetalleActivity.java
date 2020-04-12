package example.com.gruposmusica;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class DetalleActivity extends AppCompatActivity {

    private TextView tvNombre, tvDescripcion;
    private ImageView ivImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();
        Grupo grupo = (Grupo) intent.getSerializableExtra("grupo");

        setTitle("Detalle de " + grupo.getNombre());

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        ivImagen = (ImageView) findViewById(R.id.ivImagen);

        tvNombre.setText(grupo.getNombre());
        tvDescripcion.setText(grupo.getDescripcion());

        new DetalleActivity.DownloadImageTask(ivImagen).execute(grupo.getImagen());
    }

    public void atras(View v) {
        finish();
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
}
