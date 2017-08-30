package Tools;

import Environment.Place;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class PlacesFactory {
    public static final Integer MAX_PLACES_NUMBER = 256;


    public static List<Place> getPlaces() {
        List<Place> places = new ArrayList<>();
        for(int i = 0; i < MAX_PLACES_NUMBER; i++) {
            places.add(new Place(50+random(), 19+random()));
        }

        return places;


    }

}
