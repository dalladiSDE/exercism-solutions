public class Lasagna {
    private static final int exp = 40;
    private static final int lay = 2;
    public int expectedMinutesInOven(){
        return exp;
    }
    public int remainingMinutesInOven(int min){
        return exp-min;
    }
    public int preparationTimeInMinutes(int prep){
        return prep*lay;
    }
    public int totalTimeInMinutes(int prep, int timeOven){
        return prep*lay + timeOven;
    }
   
}
