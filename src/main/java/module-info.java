module com.jmc.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.web;
    requires transitive javafx.graphics;
    
    requires de.jensd.fx.glyphs.fontawesome;
    
    requires java.persistence;
	requires java.sql;
	
    requires org.hibernate.orm.core;
	requires lombok;
	
	opens com.jmc.mazebank to javafx.fxml;
	
    exports com.jmc.mazebank;
    exports com.jmc.mazebank.controllers;
    exports com.jmc.mazebank.controllers.admin;
    exports com.jmc.mazebank.controllers.client;
    exports com.jmc.mazebank.models;
    exports com.jmc.mazebank.views;
}
