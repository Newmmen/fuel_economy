package guru.qa.repo;

import guru.qa.domain.Nurburgring;
import guru.qa.domain.RaceTrack;
import guru.qa.domain.Spa;

import java.util.Map;

public class TrackStore {

    private Map<String, RaceTrack> trackList = Map.of(
            "Spa", new Spa(),
            "Nurburgring", new Nurburgring()
    );

    public String[] getTrackName() {
        return trackList.keySet().toArray(String[]::new);
    }

    public RaceTrack lookUp(String trackName) {
        for (String key : trackList.keySet()) {
            if (key.equalsIgnoreCase(trackName))
                return trackList.get(key);

        }
        throw new IllegalArgumentException("Track " + trackName + " not found");

    }
}
