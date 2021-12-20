
/**
 * Write a description of class Eje2 here.
 * ordenamos de manera clas
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Collections;
public class Eje2
{
    // 
    public int []ordenar(int []arr){
        int cont=0;
        for(int pos =0;pos<arr.length;pos++){
        int actual=arr[pos];
        if(actual%2 !=0){
            cont++;
        }
    }
    int[] impares= new int [cont];
    int [] pares= new int [arr.length-cont];
    int posImpares=0;
    int posPares =0;
    for (int pos=0;pos<arr.length;pos++){
        int actual= arr[pos];
        if ( actual%2 !=0 ){
        impares[posImpares]= actual;
        
       }else {
        pares[posPares]=actual;
       }
    }
    Arrays.sort(impares);
    ordenarDes(pares);// invocamos el metodo oredenar descendente
    int []res = new int [arr.length];
    for (int pos =0; pos<impares.length; pos++){
        res [pos]= pares [pos];
    }
    int posAux=0;
    for (int pos =0; pos<impares.length; pos++){
        res [pos]= pares [posAux];
        posAux++;
    }
    return res;
    }
    private void ordenarDes (int []arr){
        for (int i=0; i<arr.length-1;i++){
            for (int j=0; j<arr.length-1-i;j++){
                int actual= arr[j];
                int vecino = arr[j+1];
                if (actual<vecino){
                    arr[j]= vecino;
                    arr[j+1]= actual;
                }
            }
        }
    }
}
