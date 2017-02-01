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

###ファイル分割とpackageを覚えよう
大規模な開発を行っていくにつれて、プログラムが肥大化していきます。Javaは複数のクラスを下記のように持てますが
望ましくありません。普通はMain.javaとCar.javaを分けたように.javaのファイルに対して1つのクラスが望ましいです。
<br>
※特定の条件下によっては1つのjavaファイルに複数のクラスを持つことがあります。
<br>
<br>
<br>
Main.java
```
class Main {
    
    class Car {
        //省略
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.setNumber(7);
        car1.setGas(50);

        System.out.println("car1のナンバーは" + car1.number);
        System.out.println("car1のガソリン量は" + car1.gas);
    }
}
```
そこでpackageというしくみを使ってファイルを分けることができます。

####packageを作成する
1. 任意のフォルダを作成する
    - フォルダ名が後のpackage名になる
2. そのフォルダにpackageにしたいJavaファイルを入れる
3. そのJavaコードの上部に```package フォルダ名;```を記載する

```
projects
   - lesson1
   - lesson2
        - class
            - main.java
            - itnav
                - car.java
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

更に階層を作成し、サブのpackageも作ることが出来ます。


```
projects
   - lesson1
   - lesson2
        - class
            - Main.java
            - itnav
                - Car.java
                - sub
                    - Sub.java
```

```
package itnav.sub;
public class Sub {

}

```

####別ファイルの呼び出し
import文を使い他のjavaファイルを呼び出すことができます。これでファイル分割＆統合が可能となりました。
<br>
Main.java
```
import itnav.Car;
import itnav.sub.Sub;

class Main {
    public static void main(String[] args){
        Car car = new Car();
        Sub sub = new Sub();
        System.out.println("Hello World");
    }
}
```

###アクセス修飾子を覚えよう
これまで多くのメソッドやクラスにpublicというものが付きました。
これはクラスとクラスの間でアクセス出来る制限を意味します。
感の良い方は既にお気づきかもしれませんが、先ほど作成したCarクラスの変数はどこからでも編集が
可能となっています。このままだと作成者が予期しない処理をしてしまうことがあるかもしれないので
しっかりアクセスに制限をかけてみます。
<br>
<br>
publicと書いてある変数をprivateにして外のクラスからアクセスできないようにしてみます。

```
package itnav;

public class Car {
    private int number;
    private double gas;

    public void setNumber(int number){
        this.number = number;
    }

    public void setGas(int gas){
        this.gas = gas;
    }
}
```

このクラスは変数numberと変数gasに値をセット出来ますが、ゲットすることはできません。<br>
Main.java
```
import itnav.Car;

class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.setGas(10);
        int gas = car.gas; //これはできない！！文法エラーになる
        System.out.println(gas);
    }
}
```

ゲットするメソッドをpublicで制限して、Main.javaで受け取ってみます

```
package itnav;

public class Car {
    private int number;
    private double gas;

    public void setNumber(int number){
        this.number = number;
    }

    public void setGas(int gas){
        this.gas = gas;
    }

    public int getNumber(){
        return this.number;
    }

    public double getGas(){
        return this.gas;
    }
}
```
<br>
Main.java
```
import itnav.Car;

class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.setGas(10);
        int gas = car.getGas(); //これでガスの量が取得可能になる
        System.out.println(gas);
    }
}
```

<br>
アクセス修飾子を表にまとめるとこうなります。

|修飾子名|意味|
|-:-|:--|
|private|同じクラス内から呼び出せる。|
|何も書かない|同じパッケージからアクセス出来る。|
|protected|同じパッケージかサブクラスからしか呼び出せない。|
|public|どこからでも呼び出せる。|

###コンストラクタを覚えよう
コンストラクタというものをご紹介します。コンストラクタとはクラスのインスタンスを生成する時に自動的に呼ばれる場所です。
クラスのインスタンス生成時はMain.javaでいうとこちらの部分に該当します。

```
Car car = new Car();
```

コンストラクタはこんな感じに定義します。

Car.java
```
package itnav;

public class Car {
    private int number;
    private double gas;

    public Car(){
        //これがコンストラクタ
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setGas(int gas){
        this.gas = gas;
    }

    public int getNumber(){
        return this.number;
    }

    public double getGas(){
        return this.gas;
    }
}
```

見た目はメソッドと大変よく似ていますが、戻り値があるメソッドに対してコンストラクタには戻り値を指定することができません。
またコンストラクタはクラス名と同じである必要があります。コンストラクタは、クラスのインスタンス生成時に呼ばれるので初期値などを
書く時に優良です。例えば今回の例ですと、車のナンバーとガソリンの量には初期値は入っていなかったので、コンストラクタを生成し初期値を入れてみます。

Car.java
```
package itnav;

public class Car {
    private int number;
    private double gas;

