class cellPhone{
    public void callNumber(int number){
        System.out.println("Calling " + number);
    }
    public void pickCall(){
        System.out.println("Connecting ...");
    }
}

interface camera{
    void takePic();
    void recordVid();
}

interface wifi{
    void connectToWifi();
    default void returnWifiNetworks(){
        System.out.println("There are 5 networks");
    }
}

class smartPhone extends cellPhone implements wifi, camera{

    @Override
    public void takePic() {
        System.out.println("Take Snap");
    }

    @Override
    public void recordVid() {
        System.out.println("Record Video");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connect to network");
    }
}

public class multiInheritance {
}
