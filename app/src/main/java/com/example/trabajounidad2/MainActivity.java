package com.example.trabajounidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ProgressBar pb;
    Button btn1;
    EditText et1;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.et_nombre1);

        pb = findViewById(R.id.progressBar2);
        btn1 = findViewById(R.id.btn_ingresar);

        /*btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb.setVisibility(View.VISIBLE);

                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;

                        pb.setProgress(counter);
                        if (counter == 20 ) {
                            timer.cancel();
                            String nombre = et1.getText().toString();
                            if(nombre.length() == 0){
                                Toast.makeText(MainActivity.this,"Debe ingresar un nombre", Toast.LENGTH_SHORT).show();
                            }
                            if (nombre.length() != 0){
                                Toast.makeText(MainActivity.this,"Bienvenido",Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(MainActivity.this,MenuPrincipal.class);
                                i.putExtra("dato", et1.getText().toString());
                                startActivity(i);
                            }
                        }
                    }
                };
                timer.schedule(timerTask,100,100);

            }


        }); */


    }
    public void Enviar(View v){
        String nombre = et1.getText().toString();
        if (nombre.length() == 0){
            Toast.makeText(this,"DEBES INGRESAR UN NOMBRE",Toast.LENGTH_SHORT).show();
        }
        if(nombre.length() !=0){
            pb.setVisibility(View.VISIBLE);
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    counter++;
                    pb.setProgress(counter);
                    if (counter == 50){
                        timer.cancel();
                    }

                }
            };

            Toast.makeText(this,"GRACIAS",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MenuPrincipal.class);
            i.putExtra("dato", et1.getText().toString()); startActivity(i);
            timer.schedule(timerTask,100,100);
        }
    }
}