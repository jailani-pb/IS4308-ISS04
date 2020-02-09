package week02.slot01;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MySecondGUI extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Pane root = new Pane();
		Image pblogo = new Image(
				new File("image/pblogo_new.png")
				.toURI().toString());
		ImageView imageView = new ImageView(pblogo);
		imageView.setFitWidth(100);
		imageView.setFitHeight(100);
		imageView.setX(0);
		imageView.setY(100);
		
		Label label = new Label("Politeknik Brunei");
		// Set font with 50pt size
//		label.setFont(Font.font(50));
		// To list down available fonts
//		System.out.println(Font.getFamilies());
		// Set font Serif with 50pt size
//		label.setFont(Font.font("Serif", 50));
		// Set font Serif with bold and 50pt size
//		label.setFont(Font.font("Serif", FontWeight.BOLD, 50));
		// Set font Serif with bold, italic and 50pt size
		label.setFont(
			Font.font("Serif", FontWeight.BOLD, 
					FontPosture.ITALIC, 50));
		
		label.setBackground(
			new Background(
				new BackgroundFill(
					Color.rgb(100, 200, 150, 0.5),
					CornerRadii.EMPTY,
					Insets.EMPTY)));
		
		root.getChildren().add(imageView);
		root.getChildren().add(label);
		
		Scene scene = new Scene(root, 800, 600);
		arg0.setScene(scene);
		arg0.setTitle("My Second GUI");
		arg0.show();
	}
	
}
