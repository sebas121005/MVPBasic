package com.example.mainmvp.presenter;

import com.example.mainmvp.model.Libro;
import com.example.mainmvp.model.LibroInterfaz;
import com.example.mainmvp.view.ViewInterfaz;

public class LibroPresenter implements LibroPresenterInterfaz {

    private LibroInterfaz libroInterfaz = new Libro(this);

    @Override
    public String mostrarNombreLibro() {
        return libroInterfaz.mostrarNombreLibro();
    }

    @Override
    public void guardarLibro(String nombreLibro) {
        libroInterfaz.guardarLibro(nombreLibro);
    }
}
