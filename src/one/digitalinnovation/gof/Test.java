package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;
import one.digitalinnovation.gof.Singleton.SingletonLazy;


public class Test {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstancia();
        System.out.println(Eager);
        lazy = SingletonLazy.getInstance();
        System.out.println(Eager);

        SingletonLazyHolder Holder = SingletonLazyHolder.getInstancia();
        System.out.println(Holder);
        lazy = SingletonLazy.getInstance();
        System.out.println(Holder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new cidade();
        facade.migrarCliente("Vanilton", "14834535");

    }
}

