/* ***************************************************************
 * Autor............: Artur Felipe de Azevedo Gondim
 * Matricula........: 202210167
 * Inicio...........: 28/04/2025
 * Ultima alteracao.: 05/05/2025
 * Nome.............: Principal.java
 * Funcao...........: Classe que implementa uma thread para controlar 
 * o movimento do trem azul
 ****************************************************************/

package model;

import controller.TrackScreenController;
import javafx.application.Platform;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

import static controller.HomeController.escolha;

public class BlueTrain extends Thread{
    private double speedX;
    private double speedY;
    private int position;
    private Slider slider;
    private ImageView trainImage;
    private int solution;
    private int process = 0;
    private boolean executar = true;

    private boolean cz1 = false;
    private boolean cz2 = false;

    public BlueTrain(ImageView trainImage, int position, Slider slider, int solution) {
        this.trainImage = trainImage;
        this.position = position;
        this.slider = slider;
        this.solution = solution;

        switch (position) {

            case 0:{ // superior esquerdo blue
                trainImage.setLayoutX(-32);
                trainImage.setLayoutY(166);
                trainImage.setRotate(0);

                break;
            }
            case 2:{ // superior direito blue
                trainImage.setLayoutX(1140);
                trainImage.setLayoutY(173);
                trainImage.setRotate(0);

                break;
            }

            default:
                break;
        }
        }


    /****************************************************************
     * Metodo: run
     * Funcao: define o que a thread vai controlar  o movimento do trem azul
     * Parametros:void
     * Retorno: void
     ****************************************************************/
    @Override
    public void run() {
        while (executar) {
            setSpeedX(slider.getValue());
            setSpeedY(slider.getValue());

            Platform.runLater(() -> {
                move();
            });

            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//fim do while
    }


    public void parar(){
        this.executar = false;
    }

    public double getSpeedX() {
        return speedX;
    }

    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }

    public double getSpeedY() {
        return speedY;
    }

    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ImageView getTrainImage() {
        return trainImage;
    }

    public void setTrainImage(ImageView trainImage) {
        this.trainImage = trainImage;
    }
    
    /****************************************************************
     * Metodo: move
     * Funcao: responsavel por construir a animação
     * Parametros:void
     * Retorno: void
     ****************************************************************/
    public void move(){
        switch (position) {
            case 0: {
                /*Trem azul a partir do trilho superior esquerdo */
        if (this.getTrainImage().getLayoutX() <= 95 && this.getTrainImage().getLayoutX() > -33) {
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX());
        } // fim do primeiro if

        else if (this.getTrainImage().getLayoutX() <= 160 && this.getTrainImage().getLayoutX() >= 95) {
            if( !entracz1(solution) && !cz1) {
                break;
              }
            this.getTrainImage().setRotate(45);
            this.getTrainImage().setLayoutY(this.getTrainImage().getLayoutY() + this.getSpeedY());
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX()/2);      
        } // fim do segundo if

        else if (this.getTrainImage().getLayoutX() <= 390 && this.getTrainImage().getLayoutX() >= 160) {
            this.getTrainImage().setRotate(0);
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX());    
        } //fim do terceiro if

