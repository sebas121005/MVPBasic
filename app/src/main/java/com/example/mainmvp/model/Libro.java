package com.example.mainmvp.model;

import com.example.mainmvp.presenter.LibroPresenter;
import com.example.mainmvp.presenter.LibroPresenterInterfaz;

public class Libro implements LibroInterfaz {

    String nombreLibro;
    private LibroPresenterInterfaz presenterInterfaz;

    public Libro(LibroPresenterInterfaz presenterInterfaz) {
        this.presenterInterfaz = presenterInterfaz;
    }

    @Override
    public String mostrarNombreLibro() {
        return this.nombreLibro;
    }

    @Override
    public void guardarLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;


    }
}
