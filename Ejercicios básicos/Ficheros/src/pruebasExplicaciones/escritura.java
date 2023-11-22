
package pruebasExplicaciones;

//1- Importar las herramientas que voy a usar
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class escritura {

    public static void main(String[] args) {
        
        String ruta = "src/pruebasExplicaciones/salida.txt";
        FileWriter escritor = null;
        BufferedWriter paquito = null;
        try{
            //2. Creamos Flujos de datos
            escritor = new FileWriter(ruta);
            paquito = new BufferedWriter(escritor);
            
            //3. Escribir
            /*paquito.write("No duermo bien por las noches");
            paquito.write("\n");
            paquito.newLine();
            paquito.write("del norte");*/
            
            for (int i = 0; i<10;i++){
                paquito.write(Integer.toString(i));
            }
            
            //4. Cerrar
            paquito.close();
            escritor.close();
            
        }catch(IOException e){
            System.out.println("ERROR en escritura."+e.getMessage());
        }finally{
            try{
            paquito.close();//Posible fallo, lo metemos en un if.
            escritor.close();//Si cerramos aquí tenemos que declarar las variables antes del try
            if (paquito!=null) paquito.close();
            if (escritor!=null) escritor.close();
            //O capturar ese posible error en otro catch.
            }catch(NullPointerException e){
                System.out.println("");
            
            }catch(IOException e){
                System.out.println("Error cerrando recursos: "+e.getMessage());

        }
        }

    }

}
