#ここで学ぶ内容
* * * * *
ここではインターフェースについて学びます。[抽象クラス](/docs/learn_programming/abstract.md)は理解している前提で解説します。

# 必要ファイルを準備しよう
* * * * *
[抽象クラス](/docs/learn_programming/abstract.md)の続きから行います。
新たにAlcohol.javaを作成してください。

```
projects
   - lesson1
   - lesson2
        - abstract
            - Main.java
            - Drink.java
            - Tea.java
            - Beer.java
            - Alcohol.java
```

#インターフェイスとは
* * * * *
インターフェイスは抽象クラスと同じように、定数やメソッドなどを定義することができます。
インターフェイスでは変数は定義ができず、またメソッドも全て抽象メソッド（処理内容を書くことはできない）になることにご注意ください。
またpublicやabstractのような修飾子も付きません。全てinterfaceで表現します。

Alcohol.java

```
interface Alcohol {
  void showPercent();
}
```

#インターフェイスを使う
* * * * *
Beerクラスにインターフェイスを定義してみます。クラス継承と違うところはextendsではなくimplementsを使います。

Beer.java

```
public class Beer implements Alcohol {
    public void showPercent() {
    
    }
}
```

#多重継承をしてみよう
* * * * *
クラス継承は１つまでしかできません。しかし場合によっては複数の継承をしたい場合があります。その時に便利なのがインターフェイスです。
クラスは1つまでしか継承できませんが、インターフェイスは複数以上継承することができます。<br>

Beer.java

```
public class Beer extends Drink implements Alcohol {
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

    public void showPercent() {
    
    }
}
```

これで多重継承が実現できました。さらに継承したい場合は,区切りで継承可能です。

```
public class Beer extends Drink implements Alcohol,Hoge,Foo{}
```