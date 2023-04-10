package tamirlan.battling_fighters;

public enum Strategy {
    AGGRESSIVE, DEFENSIVE, AVERAGE;

    @Override
    public String toString() {
        if(this == AGGRESSIVE){
            return "Aggressive";
        }
        else if(this == DEFENSIVE){
            return "Defensive";
        }
        else{
            return "Average";
        }
    }
}
