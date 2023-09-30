package example;
import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String texto = "Hello World!";
        // Utilizar StringUtils para invertir el texto
        String textoInvertido = StringUtils.reverse(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }
}
