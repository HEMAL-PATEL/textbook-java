package itnav;

public class Car {
    private int number;
    private double gas;

    public Car(){
        this.number = 0;
        this.gas = 0;
    }

    public Car(int number,double gas){
        this.number = number;
        this.gas = gas;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setGas(double gas){
        this.gas = gas;
    }

    public int getNumber(){
        return this.number;
    }

    public double getGas(){
        return this.gas;
    }

    public void show(){
        System.out.println("番号は" + this.number + "です。");
        System.out.println("残りのガソリンの量は" + this.gas + "Lです。");
    }   

    public String toString(){
        return "MyCar";
    }
}