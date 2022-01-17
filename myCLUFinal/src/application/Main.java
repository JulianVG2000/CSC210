// Name: Julian van Geest
// Date: 12/4/21
// Project Description: Memory match game using javafx
// Comment:

package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.Date;

public class Main extends Application implements EventHandler<ActionEvent> {
	
	Stage window;
	Scene scene1, scene2;
	Button neutralButton1, neutralButton2, neutralButton3, neutralButton4, neutralButton5,
		neutralButton6, neutralButton7, neutralButton8, neutralButton9, neutralButton10, 
		neutralButton11, neutralButton12, neutralButton13, neutralButton14, neutralButton15,
		neutralButton16;
	BorderPane layout1;
	GridPane layout2;
	Label apple, banana, orange, strawberry, blueberry, mango, grape, lemon;
	public int userScore = 0;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			*/
			window = primaryStage;
			window.setOnCloseRequest(e -> {
				e.consume();
				closeProgram();
			});
			
			Label label1 = new Label("Turn the cards to find matching pairs!");
			
			// Button 1
			Button button1 = new Button("START");
			button1.setOnAction(e -> window.setScene(scene2));
			
			// Layout 1 - Start menu
			layout1 = new BorderPane();
			layout1.setTop(label1);
			layout1.setCenter(button1);
			scene1 = new Scene(layout1, 400, 400);
			
			// Button 2
			Button button2 = new Button("EXIT");
			button2.setOnAction(e -> closeProgram());
			
			// Layout 2 - Game
			layout2 = new GridPane();
			layout2.setAlignment(Pos.CENTER);
			layout2.setPadding(new Insets(50, 50, 50, 50));
			layout2.setHgap(50);
			layout2.setVgap(50);
			
			// Game Buttons & Labels
			apple = new Label("apple");
			banana = new Label("banana");
			orange = new Label("orange");
			strawberry = new Label("strawberry");
			blueberry = new Label("blueberry");
			mango = new Label("mango");
			grape = new Label("grape");
			lemon = new Label("lemon");
			neutralButton1 = new Button("Click");
			neutralButton1.setOnAction(this);
			neutralButton2 = new Button("Click");
			neutralButton2.setOnAction(this);
			neutralButton3 = new Button("Click");
			neutralButton3.setOnAction(this);
			neutralButton4 = new Button("Click");
			neutralButton4.setOnAction(this);
			neutralButton5 = new Button("Click");
			neutralButton5.setOnAction(this);
			neutralButton6 = new Button("Click");
			neutralButton6.setOnAction(this);
			neutralButton7 = new Button("Click");
			neutralButton7.setOnAction(this);
			neutralButton8 = new Button("Click");
			neutralButton8.setOnAction(this);
			neutralButton9 = new Button("Click");
			neutralButton9.setOnAction(this);
			neutralButton10 = new Button("Click");
			neutralButton10.setOnAction(this);
			neutralButton11 = new Button("Click");
			neutralButton11.setOnAction(this);
			neutralButton12 = new Button("Click");
			neutralButton12.setOnAction(this);
			neutralButton13 = new Button("Click");
			neutralButton13.setOnAction(this);
			neutralButton14 = new Button("Click");
			neutralButton14.setOnAction(this);
			neutralButton15 = new Button("Click");
			neutralButton15.setOnAction(this);
			neutralButton16 = new Button("Click");
			neutralButton16.setOnAction(this);
			
