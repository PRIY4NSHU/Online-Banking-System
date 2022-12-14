package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
  
public class otp extends Application {
  
  
    public static void main(String[] args) {
        launch(args);
    }
      
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("OTP Verification");
        
         
        BorderPane bp_otp = new BorderPane();
        bp_otp.setPadding(new Insets(10,50,50,50));
       
         
        //Adding HBox
        HBox hb_otp = new HBox();
        hb_otp.setPadding(new Insets(20,20,20,30));
         
        //Adding GridPane
        GridPane gridPane_otp = new GridPane();
        gridPane_otp.setPadding(new Insets(20,20,20,20));
        gridPane_otp.setHgap(5);
        gridPane_otp.setVgap(5);
        gridPane_otp.setAlignment(Pos.CENTER);
         
       //Implementing Nodes for GridPane
        Label otpLabel= new Label("Enter the OTP sent to your registered mobile number");
		TextField otpText= new TextField();
		Button otpButton=new Button("Validate OTP");
		gridPane_otp.add(otpLabel, 0, 0);
		gridPane_otp.add(otpText,1,0 );
		gridPane_otp.add(otpButton,1,3);
         
        //Adding Nodes to GridPane layout
        
                 
        //Reflection for gridPane_otp
        Reflection reflection_otp = new Reflection();
        reflection_otp.setFraction(0.7f);
        gridPane_otp.setEffect(reflection_otp);
         
        //DropShadow effect 
        DropShadow dropShadow_otp = new DropShadow();
        dropShadow_otp.setOffsetX(5);
        dropShadow_otp.setOffsetY(5);
         
        //Adding text and DropShadow effect to it
        Text text_otp = new Text("OTP Verification");
        text_otp.setFont(Font.font("Courier New", FontWeight.BOLD, 28));
        text_otp.setEffect(dropShadow_otp);
         
        //Adding text to HBox
        hb_otp.getChildren().add(text_otp);
                           
        //Add ID's to Nodes
        bp_otp.setId("bp");
        gridPane_otp.setId("root");
        text_otp.setId("text");
        otpButton.setId("btnLogin");                 
        //Action for btnLogin
        
        
        //Add HBox and GridPane layout to BorderPane Layout
        bp_otp.setTop(hb_otp);
        bp_otp.setCenter(gridPane_otp);  
         
        //Adding BorderPane to the scene and loading CSS
     Scene scene_otp = new Scene(bp_otp);
     scene_otp.getStylesheets().add(otp.class.getResource("application.css").toExternalForm());
     primaryStage.setScene(scene_otp);
//       primaryStage.titleProperty().bind(
//                 scene.widthProperty().asString().
//                 concat(" : ").
//                 concat(scene_otp.heightProperty().asString()));
     //primaryStage.setResizable(false);
     primaryStage.show();
    }
}