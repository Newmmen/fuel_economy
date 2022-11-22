package guru.qa.domain;

public abstract class Car {
    private static final int FUEL_CAPACITY = 100;

    public abstract double getFlueEconomy();

    public int fuelCapacity() {
        return FUEL_CAPACITY;
    }

    private int maxLapsForTrack;


    public boolean isPirStopNeeded(RaceTrack raceTrack) {
        maxLapsForTrack(raceTrack);
        return maxLapsForTrack < raceTrack.laps();

    }

    public int maxLapsForTrack() {
        return this.maxLapsForTrack;
    }

    private void maxLapsForTrack(RaceTrack raceTrack) {
        int lapsDistance = raceTrack.lapDistance();

        double fuelEconomy = getFlueEconomy();
        int fuelCapacity = fuelCapacity();

        double maxDistanceForCar = (fuelCapacity * 100) / fuelEconomy; // km
        this.maxLapsForTrack = (int) ((maxDistanceForCar * 1000) / lapsDistance);
    }

}
