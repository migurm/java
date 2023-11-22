import java.util.Scanner;

public class pruebaTestChatGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al cuestionario. Elige una opción:");
            System.out.println("1. Responder una pregunta");
            System.out.println("2. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea después de leer la opción

            switch (opcion) {
                case 1 -> responderPregunta(scanner);
                case 2 -> continuar = false;
                default -> System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        }

        System.out.println("¡Gracias por participar en el cuestionario!");
        scanner.close();
    }

    public static void responderPregunta(Scanner scanner) {
        String pregunta;
        String[] respuestas;
        String respuestaCorrecta;
        int numRespuestas;

        // Pregunta 1
        pregunta = "¿Qué significan las siglas PL/SQL?";
        respuestas = new String[]{"a. Procedural Language / SQL", "b. Procedimental Languaje / SQL",
                "c. Programming Language / SQL", "d. Progress Language / SQL"};
        respuestaCorrecta = "a";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 2
        pregunta = "Las variables deben definirse después de la palabra:";
        respuestas = new String[]{"a. BEGIN", "b. END", "c. START", "d. DECLARE"};
        respuestaCorrecta = "d";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 3
        pregunta = "El lenguaje PL/SQL distingue entre mayúsculas y minúsculas";
        respuestas = new String[]{"True", "False"};
        respuestaCorrecta = "False";
        numRespuestas = 2;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 4
        pregunta = "¿Qué es un literal?";
        respuestas = new String[]{"a. Un símbolo", "b. El identificador de una variable",
                "c. Una palabra reservada", "d. Un valor"};
        respuestaCorrecta = "d";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 5
        pregunta = "¿Cuál NO es un tipo de datos?";
        respuestas = new String[]{"a. Varchar2", "b. Number", "c. Date", "d. String"};
        respuestaCorrecta = "d";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 6
        pregunta = "Tipo de bucles NO estudiado:";
        respuestas = new String[]{"a. WHILE", "b. FOR", "c. DO WHILE", "d. LOOP"};
        respuestaCorrecta = "c";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 7
        pregunta = "¿Cómo se llama en PL/SQL el tipo de datos equivalente a una clase en JAVA?";
        respuestas = new String[]{"a. Array", "b. Tabla Anidada", "c. Cursor", "d. Registro"};
        respuestaCorrecta = "d";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 8
        pregunta = "Forma de acceder a los campos de un registro:";
        respuestas = new String[]{"a. NombreRegistro(Campo)", "b. NombreRegistro.Campo",
                "c. NombreRegistro[Campo]", "d. NombreRegistro.get(campo)"};
        respuestaCorrecta = "b";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 9
        pregunta = "Es obligatorio establecer el tamaño máximo de un array en PL/SQL.";
        respuestas = new String[]{"True", "False"};
        respuestaCorrecta = "True";
        numRespuestas = 2;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 10
        pregunta = "Expresión para designar arrays en PL/SQL";
        respuestas = new String[]{"a. ARRAY", "b. RECORD", "c. VARRAY", "d. PARRAY"};
        respuestaCorrecta = "c";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 11
        pregunta = "Los registros NO tienen ningún tipo de constructor que podamos usar para inicializar una instancia";
        respuestas = new String[]{"True", "False"};
        respuestaCorrecta = "False";
        numRespuestas = 2;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 12
        pregunta = "Cláusula que nos devuelve un tipo complejo con todos los campos que tiene una tabla";
        respuestas = new String[]{"a. %TYPE", "b. %ROWTYPE", "c. %ROW", "d. %TABLETYPE"};
        respuestaCorrecta = "b";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 13
        pregunta = "¿Qué estructura de PL/SQL es similar a una lista en JAVA?";
        respuestas = new String[]{"a. REGISTRO", "b. ARRAY", "c. CURSOR", "d. TABLA ANIDADA"};
        respuestaCorrecta = "d";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 14
        pregunta = "¿Qué es un cursor?";
        respuestas = new String[]{"a. Una función que realiza una búsqueda",
                "b. Tipo de variable que almacena el resultado de una búsqueda",
                "c. Variable que almacena el resultado de una búsqueda",
                "d. Registro con los tipos de datos de una tabla"};
        respuestaCorrecta = "b";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 15
        pregunta = "Se le pueden pasar parámetros a un CURSOR";
        respuestas = new String[]{"True", "False"};
        respuestaCorrecta = "True";
        numRespuestas = 2;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 16
        pregunta = "Diferencia entre procedimientos y funciones:";
        respuestas = new String[]{"a. El procedimiento tiene parámetros y la función no",
                "b. El procedimiento no tiene parámetros y la función sí",
                "c. El procedimiento no devuelve nada y la función sí",
                "d. El procedimiento devuelve un dato y la función no"};
        respuestaCorrecta = "c";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 17
        pregunta = "Referente a imprimir mensajes por consola:";
        respuestas = new String[]{"a. Los procedimientos sí pueden y las funciones no",
                "b. Los procedimientos no pueden y las funciones sí",
                "c. Tanto procedimientos como funciones pueden hacerlo",
                "d. Ni procedimientos ni funciones pueden imprimir por consola"};
        respuestaCorrecta = "c";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 18
        pregunta = "Agrupación de funciones, procedimientos...";
        respuestas = new String[]{"a. Grupo", "b. Procedimiento", "c. Disparador", "d. Paquete"};
        respuestaCorrecta = "d";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 19
        pregunta = "Un disparador se activa después de un:";
        respuestas = new String[]{"a. DROP", "b. ALTER", "c. UPDATE", "d. Todas son correctas"};
        respuestaCorrecta = "c";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 20
        pregunta = "¿Qué es instanciar?";
        respuestas = new String[]{"a. Definir un objeto", "b. Definir un método",
                "c. Definir una variable de tipo objeto", "d. Fijar unos atributos a un objeto"};
        respuestaCorrecta = "c";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 21
        pregunta = "Tipos de dato admitidos para los atributos:";
        respuestas = new String[]{"a. LONG", "b. NUMBER", "c. BOOLEAN", "d. Todos son correctos"};
        respuestaCorrecta = "d";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 22
        pregunta = "Los objetos creados con el comando CREATE TYPE ... AS OBJECT se pueden usar:";
        respuestas = new String[]{"a. Desde cualquier bloque de código", "b. Solo desde el trozo de código donde se han definido",
                "c. Nunca, los objetos no se pueden usar en PL/SQL", "d. Solo desde la sesión en la que se crearon"};
        respuestaCorrecta = "a";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 23
        pregunta = "¿Cuál de los siguientes NO es un tipo de disparador?";
        respuestas = new String[]{"a. BEFORE", "b. AFTER", "c. INSTEAD OF", "d. DURING"};
        respuestaCorrecta = "d";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 24
        pregunta = "¿Cuál de las siguientes opciones NO es correcta?";
        respuestas = new String[]{"a. Pueden existir varios disparadores del mismo tipo en una tabla",
                "b. Pueden existir varios disparadores del mismo tipo en una base de datos",
                "c. Solo puede existir un disparador de cada tipo en una tabla",
                "d. Solo puede existir un disparador de cada tipo en una base de datos"};
        respuestaCorrecta = "c";
        numRespuestas = 4;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);

        // Pregunta 25
        pregunta = "Dentro de un disparador podemos hacer referencia a los campos de la tabla que activa el disparador";
        respuestas = new String[]{"True", "False"};
        respuestaCorrecta = "True";
        numRespuestas = 2;
        realizarPregunta(scanner, pregunta, respuestas, respuestaCorrecta, numRespuestas);
    }

    public static void realizarPregunta(Scanner scanner, String pregunta, String[] respuestas, String respuestaCorrecta, int numRespuestas) {
        System.out.println(pregunta);
        for (int i = 0; i < numRespuestas; i++) {
            System.out.println(respuestas[i]);
        }

        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase(respuestaCorrecta)) {
            System.out.println("¡Respuesta correcta!");
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es: " + respuestaCorrecta);
        }
    }
}
