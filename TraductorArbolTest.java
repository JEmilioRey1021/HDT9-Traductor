import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraductorArbolTest extends TestCase {

    @Test
    public void test(){
        TraductorArbol arbol = new TraductorArbol();
        arbol.getDiccionario();
    }
}