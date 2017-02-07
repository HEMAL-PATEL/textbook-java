# プログラムを実行しよう
* * * *

コンパイル作業が終了すると、以下のような構成になっていると思います。
```
projects
   - lesson1
        -  Hello.java
        -  Hello.class
```

以下の```java```コマンドでコンパイルによって作成された"Hello.class"を実行してみましょう。

```
userename$java Hello
```
ここでは ```.class``` を省くことに注意してください。

プログラムが実行されると以下のような結果になると思います。

```
Hello World!
```

うまくいかないとエラーとなり実行が停止します。
その時はエラーとなっているソースコードを修正し再び ```javac``` コマンドでコンパイル作業を行います。

# プログラムの解説
* * * *
```
class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

Javaのコードではクラスと呼ばれる領域があります。クラスを作成するには以下の様に書きます。
```
class Hello{

}
```
次に処理の名称であるメソッドと呼ばれる領域があります。こちらは後述で詳しく解説します。
```
public static void main(String[] args){
        
}
```
※public static void mainは特殊なメソッドであり、実行時に必ず呼ばれる領域です。このメソッドは必ずプロジェクトで1つ必要なります。
<br>
誰かが作成したメソッドを実行することも出来ます。
```
    System.out.println("Hello World!");
```
こちらは画面に文字を表示させるというメソッドでprintln("");の()の中に書いたものが画面に表示されます。
※厳密に説明するとコンソール上に表示されます。

#名前を表示するプログラムを書いてみましょう
以下のコードを

```
class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

このように変更します

```
class Hello {
    public static void main(String[] args){
        System.out.println("Kyohei Tsuda");
    }
}
```

再びコンパイル作業を行います

```
username$javac Hello.java
username$java Hello
```

以下のような結果となります。

```
Kyohei Tsuda
```
