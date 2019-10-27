package mx.sft.qm.atm.util;

import java.io.FileWriter;
import java.io.PrintWriter;

public class LeerEscribirData {
	public static boolean escribir(String ruta,String data) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(ruta,true);
            pw = new PrintWriter(fichero);

            
                pw.println(data);
                return true;
        } catch (Exception e) {
            e.toString();
            System.err.println(e.toString());
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.toString();
              System.err.println(e2.toString());
           }
        }
		return false;
		
	}
	
	public static String leer(String ruta) {
		return "";
	}

}
