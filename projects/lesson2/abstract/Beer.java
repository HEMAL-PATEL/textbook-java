public class Beer extends Drink {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void show(){
        //Teaに必要なshow的な処理
        System.out.println("温度は" + super.temperature + "です");
        System.out.println("色は" + this.color + "です");
    }
}