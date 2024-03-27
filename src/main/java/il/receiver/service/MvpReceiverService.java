package il.receiver.service;

public interface MvpReceiverService {
    void invokeTheMainApiTogo();
    void invokeVFlatTogo();

    void receiveVehiclesV2();

    void receiveFreeParking();

    void receiveUnicCarInfo();

    void getParkings();

    void getSingleA2A();
}
