package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoggedinPage extends Application {

	String user = "gsp";
	 String pw = "151115";
	 String checkUser, checkPw;
	 
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane root_log = new BorderPane();
//		GridPane grid_center = new GridPane();
		HBox hbox_center = new HBox();
		VBox vbox_center1 = new VBox();
		vbox_center1.setPadding(new Insets(10,10,10,0));
		VBox vbox_center2 = new VBox();
		vbox_center2.setPadding(new Insets(10,0,10,0));
		HBox hbox_pay = new HBox();
		VBox vb_logo = new VBox();
		hbox_pay.setPadding(new Insets(10, 0, 10, 0));

		// Creating text Labels
		Label text1 = new Label("WELCOME");
		Label text1_ = new Label("!!");
		Label text2 = new Label("");
		Label text2_ = new Label("");
		Label text3 = new Label("");
		Label text3_ = new Label("");
		Label text4 = new Label("");
		Label text4_ = new Label("");
		Label text5 = new Label("");
		Label text5_ = new Label("");
		
		// create a menu start----------------------------------------------------------------------
		Menu menu1 = new Menu("My Accounts");
		Menu menu2 = new Menu("Transaction History");
		Menu menu3 = new Menu("My Cards");
		Menu menu4 = new Menu("Make Payments");
		Menu menu5 = new Menu("Logout");

		// create menuitems in menu 1
		MenuItem m1_1 = new MenuItem("Personal Details");
		MenuItem m1_2 = new MenuItem("Address Details");
		MenuItem m1_3 = new MenuItem("Account Details");

		// create menuitems in menu 2
		MenuItem m2_1 = new MenuItem("Withdrawal");
		MenuItem m2_2 = new MenuItem("Deposits");

		// create menuitems in menu 3
		MenuItem m3_1 = new MenuItem("Debit Card");
		MenuItem m3_2 = new MenuItem("Credit Card");

		// create menuitems in menu 4
		MenuItem m4_1 = new MenuItem("Pay to Beneficiary");
		MenuItem m4_2 = new MenuItem("Others");

		// create menuitems in menu 5
		MenuItem m5_1 = new MenuItem("Back to Home Page");
		MenuItem m5_2 = new MenuItem("Back to Login Page");

		// add menu items to menu1
		menu1.getItems().add(m1_1);
		menu1.getItems().add(m1_2);
		menu1.getItems().add(m1_3);

		// add menu items to menu2
		menu2.getItems().add(m2_1);
		menu2.getItems().add(m2_2);

		// add menu items to menu2
		menu3.getItems().add(m3_1);
		menu3.getItems().add(m3_2);

		// add menu items to menu4
		menu4.getItems().add(m4_1);
		menu4.getItems().add(m4_2);

		// add menu items to menu5
		menu5.getItems().add(m5_1);
		menu5.getItems().add(m5_2);

		// Adding Action to menuitems
		m1_1.setOnAction(e -> {
			text1.setText("Name:");
			text1_.setText("Priyanshu");
			text2.setText("D.O.B.:");
			text2_.setText("");
			text3.setText("Email:");
			text3_.setText("");
			text4.setText("Contact:");
			text4_.setText("");
			text5.setText("Account No.:");
			text5_.setText("");
		});
		m1_2.setOnAction(e -> {
			text1.setText("Address:");
			text1_.setText("Vasai");
			text2.setText("City:");
			text2_.setText("");
			text3.setText("Pincode:");
			text3_.setText("");
			text4.setText("State:");
			text4_.setText("");
			text5.setText("");
			text5_.setText("");
		});
		m1_3.setOnAction(e -> {
			text1.setText("Account No.:");
			text1_.setText("");
			text2.setText("IFSC:");
			text2_.setText("");
			text3.setText("Branch Name:");
			text3_.setText("");
			text4.setText("");
			text4_.setText("");
			text5.setText("");
			text5_.setText("");
		});
//		m5_1.setOnAction(e -> {
//			stage.setScene(scene1);
//			stage.setTitle("HomePage");
//			stage.setFullScreen(true);
//		});
//		m5_2.setOnAction(e -> {
//			stage.setScene(scene_login);
//			stage.setTitle("Login Portal");
//			stage.setFullScreen(true);
//		});

		// create a menubar
		MenuBar mb = new MenuBar();
		mb.prefWidthProperty().bind(stage.widthProperty());

		// add menu to menubar
		mb.getMenus().addAll(menu1, menu2, menu3, menu4, menu5);
		// Menubar end------------------------------------------------------------------------
		
		// Treeview start---------------------------------------------------------------------
		TreeView<String> tree = new TreeView<>();
		
		TreeItem<String> rooot = new TreeItem<>("Options");
		
		TreeItem<String> branch1 = new TreeItem<>("Services");
		TreeItem<String> branch2 = new TreeItem<>("FAQ");
		TreeItem<String> branch3 = new TreeItem<>("Banking Channel");
		TreeItem<String> branch4 = new TreeItem<>("Loans");
		TreeItem<String> branch5 = new TreeItem<>("About Us");
		
		TreeItem<String> leaf1_1 = new TreeItem<>("Mobile Banking"); // Create leaves
		TreeItem<String> leaf1_2 = new TreeItem<>("Forex");
		TreeItem<String> leaf1_3 = new TreeItem<>("Insurance");
		TreeItem<String> leaf2_1 = new TreeItem<>("Personal FAQ");
		TreeItem<String> leaf2_2 = new TreeItem<>("Corporate FAQ");
		TreeItem<String> leaf3_1 = new TreeItem<>("Credit Card");
		TreeItem<String> leaf3_2 = new TreeItem<>("Debit Card");
		TreeItem<String> leaf3_3 = new TreeItem<>("UPI");
		TreeItem<String> leaf4_1 = new TreeItem<>("Personal Loan");
		TreeItem<String> leaf4_2 = new TreeItem<>("Home Loan");
		TreeItem<String> leaf4_3 = new TreeItem<>("Gold Loan");
		
		// Arranging treeview
		tree.setRoot(rooot);
		rooot.getChildren().addAll(branch1, branch2, branch3, branch4, branch5);
		branch1.getChildren().addAll(leaf1_1, leaf1_2, leaf1_3);
		branch2.getChildren().addAll(leaf2_1, leaf2_2);
		branch3.getChildren().addAll(leaf3_1, leaf3_2, leaf3_3);
		branch4.getChildren().addAll(leaf4_1, leaf4_2, leaf4_3);
		rooot.setExpanded(true);
		branch1.setExpanded(true);
		branch2.setExpanded(true);
		branch3.setExpanded(true);
		branch4.setExpanded(true);
		
		// Treeview end-----------------------------------------------------------------------
		

		//Make Balance button
		Button bal = new Button("Check Balance");
		bal.setMinWidth(120);
		bal.setMinHeight(40);

//		logo.setFitHeight(200);
//		logo.setFitWidth(700);
//		GridPane.setConstraints(logo, 1, 1, 1, 2);

		root_log.setLeft(tree);
		root_log.setTop(vb_logo);
		root_log.setBottom(hbox_pay);
//		root_log.setCenter(grid_center);
		root_log.setCenter(hbox_center);
		vb_logo.getChildren().addAll(mb);
		hbox_pay.getChildren().addAll(bal);
		hbox_pay.setAlignment(Pos.CENTER);
		vbox_center1.getChildren().addAll(text1,text2,text3,text4,text5);
		vbox_center1.setAlignment(Pos.CENTER_RIGHT);
		vbox_center2.getChildren().addAll(text1_,text2_,text3_,text4_,text5_);
		vbox_center2.setAlignment(Pos.CENTER_LEFT);
		hbox_center.getChildren().addAll(vbox_center1,vbox_center2);
		hbox_center.setAlignment(Pos.CENTER);
		
		//Setting Ids
		root_log.setId("root");
//		tree.setId("root");
		vbox_center1.setId("label1");
		vbox_center2.setId("label2");
//		vb_logo.setId("root");
//		vbox_center1.setId("root");
		bal.setId("btnLogin");
		
		Scene scene_log = new Scene(root_log, 800, 500);
		scene_log.getStylesheets().add(getClass().getResource("application.css").toExternalForm());    
	     
		//Default Scene
		stage.setScene(scene_log);
//		stage.getIcons().add(image); //Adding custom icon
		stage.show();
		}
	
	public static void main(String[] args) {
		Application.launch(args); 
	}
}