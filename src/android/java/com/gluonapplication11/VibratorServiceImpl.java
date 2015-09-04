/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gluonapplication11;

import android.os.Vibrator;
import javafxports.android.FXActivity;

public class VibratorServiceImpl implements VibratorService {
    
    FXActivity fxActivity = FXActivity.getInstance();

    @Override
    public void vibrateMobile(long l) {
        System.out.println("inside VibratorServiceImpl.vibrateMobile: "+l);
        Vibrator vibrator = (Vibrator)fxActivity.getSystemService(FXActivity.VIBRATOR_SERVICE);
            vibrator.vibrate(l);
    }
    
}
