/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabinariosjava;

/**
 *
 * @author Poolker
 */
public class CalculadoraBinariosJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        String b1 = "110", b2 ="1";
       
        
        CalculoBi num = new CalculoBi(b1, b2);
        System.out.println("El resultado de las operaciones:");
            String suma = num.Sumar();
            System.out.println(b1+" + "+b2+" es: "+ suma);
                String resta = num.Restar();
            System.out.println(b1+" - "+b2+" es: "+ resta);
            //*********************
            //Multipliacion
            num.setBin1(b1);
            num.setBin2(b2);
            
            String multi = num.Multiplicar();
            System.out.println(b1+" x "+b2+" es: "+ multi);
            //********************
             //*********************
            //Division
            num.setBin1(b1);
            num.setBin2(b2);
                String division = num.Dividir();
            System.out.println(b1+" / "+b2+" es: "+ division);
             //*********************
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
   
    
}
