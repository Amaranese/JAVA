package example.com.gruposmusica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    public static final String URL = "https://docs.google.com/uc?export=open&id=19LC-uf-H-VBQfA-tey7We4JgnBnb0nW5";

    private ListView lvGrupos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Lista de grupos");

        solicitarURL(URL);
    }

    public void solicitarURL(String url) {
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            List<Grupo> grupos = parsearRespuesta(response);
                            Log.d(TAG,response);
                            rellenarLista(grupos);
                        } catch (JSONException e) {
                            Log.d(TAG,"Error:" + e.getMessage());
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG,"Error:" + error.getMessage());
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    public List<Grupo> parsearRespuesta(String respuesta) throws JSONException {
        List<Grupo> grupos = new ArrayList<>();

        JSONObject raiz = new JSONObject(respuesta);
        JSONArray arrayGrupos = raiz.getJSONArray("grupos");
        for(int i=0;i<arrayGrupos.length();i++) {
            JSONObject gr =  (JSONObject) arrayGrupos.get(i);
            String nombre = gr.getString("nombre");
            String descripcion = gr.getString("descripcion");
            String imagen = gr.getString("imagen");
            Grupo g = new Grupo();
            g.setNombre(nombre);
            g.setDescripcion(descripcion);
            g.setImagen(imagen);

            grupos.add(g);
        }

        return grupos;
    }

    public void rellenarLista(List<Grupo> grupos) {
        //aqui lo pone en un listview
        lvGrupos = (ListView) findViewById(R.id.lvGrupos);

        ListaGrupoAdapter adapter = new ListaGrupoAdapter(this,grupos);

        lvGrupos.setAdapter(adapter);
        lvGrupos.setOnItemClickListener(adapter);
    }
}
