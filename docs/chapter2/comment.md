#コメントを付けてみる
* * * * * *
プログラムの中にコメントを付けてみます。コメント文はプログラムの実行では無視されます。
<br>
次のような「Hello World!」と表示するプログラムを準備してください。

```
class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

画面を表示するコードの上に ```//ここでHello World!と表示します``` と書いてください。

```
class Hello {
    public static void main(String[] args){
        //ここでHello Worldと表示します
        System.out.println("Hello World!");
    }
}
```

コンパイル作業を行います

```
username$javac Hello.java
username$java Hello
```

結果

```
Hello World!
```

プログラムに影響なくコメントができましたね！プログラムは人間にとって決して読みやすいものではありません。
このようにコメントを書くことによって、読みやすいコードを作成していくことができます。

###複数行のコメント
複数行のコメントを ```/* */``` で書くこともできます。

```
class Hello {
    public static void main(String[] args){
        /* 
        　ここでHello Worldと表示します
        　System.out.printlnは画面に文字を表示するためのプログラムです。
        */
        System.out.println("Hello World!");
    }
}
```

コンパイル作業を行います

```
username$javac Hello.java
username$java Hello
```

結果

```
Hello World!
```