# Javaのインストール方法 (Mac)
* * * *
これからJavaのインストール方法を紹介します。もし既にJavaがインストールされている場合はこの作業をステップしてください。

# Javaがインストールされているか確認する方法
* * * *
Macのターミナルを起動してください
こんな感じの画面です。
![ターミナル](https://github.com/flatfisher/textbook-java/blob/master/material/img/introduction/terminal.png?raw=true "Terminal")
起動したら以下2つのコマンドを実行してください

```
username$java -version
```

```
username$javac -version
```

以下のような結果が表示されればインストールが完了しています

```
java version "1.8.0_91"
Java(TM) SE Runtime Environment (build 1.8.0_91-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.91-b14, mixed mode)
```

```
javac 1.8.0_91
```

#Javaをインストールする
* * * *
###JDKのダウンロード
Javaの開発環境を提供している[Oracle社のJDKダウンロードページ](http://www.oracle.com/technetwork/java/javase/downloads/index.html)にアクセスします。<br>
<br>
「Java Platform, Standard Edition」という囲みの中の右側にある「JDK DOWNLOAD」ボタンをクリックします。
<br>
![Oracle1](https://github.com/flatfisher/textbook-java/blob/master/material/img/introduction/oracle1.png?raw=true "Oracle1")
<br>
「Accept License Agreement」と「Decline License Agreement」の２つの選択ボタンが並んでいます。初期状態では「Decline...」が選択されていますが、「Accept...」をクリックします。
選択ボタンの下にOS別に並ぶダウンロードリンクの中から、「Mac OS X x64（jdk-8u??-macosx-x64.dmg）」を選びダウンロードします。
<br>
![Oracle2](https://github.com/flatfisher/textbook-java/blob/master/material/img/introduction/oracle2.png?raw=true "Oracle2")
<br>
###JDKのインストール
ダウンロードしたインストーラーを実行し、手順に沿ってJDKをインストールします。
<br>
![Installer](https://github.com/flatfisher/textbook-java/blob/master/material/img/introduction/installer.png?raw=true "Installer")
<br>
###インストールされているか確認
前述の(Javaがインストールされているか確認する方法)を参考にしインストールされているか確認します。
