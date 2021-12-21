
/**
 * La Proclamación de Mi Anhelo
Dariel a estado muy abrumado por sus sentimientos últimamente, llego a tener
noches enteras sin dormir en las cuales, la música fue su más fiel compañera. De
cada canción que escuchaba, anotaba en su cuaderno de poemas, los versos
que más le identificaban o que más llamaban su atención.
El día de hoy analizaremos los versos que anotó. Nuestro criterio de análisis será
contar cuantos signos de puntuación (comas, puntos, punto y comas, signos de
interrogación y de admiración) existen en un verso particular.
Para entender mejor esto, veamos un ejemplo: Suponiendo que tenemos el
siguiente verso.
” Y te encuentro en el fondo una vez más, Amor, vida muerte, eres el bien y el
mal.”
La respuesta sería: “Existen 4 signos de puntuación”.
Veamos otro ejemplo:
“Ahora no, ¡recitas la oración! Ahora no, ¡presumes de valor!”
La respuesta sería: “Existen 6 signos de puntuación”.
Para este ejercicio se te pide: Implementar un método que reciba por
parámetro un dato de tipo String, e indicar cuantos signos de puntuación
existen en esa cadena.
 * 
 * @author (Aleida Eguivar) 
 * @version (12/12/21)
 */
public class Eje2contarSignos
{
    // contando numero de signos de puntuacion,
    public int contarSignos(String cadenaAnalizada){
        int res = 0;
        int contador_signos=0;
        for (int pos=0;pos<cadenaAnalizada.length();pos++){
            char actual = cadenaAnalizada.charAt(pos); //inspecionamos la cadena con la fubcioncharAt(pos) que inspecciona cada una
            if (actual==','||actual==';'||actual=='.'||actual==':'||actual=='¿'||actual=='?'||actual==')'||actual=='('||actual=='"'||actual=='!'||actual=='¡'||actual=='-'||actual=='_'){
               contador_signos++;
            } //pregunto si la cadena es o no un signo de puntuacion
    }
    return contador_signos;
   }
}
