/* ***************************************************************
 * Autor............: Artur Felipe de Azevedo Gondim
 * Matricula........: 202210167
 * Inicio...........: 15/03/2025
 * Ultima alteracao.: 23/03/2025
 * Nome.............: TrackScreenController.java
 * Funcao...........: Controla e gerencia o JavaFX e as interacoes
 do usuario com os elementos presentes na tela, como a animacao dos
 trens, o botao de reset e home, alem dos sliders
 ****************************************************************/

package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Model.Train;
import Model.TrainAnimation;
import javafx.animation.AnimationTimer;
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
import use.DataSingleton;

/* ***************************************************************
* Classe HomeController implementa a interface Initializable, 
exclusiva da biblioteca do JavaFX.
*****************************************************************/

public class TrackScreenController implements Initializable{
    /*declarando variaveis */
    private Stage stage;
    private Scene scene;
    private Parent root;

    DataSingleton data = DataSingleton.getInstance();

    /*novo objeto da classe TrainAnimation */
    TrainAnimation animation = new TrainAnimation();

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

    /*declarando variaveis trem, conforme a classe Train requere */
    private Train blueTrain, redTrain;

    
    /* ******************************************************************
    * Metodo: reset
    * Funcao: Ao ser acionado, o metodo retorna os trens para a posicao inicial
    * Parametros: ActionEvent event
    * Retorno: void
    *********************************************************************/

    public void reset(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("../fxml/trackScreenController.fxml"));
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
        root = FXMLLoader.load(getClass().getResource("../fxml/homeController.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
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
                blueTrain = new Train(blueTrain1, 0); // superior esquerdo
                redTrain = new Train(redTrain2, 1); //inferior esquerdo

                break;
            }
            case 1: {
                blueTrain = new Train(blueTrain2, 2); // superior direito
                redTrain = new Train(redTrain1, 3); // inferior direito

                break;
            }
            case 2: {
                blueTrain = new Train(blueTrain1, 0); // superior esquerdo
                redTrain = new Train(redTrain1, 3); // inferior direito

                break;
            }
            case 3: {
                blueTrain = new Train(blueTrain2, 2); //superior direito
                redTrain = new Train(redTrain2, 1); // inferior esquerdo

                break;
            }
            default:
                break;
        }

        begin.start();/*depois de selecionado as posicoes, iniciar animacao */
    }

    AnimationTimer begin = new AnimationTimer() {
        
        /* ***************************************************************
        * Metodo: handle
        * Funcao: O método handle() eh chamado em cada frame de animação pelo sistema de tempo de animação JavaFX, de acordo com a opcao escolhida
        pela choiceBox
        * Parametros: long now ,
        * Retorno: void
        *******************************************************************/
         
        @Override
        public void handle(long now) {
            switch (data.getOptions()) {
                case 0: {
                    animationCase0.start();
                    break;
                }
                case 1: {
                    animationCase1.start();
                    break;
                }
                case 2: {
                    animationCase2.start();
                    break;
                }
                case 3: {
                    animationCase3.start();
                    break;
                }
                default:
                    break;
            }
        }

    AnimationTimer animationCase0 = new AnimationTimer() {

        @Override
        public void handle(long now) {
            blueTrain.setSpeedX(blueSlider.getValue());
            blueTrain.setSpeedY(blueSlider.getValue());
            redTrain.setSpeedX(redSlider.getValue());
            redTrain.setSpeedY(redSlider.getValue());
            animation.animationCase0(blueTrain, redTrain);
        }
    };

    AnimationTimer animationCase1 = new AnimationTimer() {

        @Override
        public void handle(long now) {
            blueTrain.setSpeedX(blueSlider.getValue());
            blueTrain.setSpeedY(blueSlider.getValue());
            redTrain.setSpeedX(redSlider.getValue());
            redTrain.setSpeedY(redSlider.getValue());
            animation.animationCase1(blueTrain, redTrain);
        }
    };

    AnimationTimer animationCase2 = new AnimationTimer() {

        @Override
        public void handle(long now) {
            blueTrain.setSpeedX(blueSlider.getValue());
            blueTrain.setSpeedY(blueSlider.getValue());
            redTrain.setSpeedX(redSlider.getValue());
            redTrain.setSpeedY(redSlider.getValue());
            animation.animationCase2(blueTrain, redTrain);
        }
    };

    AnimationTimer animationCase3 = new AnimationTimer() {

        @Override
        public void handle(long now) {
            blueTrain.setSpeedX(blueSlider.getValue());
            blueTrain.setSpeedY(blueSlider.getValue());
            redTrain.setSpeedX(redSlider.getValue());
            redTrain.setSpeedY(redSlider.getValue());
            animation.animationCase3(blueTrain, redTrain);
        }
    };
};
}