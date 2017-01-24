import itnav.Car;

class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.setNumber(7);
        car1.setGas(50);

        System.out.println("car1のナンバーは" + car1.number);
        System.out.println("car1のガソリン量は" + car1.gas);
    }
}