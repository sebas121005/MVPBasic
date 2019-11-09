package com.example.mainmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mainmvp.R;
import com.example.mainmvp.presenter.LibroPresenter;

public class MainActivity extends AppCompatActivity implements ViewInterfaz {

    private LibroPresenter libroPresenter;
    private TextView txtMostrarLibro;
    private Button btnGuardarLibro;
    private EditText editNombreLibro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMostrarLibro = findViewById(R.id.mostrarLibro);
        btnGuardarLibro = findViewById(R.id.guardarLibro);
        editNombreLibro = findViewById(R.id.nombreLibro);

        libroPresenter = new LibroPresenter();


        mostrarNombreLibro();

    }

    @Override
    public String mostrarNombreLibro() {

        btnGuardarLibro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreLibro = editNombreLibro.getText().toString();
                final String libro = nombreLibro;

                libroPresenter.guardarLibro(libro);

                txtMostrarLibro.setText(mostrarNombreLibro());
            }
        });
        return libroPresenter.mostrarNombreLibro();
    }
}
