


public class Recursividad {
    
    private String CapturarString(){
     
     String laHilera = "Hello world";
        return (laHilera); 
       
        
    }
    private int LargoHilera(String Hilera){
       return Hilera.length();
        
    }
     private void ImprimirDerechaIzquierda(String Hilera,  int Largo){
         ImprimirRecursivo(Hilera, 0, 
                Largo - 1);
     }    
      private void ImprimirRecursivo(String Hilera, int Posicion, int Largo){
          
 
        if (Posicion == Largo)
        {
            ImporimirCaracter (Hilera, 
                    Posicion);
        }
        else
        {
            ImprimirRecursivo(Hilera, 
                    Posicion + 1, 
                    Largo);
            ImporimirCaracter(Hilera, 
                    Posicion);
        }
     }
     public void EjecutarEjemploUno(){
        String laHilera = CapturarString ();
        int elLargoDeLaHilera = LargoHilera
                    (laHilera);
        ImprimirDerechaIzquierda (laHilera, 
                elLargoDeLaHilera);
     }

    private void ImporimirCaracter(String Hilera,int Posicion) {
          System.out.print(
                Hilera.charAt(Posicion));
    }
}
