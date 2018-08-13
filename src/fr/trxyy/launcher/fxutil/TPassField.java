package fr.trxyy.launcher.fxutil;

import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;

public class TPassField extends PasswordField {

	public TPassField(Pane root) {
		setSize(100, 30);
		setPosition(0, 0);
		root.getChildren().add(this);
	}

	public TPassField(int w, int h, int pX, int pY, Pane root) {
		setSize(w, h);
		setPosition(pX, pY);
		root.getChildren().add(this);
	}

	public TPassField(String s, int w, int h, int pX, int pY, Pane root) {
		setText(s);
		setSize(w, h);
		setPosition(pX, pY);
		root.getChildren().add(this);
	}

	public void setSize(int width_, int height_) {
		setPrefSize(width_, height_);
	}

	public void setPosition(int posX, int posY) {
		setLayoutX(posX);
		setLayoutY(posY);
	}
	
	public void setVoidText(String s) {
        setPromptText(s);
	}

}