			/*
			Image imageNeutral = new Image("file:///C:/Users/julia/OneDrive/Documents/CSC210/myCLUFinal/Images/neutral.png");
			Image image1 = new Image("file:///C:/Users/julia/OneDrive/Documents/CSC210/myCLUFinal/Images/apple.jpg");
			Image image2 = new Image("file:///C:/Users/julia/OneDrive/Documents/CSC210/myCLUFinal/Images/banana.png");
			Image image3 = new Image("file:///C:/Users/julia/OneDrive/Documents/CSC210/myCLUFinal/Images/orange.jpg");
			Image image4 = new Image("file:///C:/Users/julia/OneDrive/Documents/CSC210/myCLUFinal/Images/strawberry.jpg");
			
			ImageView imageViewNeutral = new ImageView(imageNeutral);
			imageViewNeutral.setFitHeight(100);
			imageViewNeutral.setFitWidth(100);
			ImageView imageView1 = new ImageView(image1);
			imageView1.setFitHeight(100);
			imageView1.setFitWidth(100);
			ImageView imageView2 = new ImageView(image2);
			imageView2.setFitHeight(100);
			imageView2.setFitWidth(100);
			ImageView imageView3 = new ImageView(image3);
			imageView3.setFitHeight(100);
			imageView3.setFitWidth(100);
			ImageView imageView4 = new ImageView(image4);
			imageView4.setFitHeight(100);
			imageView4.setFitWidth(100);
			
			layout2.add(imageView1, 0, 0);
			layout2.add(imageView2, 1, 0);
			layout2.add(imageView3, 2, 0);
			layout2.add(imageView4, 3, 0);
			*/
			
			Date date = new Date();
			Label label2 = new Label("Time: " + date.toString());
			layout2.add(label2, 4, 0);
			GridPane.setHalignment(label2, HPos.RIGHT);
			
			layout2.add(neutralButton1, 0, 0);
			layout2.add(neutralButton2, 1, 0);
			layout2.add(neutralButton3, 2, 0);
			layout2.add(neutralButton4, 3, 0);
			layout2.add(neutralButton5, 0, 1);
			layout2.add(neutralButton6, 1, 1);
			layout2.add(neutralButton7, 2, 1);
			layout2.add(neutralButton8, 3, 1);
			layout2.add(neutralButton9, 0, 2);
			layout2.add(neutralButton10, 1, 2);
			layout2.add(neutralButton11, 2, 2);
			layout2.add(neutralButton12, 3, 2);
			layout2.add(neutralButton13, 0, 3);
			layout2.add(neutralButton14, 1, 3);
			layout2.add(neutralButton15, 2, 3);
			layout2.add(neutralButton16, 3, 3);
			
			layout2.add(button2, 5, 4);
			GridPane.setHalignment(button2, HPos.RIGHT);
			scene2 = new Scene(layout2);
			
