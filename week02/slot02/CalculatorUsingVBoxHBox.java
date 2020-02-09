package week02.slot02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatorUsingVBoxHBox extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		
		Label calculationLabel = new Label();
		calculationLabel.setMinWidth(500);
		calculationLabel.setMaxWidth(500);
		calculationLabel.setMinHeight(100);
		calculationLabel.setMaxHeight(100);
		calculationLabel.setFont(Font.font(30));
		
		root.getChildren().add(calculationLabel);
		
		HBox buttonsHBox = new HBox();
		VBox number7410VBox = new VBox();
		
		Button number7 = new Button("7");
		Button number4 = new Button("4");
		Button number1 = new Button("1");
		Button number0 = new Button("0");
		
		number7410VBox.getChildren()
				.addAll(number7, number4, number1, number0);
		
		VBox number852dotVBox = new VBox();
		
		Button number8 = new Button("8");
		Button number5 = new Button("5");
		Button number2 = new Button("2");
		Button numberdot = new Button(".");
		
		number852dotVBox.getChildren()
				.addAll(number8, number5, number2, numberdot);
		
		VBox number963equalVBox = new VBox();
		
		Button number9 = new Button("9");
		Button number6 = new Button("6");
		Button number3 = new Button("3");
		Button numberequal = new Button("=");
		
		number963equalVBox.getChildren()
				.addAll(number9, number6, number3, numberequal);
		
		VBox arithmeticVBox = new VBox();
		
		Button numberDivide = new Button("/");
		Button numberMultiply = new Button("*");
		Button numberSubtract = new Button("-");
		Button numberAdd = new Button("+");
		
		arithmeticVBox.getChildren()
				.addAll(numberDivide, numberMultiply, 
						numberSubtract, numberAdd);
		
		Button clear = new Button("C");
		clear.setMinHeight(400);
		clear.setMaxHeight(400);
		clear.setMinWidth(100);
		clear.setMaxWidth(100);
		clear.setFont(Font.font(30));
		
		buttonsHBox.getChildren()
				.addAll(number7410VBox, number852dotVBox,
						number963equalVBox, arithmeticVBox,
						clear);
		
		setButtonsLayout(number7, number4, number1, number0,
				number8, number5, number2, numberdot,
				number9, number6, number3, numberequal,
				numberDivide, numberMultiply, 
				numberSubtract, numberAdd);
		
		root.getChildren().add(buttonsHBox);
		
		Scene scene = new Scene(root, 500, 500);
		arg0.setScene(scene);
		arg0.setResizable(false);
		arg0.show();
	}
	
	public void setButtonsLayout(Button... buttons) {
		for(Button button : buttons) {
			button.setMinWidth(100);
			button.setMaxWidth(100);
			button.setMinHeight(100);
			button.setMaxHeight(100);
			button.setFont(Font.font(30));
		}
	}
	
}








