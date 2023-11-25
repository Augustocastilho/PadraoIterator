package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Formicario implements Iterable<Formiga>{

    private List<Formiga> formigas = new ArrayList<>();

    public Formicario(Formiga... formigas) {
        this.formigas = Arrays.asList(formigas);
    }

    public Iterator<Formiga> iterator() {
        return formigas.iterator();
    }
}
