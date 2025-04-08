/* ***************************************************************
 * Autor............: Artur Felipe de Azevedo Gondim
 * Matricula........: 202210167
 * Inicio...........: 15/03/2025
 * Ultima alteracao.: 23/03/2025
 * Nome.............: TrainAnimation.java
 * Funcao...........: configurar a animacao dos trens em cada cenario
 especifico
 ****************************************************************/
package Model;

public class TrainAnimation {

    public void animationCase0(Train blueTrain, Train redTrain) {
        /*Trem azul a partir do trilho superior esquerdo */
        if (blueTrain.getTrainImage().getLayoutX() <= 95 && blueTrain.getTrainImage().getLayoutX() > -33) {
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());
        } // fim do primeiro if

        else if (blueTrain.getTrainImage().getLayoutX() <= 160 && blueTrain.getTrainImage().getLayoutX() >= 95) {
            blueTrain.getTrainImage().setRotate(45);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() + blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX()/2);      
        } // fim do segundo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 390 && blueTrain.getTrainImage().getLayoutX() >= 160) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());    
        } //fim do terceiro if

        else if (blueTrain.getTrainImage().getLayoutX() <= 465 && blueTrain.getTrainImage().getLayoutX() >= 390) {
            blueTrain.getTrainImage().setRotate(315);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() - blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX()/2);      
        } // fim do quarto if 

        else if (blueTrain.getTrainImage().getLayoutX() <= 660 && blueTrain.getTrainImage().getLayoutX() >= 465) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());    
        } // fim do quinto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 730 && blueTrain.getTrainImage().getLayoutX() >= 660) {
            blueTrain.getTrainImage().setRotate(405);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() + blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX()/2);      
        } // fim do sexto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 925 && blueTrain.getTrainImage().getLayoutX() >= 730) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());    
        } // fim do setimo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 988 && blueTrain.getTrainImage().getLayoutX() >= 918) {
            blueTrain.getTrainImage().setRotate(315);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() - blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX()/2);      
        } //fim do oitavo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 1250 && blueTrain.getTrainImage().getLayoutX() >= 988) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());    
        } // fim do nono if

        else {
            blueTrain.getTrainImage().setLayoutX(-32);
            blueTrain.getTrainImage().setLayoutY(166);
            blueTrain.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial

        /*trem vermelho a partir do trilho inferior esquerdo */
        if (redTrain.getTrainImage().getLayoutX() <= 106 && redTrain.getTrainImage().getLayoutX() > -33) {
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do primeiro if

        else if (redTrain.getTrainImage().getLayoutX() <= 176 && redTrain.getTrainImage().getLayoutX() >= 106) {
            redTrain.getTrainImage().setRotate(305);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() - redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX()/2); 
        } // fim do segundo if

        else if (redTrain.getTrainImage().getLayoutX() <= 367 && redTrain.getTrainImage().getLayoutX() >= 176) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do terceiro if

        else if (redTrain.getTrainImage().getLayoutX() <= 437 && redTrain.getTrainImage().getLayoutX() >= 367) {
            redTrain.getTrainImage().setRotate(45);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() + redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX()/2); 
        } // fim do quarto if

        else if (redTrain.getTrainImage().getLayoutX() <= 654 && redTrain.getTrainImage().getLayoutX() >= 437) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do quinto if

        else if (redTrain.getTrainImage().getLayoutX() <= 724 && redTrain.getTrainImage().getLayoutX() >= 654) {
            redTrain.getTrainImage().setRotate(305);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() - redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX()/2); 
        } // fim do sexto if

        else if (redTrain.getTrainImage().getLayoutX() <= 916 && redTrain.getTrainImage().getLayoutX() >= 724) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do setimo if

        else if (redTrain.getTrainImage().getLayoutX() <= 986 && redTrain.getTrainImage().getLayoutX() >= 916) {
            redTrain.getTrainImage().setRotate(45);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() + redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX()/2); 
        } // fim do oitavo if

        else if (redTrain.getTrainImage().getLayoutX() <= 1250 && redTrain.getTrainImage().getLayoutX() >= 986) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do nono if

        else{
            redTrain.getTrainImage().setLayoutX(-32);
            redTrain.getTrainImage().setLayoutY(375);
            redTrain.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial
    }


    public void animationCase1(Train blueTrain, Train redTrain) {
        /*Trem azul a partir do trilho superior direito */
        if (blueTrain.getTrainImage().getLayoutX() <= 1140 && blueTrain.getTrainImage().getLayoutX() > 976) {
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());
        } // fim do primeiro if

        else if (blueTrain.getTrainImage().getLayoutX() <= 976 && blueTrain.getTrainImage().getLayoutX() >= 910) {
            blueTrain.getTrainImage().setRotate(315);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() + blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX()/2);      
        } // fim do segundo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 910 && blueTrain.getTrainImage().getLayoutX() >= 715 ) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());    
        } // fim do terceiro if

        else if (blueTrain.getTrainImage().getLayoutX() <= 715 && blueTrain.getTrainImage().getLayoutX() >= 645) {
            blueTrain.getTrainImage().setRotate(405);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() - blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX()/2);      
        } // fim do quarto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 645 && blueTrain.getTrainImage().getLayoutX() >= 460) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());    
        } // fim do quinto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 460 && blueTrain.getTrainImage().getLayoutX() >= 395) {
            blueTrain.getTrainImage().setRotate(315);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() + blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX()/2);      
        } // fim do sexto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 400 && blueTrain.getTrainImage().getLayoutX() >= 175) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());    
        } // fim do setimo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 175 && blueTrain.getTrainImage().getLayoutX() >= 107) {
            blueTrain.getTrainImage().setRotate(405);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() - blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX()/2);      
        } // fim do oitavo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 107 && blueTrain.getTrainImage().getLayoutX() >= -182) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());    
        } // fim do nono if

        else {
            blueTrain.getTrainImage().setLayoutX(1140);
            blueTrain.getTrainImage().setLayoutY(173);
            blueTrain.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial

        /*Trem vermelho a partir do trilho inferior direito */
        if (redTrain.getTrainImage().getLayoutX() <= 1140 && redTrain.getTrainImage().getLayoutX() > 976) {
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do primeiro if

        else if (redTrain.getTrainImage().getLayoutX() <= 976 && redTrain.getTrainImage().getLayoutX() >= 910) {
            redTrain.getTrainImage().setRotate(45);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() - redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX()/2); 
        } // fim do segundo if

        else if (redTrain.getTrainImage().getLayoutX() <= 910 && redTrain.getTrainImage().getLayoutX() >= 715) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do terceiro if

        else if (redTrain.getTrainImage().getLayoutX() <= 715 && redTrain.getTrainImage().getLayoutX() >= 650) {
            redTrain.getTrainImage().setRotate(305);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() + redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX()/2); 
        } // fim do quarto if

        else if (redTrain.getTrainImage().getLayoutX() <= 650 && redTrain.getTrainImage().getLayoutX() >= 460) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do quinto if

        else if (redTrain.getTrainImage().getLayoutX() <= 460 && redTrain.getTrainImage().getLayoutX() >= 390) {
            redTrain.getTrainImage().setRotate(45);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() - redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX()/2); 
        } // fim do sexto if

        else if (redTrain.getTrainImage().getLayoutX() <= 390 && redTrain.getTrainImage().getLayoutX() >= 177) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do setimo if

        else if (redTrain.getTrainImage().getLayoutX() <= 177 && redTrain.getTrainImage().getLayoutX() >= 107) {
            redTrain.getTrainImage().setRotate(305);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() + redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX()/2); 
        } // fim do oitavo if

        else if (redTrain.getTrainImage().getLayoutX() <= 107 && redTrain.getTrainImage().getLayoutX() >= -182) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do nono if

        else{
            redTrain.getTrainImage().setLayoutX(1140);
            redTrain.getTrainImage().setLayoutY(383);
            redTrain.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial
    }

    public void animationCase2(Train blueTrain, Train redTrain) {
         /*Trem azul a partir do trilho superior esquerdo */
         if (blueTrain.getTrainImage().getLayoutX() <= 95 && blueTrain.getTrainImage().getLayoutX() > -33) {
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());
        } // fim do primeiro if

        else if (blueTrain.getTrainImage().getLayoutX() <= 160 && blueTrain.getTrainImage().getLayoutX() >= 95) {
            blueTrain.getTrainImage().setRotate(45);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() + blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX()/2);      
        } // fim do segundo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 390 && blueTrain.getTrainImage().getLayoutX() >= 160) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());    
        } //fim do terceiro if

        else if (blueTrain.getTrainImage().getLayoutX() <= 465 && blueTrain.getTrainImage().getLayoutX() >= 390) {
            blueTrain.getTrainImage().setRotate(315);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() - blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX()/2);      
        } // fim do quarto if 

        else if (blueTrain.getTrainImage().getLayoutX() <= 660 && blueTrain.getTrainImage().getLayoutX() >= 465) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());    
        } // fim do quinto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 730 && blueTrain.getTrainImage().getLayoutX() >= 660) {
            blueTrain.getTrainImage().setRotate(405);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() + blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX()/2);      
        } // fim do sexto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 925 && blueTrain.getTrainImage().getLayoutX() >= 730) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());    
        } // fim do setimo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 988 && blueTrain.getTrainImage().getLayoutX() >= 918) {
            blueTrain.getTrainImage().setRotate(315);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() - blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX()/2);      
        } //fim do oitavo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 1250 && blueTrain.getTrainImage().getLayoutX() >= 988) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() + blueTrain.getSpeedX());    
        } // fim do nono if

        else {
            blueTrain.getTrainImage().setLayoutX(-32);
            blueTrain.getTrainImage().setLayoutY(166);
            blueTrain.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial

        /*Trem vermelho a partir do trilho inferior direito */
        if (redTrain.getTrainImage().getLayoutX() <= 1140 && redTrain.getTrainImage().getLayoutX() > 976) {
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do primeiro if

        else if (redTrain.getTrainImage().getLayoutX() <= 976 && redTrain.getTrainImage().getLayoutX() >= 910) {
            redTrain.getTrainImage().setRotate(45);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() - redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX()/2); 
        } // fim do segundo if

        else if (redTrain.getTrainImage().getLayoutX() <= 910 && redTrain.getTrainImage().getLayoutX() >= 715) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do terceiro if

        else if (redTrain.getTrainImage().getLayoutX() <= 715 && redTrain.getTrainImage().getLayoutX() >= 650) {
            redTrain.getTrainImage().setRotate(305);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() + redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX()/2); 
        } // fim do quarto if

        else if (redTrain.getTrainImage().getLayoutX() <= 650 && redTrain.getTrainImage().getLayoutX() >= 460) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do quinto if

        else if (redTrain.getTrainImage().getLayoutX() <= 460 && redTrain.getTrainImage().getLayoutX() >= 390) {
            redTrain.getTrainImage().setRotate(45);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() - redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX()/2); 
        } // fim do sexto if

        else if (redTrain.getTrainImage().getLayoutX() <= 390 && redTrain.getTrainImage().getLayoutX() >= 177) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do setimo if

        else if (redTrain.getTrainImage().getLayoutX() <= 177 && redTrain.getTrainImage().getLayoutX() >= 107) {
            redTrain.getTrainImage().setRotate(305);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() + redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX()/2); 
        } // fim do oitavo if

        else if (redTrain.getTrainImage().getLayoutX() <= 107 && redTrain.getTrainImage().getLayoutX() >= -182) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() - redTrain.getSpeedX());
        } // fim do nono if

        else{
            redTrain.getTrainImage().setLayoutX(1140);
            redTrain.getTrainImage().setLayoutY(383);
            redTrain.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial 

}

    public void animationCase3(Train blueTrain, Train redTrain){
         /*Trem azul a partir do trilho superior direito */
         if (blueTrain.getTrainImage().getLayoutX() <= 1140 && blueTrain.getTrainImage().getLayoutX() > 976) {
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());
        } // fim do primeiro if

        else if (blueTrain.getTrainImage().getLayoutX() <= 976 && blueTrain.getTrainImage().getLayoutX() >= 910) {
            blueTrain.getTrainImage().setRotate(315);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() + blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX()/2);      
        } // fim do segundo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 910 && blueTrain.getTrainImage().getLayoutX() >= 715 ) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());    
        } // fim do terceiro if

        else if (blueTrain.getTrainImage().getLayoutX() <= 715 && blueTrain.getTrainImage().getLayoutX() >= 645) {
            blueTrain.getTrainImage().setRotate(405);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() - blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX()/2);      
        } // fim do quarto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 645 && blueTrain.getTrainImage().getLayoutX() >= 460) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());    
        } // fim do quinto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 460 && blueTrain.getTrainImage().getLayoutX() >= 395) {
            blueTrain.getTrainImage().setRotate(315);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() + blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX()/2);      
        } // fim do sexto if

        else if (blueTrain.getTrainImage().getLayoutX() <= 400 && blueTrain.getTrainImage().getLayoutX() >= 175) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());    
        } // fim do setimo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 175 && blueTrain.getTrainImage().getLayoutX() >= 107) {
            blueTrain.getTrainImage().setRotate(405);
            blueTrain.getTrainImage().setLayoutY(blueTrain.getTrainImage().getLayoutY() - blueTrain.getSpeedY());
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX()/2);      
        } // fim do oitavo if

        else if (blueTrain.getTrainImage().getLayoutX() <= 107 && blueTrain.getTrainImage().getLayoutX() >= -182) {
            blueTrain.getTrainImage().setRotate(0);
            blueTrain.getTrainImage().setLayoutX(blueTrain.getTrainImage().getLayoutX() - blueTrain.getSpeedX());     
        } // fim do nono if

        else {
            blueTrain.getTrainImage().setLayoutX(1140);
            blueTrain.getTrainImage().setLayoutY(173);
            blueTrain.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial

        /*trem vermelho a partir do trilho inferior esquerdo */
        if (redTrain.getTrainImage().getLayoutX() <= 106 && redTrain.getTrainImage().getLayoutX() > -33) {
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do primeiro if

        else if (redTrain.getTrainImage().getLayoutX() <= 176 && redTrain.getTrainImage().getLayoutX() >= 106) {
            redTrain.getTrainImage().setRotate(305);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() - redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX()/2); 
        } // fim do segundo if

        else if (redTrain.getTrainImage().getLayoutX() <= 367 && redTrain.getTrainImage().getLayoutX() >= 176) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do terceiro if

        else if (redTrain.getTrainImage().getLayoutX() <= 437 && redTrain.getTrainImage().getLayoutX() >= 367) {
            redTrain.getTrainImage().setRotate(45);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() + redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX()/2); 
        } // fim do quarto if

        else if (redTrain.getTrainImage().getLayoutX() <= 654 && redTrain.getTrainImage().getLayoutX() >= 437) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do quinto if

        else if (redTrain.getTrainImage().getLayoutX() <= 724 && redTrain.getTrainImage().getLayoutX() >= 654) {
            redTrain.getTrainImage().setRotate(305);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() - redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX()/2); 
        } // fim do sexto if

        else if (redTrain.getTrainImage().getLayoutX() <= 916 && redTrain.getTrainImage().getLayoutX() >= 724) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do setimo if

        else if (redTrain.getTrainImage().getLayoutX() <= 986 && redTrain.getTrainImage().getLayoutX() >= 916) {
            redTrain.getTrainImage().setRotate(45);
            redTrain.getTrainImage().setLayoutY(redTrain.getTrainImage().getLayoutY() + redTrain.getSpeedY());
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX()/2); 
        } // fim do oitavo if

        else if (redTrain.getTrainImage().getLayoutX() <= 1250 && redTrain.getTrainImage().getLayoutX() >= 986) {
            redTrain.getTrainImage().setRotate(0);
            redTrain.getTrainImage().setLayoutX(redTrain.getTrainImage().getLayoutX() + redTrain.getSpeedX());
        } // fim do nono if

        else{
            redTrain.getTrainImage().setLayoutX(-32);
            redTrain.getTrainImage().setLayoutY(375);
            redTrain.getTrainImage().setRotate(0);
        } // voltando para a posicao inicial
    }
    

}


