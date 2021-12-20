
/**
 * Write a description of class Eje4 here.
 * 
 * @author (Aleida Eguivar) 
 * @version (9/12/21)
 */
public class Eje4{
   public int []hrs (int valor, int tam){
    int[]arr=new int [tam];
    arr[0]= valor;
    int num =1;
    for(int i=0; i<arr.length-1; i++){
        int actual=arr[i];
        if (actual%2==0){
            actual=actual/2;
        }else{
            actual = actual +num;
            num++;
        }
        arr[i+1]=actual;
        
    }
     return arr;
  }
}