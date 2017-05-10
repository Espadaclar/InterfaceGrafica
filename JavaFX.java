
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
        Image imagen0 = new Image ("0.jpg");
        ImageView verImagen0 = new ImageView();
        verImagen0.setImage(imagen0);
        root.getChildren().add(verImagen0);

        //Una nueva imagen para cambiarla por la imagen de fondo, al accionar el botón.
        Image imagen1 = new Image ("1.jpg");
        ImageView verImagen1 = new ImageView();
        root.getChildren().add(verImagen1);

        //Se agrega el boton
        root.getChildren().add(boton);

        //para cambiar la imagen de fondo por otra imgen, y para que aparezca una saludo por pantalla al mismo tiempo.
        // 1º colocadas las dos acciones dentro del mismo evento,
        //                                        **************************DEL EJERCICIO***********************************************
        boton.setOnAction(event -> { 
                verImagen1.setImage(imagen1);                
                System.out.println("Hola.");}
        );

        //Para mostrar la visible, semejante al setVisible(true)
        primaryStage.show();        
    }

}