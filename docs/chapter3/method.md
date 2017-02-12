# ここで学ぶ内容
* * * *
ここではメソッドの使い方について学びます。メソッドは1つの処理をまとめたものです。
このメソッドを使いこなすことにより、何回も同じようなことを書かなくて済みます。
<br>
※今回は関数のような処理もメソッドと呼ぶことにします。

# 必要ファイルを準備しよう
* * * *

前回のループ処理で作成した"lesson2" フォルダに"MethodSample.java"を作成します。

```
projects
   - lesson1
   - lesson2
        - MethodSample.java
```

"MethodSample.java"に以下のコードを追加します。

```
class MethodSample {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

#メソッドを使ってみる
* * * * *
まずは簡単なメソッドを作成してみます。

##メソッドの作成
```
public void sayHello(){
    System.out.println("Hello");
}
```

このようにメソッドは
```
public void メソッドの名前(){

}
```
と定義します。こちらのメソッドを使ってみましょう。

##メソッドを使う
メソッドを作成する場所は ```public~``` の外に定義してください。

```
    class クラスの名前 {
        public void メソッドの名前(){

        }

        public void メソッドの名前(){

        }

        public void メソッドの名前(){

        }
    }
```

さきほど作成したsayHelloを使ってみます。

```
class MethodSample {
    public static void main(String[] args){
        sayHello();
    }

    public static void sayHello(){
        System.out.println("Hello");
    }
}
```

###結果

```
Hello
```

###戻り値
次に戻り値というものを作成してみます。
戻り値は``` public 戻り値 ~~~```で作成することが出来ます。
<br>
戻り値はStringやintなど変数の型などを指定することができます。
<br>
戻り値に値を返すにはreturnを使います。

```
    public static String getHello(){
        return "Hello";
    }
```

###戻り値の受取
```
class MethodSample {
    public static void main(String[] args){
        String hello = getHello();
        System.out.println(hello);
    }

    public static String getHello(){
        return "Hello";
    }
}

###結果

```
Hello
```

###引数を入れる
次に引数というものを作成してみます。
引数は``` public 戻り値 (引数1,引数2){}```で作成することが出来ます。<br>
引数はStringやintなど変数の型などを指定することができます。<br>
引数は複数作成することができます。

```
class MethodSample {
    public static void main(String[] args){
        String text = getText("text");
        System.out.println(text);
    }

    public static String getText(String text){
        return text;
    }
}

###結果

```
text
```

#メソッドの応用
* * * * *
下記のようなコードを作成してください。

```
class MethodSample {
    public static void main(String[] args){

        int num1 = 12;
        int num2 = 24;
        int num3 = 50;
        int num4 = 89;

        int total1 = num1 + num2;
        int total2 = num3 + num4;

        System.out.println(total1);
        System.out.println(total4);
    }
}
```

結果は以下のようになります。

```
36
139
```

###クイズ
こちらの処理ですが2回同じような処理をしているところがあります、ちょっと考えてみてください。

###答え
こちらの2つが同じように足し算をしていることが分かります。
```
int total1 = num1 + num2;
int total2 = num3 + num4;
```

このように同じような処理をしているものを１つのメソッドにまとめると便利です。

###戻り値を決める
欲しいのはint型の結果なので戻り値はintにします。

```
public int 
```

###メソッドの名前を決める
メソッドはどんな処理をするのかが分かるような名前にするのが望ましいです。
<br>
ここではsumとします。
```
public int sum
```

###メソッドの引数を決める
今回はint型の変数が2つ必要なので2つ定義します。

```
public static int sum(int num1,int num2){

}
```

###足し算を作ってreturnで返す
```
public static int sum(int num1,int num2){
    return num1 + num2;
}
```

これを最初のコードに応用します。
```
class MethodSample {
    public static void main(String[] args){

        int num1 = 12;
        int num2 = 24;
        int num3 = 50;
        int num4 = 89;

        int total1 = sum(num1,num2);
        int total2 = sum(num3,num4);

        System.out.println(total1);
        System.out.println(total2);
    }

    public static int sum(int num1,int num2){
        return num1 + num2;
    }
}
```

###結果
```
36
139
```

#練習問題
* * * * *

- 引き算のメソッドを作成して結果を表示するプログラムを作ってください
- 掛け算のメソッドを作成して結果を表示するプログラムを作ってください
- 割り算のメソッドを作成して結果を表示するプログラムを作ってください
- 三角形の面積を求めるメソッドを作成して結果を表示するプログラムを作ってください
- 2つの文字列を連結させるメソッドを作成して表示するプログラムを作ってみてください。


#コラム
* * * * *

### ```public static void main(String[] args){}```このメソッドは何？

このメソッドはJavaのプログラムには必ず必要なもので、Javaのプログラムを実行すること必ずこのmainメソッドが実行されます。

###(String[] args)は引数？？
はい引数です。しかしこちらの引数はちょっと特殊でプログラムを実行する時に入れます。試しに引数を拾っておきましょう。

###引数を受け取って表示するためのコードを書く

```
class MethodSample {
    public static void main(String[] args){
        int length = args.length;
        for(int i = 0;i < length;i++){
            System.out.println(args[i]);
        }
    }
}
```

###引数を指定する
プログラムを実行する時に以下のように引数を指定します。複数したい場合をスペースを利用します

```
javac MethodSample.java
java MethodSample hello world this is a pen
```

###結果
```
hello
world
this
is
a
pen
```