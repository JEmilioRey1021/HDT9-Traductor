/***
 * Clase para la asociación de nodos
 *
 * @author Emilio Reyes
 * @version 21/04/2023
 */
class Nodo {
    Asociation data;
    Nodo left, right;

    /***
     * asociación de nodos
     */
    Nodo(Asociation data)
    {
        this.data = data;
        left = right = null;
    }
}