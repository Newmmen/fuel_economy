import guru.qa.domain.Car;
import guru.qa.domain.RaceTrack;
import guru.qa.service.GuiInterface;

public class Application {
    public Application(GuiInterface userInterface) {
        this.userInterface = userInterface;
    }

    private final GuiInterface userInterface;


    void run() {
        Car car = userInterface.chooseCar();
        RaceTrack raceTrack = userInterface.chooseTrack();
        userInterface.showResult(raceTrack, car);
    }
}
