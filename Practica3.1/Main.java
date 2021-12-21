import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[]args){// es el formato de como mostrar  reultados
        Scanner sc= new Scanner (System.in);
        Eje3 juego=new Eje3();
        juego.setPremio(500);
        juego.agregarFichas(10);
        while (juego.getFichas()>0) {
        int intento=sc.nextInt();
        String res = juego.jugar(intento);
        System.out.print(res);}
    }
}
