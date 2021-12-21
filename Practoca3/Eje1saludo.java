
/**
  UnicornioBot
Los bots han ganado popularidad durante estos años, es bastante interesante verlos
en todo tipo de aplicaciones y servicios. El día de hoy, trataremos de simular un
comportamiento bastante simple, lo que haremos será modelar nuestro asistente
personal, el cual llamaremos UnicornioBot.
Un UnicornioBot almacena el nombre del usuario actual, es decir el nombre del
usuario a quien debe saludar. Este nombre debe ser indicado al momento de la
creación de un UnicornioBot particular.
La única acción que simularemos en esta ocasión será la de un saludo, por lo tanto, el
UnicornioBot sabrá saludar. Para saludar lo único que hace es devolver un mensaje.
Por ejemplo: “Hola Edriel”
Por otro lado, si se diera el caso que el usuario actual desee cambiar el nombre que
tiene guardado el UnicornioBot para el saludo, este puede hacerlo, indicando el
nuevo nombre que desea guardar.
Se te pide:
a) Realizar el planteamiento de solución y diagrama de clases.
b) Implementar el constructor que te permita crear objetos de tipo UnicornioBot.
c) Implemente los métodos necesarios para el correcto funcionamiento del
programa.
 * @author (Aleida EGUIVAR) 
 * @version (a version number or a date)
 */
public class Eje1saludo
{
  
     private String nombreUsuario;
    public Eje1saludo(String nombre){
        nombreUsuario=nombre;
    }
    public String saludar (){
        String saludo ="Hola"+nombreUsuario;
        return saludo;
    }
    public void setNombre (String valor){
       nombreUsuario=valor;
    }
}