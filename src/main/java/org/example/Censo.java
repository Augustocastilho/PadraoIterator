package org.example;

public class Censo {

    public static Integer contarFormigas(Formicario formicario) {
        Integer contador = 0;
        for (Formiga formiga : formicario) {
            contador++;
        }
        return contador;
    }

    public static Integer contarFormigasPorEspecie(Formicario formicario, String especie) {
        Integer contador = 0;
        for (Formiga formiga : formicario) {
            if (formiga.getEspecie().equals(especie)) {
                contador++;
            }
        }
        return contador;
    }

}
