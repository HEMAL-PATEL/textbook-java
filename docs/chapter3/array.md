# ここで学ぶ内容
* * * *
ここでは配列を学びます。配列は値を格納する機能です。変数との違いは1つの、値を格納していた変数に対して、配列は複数の値を格納することができます。
同じ様な内容の変数を複数用意したい場合などは配列を使うと便利です。

# 必要ファイルを準備しよう
* * * *

前回のループ処理で作成した"lesson2" フォルダに"Array.java"を作成します。

```
projects
   - lesson1
   - lesson2
        - Array.java
```

"Array.java"に以下のコードを追加します。

```
class Array {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

#配列を使ってみる
* * * * *
変数はとても便利でよく使う機能ですが、同じような変数を大量に宣言してしまうと
読みづらく扱いづらいコードになってしまいます。そこで配列を使い値を管理すると便利です。さっそく使ってみましょう。

####変数の宣言（おさらい）
3つの変数を宣言しそれらを表示
```
class Array {
    public static void main(String[] args){
        int result = 78;
        int result2 = 89;
        int result3 = 90;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
```

####配列の宣言方法
```
int[] results = new int[3] ←格納したい数を入れる
```

####配列の代入方法
配列は0,1,3,...,とindexを指定することで代入や取り出しができる

```
results[0] = 78;
results[1] = 89;
results[2] = 90;

System.out.println(results[0]);
System.out.println(results[1]);
System.out.println(results[2]);
```

配列はindexを指定することで操作が可能なのでfor(){}のiを利用するとスッキリ書けます。
先ほどの変数の例を配列を利用したもの修正すると以下のようになります。

```
class Array {
    public static void main(String[] args){
        int[] results = new int[3];
        results[0] = 78;
        results[1] = 89;
        results[2] = 90;

        for(int i = 0;i < 3;i++){
            System.out.println(results[i]);
        }
    }
}
```
また配列は自身の長さを取得することが出来るのでfor文の条件も少し変えてみます。
```
class Array {
    public static void main(String[] args){
        int[] results = new int[3];
        results[0] = 78;
        results[1] = 89;
        results[2] = 90;

        int length = results.length; //自身の長さ（最大値）
        for(int i = 0;i < length;i++){
            System.out.println(results[i]);
        }
    }
}
```

####結果
```
78
89
90
```

#練習
* * * * *
1. （2, 4, 8, 16, 32, 2, 4, 6, 8, 10）を格納したint型の配列を用意して、全て足した合計を表示してみてください。