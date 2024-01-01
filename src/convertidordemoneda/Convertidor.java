
package convertidordemoneda;

import java.util.Scanner;

public class Convertidor {
    
    private String tipoCamb, montoCol;  
    private double montoDol, mC, tC, pruebaTC = 1, pruebaCol = 1;
    private boolean pruebaN = true, pruebaY = true;
    
    public void ingresoDatos (){
        
         Scanner entrada = new Scanner(System.in); 
         
         System.out.println("Programa para convertir de colones a dólares\n");
       
         System.out.println("Ingrese el tipo de cambio actual:");         
         tipoCamb = entrada.nextLine();        
         
         while (pruebaN == true || pruebaTC <= 0){         
             for (int i=0; i<tipoCamb.length();i++){                 
                 if (Character.isLetter(tipoCamb.charAt(i))){
                     pruebaN = true;
                     break;
                 }
                 else {                                          
                     pruebaN = false;                     
                 }                                
             }      
             if (pruebaN==false){
                 pruebaTC = Double.parseDouble(tipoCamb);
             }
             else{
                 System.out.println("Error, no ingresó un valor numérico\nPor favor ingrese de nuevo el tipo de cambio:\n");                  
                 tipoCamb = entrada.nextLine();       
             } 
             if (pruebaTC <= 0 && pruebaN == false){              
                 System.out.println("Error, ingresó un valor negativo o cero\nPor favor ingrese de nuevo el tipo de cambio:\n");                              
                 tipoCamb = entrada.nextLine();                                          
                 }            
             if (pruebaTC > 0 && pruebaN == false){
                  tC = Double.parseDouble(tipoCamb);
             }      
         }         
         
         System.out.println("Ingrese el monto en colones:");
         montoCol = entrada.nextLine();
         
         while (pruebaY == true || pruebaCol <= 0){         
             for (int i=0; i<montoCol.length();i++){                 
                 if (Character.isLetter(montoCol.charAt(i))){
                     pruebaY = true;
                     break;
                 }
                 else {                                          
                     pruebaY = false;                     
                 }                                
             }             
             if (pruebaY==false){
                 pruebaCol = Double.parseDouble(montoCol);
             }
             else{
                 System.out.println("Error, no ingresó un valor numérico\nPor favor ingrese de nuevo el monto en colones:\n");                  
                 montoCol = entrada.nextLine();       
             } 
             if (pruebaCol <= 0 && pruebaY == false){              
                 System.out.println("Error, ingresó un valor negativo o cero\nPor favor ingrese de nuevo el monto en colones:\n");                              
                 montoCol = entrada.nextLine();                                          
                 }            
            if (pruebaCol > 0 && pruebaY == false){
                  mC = Double.parseDouble(montoCol);
             }      
           }            
    }
     
    public double calc(){
        montoDol = mC/tC;
        return montoDol;
    }
    
    public void resultMontoDol(){
        System.out.printf("\nEl valor de ȼ%.2f en dólares es de: $%.2f\n",mC,calc());      
    }
}

