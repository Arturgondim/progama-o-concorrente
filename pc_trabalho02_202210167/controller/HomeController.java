/* ***************************************************************
 * Autor............: Artur Felipe de Azevedo Gondim
 * Matricula........: 202210167
 * Inicio...........: 28/04/2025
 * Ultima alteracao.: 05/05/2025
 * Nome.............: HomeController.java
 * Funcao...........: Controla e gerencia o JavaFX e as interacoes
 do usuario com os elementos presentes na tela, como a definicao da
 posicao inicial dos trens atraves de uma choiceBox e o botao start
 que permite a alteracao para a proxima tela
 ****************************************************************/

package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import util.DataSingleton;

/* ***************************************************************
* Classe HomeController implementa a interface Initializable, 
exclusiva da biblioteca do JavaFX.
*****************************************************************/

public class HomeController implements Initializable{
    /*declarando variaveis da classe */
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ChoiceBox<String> choosePositionChoiceBox;
    @FXML
    private ChoiceBox<String> choiceBox = new ChoiceBox<>();// choiceBox da escolha de solucao
    public static int escolha;
    DataSingleton data = DataSingleton.getInstance();

    private String[] choices = {"Superior esquerdo e inferior esquerdo", "Superior direito e inferior direito", "Superior esquerdo e Inferior direito", "Superior direito e inferior esquerdo "};/*string da choiceBox, com as opcoes de direcao dos trens */

    private String[] choices2 = {"Variavel de Travamento", "Estrita Alternancia", "Solução de Peterson"};

  
   
    public void setEscolha(){
        if (choiceBox.getValue().equals("Variavel de Travamento")) {
            escolha = 0;
        } else if (choiceBox.getValue().equals("Estrita Alternancia")) {
            escolha = 1;
        } else if (choiceBox.getValue().equals("Solução de Peterson"))  {
            escolha = 2;
        }
    }

  public int getEscolha(){
     return escolha;
     }
    
    /* ****************************************************************
    * Metodo: startButton
    * Funcao: controlar a acao do botao iniciar, ao clicar troca para a
    tela dos trens
    * Parametros: ActionEvent event
    * Retorno: void
    *****************************************************************/

    @FXML
    public void startButton(ActionEvent event)throws IOException{
        data.setOptions(choosePositionChoiceBox.getSelectionModel().getSelectedIndex()); /*pega a escolha da choiceBox */
        root = FXMLLoader.load(getClass().getResource("/view/trackScreenController.fxml")); /*carrega tela dos trens */
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);/*gera nova cena */
        stage.setScene(scene); /*configura a cena */
        stage.show();/*mostra a cena */
    }

    /* ****************************************************************
     * Metodo: initialize
     * Funcao: implementar alteracoes na interface apos a sua contrucao
     * Parametros: URL(representa o local do arquivo FXML) , ResourceBundlue
     * Retorno: void
     *****************************************************************/

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choosePositionChoiceBox.getItems().addAll(choices);
        choosePositionChoiceBox.setValue(choosePositionChoiceBox.getItems().get(data.getOptions()));/*instancia a escolha para o DataSingleton */
        choiceBox.getItems().addAll(choices2);
        choiceBox.getSelectionModel().selectFirst();
    }
}
