# ここで学ぶ内容
* * * * *
ここでは変数というものを学びます。変数とは文字や数字などを名前を付けて格納しておく機能のことです。
この格納することを代入と言います。

# 必要ファイルを準備しよう
* * * * * 

前回のループ処理で作成した"lesson2" フォルダに"Variable.java"を作成します。

```
projects
   - lesson1
   - lesson2
        - Variable.java
```

"Variable.java"に以下のコードを追加します。

```
class Variable {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

#クイズ
* * * *
Javaでは""で囲まれたものは文字列として認識されます。
前回までのHello Wordの例で文字列を探してみてください。

#文字列を宣言しよう
""で囲まれた場所は　"Hello World"　でしたね。
この場合　"Hello World"　は文字列となります。

この文字列ですが直接 "Hello World" のように書き入れることができますが、
先ほど紹介した変数に格納し使うこともできます。 

宣言方法は以下のようにします。

```
String text = "Hello World";
```

Stringは文字列という意味で、textは変数の名前となります。
textというのは変数の名前で任意の名前を付けます。一般的には実際に格納される文字と関連する名前を付けます。

ではさっそく宣言してみましょう。以下の様に文字列を宣言します。

```
class Variable {
    public static void main(String[] args){
        String text = "Hello World";

        System.out.println("Hello World");
    }
}
```

しかしこのままでは折角作成した文字列を使っていません。
以下の様にSystem.out.println();の中で使ってみます。

```
class Variable {
    public static void main(String[] args){
        String text = "Hello World";

        System.out.println(text);
    }
}
```

プログラムの実行を行い以下の結果がでれば成功です！

```
Hello World
```

しかしこの結果だけだと何が便利なのかいまいちよく分かりません。
そこで以下のような結果を出すプログラムがあったとします。

```
都道府県別の最高人口は
東京都
都道府県別の最低人口は
鳥取県
```

このような結果を出す時はいかのようなプログラムになると思います。

```
class Variable {
    public static void main(String[] args){
        System.out.println("都道府県別の最高人口は");
        System.out.println("東京都");
        System.out.println("都道府県別の最低人口は");
        System.out.println("鳥取県");
    }
}
```

しかしこのプログラムだと2回東京都と書かないといけません。短い文章なら大丈夫ですが、これが100行や1000行になったら大変です。
そこで変数をうまく使いこのプログラムを実行してみます。

```
class Variable {
    public static void main(String[] args){

        String prefName = "東京都";

        System.out.println("都道府県別の最高人口は");
        System.out.println(prefName);
        System.out.println("一番人気のある都道府県は");
        System.out.println(prefName);
    }
}
```

これで１つの場所を変えれば色々な結果を出すことができるようになりました。しかし最高人口の都道府県と一番人気の都道府県は変動する可能性があります。
そこで2つ目の都道府県変数を用意し対応してみます。

```
class Variable {
    public static void main(String[] args){

        String prefName1 = "東京都";
        String prefName2 = "京都府";

        System.out.println("都道府県別の最高人口は");
        System.out.println(prefName);
        System.out.println("一番人気のある都道府県は");
        System.out.println(prefName2);
    }
}
```

これで2つの都道府県を自由に変更することができるようになりました。

#練習
変数の機能を使って文字列を宣言し、以下の結果を出してみてください。

```
Hello Japan
```

#数字の変数を宣言してみよう
文字列では "String xxxx = "";"　でしたが数字では"int"を使います。

```
int age = 25;
```

これをプログラムに書くと以下のようになります。

```
class Variable {
    public static void main(String[] args){
        String title = "私の年齢は";
        int age = 25;

        System.out.println(title);
        System.out.println(age);
    }
}
```

結果はこうなります。

```
私の年齢は
25
```

ちなみに小数点などは代入できないので注意してください。

#練習
以下のような結果を出すプログラムを作成してみてください。

```
1
2
3
4
5
```

#色々な変数を宣言して使ってみよう！

以下にJavaで使える主な変数をまとめました。表を参考にし練習問題をやってみてください。

|型名|意味|使用例|
|:--|:--|:--|
|int|整数型 32ビット符号つき(-2147483648～2147483647)|int num = 0;|
|long|整数型 64ビット符号つき(-9223372036854775808～9223372036854775807)|long num = 10000000000L;|
|short|整数型 16ビット符号つき(-32768～32767)|short num = -10000;|
|byte|整数型 8ビット符号つき(-128～127)|byte num = 0;|
|char|文字型 16ビット符号なし(Unicode)|char bit = 'a';|
|float|浮動小数点数型 32ビット浮動小数点数(IEEE754-1985)|float num = 1.5F;|
|double|浮動小数点数型 64ビット浮動小数点数(IEEE754-1985)|double num = 1.000000000005;|
|boolean|論理型 true または false|boolean isChecked = true;|

※変数には大きさの順序がある<br>
double > float > long > int > short > byte<br>
注意としては 小さい変数に大きい値を格納することはできない。<br>
longにintを入れることはできるがintにlongを入れることは出来ない。<br>
またlongやfloatは普段は使う際は後ろにLやFを入れる。<br>
これはLであればlongFであればfloatというのを明示している。<br>

```
long num = 10000000000L;
float num = 1.5F;
```

#練習
以下の様な結果をだすプログラムを作り実行してください。

```
私の身長は
165
私の体重は
50.2
私の年齢は
22
```

#変数の演算にチャレンジ！
* * * * *
変数は値を保存しておくだけではなく文字を連結したり数字の計算も行うことができます。

##文字の連結
```
String text1 = "私の家は";
String text2 = "石巻市にあります。";
String text3 = text1 + text2;
System.out.println(text3);
```

##数字の演算

```
int num1 = 1;
int num2 = 2;
int num3 = num1 + num2;
System.out.println(num3);
```

結果
```
3
```

##数字の演算の種類

|意味|演算子|使用例|
|:--|:--|:--|
|足し算| +	|num1 + num2|
|引き算| - |num1 - num2|
|掛け算| ＊ |num1 * num2|
|割り算| / |num1 / num2|
|余り| % |num1 % num2|

##キャスト
数字の演算では小数点になることもあります。その時は以下のようにfloatで対応できます。

```
int num1 = 1;
int num2 = 2;
float num3 = num1 / num2;
System.out.println(num3);
```
結果
```
0.0
```

しかしこのままだとint同士の計算となってしまうので結果は0.0になってしまいます。
そこでJavaのキャストという機能を使用し強制的に型を変換し計算します。
今回はfloatを使いたいので(float)と書きます。

```
int num1 = 1;
int num2 = 2;
float num3 = (float) num1 / num2;
System.out.println(num3);
```

結果
```
0.5
```

##文字列と数字を組み合わせてみる

```
int age = 25;
String title = "私の年齢は";
String unit = "歳です";
String text = title + age + title;
System.out.println(text);
```

結果
```
私の年齢は25歳です。
```

#練習問題
* * * * *
これまでの資料を参考に以下の練習問題にチャレンジしてください。

1. 合計と平均を出すプログラムを作ってください
 - int型でnum1,num2,num3,num4,num5を用意してください
 - num1に52,num2に68,num3に75,num4に83,num5に36を代入してください。
 - 5つの合計を表示させてください。
 - 5つの平均を表示させてください。

2. 三角形の面積をだすプログラムを作ってください
 - すべて自分で考えて作ってみてください。