# Javaのインストール方法 (Windows)
* * * * *
これからJavaのインストール方法を紹介します。もし既にJavaがインストールされている場合はこの作業をステップしてください。

# 推奨スペック
* * * * *
- Windows 10 (8u51以上)
- Windows 8.x (デスクトップ)
- Windows 7 SP1
- Windows Vista SP2
- Windows Server 2008 R2 SP1 (64ビット)
- Windows Server 2012および2012 R2 (64ビット)
- RAM: 128MB
- ディスク・スペース: JRE用に124MB、Java Update用に2MB
- プロセッサ: Pentium 2 266MHzプロセッサ以上
- ブラウザ: Internet Explorer 9以上、Firefox

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
選択ボタンの下にOS別に並ぶダウンロードリンクの中から、32bitOSの方は「Windows x86 jdk-8u121-windows-i586.exe」を、64bitOSの方は「Windows x64 jdk-8u121-windows-x64.exe」をダウンロードします。
<br>
![Oracle2](https://github.com/flatfisher/textbook-java/blob/master/material/img/introduction/oracle_win.png?raw=true "Oracle2")
<br>
###JDKのインストール
ダウンロードしたインストーラーを実行し、手順に沿ってJDKをインストールします。
<br>
![Installer](https://github.com/flatfisher/textbook-java/blob/master/material/img/introduction/installer.png?raw=true "Installer")
<br>
###インストールされているか確認
前述の(Javaがインストールされているか確認する方法)を参考にしインストールされているか確認します。
どこのフォルダにインストールするか必ず確認してください！通常は「Program Files」にインストールされます。

#Javaコマンドのパスを通す
* * * * *
パスの設定は[こちら](http://techfun.cc/java/windows-jdk-pathset.html)のサイトにより詳しく記載されています。