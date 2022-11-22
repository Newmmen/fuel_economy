package guru.qa.repo;

import guru.qa.domain.Car;
import guru.qa.domain.Ferrari;
import guru.qa.domain.Ford;

import java.util.Map;

public class CarStore {

    private Map<String, Car> carList = Map.of(
            "Ferrari", new Ferrari(),
            "Ford", new Ford()
    );

    public String[] getCarName() {
        return carList.keySet().toArray(String[]::new);
    }

    public Car lookUp(String carName) {
        for (String key : carList.keySet()) {
            if (key.equalsIgnoreCase(carName))
                return carList.get(key);

        }
        throw new IllegalArgumentException("Car " + carName + " not found");

    }
}
