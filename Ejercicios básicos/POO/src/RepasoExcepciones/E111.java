/*
Finalmente, crea un main para hacer la siguiente prueba:
? instancia dos objetos Gato: uno con datos correctos y otro con edad y nombre
incorrectos.
? Utiliza los setters en el primer objeto: Introduce valores incorrectos.
? Maneja las excepciones que puedan ocurrir.
*/
package RepasoExcepciones;


public class E111 {

    public static void main(String[] args) {
        Gato gatoCorrecto=null;
        Gato gatoErroneo=null;
        try{
            gatoCorrecto = new Gato ("Bigotes", 4);
            System.out.println(gatoCorrecto);
            
        }catch(CreacionGatoException e){
            System.out.println(e.getMessage());
        }
        try{
            gatoErroneo = new Gato ("a", -100);
            System.out.println(gatoErroneo);
        }catch(CreacionGatoException e){
            System.out.println(e.getMessage());
        }
        try{
            gatoCorrecto.setEdad(-100);
        }catch(CreacionGatoException e){
            System.out.println(e.getMessage());
        }
        try{
            gatoCorrecto.setNombre("a2");
        }catch(CreacionGatoException e){
            System.out.println(e.getMessage());
        }

    }

}
