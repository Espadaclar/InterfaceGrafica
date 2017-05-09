

import javafx.stage.Stage;             // |
import javafx.scene.Group;             // |\ Librerías necesarias
import javafx.scene.Scene;             // |/ Para el ejemplo
import javafx.application.Application; // |
import javafx.scene.control.Button;    // |

public class JavaFX extends Application {

	public static void main(String[] args) {
		//Esto se utiliza para ejecutar la aplicación 
		//es como el new Contructor();
		launch(args);
	}

	//Este metodo es obligatorio
	public void start( Stage primaryStage ){
		Group root = new Group();
		//El grupo que se desea agregar, y el tamaño ancho y alto
		Scene scene = new Scene( root, 300, 300 );
		//Titulo de la ventana
		primaryStage.setTitle("JavaFx");
		//Se agrega la scena
		primaryStage.setScene( scene );
		
		//Creacion del boton
		Button boton = new Button("Saludos");
		boton.setDefaultButton(true);
		//Tamaño del boton
		boton.setPrefSize(100, 50);
		//Tamaño del boton
		//Posicion dle boton
		boton.setLayoutX(65);
		boton.setLayoutY(60);
		
		
		
		
		
		//Se agrega el boton
		root.getChildren().add(boton);
		
		//Para mostrar la visible, semejante al setVisible(true)
		primaryStage.show();		
	}

}