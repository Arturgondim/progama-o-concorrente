/* ***************************************************************
 * Autor............: Artur Felipe de Azevedo Gondim
 * Matricula........: 202210167
 * Inicio...........: 15/03/2025
 * Ultima alteracao.: 23/03/2025
 * Nome.............: Train.java
 * Funcao...........: estabelecer posicao inicial dos trens, configurar
 imagem dos trem(ImageView) e gerar velocidade nos eixos x e y
 ****************************************************************/

package Model;

import javafx.scene.image.ImageView;

public class Train {
    /*declarando variaveis da classe*/
    private double speedX;
    private double speedY;
    private int position;

    ImageView trainImage;

    public Train(ImageView trainImage, int position){
        this.trainImage = trainImage;
        this.position = position;

        switch(position){
            case 0:{ // superior esquerdo blue
                trainImage.setLayoutX(-32);
                trainImage.setLayoutY(166);
                trainImage.setRotate(0);

                break;
            }
            case 1:{ // inferior esquerdo red
                trainImage.setLayoutX(-45);
                trainImage.setLayoutY(375);
                trainImage.setRotate(0);

                break;
            }
            case 2:{ // superior direito blue
                trainImage.setLayoutX(1140);
                trainImage.setLayoutY(173);
                trainImage.setRotate(0);

                break;
            }
            case 3:{ // inferior direito red
                trainImage.setLayoutX(1140);
                trainImage.setLayoutY(383);
                trainImage.setRotate(0);

                break;
            }
            default: 
               break;

            }
        }

        
        /* ***************************************************************
        * Metodo: getSpeedX
        * Funcao: retornar a velocidade no eixo x
        * Parametros: nao recebe
        * Retorno: double
        ****************************************************************/

        public double getSpeedX(){
            return speedX;
        }

        /* ***************************************************************
        * Metodo: setSpeedX
        * Funcao: modificar a velocidade no eixo x
        * Parametros: douvle speedX
        * Retorno: void
        ****************************************************************/

        public void setSpeedX(double speedX){
            this.speedX = speedX;
        }

        /* ***************************************************************
        * Metodo: getSpeedY
        * Funcao: retornar a velocidade no eixo y
        * Parametros: nao recebe
        * Retorno: double
        ****************************************************************/

        public double getSpeedY(){
            return speedY;
        }

         /* ***************************************************************
        * Metodo: setSpeedY
        * Funcao: modificar a velocidade no eixo y
        * Parametros: double speedY
        * Retorno: void
        ****************************************************************/

        public void setSpeedY(double speedY){
            this.speedY = speedY;
        }

        /* ***************************************************************
        * Metodo: getTrainImage
        * Funcao: retorna a imagem que esta associado ao objeto do trem
        * Parametros: nenhum
        * Retorno: ImageView
        ****************************************************************/

        public ImageView getTrainImage(){
            return trainImage;
        }

        /* ***************************************************************
        * Metodo: setTrainImage
        * Funcao: configurar imagem do objeto trem
        * Parametros: ImageView trainImage
        * Retorno: void
        ****************************************************************/

        public void setTrainImage(ImageView trainImage){
            this.trainImage = trainImage;
        }

         /* ***************************************************************
        * Metodo: getPosition
        * Funcao: retornar a posicao inicial do trem
        * Parametros: nenhum 
        * Retorno: int
        ****************************************************************/

        public int getPosition(){
            return position;
        }
    }

