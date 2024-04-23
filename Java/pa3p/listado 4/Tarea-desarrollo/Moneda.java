package Tarea-desarrollo;

import Moneda;

abstract class Moneda {

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    public Moneda() {

    }
}
