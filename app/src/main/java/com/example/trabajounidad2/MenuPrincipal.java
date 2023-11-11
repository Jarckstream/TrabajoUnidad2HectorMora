package com.example.trabajounidad2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MenuPrincipal extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    private TextView tv1;

    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        tv1 = findViewById(R.id.et_nombre2);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Bienvenido " + dato);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {

    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng Dentista = new LatLng(-38.73422747126165, -72.60213053855654);
        mMap.addMarker(new MarkerOptions().position(Dentista).title("Centro de atención dental"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Dentista));

    }
    public void Agenda (View view){
        Intent i = new Intent(this, Agenda.class);
        startActivity(i);
    }
}