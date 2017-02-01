abstract class Drink {
    protected int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    abstract void show();   
}