    public Car(){
        this.number = 0;
        this.gas = 0;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setGas(int gas){
        this.gas = gas;
    }

    public int getNumber(){
        return this.number;
    }

    public double getGas(){
        return this.gas;
    }
}
```

コンストラクタを生成した後もう一度```Main.java```で読み込み値をセットするまえに画面表示してみます。


Main.java
```
import itnav.Car;

class Main {
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car.number);
        System.out.println(car.gas);
    }
}
```

結果
```
0
0
```

コンストラクタで初期値を代入することで、何も値が入っていないということを防止することができます。

###オーバーロードを覚えよう
これまでコンストラクタやメソッドについて学びました。基本的にメソッドやコンストラクタは同じ名前のものを複数持つことはできませんが、
引数を変えることによって複数同じ名前のメソッドを持つことができます。これをオーバーロードと言います。
<br>
<br>
<br>
同じ名前では持てない<br>
Car.java
```
package itnav;

public class Car {
    private int number;
    private double gas;

    public Car(){
        this.number = 0;
        this.gas = 0;
    }

    public Car(){
        //ダメ！
    }
}
```

これなら大丈夫!<br>
Car.java

```
package itnav;

public class Car {
    private int number;
    private double gas;

    public Car(){
        this.number = 0;
        this.gas = 0;
    }

    public Car(int number,int gas){
        this.number = number;
        this.gas = gas;
    }
}
```


上記の例ではコンストラクタを2つ持たせることにより、デフォルトの初期値と任意の初期値を指定することが出来ます。
Main.javaで任意の初期値を指定できるコンストラクタを呼び出してみます。
<br>
<br>

Main.java

```
import itnav.Car;

class Main {
    public static void main(String[] args){
        Car car = new Car(10,10)
        System.out.println(car.number);
        System.out.println(car.gas);
    }
}
```

結果

```
10
10
```

この調子でメソッドもオーバーロードしてみましょう！

Car.java

```
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
}
```

```setNumber()``` と ```setGas()``` を ```setCar()``` というメソッドで統一してみます。


Car.java

```
package itnav;

public class Car {
    private int number;
    private double gas;

    public void setCar(int number){
        this.number = number;
    }

    public void setCar(double gas){
        this.gas = gas;
    }

    public void setCar(int number,double gas){
        this.number = number;
        this.gas = gas;
    }
}
```

Main.java

```
import itnav.Car;

class Main {
    public static void main(String[] args){
        Car car = new Car()
        car.setCar(10);//int 型のsetCar()が呼ばれる
        car.setCar(10.5);//double 型のsetCar()が呼ばれる
        System.out.println(car.number);
        System.out.println(car.gas);
    }
}
```

結果

```
10
10.5
```

###クラスの継承を覚えよう
冒頭でクラスは後に使いまわすメリッドなどを説明しました。ここではクラスの継承について説明します。
先ほどまで作成していた```Car.java```を以下の様に変更します。

Car.java

```
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
}
```

そして新しく```MyCar.java```というクラスを```Main.java```と同じディレクトリに作成してください。

```
projects
   - lesson1
   - lesson2
        - class
            - Main.java
            - MyCar.java
            - itnav
                - Car.java
```

Carクラスの中身を引き継ぎMyCarというクラスを作成してみます。これをクラスの継承といいます。
<br>
継承はこのようにextendsの後に継承したクラス名を記入します。事前のimportは忘れずに！
<br>

MyCar.java

```
import itnav.Car;

public class MyCar extends Car {
    
}
```

この時点でMyCarクラスのインスタンスを生成しCarクラスの様に値を表示してみましょう。<br>

Main.java
```
class Main {
    public static void main(String[] args){
        MyCar myCar = new MyCar();
        myCar.setNumber(10);
        myCar.setGas(16.7);
        
        System.out.println(myCar.getNumber());
        System.out.println(myCar.getGas());
    }
}
```

結果

```
10
16.7
```

Carクラスを継承しているためMyCarにsetNumber()などを実装しなくとも、このようにメソッドを使いまわすことができます。<br>
しかしCarクラスのコンストラクタは呼べないので、MyCarクラスのコンストラクタで値を受取りCarクラスのコンストラクタに値を渡してみます。
値を渡す時はCarクラスと同様の意味合いなsuper()を使います。

MyCar.java

```
import itnav.Car;

public class MyCar extends Car {

    public MyCar(){
        super();
    }

