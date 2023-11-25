package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CensoTest {

    @Test
    void deveContarFormigasFormicario(){
        Formicario formicario = new Formicario(
            new Formiga("Gasparzinho", 1, "Formiga fantasma"),
            new Formiga("Espicha", 2, "Formiga fantasma"),
            new Formiga("Gordo", 3, "Formiga fantasma"),
            new Formiga("Catinga", 4, "Formiga fantasma"),
            new Formiga("Perereca", 5, "Formiga lava-pé"),
            new Formiga("Chulé", 6, "Formiga lava-pé")
        );
        assertEquals(6, Censo.contarFormigas(formicario));
    }

    @Test
    void deveContarFormigasPorEspecieFormicario(){
        Formicario formicario = new Formicario(
            new Formiga("Gasparzinho", 1, "Formiga fantasma"),
            new Formiga("Espicha", 2, "Formiga fantasma"),
            new Formiga("Gordo", 3, "Formiga fantasma"),
            new Formiga("Catinga", 4, "Formiga fantasma"),
            new Formiga("Perereca", 5, "Formiga lava-pé"),
            new Formiga("Chulé", 6, "Formiga lava-pé")
        );
        assertEquals(2, Censo.contarFormigasPorEspecie(formicario, "Formiga lava-pé"));
    }

}