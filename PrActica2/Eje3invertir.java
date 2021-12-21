
/**
 * Zenith y Nadir
La vida es una amalgama perfecta de contras y pros, al igual que el ying y el
yang todo lo bueno tiene algo malo, dándole sentido a la existencia de ambos
conceptos.
Estas ideas y pensamientos siempre despertaron interés particular en la mente
de Heziel, quien pudo darse cuenta que todo en la vida, tiene su lado opuesto
perfecto.
Fue asi que Heziel, comenzó su investigación con nombres de personas. Su
objetivo era invertir el nombre.
Por ejemplo: Si tuviéramos el nombre:
“Meredith”
Su forma invertida debería ser: “htidereM”
También se pueden invertir frases completas, por ejemplo:
“¡Brillante, radiante! Como lo fuiste antes…”
Su forma invertida debería ser: “…setna etsiuf ol omoC ¡etnaidar ,etnallirB¡”
Para este ejercicio se te pide: Implementar un método que reciba por
parámetro un dato de tipo String, para formar e indicar por resultado cual seria
la cadena invertida.
 * 
 * @author (Aleida Eguivar) 
 * @version (12/12/21
 */
public class Eje3invertir
{
    // Zenith y Nadir
    // public =implementa el metodo ,String lo que devuelve que es una cadena, invertir= es el nombre  del metodo ,(String = lo que recibe de parametro cadena)llamada cad
    public String invertir(String cad){
        String res =""; //respuesta en orden 
        //for es una palabra reservada para recorrer la cadena ,for indica que es un ciclo,int simboloza las y es ina variable locar por que se usa dentro del for , 
        // pos simboliza la posicion ;mientras sea valida <menor que la longitud  del la cadena donde length es un metodo;la poscion se incremta de 1 en 1 
        for (int pos=0;pos<cad.length();pos++){
           //intrucciones necesito que se repitan
           char actual = cad.charAt(pos);//devuelve un caracter que existe  en alguna posiciony entre parentesis la pos que desea inspeccionar
           // cada uno se concatena pr la  isquierda lo que ya haya por respuesta
           res = actual+res;
        }
        return res;
    }
     public String invertirconmetodos(String cad){
        StringBuilder res = new StringBuilder(cad); //StringBuilder no es una cDENA NORMAL ai nonun objeto afectando  la interfazgrafica es un tipo de formato de cadena no simple
        res =  res.reverse();//invoco un metodo
       //para volver a cmbiar el formato al tipo string usamos el siguiemte metodo
        return res.toString();//devuelve todo en string cadena
    }
}
