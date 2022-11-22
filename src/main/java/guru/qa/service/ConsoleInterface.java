package guru.qa.service;

import guru.qa.domain.Car;
import guru.qa.domain.RaceTrack;
import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;

import java.util.Scanner;

public class ConsoleInterface implements Interface {

    public ConsoleInterface(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    private final CarStore carStore;
    private final TrackStore trackStore;
    private final Scanner sc = new Scanner(System.in);

    @Override
    public Car chooseCar() {
        System.out.println("Выберите автомобиль:");
        carStore.getCarName();
        String chosenCar = sc.next();
        return carStore.lookUp(chosenCar);
    }

    @Override
    public RaceTrack chooseTrack() {
        System.out.println("Выберите трассу:");
        trackStore.getTrackName();
        String raceTrack = sc.next();
        return trackStore.lookUp(raceTrack);
    }

    @Override
    public void showResult(RaceTrack raceTrack, Car car) {
        if (car.isPirStopNeeded(raceTrack)) {
            System.out.println("Pit-stop needed in " + car.maxLapsForTrack());
        } else {
            System.out.println("Pit-stop not needed");

        }
    }
}
