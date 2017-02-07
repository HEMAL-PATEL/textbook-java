#ブレークタイム
* * * * *

初めてのプログラミングはいかがだったでしょうか。慣れない作業も多く疲れたと思います。ここで少し休憩をとりましょう。
休憩の前に以下の"OpendBrowser.java"というJavaファイルを新たに作成し以下のコードを書き
コンパイル＆実行してみてください。※今回はコピー＆ペーストで構いません

<br>

ディレクトリ構成

```
projects
   - lesson1
        -  Hello.java
        -  Hello.class
        -  OpendBrowser.java
```

記載するコード

```
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {
	public static void main(String[] args) {
		Desktop desktop = Desktop.getDesktop();
		String uriString = "http://www.google.co.jp";
		try {
			URI uri = new URI(uriString);
			desktop.browse(uri);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
```

ブラウザが開きYoutubeが再生されます。どうぞ休憩をお楽しみにください。
<br>
※URLの部分を変えれば他のサイトも開くことができます。