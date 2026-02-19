package nl.han.bewd.lambdas;

import nl.han.bewd.lambdas.reis.*;

import java.util.Random;

public class Main {
    /*
    Een Reis wordt gemaakt met een enkel vervoermiddel. De reistijd kan door middel van een simulatie van de
    reis worden berekend. Hierbij kan onderscheid gemaakt worden of de reis tijdens de spits of buiten de spits is.
     */
    public static void main(String[] args) {
        System.out.println("Buiten spits met fiets");

        Reis mijnReis = new Reis(false);

        VervoerStrategy vervoer = new FietsVervoerStrategy();
        mijnReis.simuleerReis(vervoer);

        System.out.println("Tijdens de spits");

        mijnReis.setSpits(true);

        mijnReis.simuleerReis(vervoer);                   // Met fiets
        mijnReis.simuleerReis(new AutoVervoerStrategy()); // Met auto
        mijnReis.simuleerReis(new OVVervoerStrategy());   // Met OV

        mijnReis.simuleerReis(new UfoVervoerStrategy());

        System.out.println("Met <nieuw> vervoer, lambda edition! (Stap 5)");

// Nieuwe vervoersvorm met lambda (bijvoorbeeld: Beamer)
        VervoerStrategy beamer = isReisTijdensSpits ->
                isReisTijdensSpits ? 70 : 35;

        mijnReis.simuleerReis(beamer);

    }
}