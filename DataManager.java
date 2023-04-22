import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Clase para la manipulación de la información
 *
 * @author Emilio Reyes
 * @version 21/04/2023
 */
public class DataManager {

    /***
     * String con el contenido de un archivo
     * @param PATH_FILE dirección donde se encuentra el archivo
     * @return String con datos contenidos dentro del documento
     */
    public static String getDataFile(String PATH_FILE){
        BufferedReader reader;
        String linea,datos = "";

        try{
            reader = new BufferedReader(new FileReader(PATH_FILE));

            while((linea = reader.readLine()) != null){
                datos += linea + "\t";
            }
            reader.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return datos;
    }


    /***
     * Verificar la existencia del archivo 
     * @return true si el archivo existe, false si el archivo no existe
     */
    public static boolean getExists(String PATH_FILE){
        return (new File(PATH_FILE)).exists();
    }

    /***
     * Separación de los datos de un archivo, a una lista, según delimitador enviado
     */
    public static List getFileTokens(String DELIMITADOR, String PATH_FILE){

        return Collections.list(new StringTokenizer(DataManager.getDataFile(PATH_FILE), DELIMITADOR)).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());
    }

    /***
     * Separación de un string a una lista, según delimitador enviado
     */
    public static List getStringTokens(String DELIMITADOR, String VALUE){

        return Collections.list(new StringTokenizer(VALUE, DELIMITADOR)).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());

    }

    /***
     * Conversión del string a su tipo original
     */
    private static Object getAtom(String VALUE) {
        try {
            return Integer.parseInt(VALUE);
        }
        catch (NumberFormatException e) {
            try {
                return Float.parseFloat(VALUE);
            }
            catch (NumberFormatException e2) {
                try {
                    return Double.parseDouble(VALUE);
                }
                catch (NumberFormatException e3) {
                    return VALUE;
                }
            }
        }
    }
}
