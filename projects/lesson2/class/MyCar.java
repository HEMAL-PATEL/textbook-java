import itnav.Car;

public class MyCar extends Car {
    public final static String COMPANY = "Itnav inc.";

    private String name;

    public MyCar(){
        super();
    }

    public MyCar(int number,double gas){
        super(number,gas);
    }

    public MyCar(int number,double gas,String name){
       super(number,gas);
       this.name = name;
    }

    public void setName(String name){ 
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void show(){
        super.show();
        System.out.println("車の名前は" + this.name + "です。");
    }
}