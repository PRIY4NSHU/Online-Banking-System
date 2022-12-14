package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
  
public class login extends Application {
  
 String user = "gsp";
 String pw = "151115";
 String checkUser, checkPw;
  
    public static void main(String[] args) {
        launch(args);
    }
      
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Portal");
        
         
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10,50,50,50));
       
         
        //Adding HBox
        HBox hb = new HBox();
        hb.setPadding(new Insets(20,20,20,30));
         
        //Adding GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);
         
       //Implementing Nodes for GridPane
        Label lblUserName = new Label("Username");
        final TextField txtUserName = new TextField();
        Label lblPassword = new Label("Password");
        final PasswordField pf = new PasswordField();
        Button btnLogin = new Button("Login");
        final Label lblMessage = new Label();
        
        
        //Button action code
        btnLogin.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
		        String enteredUserName= txtUserName.getText().toString();
		        String enteredPassword= pf.getText().toString();
		        try {
		        	int flag=0;
		        	Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql: //localhost:3306/javaproject","root","1234");
					Statement stmt = con.createStatement();
					ResultSet rs=stmt.executeQuery("select pwd from Account_Details acc,Personal_Details p where p.person_id=acc.person_id and p.name='" + enteredUserName + "'" );
					while(rs.next())
					{
						System.out.println("correct password:"+rs.getString(1) + " user password:"+enteredPassword);
						if(rs.getString(1).equals(enteredPassword))
						{
							
							lblMessage.setText("Login!");
							flag=1;
						}
					}
					if(flag==0)
						lblMessage.setText("Wrong Password!");
		        }
		        
		        catch(Exception e) {
		        	System.out.println("Caught an error");
		        }

			}
        	
        });
         
        //Adding Nodes to GridPane layout
        gridPane.add(lblUserName, 0, 0);
        gridPane.add(txtUserName, 1, 0);
        gridPane.add(lblPassword, 0, 1);
        gridPane.add(pf, 1, 1);
        gridPane.add(btnLogin, 2, 1);
        gridPane.add(lblMessage, 1, 2);
         
                 
        //Reflection for gridPane
        Reflection reflection = new Reflection();
        reflection.setFraction(0.7f);
        gridPane.setEffect(reflection);
         
        //DropShadow effect 
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);
         
        //Adding text and DropShadow effect to it
        Text text = new Text("Login Portal");
        text.setFont(Font.font("Courier New", FontWeight.BOLD, 28));
        text.setEffect(dropShadow);
         
        //Adding text to HBox
        hb.getChildren().add(text);
                           
        //Add ID's to Nodes
        bp.setId("bp");
        gridPane.setId("root");
        btnLogin.setId("btnLogin");
        text.setId("text");
        
        //Add HBox and GridPane layout to BorderPane Layout
        bp.setTop(hb);
        bp.setCenter(gridPane);  
         
        //Adding BorderPane to the scene and loading CSS
     Scene scene = new Scene(bp);
     scene.getStylesheets().add(login.class.getResource("application.css").toExternalForm());
     primaryStage.setScene(scene);
     primaryStage.show();
    }
}