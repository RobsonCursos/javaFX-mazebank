package com.jmc.mazebank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static Scene mainScene;

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/screens/login.fxml"));
		fxmlLoader.setController("com.jmc.mazebank.controllers.LoginController");
		AnchorPane anchorPane = fxmlLoader.load();
		mainScene = new Scene(anchorPane);
		//CSS to intire application (1)
		//mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//CSS to intire application (2)
		//String css = this.getClass().getResource("application.css").toExternalForm();
		//mainScene.getStylesheets().add(css);
		stage.setScene(mainScene);
		stage.show();
	}

    public static Scene getMainScene() {
    	return mainScene;
    }

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Mazebank-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.close();
        entityManagerFactory.close();
    	launch();
    }

}
