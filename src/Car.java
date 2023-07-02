public class Car extends Vehicle implements ILights {

    boolean isOn = false;

    public Car() {
        super();
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }
}