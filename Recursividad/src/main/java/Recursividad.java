


public class Recursividad {
    
    private String CapturarString(){
     
       String LaHilera = "Hello world";
       return LaHilera;
       
        
    }
    private int LargoHilera(String Hilera){
        int Largo =Hilera.length();
        return Largo;
        
    }
     private void ImprimirDerechaIzquierda(String Hilera,  int Largo){
         ImprimirRecursivo(Hilera,0,Largo);
     }    
      private void ImprimirRecursivo(String Hilera, int Posicion, int Largo){
          
     if (Posicion==Largo){
         ImporimirCaracter(Hilera,Posicion);

          }    
     else
     {
         ImprimirRecursivo(Hilera,Posicion+1,Largo);
           ImporimirCaracter(Hilera,Posicion);
     }
     }
     public void EjecutarEjemploUno(){
        String LaHilera =CapturarString ();
        int Largo =LargoHilera(LaHilera);
         ImprimirDerechaIzquierda(LaHilera,Largo);
     }

    private void ImporimirCaracter(String Hilera,int Posicion) {
         System.out.print(Hilera.charAt(Posicion));
    }
}
