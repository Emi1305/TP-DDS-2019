package com.dds.tp.anual.Enums;

public enum Tipo {
    ZAPATO      (Categoria.CALZADO),
    CAMISA      (Categoria.PARTE_SUPERIOR),
    SOMBRERO    (Categoria.ACCESORIO),
    PANTALON    (Categoria.PARTE_INFERIOR),
    POLLERA     (Categoria.PARTE_INFERIOR),
    SHORTS      (Categoria.PARTE_INFERIOR),
    REMERA      (Categoria.PARTE_SUPERIOR),
    BOTAS       (Categoria.CALZADO)
    ;




    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    Tipo (Categoria categoria){
        this.categoria = categoria;
    }

}