        else if (this.getTrainImage().getLayoutX() <= 465 && this.getTrainImage().getLayoutX() >= 390) {
            this.getTrainImage().setRotate(315);
            this.getTrainImage().setLayoutY(this.getTrainImage().getLayoutY() - this.getSpeedY());
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX()/2);      
        } // fim do quarto if 

        else if (this.getTrainImage().getLayoutX() <= 660 && this.getTrainImage().getLayoutX() >= 465) {
            saicz1(solution);
            this.getTrainImage().setRotate(0);
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX());    
        } // fim do quinto if

        else if (this.getTrainImage().getLayoutX() <= 730 && this.getTrainImage().getLayoutX() >= 660) {
            if( !entracz2(solution) && !cz2) {
                break;
              }
            this.getTrainImage().setRotate(405);
            this.getTrainImage().setLayoutY(this.getTrainImage().getLayoutY() + this.getSpeedY());
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX()/2);      
        } // fim do sexto if

        else if (this.getTrainImage().getLayoutX() <= 925 && this.getTrainImage().getLayoutX() >= 730) {
            this.getTrainImage().setRotate(0);
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX());    
        } // fim do setimo if

        else if (this.getTrainImage().getLayoutX() <= 988 && this.getTrainImage().getLayoutX() >= 918) {
            this.getTrainImage().setRotate(315);
            this.getTrainImage().setLayoutY(this.getTrainImage().getLayoutY() - this.getSpeedY());
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX()/2);      
        } //fim do oitavo if

        else if (this.getTrainImage().getLayoutX() <= 1250 && this.getTrainImage().getLayoutX() >= 988) {
            saicz2(solution);
            this.getTrainImage().setRotate(0);
            this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() + this.getSpeedX());    
        } // fim do nono if

        else {
            this.getTrainImage().setLayoutX(-32);
            this.getTrainImage().setLayoutY(166);
            this.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial
        break;

              
            }
        
            case 2:{
            /*Trem azul a partir do trilho superior direito */
              if (this.getTrainImage().getLayoutX() <= 1140 && this.getTrainImage().getLayoutX() > 976) {
                this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX());
              } // fim do primeiro if

              else if (this.getTrainImage().getLayoutX() <= 976 && this.getTrainImage().getLayoutX() >= 910) {
              if( !entracz2(solution) && !cz2) {
                break;
              }
              this.getTrainImage().setRotate(315);
              this.getTrainImage().setLayoutY(this.getTrainImage().getLayoutY() + this.getSpeedY());
              this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX()/2);      
              } // fim do segundo if

              else if (this.getTrainImage().getLayoutX() <= 910 && this.getTrainImage().getLayoutX() >= 715) {
              this.getTrainImage().setRotate(0);
              this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX());    
              } //fim do terceiro if

              else if (this.getTrainImage().getLayoutX() <= 715 && this.getTrainImage().getLayoutX() >= 645) {
              this.getTrainImage().setRotate(405);
              this.getTrainImage().setLayoutY(this.getTrainImage().getLayoutY() - this.getSpeedY());
              this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX()/2);      
              } // fim do quarto if 

              else if (this.getTrainImage().getLayoutX() <= 645 && this.getTrainImage().getLayoutX() >= 460) {
              saicz2(solution);
              this.getTrainImage().setRotate(0);
              this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX());    
              } // fim do quinto if

              else if (this.getTrainImage().getLayoutX() <= 460 && this.getTrainImage().getLayoutX() >= 395) {
              if( !entracz1(solution) && !cz1) {
                break;
              }
              this.getTrainImage().setRotate(315);
              this.getTrainImage().setLayoutY(this.getTrainImage().getLayoutY() + this.getSpeedY());
              this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX()/2);      
              } // fim do sexto if

              else if (this.getTrainImage().getLayoutX() <= 395 && this.getTrainImage().getLayoutX() >= 175) {
              this.getTrainImage().setRotate(0);
              this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX());    
              } // fim do setimo if

              else if (this.getTrainImage().getLayoutX() <= 175 && this.getTrainImage().getLayoutX() >= 107) {
              this.getTrainImage().setRotate(405);
              this.getTrainImage().setLayoutY(this.getTrainImage().getLayoutY() - this.getSpeedY());
              this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX()/2);      
              } //fim do oitavo if

              else if (this.getTrainImage().getLayoutX() <= 107 && this.getTrainImage().getLayoutX() >= -182) {
              saicz1(solution);
              this.getTrainImage().setRotate(0);
              this.getTrainImage().setLayoutX(this.getTrainImage().getLayoutX() - this.getSpeedX());    
              } // fim do nono if

              else {
              this.getTrainImage().setLayoutX(1140);
              this.getTrainImage().setLayoutY(173);
              this.getTrainImage().setRotate(0);
              } // voltando para a posicao inicial
              break;
            }
 
            default:
                break;
        }
    }
    /*
     * ***************************************************************
     * Metodo: entracz1
     * Funcao: verificar se e qual trem entrou na zona primeiro e fazer a parada com base na escolha do usuario
     * Parametros: metodo de travamanento que sera utilizado
     * Retorno: boolean
     * ***************************************************************
     */
    public boolean entracz1(int solution){

        switch (solution) {

            case 0:{
                if(TrackScreenController.travaZona1 == 1){
                    return false;
                }else{
                    TrackScreenController.travaZona1 = 1;
                    cz1 = true;
                    return true;
                }
            }
            case 1:{
                if(TrackScreenController.turno1 == 0){
                    return false;
                }else{
                    cz1 = true;
                    return true;
                }
            }
            case 2:{
                int other; // numero do outro processo
                other = 1 - process; // o oposto do processo
                TrackScreenController.interesse1[process] = true; // mostra que o processo esta interessado
                TrackScreenController.vez1 = process; // alterar o valor do turno
                if(TrackScreenController.vez1 == process && TrackScreenController.interesse1[other] == true){
                    return false;
                }else{
                    cz1 = true;
                    return true;
                }
            }
            default:
                return true;
        }


    }
    /*
     * ***************************************************************
     * Metodo: saicz1
     * Funcao: verificar se o trem ja saiu da zona critica assim permitindo a passagem de outros trens
     * Parametros: metodo de travamanento que sera utilizado
     * Retorno: void
     * ***************************************************************
     */
    public  void saicz1(int solution){
        switch (solution) {
            case 0:{ // variavel de travamento
                TrackScreenController.travaZona1 = 0;
                cz1 = false;
                break;
            }
            case 1:{
                TrackScreenController.turno1 = 1;
                cz1 = false;
                break;
            }
            case 2:{
                TrackScreenController.interesse1[process] = false; // mostra que o processo nao tem interesse na zona critia
                cz1 = false; // mostra que o trem nao tem interesse
            }


            default:
                break;


        }
    }
    /*
     * ***************************************************************
     * Metodo: entracz2
     * Funcao: verificar se e qual trem entrou na zona primeiro e fazer a parada com base na escolha do usuario
     * Parametros: metodo de travamento que sera utilizado
     * Retorno: boolean
     * ***************************************************************
     */
   
    public boolean entracz2(int solution){
        switch (solution) {
            case 0:{ // variavel de travamento
                if(TrackScreenController.travaZona2 == 1){
                    return false;
                } else{
                    TrackScreenController.travaZona2 = 1;
                    cz2 = true;
                    return true;
                }
            }
            case 1:{ //estrita alternancia
                if(TrackScreenController.turno2 == 1){
                    return false;
                } else{
                    cz2 = true;
                    return true;
                }
            }
            case 2:{//solucao Peterson
                int other; 
                other = 1 - process; 
                TrackScreenController.interesse2[process] = true; 
                TrackScreenController.vez2 = process; 
                if(TrackScreenController.vez2 == process && TrackScreenController.interesse2[other] == true){
                    return false;
                }else{
                    cz2 = true;
                    return true;
                }
            }

            default:
                return true;
        }
    }

    /*
     * ***************************************************************
     * Metodo: saicz2
     * Funcao: verificar se o trem ja saiu da zona critica assim permitindo a passagem de outros trens
     * Parametros: metodo de travamento que sera utilizado
     * Retorno: void
     * ***************************************************************
     */
    public  void saicz2(int solution){
        switch (solution) {
            case 0:{
                TrackScreenController.travaZona2 = 0;
                cz2 = false;
                break;
            }
            case 1:{
                TrackScreenController.turno2 =1;
                cz2 = false;
                break;
            }
            case 2:{
                TrackScreenController.interesse2[process] = false;
                cz2 = false;
            }



            default:
                break;
        }

    }


   

}
