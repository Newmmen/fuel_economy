import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;
import guru.qa.service.GuiInterface;

public class Main {
    public static void main(String[] args) {
        new Application(new GuiInterface(
                new CarStore(),
                new TrackStore()
        )).run();

    }
}
