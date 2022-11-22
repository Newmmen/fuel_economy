package guru.qa.service;

import guru.qa.domain.Car;
import guru.qa.domain.RaceTrack;

public interface Interface {
    Car chooseCar();

    RaceTrack chooseTrack();

    void showResult(RaceTrack raceTrack, Car car);
}

