# ここで学ぶ内容
* * * * *
ここではクラスについて学びます。クラスを覚えると本格的なプログラミングができるようになるのでしっかり覚えましょう。
またここでは、既にif,for,配列,メソッドなどを理解した前提で説明を行うのでもし分からなくなった場合は前述の資料を参考にしてください。

# 必要ファイルを準備しよう
* * * * *

クラスを学ぶには複数の".java"ファイルが必要なので整理をするために、lesson2フォルダにclassというフォルダを作成してください。
そのしたに"main.java"を作成してください。

```
projects
   - lesson1
   - lesson2
        - class
            - main.java
```

"Main.java"に以下のコードを追加します。

```
class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

#クラスとは？
* * * * *
これまで変数や配列について学んできました。
このような機能は多くのプログラミング言語で使用されてきました。
プログラムが複雑になるにつれ、効率よくプログラムを作成する仕組みが必要になってきました。
こうしてとり入れられた機能が```クラス```です。
クラスをしようすると効率よくプログラムを書くことができます。

###Javaにはクラスが必要
これまで記述してきたコードには、クラスが使われています。下記の様に```class {}```で囲まれた部分がクラスです。

```
class Loop {

}
```

###クラスとメソッドの違い
メソッドはより細かい処理を定義する場所でクラスの中に存在します。

```
    class クラスA {
        メソッドA｛｝
        メソッドB｛｝
        メソッドC｛｝
        メソッドD｛｝
        メソッドE｛｝
    }
```

###クラスについて知る
よくクラスの説明に車の例が挙げられます。この車の例をここでも紹介したいと思います。<br>
スーパーカーを作る時も、軽トラックを作る時も基本的には車を作ることに変わりありません。
車を作る時に必要なものはどんなものがあるでしょうか。ちょっと考えてみましょう。<br>
<br>
例:ハンドル、アクセル、ブレーキなどなど
<br>
<br>
<br>
###クラスに車の機能をまとめてみる
たくさん色々なものがあがりましたか？よく考えてみると、スーパーカーと軽トラックは値段は違えど基本的には同じ車ということに気付きます。
ではそれをJavaの世界に置き換えたらどうでしょうか？それを表現するとこのようになります。
```
    class 車 {
        public void ハンドル (){}
        public void アクセル (){}
        public void ブレーキ (){}
    }
```

###世界中にはたくさんのクラスがたくさん存在する
いかがでしょうか。このようにクラスは抽象的なものを1つにまとめることが出来ます。
もしあなた、あるいは世界中の誰かが既に車というクラスを作っているとしたら、あなたはその車クラスというものを
カスタマイズし自分専用の車をすぐに作成することができます。最初の章で日付を表示したり、Youtubeの動画を再生したのを
覚えているでしょか。これは過去だれかが作成したクラスをうまく活用することで実現できたことです。

#クラスの作成
* * * * * 
クラスをどんどん作ってクラスについて慣れていきましょう！

###必要ファイルの作成
先ほど作成したclassフォルダの中に"itnav"フォルダを作成し、"Car.java"を作成してください。

```
projects
   - lesson1
   - lesson2
        - class
            - main.java
            - itnav
                - car.java
```

###Carクラスを作成
まず前述にあった車の例をJavaのソースコードに落とし込んでいきましょう。
ハンドルやアクセルなどを挙げましたが、今回は分かりやすいナンバーとガソリンだけを定義してみます。
以下のコードを"car.java"に入れてください。
```
class Car {
    int number;
    double gas;
}
```
ナンバーは今回は分かりやすく数字のみで表現してみます。<br>
ガソリンが入る量をdouble型の浮動小数点でgasを定義します。<br>

###入力機能を追加する
このままだとナンバーとガソリンを定義することは出来ないので、ナンバーとガソリンを入れるメソッドを作成してみましょう。

```
class Car {
    public int number;
    public double gas;

    public void setNumber(int number){
        this.number = num;
    }

    public void setGas(int gas){
        this.gas = gas;
    }
}
```
ここで新しく"this"というものが出てきました。これはクラスを指定する特別な言葉です。
ここでは"this"はCarを指します。そしてCarに定義されているnumberやgasを指定することで、
値を入れたり、取り出すことができます。このような変数をクラス変数と呼びます。

###packageを定義
異なるクラスからCarクラスにアクセスするにはpackageの定義とクラス名の前に"public"の定義が必要となります。
それではpackageを定義してみましょう。packageの定義はこれを書くだけです。
packageネームにはフォルダ名を指定します。ここではitnavと定義します。
packageについては後から詳しく説明したいと思います。

```
package packagename;
```

```
package itnav;

public class Car {
    public int number;
    public double gas;

    public void setNumber(int number){
        this.number = number;
    }

    public void setGas(int gas){
        this.gas = gas;
    }
}
```

#車クラスを使ってみよう
***
Main.javaを開いてください。先ほど作成したCarクラスをimport文を使ってMainクラスのコードで使えるようにしてみます。

```
import itnav.Car;

class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

ここで一度ビルドしてください。何もエラーが無ければMainクラスを触っていきます。

```
javac Main.java
```

###Carクラスの使用
エラーが起きなかったらさっそくCarクラスを使ってみます。Carクラスを使うには以下のように書きます。
最初は変数の定義のようなものです。必ずnewを忘れないでください。このnewを使うことにより、Carクラスのコピーを作成します。

```
Car car1 = new Car();
```

###Carクラスを使い、ナンバーとガソリン量を表示してみる。

```
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
```

###結果
```
car1のナンバーは7
car1のガソリン量は50.0
```

#より深くクラスについて学ぶ
* * * * *
これからよく使うクラスの機能について解説していきたいと思います。

###packageとは？

###アクセス修飾子を覚えよう

###コンストラクタを覚えよう

###オーバーロードを覚えよう

###オーバーライドを覚えよう

###staticメソッドを作ろう

###staticとfinalの修飾子で定数を作ってみよう