import guru.qa.domain.Car;
import guru.qa.domain.RaceTrack;
import guru.qa.service.Interface;

public class Application {
    public Application(Interface userInterface) {
        this.userInterface = userInterface;
    }

    private final Interface userInterface;


    void run() {
        Car car = userInterface.chooseCar();
        RaceTrack raceTrack = userInterface.chooseTrack();
        userInterface.showResult(raceTrack, car);
    }
}
