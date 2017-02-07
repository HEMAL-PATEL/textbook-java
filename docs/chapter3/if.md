# ここで学ぶ内容
* * * * *
ここではif文という条件分岐の処理を学びます。

# 必要ファイルを準備しよう
* * * * * 

前回のループ処理で作成した"lesson2" フォルダに"LearnIf.java"を作成します。

```
projects
   - lesson1
   - lesson2
        - LearnIf.java
```

"LearnIf.java"に以下のコードを追加します。

```
class LearnIf {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

#条件分岐を作ろう

条件分岐はこのように作成します。

```
if (式){
//trueの場合
}else{
//falseの場合
}
```

式の中には比較する条件式を作成します。<br>
条件式通りであればtrueの領域に入ります。<br>
条件式通りででなければfalseの領域に入ります。<br>

##条件式の作り方
条件式は==や=>などを使用します

|条件式|使い方|意味|
|:--|:--|:--|
|==|a==b|aとbは同じ|
|>=|a>=b|aはb以上|
|<=|a<=b|aはb以下|
|>|a>b|aはbより大きい|
|<|a<b|aはb未満|

特殊な条件式

|条件式|使い方|意味|
|:--|:--|:--|
|&&|条件式A&&条件式B|条件式AとBどちらもtrueである|
|｜｜|条件式A｜｜条件式B|条件式AとBいずれかがtrueである|
|!|!a|aはtrueではない|

以下にif文の例を作成したので、どんどん書いて試してください。

###年齢が20以上ならば成人それ以外なら未成年と表示

```
class LearnIf {
    public static void main(String[] args){

        int age = 19;

        if (age >= 20){
            System.out.println("成人");
        }else{
            System.out.println("未成年");
        }
    }
}
```

###2つのスコアが両方70以上なら合格と表示

```
class LearnIf {
    public static void main(String[] args){

        int score1 = 82;
        int score2 = 73;

        if (score1 >= 70 && score2 >= 70){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
}
```

###2つのスコアのいずれかが90以上なら合格と表示

```
class LearnIf {
    public static void main(String[] args){

        int score1 = 82;
        int score2 = 73;

        if (score1 >= 90 || score2 >= 90){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
}
```

#else if ~ を学ぶ
* * * * *
上記の例では分岐が1つのみでしたが、else if を活用すればelse以降もif文を作成することが出来ます。
<br>

書き方はこんな感じです

```
if (式)｛

｝else if (式) {

} else {

} 
```

###テストの点数からA~E判定を作ってみる

```
class LearnIf {
    public static void main(String[] args){

        int score = 78;

        if (score >= 80) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
```

#練習問題
* * * * *
スコアを3つ用意しスコアの合計240以上かつ1科目の点数が40以上の場合は合格と表示させるプログラムを作ってください。