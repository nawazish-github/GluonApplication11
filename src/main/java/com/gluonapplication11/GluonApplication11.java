package com.gluonapplication11;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class GluonApplication11 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        Button vibrateMe = new Button ("Vibrate Me");
        
        StackPane root = new StackPane(vibrateMe);

        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root, visualBounds.getWidth(), visualBounds.getHeight());

        stage.getIcons().add(new Image(GluonApplication11.class.getResourceAsStream("/icon.png")));

        stage.setScene(scene);
        stage.show();
 
        vibrateMe.setOnAction(event -> {
            System.out.println("vibrator clicked");
            try {
                VibratorService vibratorService = (VibratorService)Class.forName("com.gluonapplication11.VibratorServiceImpl").newInstance();
                    vibratorService.vibrateMobile(20000);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GluonApplication11.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(GluonApplication11.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(GluonApplication11.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
    }
   
    public static void main (String [] a){
        launch(a);
    }

}
