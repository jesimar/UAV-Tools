package uav.google.maps;

import java.io.File;
import marte.swing.google.maps.GoogleMapsScene;
import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;

/**
 * you can use "./html/maps.html", <br>
 * remenber to set YOUR_API_KEY on this html file, see line:<br>
 * src="https://maps.googleapis.com/maps/api/js?key=<b>YOUR_API_KEY</b>&callback=initMap"<br>
 * @author Marcio
 */
public class UAVGoogleMaps{
    
    public static void main(String[] args) throws InterruptedException {
        final GoogleMapsScene api = GoogleMapsScene.launch(new File("./html/maps.html"), args);    
     
        JFrame frame = new JFrame("Google Maps JavaScript API on a swing JPanel");

        JFXPanel fxPanel = new JFXPanel();
        
        api.attach(fxPanel);

        frame.add(fxPanel);
        frame.setSize(1300, 820);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

