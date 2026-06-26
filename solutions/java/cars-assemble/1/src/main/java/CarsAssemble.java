public class CarsAssemble {
    public static final int carsProduced = 221;
    public double productionRatePerHour(int speed) {
        if(speed>0 && speed<=4) {
            return speed*carsProduced;
        }
        else if(speed>=5 && speed<=8){
            return (speed*carsProduced)*0.9;
        }
        else if(speed == 9){
            return (speed*carsProduced)*0.8;
        }
        return (speed*carsProduced)*0.77;
    }

    public int workingItemsPerMinute(int speed) {
        int ans = 0;
        if(speed>=1 && speed<=4) {
            ans = (speed*carsProduced)/60;
        }
        else if(speed>=5 && speed<=8){
            ans = (int)((speed*carsProduced*0.9)/60);
        }
        else if(speed == 9){
            ans = (int)((speed*carsProduced*0.8)/60);
        }
        else{
            ans = (int)((speed*carsProduced*0.77)/60);
        }
        return ans;
    }
}
