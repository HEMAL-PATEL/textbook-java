class Main {
    public static void main(String[] args){
        Tea tea = new Tea();
        tea.setTemperature(70);
        tea.setColor("green");

        Beer beer = new Beer();
        beer.setTemperature(8);
        beer.setColor("yellow");
        
        tea.show();
        beer.show();
    }
}