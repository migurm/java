package E77;

public class TestEstudiante {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("paquillo", "fernandez", 6);
        System.out.println(estudiante1.MostrarNotas());
        boolean nota1 = estudiante1.InsertarNota(4.5);
        boolean nota2 = estudiante1.InsertarNota(6.70);
        boolean nota3 = estudiante1.InsertarNota(9.50);
        boolean nota4 = estudiante1.InsertarNota(5.5);
        boolean nota5 = estudiante1.InsertarNota(10);
        boolean nota6 = estudiante1.InsertarNota(-2);//Metidos en variables por si hace falta después
        System.out.println(nota6);
        System.out.println(estudiante1.MostrarNotas());
        System.out.println(estudiante1.IndicarRangos());
        System.out.println(estudiante1);
        
        System.out.println(estudiante1.MostrarNotas());
        
        Estudiante estudiante2;
        
        
        Estudiante estudiante3;
        
        estudiante3 = estudiante1;
        
        estudiante3.MostrarNotas();
        
        estudiante3=null;
        
        estudiante3.MostrarNotas();
        
    }
}
