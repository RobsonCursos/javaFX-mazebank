package com.jmc.mazebank.controllers.client;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ClientMenuController implements Initializable {

	@FXML
    private Button account_btn;

    @FXML
    private Button dashboard_btn;

    @FXML
    private Button logout_btn;

    @FXML
    private Button profile_btn;

    @FXML
    private Button report_btn;

    @FXML
    private Button transaction_btn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
