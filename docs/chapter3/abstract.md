#ここで学ぶ内容
* * * * *
ここでは特別なクラス、抽象クラスについて学びます。

# 必要ファイルを準備しよう
* * * * *

クラスを学ぶには複数の".java"ファイルが必要なので整理をするために、lesson2に"abstract"フォルダを作成し、
そこに"Main.java","Drink.java","Tea.java","Beer.java"を作成してください。

```
projects
   - lesson1
   - lesson2
        - abstract
            - Main.java
            - Drink.java
            - Tea.java
            - Beer.java
```

#抽象クラスとは
* * * * *
次のクラスを見てください。

```
abstract class Drink {
    protected String color;

    public void setColor(String color){
        this.color = color;
    }

    abstract void show();   
}
```

abstractという修飾子が付いています。このようにabstractが付いているクラスを抽象クラスと呼びます。
またabstractが付いたメソッドには処理が書かれていません。<br><br>

また今までのクラスのようにnewでインスタンス生成ができません。

```
Drink drink = new Drink();//これはできない。
```

ではどんな時にこの抽象クラスを使うか説明します。抽象クラスは通常のクラスのようにクラスをextendsで継承することができます。
その時に必ずオーバーライドしてほしいメソッドがある時に抽象クラスを使い強制的にオーバーライドさせます。

```
abstract class Drink {
    protected String color;

    public void setColor(String color){
        this.color = color;
    }

    abstract void show();   
}
```

Drinkを継承した場合はshow()メソッドをオーバーライドする必要がある。

```
public class Tea extends Drink {
    public void show(){
        //オーバーライドしないとエラーになる
        //Teaに必要なshow的な処理
    }
}
```

この機能により必要なメソッドの追加漏れを防ぐ事ができます。

#抽象クラスを作ってみよう
* * * * *

抽象クラスを作成していきましょう。

```
Drink 
  - Tea
  - Beer
```

Drink.java

```
abstract class Drink {
    protected int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    abstract void show();   
}
```

Tea.java

```
public class Tea extends Drink {
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
```

Beer.java

```
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
```

Main.java

```
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
```

結果

```
温度は70です
色はgreenです
温度は8です
色はyellowです
```

このように抽象クラスを用いることでより分かりやすいコードを作成することができます。


#応用な使い方
TeaクラスもBeerクラスも元々は、Drinkクラスを継承しているため以下のようにDrink変数まとめて定義することもできます。<br>

Main.java

```
public static void main(String[] args){
        Drink tea = new Tea();
        tea.setTemperature(70);
        tea.setColor("green");

        Drink beer = new Beer();
        beer.setTemperature(8);
        beer.setColor("yellow");
        
        tea.show();
        beer.show();
    }
```

配列にすることもできます。

```
public static void main(String[] args){
        Drink[] drinks = new Drink[2];

        drinks[0] = new Tea();
        tea.setTemperature(70);
        tea.setColor("green");

        drinks[1] = new Beer();
        beer.setTemperature(8);
        beer.setColor("yellow");
        
        tea.show();
        beer.show();
    }
```

また同じDrinkクラスでも実際はTea?Beer?となることもありますよね。その時便利なのがinstanceofメソッドです。

```
if (drinks[0] incetanceof Tea) { 
    //Teaクラス
} else { 
    //Teaクラスじゃない
}
```


```
if (drinks[0] incetanceof Beer) { 
    //Beerクラス
} else { 
    //Beerクラスじゃない
}
```