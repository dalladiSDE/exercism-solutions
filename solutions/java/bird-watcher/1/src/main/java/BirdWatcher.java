
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int length = birdsPerDay.length;
        return birdsPerDay[length-1];
    }

    public void incrementTodaysCount() {
        int length = birdsPerDay.length;
        birdsPerDay[length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds : birdsPerDay){
            if(birds == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count=0,sum=0;
        if(numberOfDays>birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
        while(count<numberOfDays){
            sum+=birdsPerDay[count];
            count++;
        }
        return sum;
    }

    public int getBusyDays() {
        int busy = 0;
        for(int birds : birdsPerDay){
            if(birds >= 5){
                busy++;
            }
        }
        return busy;
    }
}
