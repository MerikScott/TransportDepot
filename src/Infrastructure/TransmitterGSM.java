package Infrastructure;

import Environment.Place;

public class TransmitterGSM extends Place implements Traceable {
    private Integer transmitterId;
    private double latitude;
    private double longitude;

    public TransmitterGSM(double latitude, double longitude, Integer transmitterId) {
        super(latitude, longitude);
        this.transmitterId = transmitterId;
    }

    public Integer getTransmitterId() {
        return transmitterId;
    }

//    public void setTransmitterId(Integer transmitterId) {
//        this.transmitterId = transmitterId;
//    }

    @Override
    public double getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public double getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

//    @Override
//    public Place getPosition() {
//        Place place = new Place(0,0);
//        place.setLatitude(this.latitude);
//        place.setLongitude(this.longitude);
//        return (place);
//    }

    @Override
    public String toString() {
        return "TransmitterGSM{" +
                "transmitterId=" + transmitterId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