			window.setScene(scene1);
			window.setTitle("Memory Match");
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		// Apple
		if (event.getSource() == neutralButton1) {
			try {
				layout2.getChildren().remove(neutralButton1);
				layout2.add(apple, 0, 0);
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton7);
				layout2.getChildren().remove(apple);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Banana
		if (event.getSource() == neutralButton2) {
			try {
				layout2.getChildren().remove(neutralButton2);
				layout2.add(banana, 1, 0);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton9);
				layout2.getChildren().remove(banana);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Orange
		if (event.getSource() == neutralButton3) {
			try {
				layout2.getChildren().remove(neutralButton3);
				layout2.add(orange, 2, 0);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton5);
				layout2.getChildren().remove(orange);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Strawberry
		if (event.getSource() == neutralButton4) {
			try {
				layout2.getChildren().remove(neutralButton4);
				layout2.add(strawberry, 3, 0);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton10);
				layout2.getChildren().remove(strawberry);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Orange
		if (event.getSource() == neutralButton5) {
			try {
				layout2.getChildren().remove(neutralButton5);
				layout2.add(orange, 0, 1);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton3);
				layout2.getChildren().remove(orange);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Blueberry
		if (event.getSource() == neutralButton6) {
			try {
				layout2.getChildren().remove(neutralButton6);
				layout2.add(blueberry, 1, 1);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton15);
				layout2.getChildren().remove(blueberry);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Apple
		if (event.getSource() == neutralButton7) {
			try {
				layout2.getChildren().remove(neutralButton7);
				layout2.add(apple, 2, 1);
				
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton1);
				layout2.getChildren().remove(apple);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Mango
		if (event.getSource() == neutralButton8) {
			try {
				layout2.getChildren().remove(neutralButton8);
				layout2.add(mango, 3, 1);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton11);
				layout2.getChildren().remove(mango);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Banana
		if (event.getSource() == neutralButton9) {
			try {
				layout2.getChildren().remove(neutralButton9);
				layout2.add(banana, 0, 2);
				
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton2);
				layout2.getChildren().remove(banana);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Strawberry
		if (event.getSource() == neutralButton10) {
			try {
				layout2.getChildren().remove(neutralButton10);
				layout2.add(strawberry, 1, 2);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton4);
				layout2.getChildren().remove(strawberry);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Mango
		if (event.getSource() == neutralButton11) {
			try {
				layout2.getChildren().remove(neutralButton11);
				layout2.add(mango, 2, 2);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton8);
				layout2.getChildren().remove(mango);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Lemon
		if (event.getSource() == neutralButton12) {
			try {
				layout2.getChildren().remove(neutralButton12);
				layout2.add(lemon, 3, 2);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton14);
				layout2.getChildren().remove(lemon);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Grape
		if (event.getSource() == neutralButton13) {
			try {
				layout2.getChildren().remove(neutralButton13);
				layout2.add(grape, 0, 3);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton16);
				layout2.getChildren().remove(grape);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Lemon
		if (event.getSource() == neutralButton14) {
			try {
				layout2.getChildren().remove(neutralButton14);
				layout2.add(lemon, 1, 3);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton12);
				layout2.getChildren().remove(lemon);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Blueberry
		if (event.getSource() == neutralButton15) {
			try {
				layout2.getChildren().remove(neutralButton15);
				layout2.add(blueberry, 2, 3);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(0, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (grape.contains(3, 3)) {
					layout2.getChildren().remove(grape);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton6);
				layout2.getChildren().remove(blueberry);
				System.out.println("Score:" + userScore);
			}
		}
		
		// Grape
		if (event.getSource() == neutralButton16) {
			try {
				layout2.getChildren().remove(neutralButton16);
				layout2.add(grape, 3, 3);
				
				if (apple.contains(0, 0)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (banana.contains(1, 0)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(2, 0)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(3, 0)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (orange.contains(0, 1)) {
					layout2.getChildren().remove(orange);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(1, 1)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				if (apple.contains(2, 1)) {
					layout2.getChildren().remove(apple);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(3, 1)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (banana.contains(0, 2)) {
					layout2.getChildren().remove(banana);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (strawberry.contains(1, 2)) {
					layout2.getChildren().remove(strawberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (mango.contains(2, 2)) {
					layout2.getChildren().remove(mango);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(3, 2)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (lemon.contains(1, 3)) {
					layout2.getChildren().remove(lemon);
					userScore -= 10;
					System.out.println(userScore);
				}
				else if (blueberry.contains(2, 3)) {
					layout2.getChildren().remove(blueberry);
					userScore -= 10;
					System.out.println(userScore);
				}
				
			} catch(Exception ex) {
				userScore += 100;
				layout2.getChildren().remove(neutralButton13);
				layout2.getChildren().remove(grape);
				System.out.println("Score:" + userScore);
			}
		}
	}
	
	private void closeProgram() {
		Boolean answer = ConfirmBox.display("Title", "Are you sure you want to exit?");
		if(answer)
			window.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}

class ConfirmBox {
	
	static boolean answer;
	
	public static boolean display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label label = new Label();
		label.setText(message);
		
		Button continueButton = new Button("Yes");
		Button exitButton = new Button("No");
		
		continueButton.setOnAction(e -> {
				answer = true;
				window.close();
		});
		exitButton.setOnAction(e -> {
			answer = false;
			window.close();
		});
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, continueButton, exitButton);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		return answer;
	}
}
