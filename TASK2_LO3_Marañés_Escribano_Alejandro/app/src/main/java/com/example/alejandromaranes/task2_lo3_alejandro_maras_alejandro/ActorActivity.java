package com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.beans.Actor;
import static com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.MainActivity.KEY_ACTOR;

public class ActorActivity extends AppCompatActivity
        implements View.OnClickListener{

   private TextView txtActor1, txtActor2;
   private Button btnExit;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_actor);

       txtActor1 = findViewById(R.id.txtActor1);
       txtActor2 = findViewById(R.id.txtActor2);
       btnExit = findViewById(R.id.btnExit);
       btnExit.setOnClickListener(ActorActivity.this);

       Intent intent = getIntent();
       String json = intent.getStringExtra(KEY_ACTOR);
       Actor actor = Actor.fromJson(json);

       txtActor1.setText(actor.getActor1()+": "+actor.getHombre());
       txtActor2.setText(actor.getActor2()+": "+actor.getMujer());
   }


    @Override
    public void onClick(View view) { finish(); }
}
