public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int min){
        return 40-min;
    }
    public int preparationTimeInMinutes(int prep){
        return prep*2;
    }
    public int totalTimeInMinutes(int prep, int timeOven){
        return prep*2 + timeOven;
    }
    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
}
