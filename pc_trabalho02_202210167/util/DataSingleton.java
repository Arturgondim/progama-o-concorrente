/* ***************************************************************
 * Autor............: Artur Felipe de Azevedo Gondim
 * Matricula........: 202210167
 * Inicio...........: 28/04/2025
 * Ultima alteracao.: 05/05/2025
 * Nome.............: DataSingleton
 * Funcao...........: Garantir uma instancia unica que todas as telas
 tenham acesso
 ****************************************************************/

package util;

public class DataSingleton {
    private static DataSingleton instance;
    private int options;

    /* ***************************************************************
     * Metodo: getInstance
     * Funcao: instancia criada para fornecer um ponto de acesso entre todas as classes
     * Parametros: nulo
     * Retorno: DataSingleton
     *************************************************************** */

    public static DataSingleton getInstance(){
        if(instance == null){
            instance = new DataSingleton();

        }
        return instance;

    }

    /* ***************************************************************
     * Metodo: getOptions
     * Funcao: Retornar o que foi escolhido no choice box
     * Parametros: nulo
     * Retorno: inteiro
     *************************************************************** */

    public int getOptions(){
        return options;
    }

    /* ***************************************************************
     * Metodo: setOptions
     * Funcao: setar uma nova opcao
     * Parametros: inteiro que sera armazenado em opcao
     * Retorno: void
     *************************************************************** */

    public void setOptions(int options){
        this.options = options;
    }

}
