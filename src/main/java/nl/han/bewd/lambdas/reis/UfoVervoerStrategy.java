package nl.han.bewd.lambdas.reis;

public class UfoVervoerStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return 10;
    }


}
