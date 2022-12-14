package application;
import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
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
import java.sql.*;
  
public class Signup extends Application {
  
    public static void main(String[] args) {
        launch(args);
    }
      
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sign Up Portal");
        
         
        BorderPane bp_signup = new BorderPane();
		bp_signup.setPadding(new Insets(10, 50, 50, 50));

		// Adding HBox
		HBox hb_signup = new HBox();
		hb_signup.setPadding(new Insets(20, 20, 20, 30));

		// Adding GridPane
		GridPane gridPane_signup = new GridPane();
		gridPane_signup.setPadding(new Insets(20, 20, 20, 20));
		gridPane_signup.setHgap(2);
		gridPane_signup.setVgap(5);
		gridPane_signup.setAlignment(Pos.CENTER);

		// Implementing Nodes for GridPane

		// Personal Details
		Text personaldetails = new Text("Personal Details");
		personaldetails.setFont(Font.font("Courier New", FontWeight.BOLD, 18));
		Text addressdetails = new Text("Address Details");
		addressdetails.setFont(Font.font("Courier New", FontWeight.BOLD, 18));
		Text accountdetails = new Text("Account Details");
		accountdetails.setFont(Font.font("Courier New", FontWeight.BOLD, 18));
		Label lbl = new Label("Username");
		final TextField txtUser = new TextField();
		Label dateob = new Label("Date of Birth");
		final TextField dofbirth = new TextField();
		Label aadhar = new Label("Aadhar Number");
		final TextField aadharNumber = new TextField();
		Label father = new Label("Father's Name");
		final TextField fatherName = new TextField();
		Label email = new Label("Email ID");
		final TextField mailId = new TextField();
		Label contact = new Label("Contact Number");
		final TextField contactNumber = new TextField();
		Label Pincode = new Label("Pincode");
		final TextField pincode = new TextField();
		Label city = new Label("City");
		final TextField City = new TextField();
		Label state = new Label("State");
		ComboBox<String> Statee = new ComboBox<>();
		Statee.getItems().addAll("Karnataka","Jharkhand","Maharashtra","Gujrat");
		Label gender = new Label("Gender:		");
		final RadioButton rbm = new RadioButton("Male");
		final RadioButton rbf = new RadioButton("Female");
		final RadioButton rbo = new RadioButton("Others");
		Label PAN = new Label("PAN number");
		final TextField panNumber = new TextField();
		Label an = new Label("Account number");
		final TextField accNumber = new TextField();
		Label cisc = new Label("CISC");
		final TextField ciscc = new TextField();
		Label permanentAddress = new Label("Permanent Address");
		final TextField pa = new TextField();
		Label bn = new Label("Branch Name");
		final TextField branchName = new TextField();
		Label bc = new Label("IFSC");
		final TextField branchCode = new TextField();

		Label lblPassword_signup = new Label("Password");
		final PasswordField pf_signup = new PasswordField();
		Label confirmPassword = new Label("Confirm Password");
		final PasswordField p_signup = new PasswordField();

		Button btn_signup = new Button("Sign Up");
		final Label lblMessage_signup = new Label();
		
		// Signup button function in Signup portal
		
