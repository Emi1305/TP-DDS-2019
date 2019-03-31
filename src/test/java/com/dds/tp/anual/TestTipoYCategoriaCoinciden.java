package com.dds.tp.anual;


import com.dds.tp.anual.Enums.Categoria;
import com.dds.tp.anual.Enums.Color;
import com.dds.tp.anual.Enums.Material;
import com.dds.tp.anual.Enums.Tipo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTipoYCategoriaCoinciden {

    @Test
    public void zapatoTieneCategoriaCalzado(){

        Prenda prenda = new Prenda(Tipo.ZAPATO, Material.ALGODON, Color.AMARILLO);

        Assertions.assertEquals(Categoria.CALZADO, prenda.getCategoria());
    }

    @Test
    public void camisaTieneCategoriaParteSuperior(){

        Prenda prenda = new Prenda(Tipo.CAMISA, Material.ALGODON, Color.AMARILLO);

        Assertions.assertEquals(Categoria.PARTE_SUPERIOR, prenda.getCategoria());
    }

    @Test
    public void pantalonTieneCategoriaParteInferior(){

        Prenda prenda = new Prenda(Tipo.PANTALON, Material.ALGODON, Color.AMARILLO);

        Assertions.assertEquals(Categoria.PARTE_INFERIOR, prenda.getCategoria());
    }

    @Test
    public void sombreroTieneCategoriaAccesorio(){

        Prenda prenda = new Prenda(Tipo.SOMBRERO, Material.ALGODON, Color.AMARILLO);

        Assertions.assertEquals(Categoria.ACCESORIO, prenda.getCategoria());
    }
}
