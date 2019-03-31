package com.dds.tp.anual;

import com.dds.tp.anual.Enums.Categoria;
import com.dds.tp.anual.Enums.Color;
import com.dds.tp.anual.Enums.Material;
import com.dds.tp.anual.Enums.Tipo;

public class Prenda {

    private Color colorPrincipal;
    private Color colorSecundario;
    private Material material;
    private Tipo tipo;

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }


    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Categoria getCategoria(){
        return this.tipo.getCategoria();
    }


    public Prenda(Tipo tipo, Material material, Color colorPrincipal){
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = Color.NINGUNO;
    }

    public Prenda(Tipo tipo, Material material, Color colorPrincipal, Color colorSecundario){
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

}
