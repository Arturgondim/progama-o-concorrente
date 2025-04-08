/* ***************************************************************
 * Autor............: Artur Felipe de Azevedo Gondim
 * Matricula........: 202210167
 * Inicio...........: 15/03/2025
 * Ultima alteracao.: 23/03/2025
 * Nome.............: Principal.java
 * Funcao...........: Faz a iniciação das cenas e do programa alem
 de carregar o FXML.
 ****************************************************************/

import javafx.application.Application;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import Controller.HomeController;
import Controller.TrackScreenController;
import javafx.application.Application;

/* ***************************************************************
* Classe principal estende Aplication, classe necessária para a 
construção da GUI
*************************************************************** */

public class Principal extends Application{

    /*****************************************************************
    * Metodo: start
    * Funcao: reponsavel por inicializar o sistema do JavaFX, encaminhando o usuario em direcao a primeira tela (homeController.fxml)
    * Parametros: Stage
    * Retorno: void
    ******************************************************************/

    @Override
    public void start(Stage stage) throws IOException{
        stage.getIcons().add(new Image("./assets./train-icon.png"));/*adiciona um icone a cena*/
        stage.setTitle("Train Simulator");/*define um titulo a cena*/

        Parent root = FXMLLoader.load(getClass().getResource("fxml/homeController.fxml"));/*define o caminho que ira aparecer ao criar a cena */
        Scene scene = new Scene(root);/*cria um novo objeto cena */
        stage.setScene(scene); /*configura a tela a ser exibida */
        stage.show(); /*exibe a tela */



    }
    
  /*****************************************************************
   * Metodo: main
   * Funcao: ponto de entrada do programa
   * Parametros: args - recebe dados linha de comando
   * Retorno: void
   *****************************************************************/

    public static void main(String[] args) {
        launch(args);
    }

}
