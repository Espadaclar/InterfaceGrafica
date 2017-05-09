

import javafx.stage.Stage;             // |
import javafx.scene.Group;             // |\ Librerías necesarias
import javafx.scene.Scene;             // |/ Para el ejemplo
import javafx.application.Application; // |
import javafx.scene.control.Button;    // |

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
        //Se a  grega la scena
        primaryStage.setScene( scene);

        //Creacion del boton
        Button boton = new Button("Saludar");
        boton.setDefaultButton(true);
        //Tamaño del boton
        boton.setPrefSize(100, 50);
        //Tamaño del boton
        //Posicion dle boton
        boton.setLayoutX(45);
        boton.setLayoutY(45);
    
        //para poner una imagen en el fondo de la pantalla.    **************************DEL EJERCICIO***********************************************
         Image image = new Image ("0.jpg");
        ImageView ima2 = new ImageView();
        ima2.setImage(image);
        root.getChildren().add(ima2);
        
        //Se agrega el boton
        root.getChildren().add(boton);
        
        //para mostrar en pantalla un texto al pulsar el botón.  *************************DEL EJERCICIO********************************************
        boton.setOnAction(event -> {System.out.println("Hola.");});
        
        
        boton.setOnAction(event -> {  Image image2 = new Image ("1.jpg");
        ImageView ima22 = new ImageView();
        ima2.setImage(image2);
        root.getChildren().add(ima22);   });
               
        //Para mostrar la visible, semejante al setVisible(true)
        primaryStage.show();        
    }

}