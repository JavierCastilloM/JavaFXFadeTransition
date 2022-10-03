/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxfadetransition;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author JavierCastilloM
 */
public class JavaFXFadeTransition extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane sp = new StackPane();
        Ellipse ellipse = new Ellipse(130,90);
        ellipse.setFill(Color.RED);
        
        
        ellipse.setCenterX(sp.getWidth()/2);
        ellipse.setCenterY(sp.getHeight()/2); 
        
        FadeTransition ft = new FadeTransition(Duration.millis(3000), ellipse);
        
        sp.getChildren().add(ellipse);
        
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(4);
        ft.setAutoReverse(true);
        
        
        ft.play();
        sp.setOnMousePressed(event -> {
            ft.pause();
        });
        
        sp.setOnMouseReleased(event -> {
            ft.play();
        });

        Scene scene = new Scene(sp, 300, 200);
        
 
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
