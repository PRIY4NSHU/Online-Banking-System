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
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
  
public class Makepayment_others extends Application {
  
  
    public static void main(String[] args) {
        launch(args);
    }
      
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Make Payment");
        
         
        BorderPane make_payment_others = new BorderPane();
        make_payment_others.setPadding(new Insets(10,50,50,50));
       
         
        //Adding HBox
        HBox hb_makepayment_others = new HBox(200);
        hb_makepayment_others.setPadding(new Insets(20,20,20,30));
        
        //Adding GridPane
        GridPane gridPane_makepayment_others = new GridPane();
        gridPane_makepayment_others.setPadding(new Insets(20,20,20,20));
        gridPane_makepayment_others.setHgap(5);
        gridPane_makepayment_others.setVgap(5);
        gridPane_makepayment_others.setAlignment(Pos.CENTER);
         
       //Implementing Nodes for GridPane
        Label AmoutToSend_others= new Label("Amount: ");
		TextField AmoutToSendText_others= new TextField();
		Label SelectBenefeciary_others= new Label(" Benefeciary Name: ");
		TextField SelectBenefeciaryText_others= new TextField();
		Label SelectBenefeciaryaccno_others= new Label("Benefeciary Account Number: ");
		TextField SelectBenefeciaryaccnoText_others= new TextField();
		Label ifsc_others= new Label(" IFSC Code: ");
		TextField ifsc_othersText= new TextField();
		Label Bank_others= new Label(" Bank Name: ");
		TextField Bank_others_others= new TextField();
		Label Enterpwd_others= new Label("Enter your Online Banking Password : ");
		TextField EnterpwdText_others= new TextField();
		Button SendButton_others=new Button("Send");
		
		gridPane_makepayment_others.add(AmoutToSend_others, 0, 0);
		gridPane_makepayment_others.add(AmoutToSendText_others,1,0 );
		gridPane_makepayment_others.add(SelectBenefeciary_others,0,1 );
		gridPane_makepayment_others.add(SelectBenefeciaryText_others,1,1 );
		gridPane_makepayment_others.add(SelectBenefeciaryaccno_others,0,2 );
		gridPane_makepayment_others.add(SelectBenefeciaryaccnoText_others,1,2 );
		gridPane_makepayment_others.add(ifsc_others,0,3 );
		gridPane_makepayment_others.add(ifsc_othersText,1,3);
		gridPane_makepayment_others.add(Bank_others,0,4 );
		gridPane_makepayment_others.add(Bank_others_others,1,4);
		gridPane_makepayment_others.add(Enterpwd_others,0,5 );
		gridPane_makepayment_others.add(EnterpwdText_others,1,5);
		
		
		gridPane_makepayment_others.add(SendButton_others,1,9);
         
        //Adding Nodes to GridPane layout
        
                 
        //Reflection for gridPane_makepayment_others
        Reflection reflectionMakepayment_others = new Reflection();
        reflectionMakepayment_others.setFraction(0.7f);
        gridPane_makepayment_others.setEffect(reflectionMakepayment_others);
         
        //DropShadow effect 
        DropShadow dropShadow_makepayment = new DropShadow();
        dropShadow_makepayment.setOffsetX(5);
        dropShadow_makepayment.setOffsetY(5);
         
        //Adding text and DropShadow effect to it
        Image image_makepayment_others = new Image("FinCorp.png");
		ImageView logo_makepayment_others = new ImageView(image_makepayment_others);
		logo_makepayment_others.setFitHeight(200);
		logo_makepayment_others.setFitWidth(800);
        Text text_makepayment_others = new Text("Payment");
        text_makepayment_others.setFont(Font.font("Courier New", FontWeight.BOLD, 28));
        text_makepayment_others.setEffect(dropShadow_makepayment);

        
        //Adding back Button
		Button Makepaymentback_others=new Button("Back");
		Makepaymentback_others.setAlignment(Pos.CENTER_RIGHT);

         
        //Adding text to HBox
        hb_makepayment_others.getChildren().addAll(logo_makepayment_others,Makepaymentback_others);
        
        //Adding text paymnet to other Hbox
                           
        //Add ID's to Nodes
        make_payment_others.setId("bp");
        gridPane_makepayment_others.setId("root");
        text_makepayment_others.setId("text");
        Makepaymentback_others.setId("bck_makepayment_others");
        Makepaymentback_others.setMinWidth(80);
        Makepaymentback_others.setMinHeight(20);
        Makepaymentback_others.setAlignment(Pos.CENTER);
                 
        
        
        //Add HBox and GridPane layout to BorderPane Layout
        make_payment_others.setTop(hb_makepayment_others);
        make_payment_others.setCenter(gridPane_makepayment_others);  
         
        //Adding BorderPane to the scene and loading CSS
     Scene scene_makepayment_others = new Scene(make_payment_others);
     scene_makepayment_others.getStylesheets().add(Makepayment_others.class.getResource("application.css").toExternalForm());
     primaryStage.setScene(scene_makepayment_others);
//       
     primaryStage.show();
    }
}