    public MyCar(int number,double gas){
        super(number,gas);
    }
}
```

Main.java

```
class Main {
    public static void main(String[] args){
        MyCar myCar = new MyCar(10,16.7);
        
        System.out.println(myCar.getNumber());
        System.out.println(myCar.getGas());
    }
}
```

結果

```
10
16.7
```

####練習
MyCarクラスに自分の車の名前を付ける機能を作って、それを表示させてみましょう。<br>
また名前で使った変数はコンストラクタでも初期化できるようにしてみよう。<br>

###オーバーライドを覚えよう
次にオーバーライドという機能を紹介します。オーバーライドは継承元のメソッドを継承先のクラスで、
まったく同じ名前と引数で新しく作り変えることが出来ます。

```Car.java``` に新しく番号とガソリンを表示するメソッドを作成しましょう。<br>

Car.java

```
public void show(){
    System.out.println("番号は" + this.number + "です。");
    System.out.println("残りのガソリンの量は" + this.gas + "Lです。");
}
```

Main.java

```
class Main {
    public static void main(String[] args){
        MyCar myCar = new MyCar(10,16.7);
        
        myCar.show();
    }
}
```

結果

```
番号は10です。
残りのガソリンの量は16.7Lです。
```

次にMyCarでも同様にshow()メソッドを定義します。<br>

MyCar.java

```
public void show(){

}
```

この状態でshow()メソッドを実行すると何も表示されません。<br>
継承元のshow()メソッドを何も処理しないshow()メソッドで上書きされたからです。
これをCarクラスのshow()メソッドを呼び出すには、継承元の親クラスを示すsuperを使います。

MyCar.java

```
public void show(){
    super.show();
}
```

結果

```
番号は10です。
残りのガソリンの量は16.7Lです。
```

しかしこのままでは単純にCarクラスのshow()メソッドを呼び出しているだけなので、
MyCarならではのshow()メソッドを作成してみましょう。先ほど練習問題で作成したnameを使用します。<br>

MyCar.java

```
import itnav.Car;

public class MyCar extends Car {
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
```

Main.java

```
class Main {
    public static void main(String[] args){
        MyCar myCar = new MyCar(10,16.7,"itnav");
        
        myCar.show();
    }
}
```

結果

```
番号は10です。
残りのガソリンの量は16.7Lです。
車の名前はitnavです。
```

オーバーライドを行うと様々なクラスの機能を自分オリジナルな機能に変えることができます!
逆にMyClassではshow()メソッドが不要な場合はprivateを付けることでshow()メソッドを閉じことができます。

MyCar.java
```
private void show(){

}
```

####応用
少々応用な話ですが、Javaのクラスは元々Javaオブジェクトと呼ばれるクラスを既に持っています。
Javaオブジェクトの代表的なメソッドがtoString()メソッドです。
こちらをインポートしクラスの情報を表示できるようにしておくとログを作る時に便利です。
<br>

Main.java

```
class Main {
    public static void main(String[] args){
        MyCar myCar = new MyCar(10,16.7,"itnav");
        
        System.out.println(myCar.toString());
    }
}
```

結果

```
MyCar@7.........
```

MyCar.java

```
public String toString(){
    return "MyCar";
}
```

Main.java

```
class Main {
    public static void main(String[] args){
        MyCar myCar = new MyCar(10,16.7,"itnav");
        
        System.out.println(myCar.toString());
    }
}
```

結果

```
MyCar
```

####アクセス修飾子のおさらい
先ほど紹介したアクセス修飾子ですが、protectedだけ謎のままでした。答えは継承先のクラスからのみアクセスできるメソッドです。
時間がある人はCarクラスのshow()メソッドの修飾子をprotectedに変更し、Main.javaやMyCarクラスで呼び出せるか実験してみてください。

###staticメソッドを作ろう
これまでクラスのインスタンスについて学びました。staticメソッドを使用すると、インスタンスを生成しなくともメソッドを呼び出す事ができます。
しかし、これまでクラス変数に値を保存してそれを呼び出すというようなことは出来ないので注意が必要です。既に決まっている値や処理を実行する時のみ使いましょう。
<br>
MyCar.java

```
public static String getCompany(){
    return "Itnav inc.";
}
```

呼び出す時はクラス名から直接メソッドを指定します。<br>

Main.java

```
class Main {
    public static void main(String[] args){   
        String company = MyCar.getCompany();

        System.out.println(company);
    }
}
```

結果

```
Itnav inc.
```

####注意
staticメソッドからクラス変数にアクセスはできません！

```
private String company = "Itnav inc."

public static String getCompany(){
    return this.company; //これはできない！！thisもつかえません！
}
```

staticな変数なら指定することができます！

```
private static String company = "Itnav inc."

public static String getCompany(){
    return company; 
}
```

###staticとfinalの修飾子で定数を作ってみよう
finalを付けると変更ができない変数を作成することができます。絶対に変わらない値などに作成する時に便利です。
間違えて変更してしまうなどの問題を事前に防げるからです。<br>

MyCar.java

```
private final static String company = "Itnav inc."

public static String getCompany(){
    return company; 
}
```

結果

```
Itnav inc.
```

値が変わらない、何か特別な処理もしないのであればメソッドを削除し定数をpublicに変えればもっとコードが良くなります！<br>
またJavaの世界では定数を全て大文字にし、単語の間は_で区切るという表現が主流なのでそちらの表現に変更します。

MyCar.java

```
public final static String COMPANY = "Itnav inc." //privateからpublicに変更

//getCompany()を削除する
```

Main.java

```
class Main {
    public static void main(String[] args){   
        System.out.println(MyCar.COMPANY);
    }
}
```