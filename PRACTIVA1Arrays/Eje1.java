
/**
 * BUSCANDO ALGO Y GUARDANDO SU POSICION  en este  caso el numero mayor y el menor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eje1
{
    // instance variables - replace the example below with your own
    public String hallarVortice(int[]arr){
        String res ="El vortice esta formado por los numeros";
        //buscamos la posicion  del numero mayor, numero menor;pocicion del del numero mayor, numero meno
        int numMayor = arr [0];
        int numMenor = arr [0];
        int posMayor = 0;
        int posMenor = 0;
        for (int pos =1;pos<arr.length;pos++){
            // si es mayor ahora guarda ese valor
            int actual=arr[pos];
           if(actual> numMayor){
               numMayor =actual;
               posMayor=pos;
            } else{
                if (actual< numMenor){
                     numMenor =actual;
                     posMenor=pos;
                }
            }
            
        }
        int posInicial=Math.min(posMenor,posMayor);
        int posFinal=Math.max(posMenor,posMayor);
        for(int pos =posInicial;pos<=posFinal;pos++){
            int actual=arr[pos];
          res= res+""+actual;
        }
        return res;
    }
}
