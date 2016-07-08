package es.rogermartinez.ratingsystem;

/**
 * Created by roger on 7/7/16.
 */
public enum MatchResult {
    WIN(1d),
    LOST(0d),
    EQUAL(0.5d);

    private double result;

    private MatchResult(double result){
        this.result = result;
    }

    public double getResult(){
        return this.result;
    }
}
