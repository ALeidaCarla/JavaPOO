
/**
 Máquina de la Suerte, el UnicornioTron
Es un día normal en la vida de Meredith, hasta que, de casualidad, puede observar en
la puerta de una tienda, una maquina bastante interesante, la cual se llama el
UnicornioTron.
Esta es una máquina de apuesta, Meredith siempre se ha considerado una persona
con suerte, así que intentara jugar, esperemos que le vaya bien.
En esta ocasión, nos centraremos exclusivamente en la maquina llamada
UnicornioTron
Esta máquina tiene una cantidad fija de dinero en su interior, la cual entrega como
premio si ganas el juego. Dicha cantidad puede ser consultada por el usuario si así lo
desea.
Para poder jugar, debes insertar fichas previamente, puedes insertar cuantas fichas
desees. Cada ficha representa un intento, cada vez que juegas, la maquina descuenta
una ficha.
Ahora lo más importante, la explicación del juego. El juego consiste en adivinar un
número secreto, dicho número secreto es uno que la maquina conoce y que genera
de manera aleatoria al momento de su creación. Si adivinas el número, ganas el
premio, si no adivinas el número, pues la maquina te informara mediante un
mensaje, que fallaste este intento.
Cuando alguien gana, la maquina se queda sin premio, por lo cual nadie puede ni
insertar fichas ni jugar, hasta que recarguen la maquina nuevamente.
Se te pide:
a) Realizar el planteamiento de solución y diagrama de clases.
b) Implementar el constructor que te permita crear objetos de tipo
UnicornioTron.
c) Implemente los métodos necesarios para el correcto funcionamiento del
programa.
 * @author (Alida Eguivar) 
 * @version (16/12/21)
 */
public class Eje3
{
   private int premio;
   private int fichas;
   private int numSecreto;
  public  Eje3(){
      premio=0;
      fichas=0;
     numSecreto=(int)((Math.random()*9999)+1000);// genera un punto ramdom dondde indicamos dese donde empesar  hasta donde acabar;
    }
  public String jugar(int numeroIntento){// PARA jugar ingreso numero
   String res= "";
   if (premio>0){
       if (fichas>0){
           fichas--;//actualizando la disminucion de fichas
           if (numSecreto==numeroIntento){
            res="Felicidades , ganaste!!! Tu premio es "+premio;
            premio=0;
             numSecreto=(int)((Math.random()*9999)+1000);
          }else{res=  "Fallaste, sigue participando";
            }
           
        }else {
            res= "Error,no hay fichas para jugar";
        }
    }else{res= "Error,no hay premio disponible";}
    return res;
}
 public void  agregarFichas(int cantidad){
    fichas=fichas+cantidad;
}
public int getFichas(){
    return fichas;
}
public int consultarPremio(){
return premio;
}
public void setPremio(int cantidad){
premio=cantidad;}
   
   
}
