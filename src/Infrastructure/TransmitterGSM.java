package Infrastructure;

import Environment.Place;

public class TransmitterGSM extends Place {
    private Integer transmitterId;
    private double latitude;
    private double longitude;

    public TransmitterGSM(double latitude, double longitude, Integer transmitterId) {
        super(latitude, longitude);
        this.transmitterId = transmitterId;
    }
}
