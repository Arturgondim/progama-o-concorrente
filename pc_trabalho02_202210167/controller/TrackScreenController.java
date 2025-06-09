/* ***************************************************************
 * Autor............: Artur Felipe de Azevedo Gondim
 * Matricula........: 202210167
 * Inicio...........: 28/04/2025
 * Ultima alteracao.: 05/05/2025
 * Nome.............: TrackScreenController.java
 * Funcao...........: Controla e gerencia o JavaFX e as interacoes
 do usuario com os elementos presentes na tela, como a animacao dos
 trens, o botao de reset e home, alem dos sliders
 ****************************************************************/

package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import model.BlueTrain;
import model.RedTrain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import util.DataSingleton;

/* ***************************************************************
* Classe HomeController implementa a interface Initializable, 
exclusiva da biblioteca do JavaFX.
*****************************************************************/

public class TrackScreenController implements Initializable{
    /*declarando variaveis */
    private Stage stage;
    private Scene scene;
    private Parent root;

    private BlueTrain bTrain;
    private RedTrain rTrain;

    DataSingleton data = DataSingleton.getInstance();



    /*declarando trem azul*/
    @FXML
    private ImageView blueTrain1;/*trem azul esquerda para direita */
    @FXML
    private ImageView blueTrain2;/*trem azul direita para esquerda */

    /*declarando trem vermelho*/
    @FXML
    private ImageView redTrain1;/*trem vermelho direita para esquerda */
    @FXML
    private ImageView redTrain2;/*trem vermelho esquerda para direita */

    /*declarando sliders */
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider redSlider;

    // variaveis de travamento
    public static int travaZona1 = 0;
    public static int travaZona2 = 0;

    // estrita alternancia
    public static int turno1 = 0;
    public static int turno2 = 0;

    // solucao de peterson
    public static int vez1;
    public static boolean interesse1[] = {false, false};
    public static int vez2;
    public static boolean interesse2[] = {false, false};


    
    /* ******************************************************************
    * Metodo: reset
    * Funcao: Ao ser acionado, o metodo retorna os trens para a posicao inicial
    * Parametros: ActionEvent event
    * Retorno: void
    *********************************************************************/

    public void reset(ActionEvent event) throws IOException{
        bTrain.parar();
        rTrain.parar();
        travaZona1=0;
        travaZona2=0;
        turno1 = 0;
        turno2 = 0;
        vez1=0;
        interesse1 [0] = false;
        interesse1 [1] = false;
        vez2 = 0;
        interesse2 [0] = false;
        interesse2 [1] = false;
        root = FXMLLoader.load(getClass().getResource("../view/trackScreenController.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /* ******************************************************************
    * Metodo: home
    * Funcao: Ao ser acionado, o metodo retorna para a tela inicial, 
    podendo ser escolhido novas direcoes
    * Parametros: ActionEvent event
    * Retorno: void
    *********************************************************************/

    public void home(ActionEvent event) throws IOException{
        bTrain.parar();
        rTrain.parar();
        travaZona1=0;
        travaZona2=0;
        turno1 = 0;
        turno2 = 0;
        vez1=0;
        interesse1 [0] = false;
        interesse1 [1] = false;
        vez2 = 0;
        interesse2 [0] = false;
        interesse2 [1] = false;
        root = FXMLLoader.load(getClass().getResource("../view/homeController.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
        stage.setOnCloseRequest(e -> System.exit(0));
    }

    /* ****************************************************************
    * Metodo: initialize
    * Funcao: atraves da escolha de choiceBox, definir as posicoes iniciais
    dos trens
    * Parametros: URL(representa o local do arquivo FXML) , ResourceBundlue
    * Retorno: void
    *****************************************************************/

    @Override 
    public void initialize (URL location, ResourceBundle resources){
        switch (data.getOptions()) {
            case 0:{
                bTrain = new BlueTrain(blueTrain1, 0, blueSlider, HomeController.escolha); // superior esquerdo
                rTrain = new RedTrain(redTrain2, 1, redSlider, HomeController.escolha); //inferior esquerdo

                break;
            }
            case 1: {
                bTrain = new BlueTrain(blueTrain2, 2, blueSlider, HomeController.escolha); // superior esquerdo
                rTrain = new RedTrain(redTrain1, 3, redSlider, HomeController.escolha); //inferior esquerdo
                break;
            }
            case 2: {
                bTrain = new BlueTrain(blueTrain1, 0, blueSlider, HomeController.escolha); // superior esquerdo
                rTrain = new RedTrain(redTrain1, 3, redSlider, HomeController.escolha); //inferior esquerdo
          
                break;
            }
            case 3: {
                bTrain = new BlueTrain(blueTrain2, 2, blueSlider, HomeController.escolha); // superior esquerdo
                rTrain = new RedTrain(redTrain2, 1, redSlider, HomeController.escolha); //inferior esquerdo
             
                break;
            }
            default:
                break;
        }
        bTrain.start();
        rTrain.start();
      
    }

    
}