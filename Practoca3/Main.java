/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String []args){// realiza todo por imterface por codigo
        //creamos un objeto y guardamos  en una variable
        Eje1saludo unicorn1= new Eje1saludo ("Ale");//new reserva espacio en memoria para crear un objedo y antecede al constructorutiliza el nombre de la clase invocada
        String saludo =unicorn1.saludar();// el punto invoca un metodo
        System.out.print(saludo);
    }
}
