/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procalcularedad;
import java.util.Scanner;
/**
 *
 * @author ASUS GAMER
 */
public class ProCalcularEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion e iniciacion de varibles 
        int an, mn, dn, aa, ma, da, ea, em, ed;
        an = 0; mn = 0; dn = 0; aa = 0; ma = 0; da = 0; ea = 0; em = 0; ed = 0;
        
        System.out.println("Programa para calcular la edad en dia meses y años \n");
        //Entrada de datos 
        System.out.println("Ingrese su año de nacimiento");
        an = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        mn = leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento");
        dn = leer.nextInt();
        System.out.println("Ingrese el año actual");
        aa = leer.nextInt();
        System.out.println("Ingrese el mes actual");
        ma = leer.nextInt();
        System.out.println("Ingrese el dia actual");
        da = leer.nextInt();
        
        //Proceso 
        ea = aa - an;
        em = ma - mn;
        ed = da - dn;
        
        //Logicas Condicionales
        if (em < 0){
            ea = ea - 1;
        }
        else{
            if ((em == 0)&&(ed > 0)){
                ea = ea - 1;
            }
        }
        if (em < 0){
            em = ma + 12 - mn;
        }
        if (ed < 0){
            ed = da + 30 - dn;
        }        
                
        System.out.println("la edad actual de la persona es: "+ea +"años con " + em + "meses y " +ed+ "dias" );        
    }
    
}
