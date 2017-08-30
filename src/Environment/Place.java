package Environment;

public class Place {
    private double latitude;
    private double longitude;
    private String placeDescription;

    public Place(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    @Override
    public String toString() {
        return latitude + " N, " +
                longitude + " E," +
                ", placeDescription='" + placeDescription;
    }
}
