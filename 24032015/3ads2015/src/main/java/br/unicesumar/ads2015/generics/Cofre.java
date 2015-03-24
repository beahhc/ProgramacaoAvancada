package br.unicesumar.ads2015.generics;

import java.util.ArrayList;
import java.util.List;

public class Cofre<Coisa extends Object> {
    public List<Coisa> coisas = new ArrayList<>();
    
    public void addCoisa(Coisa c) {
        this.coisas.add(c);
    }
    public List<Coisa> getCoisas() {
        return coisas;
    }    
    
}
