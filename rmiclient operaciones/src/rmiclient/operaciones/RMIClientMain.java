package rmiclient.operaciones;





public class RMIClientMain 
{
     public static void main(String[] args) 
    {
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();

            int suma = wsc.getSuma(1, 1);
            int resta = wsc.getResta(1, 1);
            int multiplicacion = wsc.getMultiplicacion(1, 1);
            int division = wsc.getDivision(5, 0);
            int modulo = wsc.getModulo(1, 1);
            int potencia = wsc.getPotencia(1, 1);
            
            
             System.out.println(" resultado de la suma por el servidor: " + suma);
             System.out.println(" resultado de la resta por el servidor: " + resta);
             System.out.println(" resultado de la mult por el servidor: " + multiplicacion);
             System.out.println(" resultado de la divi por el servidor: " + division);
             System.out.println(" resultado de el mod por el servidor: " + modulo);
             System.out.println(" resultado de la potencia por el servidor: " + potencia);
             
        } catch (Exception ex) {
            ex.printStackTrace();
             System.err.println("Connection error the server is not responding.");
        }
    }
}
