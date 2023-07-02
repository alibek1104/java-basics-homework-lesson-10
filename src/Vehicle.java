public abstract class Vehicle {
    protected boolean isOn;

    public Vehicle() {
        isOn = false;
    }

    public abstract void setLight(boolean set);

    public abstract void blinkLight();

    public void startEngine() {
        isOn = true;
        System.out.println("Engine started");
    }

    public void stopEngine() {
        isOn = false;
        System.out.println("Engine stopped");
    }
}
