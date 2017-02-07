# ここで学ぶ内容
* * * *
ここではループと呼ばれる繰り返し処理について学びます。
ループはどのプログラミング言語でも欠かせない基礎なのでここで必ず覚えちゃいましょう。
ループ処理を学ぶ前になぜ必要なのかを体験しながら学んでいきたいと思います。

# 必要ファイルを準備しよう
* * * *

新しく ```projects``` の配下に ```lesson2``` というフォルダを準備します。

```
projects
   - lesson1
   - lesson2
```

 lesson2に ```Loop.java``を作成します。

```
projects
   - lesson1
   - lesson2
        - Loop.java
```

Loop.javaに先ほど作成した3行の文字を表示するコードを追加します。

```
class Loop {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}
```

# 行数を増やそう！
* * * *

####10行の文字を表示するプログラムを作成してください。

こんな感じになったと思います。

```
class Loop {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}
```

(では次に100にしてください。)
(それが終わったら次は7893やりましょう。)

このようにどんどん数が多くなっていくと増やす作業も大変ですし。
ちゃんと数があっているか分からなくなってしまいます。
その問題をあっさり解決するのがループです。

#ループ処理を書いてみよう
* * * * *

ループ処理を作るには"for"文というもの使います。

"for"文の書き方はこのように書きます

```
for (int i = 0;i < 100;i++){

}
```

一気に色々なものがでてきてチンプンカンプンになりそうですが、安心してください。
今回見るのは"100"という数字だけです。これは100回繰り返すという意味になります。

例えば先ほどの例で100行の文字を表示するというものがありましたが、こちらの"for"文を使えば一瞬で作成することができます。

こんな感じです。

Loop.java

```
class Loop {
    public static void main(String[] args){
        for (int i = 0;i < 100;i++){
            System.out.println("Hello World");
        }
    }
}
```

これを実行すると100行の文字が表示されます。

```
Hello World
    ・
    ・
    ・
Hello World
```

####練習
Hello Worldを23行表示させるプログラムを作成し実行してください。

#クイズ
* * * * *

以下のようなfor文を実行するとどのような結果になるでしょうか。

```
class Loop {
    public static void main(String[] args){
        for (int i = 0;i < 0;i++){
            System.out.println("Hello World");
        }
    }
}
```

#ブレークタイム
* * * * *

"lesson2"の配下にGetTime.javaというファイルを作成してください。

```
projects
   - lesson1
   - lesson2
        - GetTime.java
```

GetTime.javaに以下のコードを追加してください。
今回はコピー＆ペーストで構いません。


```
import java.util.Date;

public class GetTime {
     public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.toString());
    }
}
```

準備が終わったら実行してみてください。

