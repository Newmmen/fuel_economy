package guru.qa.service;

import guru.qa.domain.Car;
import guru.qa.domain.RaceTrack;
import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;

import javax.swing.*;

public class GuiInterface implements Interface {

    private final CarStore carStore;
    private final TrackStore trackStore;

    public GuiInterface(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }


    @Override
    public Car chooseCar() {
        String desiredCar = (String) JOptionPane.showInputDialog(
                null,
                "Choose your car",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                carStore.getCarName(),
                null);
        return carStore.lookUp(desiredCar);
    }

    @Override
    public RaceTrack chooseTrack() {
        String desiredTrack = (String) JOptionPane.showInputDialog(
                null,
                "Choose your track",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                trackStore.getTrackName(),
                null);
        return trackStore.lookUp(desiredTrack);
    }


    @Override
    public void showResult(RaceTrack raceTrack, Car car) {
        if (car.isPirStopNeeded(raceTrack)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit stop needed in " + car.maxLapsForTrack() + " laps",
                    "Result",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit stop not needed",
                    "Result",
                    1
            );
        }
    }
}
