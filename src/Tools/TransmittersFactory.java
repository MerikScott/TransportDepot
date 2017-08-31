package Tools;

import Infrastructure.TransmitterGSM;

import java.util.ArrayList;
import java.util.List;

public class TransmittersFactory {

    public static List<TransmitterGSM> getTransmitters() {

        List<TransmitterGSM> transmitters = new ArrayList<>();
        for (int i=0; i<10; i++) {
            transmitters.add(new TransmitterGSM(0, 0, 0));
        }
        return transmitters;
    }
}