				btn_signup.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {


							String Username = txtUser.getText();
							String Email = mailId.getText();
							String Dob=dofbirth.getText();
							String Aadhar=aadharNumber.getText();
							String Contact = contactNumber.getText();
							String PANo = panNumber.getText();
							String Accno = accNumber.getText();
							String IFSC = branchCode.getText();
							String Branch_name=branchName.getText();
							String CISC = ciscc.getText();
							String Password = pf_signup.getText();
							String cnfPassword = p_signup.getText();
							String Address = pa.getText();
							String State = Statee.getValue();
							String Cityy = City.getText();
							String Pincodee = pincode.getText();
							System.out.println(State);
							try {
								
							Class.forName("com.mysql.jdbc.Driver");
							Connection con= DriverManager.getConnection("jdbc:mysql: //localhost:3306/javaproject","root","Anshu@2001");
							Statement stmt = con.createStatement();
							
							if(cnfPassword.equals(Password)){
//							System.out.println("insert into Account_Details(acc_no,ifsc,b_name,pwd) values('" + Accno + "','" + IFSC + "'," + Branch_name + ",'" + Password + "')");
							stmt.executeUpdate("insert into Personal_Details(name,dob,email,contact,a_no) values('" + Username + "','" + Dob + "','" + Email + "','" + Contact + "','" + Aadhar+ "')");
							stmt.executeUpdate("insert into Address_Details(address,city,pincode,state) values('" + Address + "','" + Cityy + "'," + Pincodee + ",'" + State + "')" );
							stmt.executeUpdate("insert into Account_Details(acc_no,ifsc,b_name,pwd) values('" + Accno + "','" + IFSC + "','" + Branch_name + "','" + Password + "')" );
//							stage.setScene(scene_otp);
//							stage.setFullScreen(true);
							}
							else {
								lblMessage_signup.setText("Password does not match");
      							lblMessage_signup.setTextFill(Color.RED);
							}
								
							}
							catch(Exception e){
								System.out.println("Caught an error"+e);
							}

						} 
					

				});
		
		HBox hbrb = new HBox(20);
		hbrb.getChildren().addAll(gender,rbm, rbf, rbo);

		// Adding Nodes to GridPane layout
		// Personal Details
		gridPane_signup.add(personaldetails, 0, 0, 2, 1);
		gridPane_signup.add(lbl, 0, 1);
		gridPane_signup.add(txtUser, 1, 1);
		gridPane_signup.add(dateob, 2, 1);
		gridPane_signup.add(dofbirth, 3, 1);
		gridPane_signup.add(aadhar, 4, 1);
		gridPane_signup.add(aadharNumber, 5, 1);
		gridPane_signup.add(PAN, 0, 2);
		gridPane_signup.add(panNumber, 1, 2);
		gridPane_signup.add(contact, 2, 2);
		gridPane_signup.add(contactNumber, 3, 2);
		gridPane_signup.add(email, 4, 2);
		gridPane_signup.add(mailId, 5, 2);
		gridPane_signup.add(hbrb, 0, 3);

		// Address Details
		gridPane_signup.add(addressdetails, 0, 4, 2, 1);
		gridPane_signup.add(permanentAddress, 0, 5);
		gridPane_signup.add(pa, 1, 5);
		gridPane_signup.add(city, 2, 5);
		gridPane_signup.add(City, 3, 5);
		gridPane_signup.add(Pincode, 4, 5);
		gridPane_signup.add(pincode, 5, 5);
		gridPane_signup.add(state, 0, 6);
		gridPane_signup.add(Statee, 1, 6);

		// Account Details
		gridPane_signup.add(accountdetails, 0, 7, 2, 1);
		gridPane_signup.add(an, 0, 8);
		gridPane_signup.add(accNumber, 1, 8);
		gridPane_signup.add(cisc, 2, 8);
		gridPane_signup.add(ciscc, 3, 8);
		gridPane_signup.add(bn, 0, 9);
		gridPane_signup.add(branchName, 1, 9);
		gridPane_signup.add(bc, 2, 9);
		gridPane_signup.add(branchCode, 3, 9);
		gridPane_signup.add(lblPassword_signup, 0, 10);
		gridPane_signup.add(pf_signup, 1, 10);
		gridPane_signup.add(confirmPassword, 2, 10);
		gridPane_signup.add(p_signup, 3, 10);

		// Sign up button
		gridPane_signup.add(btn_signup, 2, 14);
		// Sign up label
		gridPane_signup.add(lblMessage_signup, 2, 13);

		// Reflection for gridPane_signup
		Reflection reflection_signup = new Reflection();
		reflection_signup.setFraction(0.7f);
		gridPane_signup.setEffect(reflection_signup);

		// DropShadow effect
		DropShadow dropShadow_signup = new DropShadow();
		dropShadow_signup.setOffsetX(5);
		dropShadow_signup.setOffsetY(5);

		// Adding text_signup and DropShadow effect to it
		Text text_signup = new Text("Sign Up Portal");
		text_signup.setFont(Font.font("Courier New", FontWeight.BOLD, 28));
		text_signup.setEffect(dropShadow_signup);

		// Adding text_signup to HBox
		hb_signup.getChildren().add(text_signup);

		// Add ID's to Nodes
		bp_signup.setId("bp");
		gridPane_signup.setId("root");
		btn_signup.setId("btnLogin");
		text_signup.setId("text");

		// Add HBox and GridPane layout to BorderPane Layout
		bp_signup.setTop(hb_signup);
		bp_signup.setCenter(gridPane_signup);

		// Adding BorderPane to the scene and loading CSS
		Scene scene_signup = new Scene(bp_signup);
		scene_signup.getStylesheets().add(Signup.class.getResource("application.css").toExternalForm());   
     primaryStage.setScene(scene_signup);
//       primaryStage.titleProperty().bind(
//                 scene.widthProperty().asString().
//                 concat(" : ").
//                 concat(scene.heightProperty().asString()));
     //primaryStage.setResizable(false);
     primaryStage.show();
    }
}
//stmt.executeUpdate("insert into Personal_Details(name,dob,email,contact,a_no) values("'" + Username + "','" + Dob + "','" + Email + "','" + Contact + "','" + Aadhar+ "'");