package week02.slot01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Pane root = new Pane();
		Circle circle = new Circle();
		circle.setRadius(100);
//		circle.setCenterX(100);
//		circle.setCenterY(100);
		circle.centerXProperty()
			.bind(root.widthProperty().divide(2));
		circle.centerYProperty()
			.bind(root.heightProperty().divide(2));
		circle.radiusProperty()
			.bind(root.widthProperty().divide(2));
		
		circle.setStroke(Color.CRIMSON);
		circle.setFill(Color.AQUA);
		
		root.getChildren().add(circle);
		Scene scene = new Scene(root, 300, 300);
		
//		circle.setCenterX(root.getWidth() / 2);
//		circle.setCenterY(root.getHeight() / 2);
		
		arg0.setScene(scene);
		arg0.show();
	}
	
}
