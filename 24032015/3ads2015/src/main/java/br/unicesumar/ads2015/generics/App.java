package br.unicesumar.ads2015.generics;

import java.util.Date;

public class App {
    
    public static void main(String[] args) {
        Cofre cofreDeObjects = new Cofre();
        cofreDeObjects.addCoisa(100L);
        
        cofreDeObjects.addCoisa("asdfasdfds");
        cofreDeObjects.addCoisa(new Date());
        
        Cofre<Pão> cofreDePão = new Cofre<>();
        
    }
    
}
