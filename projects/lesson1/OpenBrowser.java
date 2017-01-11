import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {
    public static void main(String[] args) {
        Desktop desktop = Desktop.getDesktop();
        String uriString = "https://www.youtube.com/watch?v=c8UO4jquAlY&t=0m57s";
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