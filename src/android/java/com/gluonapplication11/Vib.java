/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gluonapplication11;

import android.os.Vibrator;
import com.gluonapplication11.GluonApplication11;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafxports.android.FXActivity;

/**
 *
 * @author NawazishMohammad
 */
public class Vib {

   static FXActivity fxActivity = FXActivity.getInstance();
    
    public static void vibrateMobile(){
        Vibrator vibrator = (Vibrator)fxActivity.getSystemService(FXActivity.VIBRATOR_SERVICE);
        vibrator.vibrate(20000);
    }
  
}
