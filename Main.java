package com.dam.rafa;

import com.dam.rafa.Vehiculo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String tipo = "";
        String modelo = "";
        String marca = "";
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        Double nota = 0.0;
        boolean ganador = false;
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> listaNombre = new ArrayList<>();
        String nombre;
        String contraseña2;
        int esCero  =1;
        String contraseña;
        double numD = 0.0;
        int num1 = 0;
        int num2 = 0;
        int act = 0;
        int resultado = 0;
        Integer num =0;
        int contador = 0;
        Double[] arrayNotas = new Double[10];
        System.out.println("Elige del 1 al 30 que actividad quieres ver:");
        act = teclado.nextInt();
        teclado.nextLine();

        Main main = new Main();

        switch (act) {

            case 1:

                main.act1();

                break;

            case 2:

                nombre = "";
                System.out.println("Escribe tu nombre: ");
                nombre = teclado.nextLine();
                main.act2(nombre);

                break;

            case 3:

                System.out.println("Introduce un numero entero: ");
                num1 = teclado.nextInt();
                System.out.println("Introduce otro numero entero: ");
                num2 = teclado.nextInt();

                main.act3(num1, num2);

                break;

            case 4:

                System.out.println("Introduce un numero entero: ");
                num1 = teclado.nextInt();
                System.out.println("Introduce otro numero entero: ");
                num2 = teclado.nextInt();

                main.act4(num1, num2);

                break;

            case 5:

                Boolean iguales = false;

                do {
                    System.out.println("Introduce un numero entero: ");
                    num1 = teclado.nextInt();
                    System.out.println("Introduce otro numero entero: ");
                    num2 = teclado.nextInt();

                    iguales = main.act5(num1, num2);

                    System.out.println("Los numeros no son iguakes");


                } while (!iguales) ;


                break;

            case 6:

               for (int i = 0; i < 5; i++)  {

                    System.out.println("Introduce nu numero");
                    num = teclado.nextInt();

                    listaNumeros.add(num);

                    contador++;

                }

                main.act6(listaNumeros);

                break;

            case 7:


                while (contador < 5) {

                    System.out.println("Introduce nu numero");
                    num = teclado.nextInt();

                    listaNumeros.add(num);

                    contador++;

                }

                main.act7(listaNumeros);

                break;

            case 8:

                System.out.println("Introduce un numero del 1 al 12");
                num1 = teclado.nextInt();

                main.act8(num1);

                break;

            case 9:

                System.out.println("Introduce un numero del 1 al 12");
                num1 = teclado.nextInt();

                main.act9(num1);

                break;

            case 10:

                System.out.println("Introduce un numero del 1 al 12");
                num1 = teclado.nextInt();

                main.act10(num1);
                break;

            case 11:

                System.out.println("Introduce solo lo numeros de tu DNI y te dire su letra");
                num1 = teclado.nextInt();

                main.act11(num1);

                break;

            case 12:

                nota = 0.0;
                for (int i = 0; i < arrayNotas.length; i++) {
                    System.out.println("Añade notas");
                    nota = teclado.nextDouble();
                    if (nota >=0 && nota <=10) {
                        arrayNotas[i] = nota;
                    }
                }
                main.act12(arrayNotas);

                break;

            case 13:

                System.out.println("Introduce un numero en grados Celsius y te lo devolvere en Fahrenheit");
                numD = teclado.nextDouble();

                main.act13(numD);

                break;

            case 14:

                System.out.println("Introduce el radio de una circuferencia, te devolvere el diametro y el aerea ");
                numD = teclado.nextDouble();

                main.act14(numD);

                break;

            case 15:

                System.out.println("Introduce el radio de una circuferencia, te devolvere el diametro y el aerea ");
                numD = teclado.nextDouble();

                main.act15(numD);

                break;

            case 16:

                System.out.println("Introduce tu fecha de nacimento sin simbolos");
                String fecha = teclado.nextLine();
                main.act16(fecha);

                break;

            case 17:

                System.out.println("Introduce una contraseña con almenos 5 caracteres, 1 numero y 1 mayuscula");
                contraseña = teclado.nextLine();
                main.act17(contraseña);

                break;

            case 18:

                System.out.println("Introduce una contraseña con almenos 5 caracteres, 1 numero y 1 mayuscula");
                contraseña = teclado.nextLine();
                System.out.println("Repite la contraseña");
                contraseña2 = teclado.nextLine();
                main.act18(contraseña, contraseña2);

                break;

            case 19:

                main.act19();

                break;

            case 20:

                main.act20();

                break;

            case 21:

                while (listaNombre.size() < 5) {
                    System.out.println("Introduce el nombre de una persona");
                    nombre = teclado.nextLine();

                    listaNombre.add(nombre);
                }
                break;

            case 22:
                esCero  =1;
                while (esCero == 1) {
                    System.out.println("Introduce el nombre de una persona");
                    nombre = teclado.nextLine();

                    if (nombre.equals("0")) {

                        esCero = 0;

                    } else listaNombre.add(nombre);

                }

                break;

            case 23:

                esCero  =1;
                while (esCero == 1) {
                    System.out.println("Introduce el nombre de una persona");
                    nombre = teclado.nextLine();

                    if (nombre.equals("0")) {

                        esCero = 0;

                    } else listaNombre.add(nombre);

                }
                num = 1;
                for (String s : listaNombre) {
                    System.out.println("El nombre en la linea "+ num + " es: " + s);
                    num = num +1;
                }

                break;

            case 24:

                while (!ganador) {

                    System.out.println("Elige un numero entero del 1 al 10");
                    num = teclado.nextInt();

                    Random random = new Random();

                    int numeroAleatorio = random.nextInt(10);

                    if (num == numeroAleatorio) {

                        ganador = true;

                        System.out.println("Has ganado! Elige tu premio: Una tele , un pc o una casa");
                        num1 = teclado.nextInt();

                        System.out.println("Recibiras tu premio proximamente");

                    } else System.out.println("No es el mismo numero");

                }
                break;

            case 25:

                while (!ganador) {

                    System.out.println("Elige un primer numero entero del 1 al 10");
                    num = teclado.nextInt();
                    System.out.println("Elige un segundo numero entero del 1 al 10");
                    num1 = teclado.nextInt();
                    System.out.println("Elige un tercer numero entero del 1 al 10");
                    num2 = teclado.nextInt();

                    Random random = new Random();

                    int numeroAleatorio = random.nextInt(10);

                    if (num == numeroAleatorio || num1 == numeroAleatorio|| num2 == numeroAleatorio) {

                        ganador = true;

                        System.out.println("Has ganado! Elige tu premio: Una tele , un pc o una casa");
                        num1 = teclado.nextInt();

                        System.out.println("Recibiras tu premio proximamente");

                    } else System.out.println("Ninguno es el mismo numero");

                }

                break;

            case 26:

                 nota = 0.0;
                for (int i = 0; i < arrayNotas.length; i++) {
                    System.out.println("Añade notas");
                    nota = teclado.nextDouble();
                    if (nota >=0 && nota <=10) {
                        arrayNotas[i] = nota;
                    }
                }
                main.act12(arrayNotas);

                break;

            case 27:

                System.out.println("Introduce solo lo numeros de tu DNI y te dire su letra");
                num1 = teclado.nextInt();

                main.act11(num1);
                break;

            case 28:

                for (int i = 1; i <= 3; i++) {


                    System.out.println("Introduce el tipo de vehiculo para el " + i + " vehiculo");
                    tipo = teclado.nextLine();
                    System.out.println("Introduce la marca del vehiculo para el " + i + " vehiculo");
                    marca = teclado.nextLine();
                    System.out.println("Introduce el modelo de vehiculo para el " + i + " vehiculo");
                    modelo = teclado.nextLine();

                    Vehiculo nuevoVehiculo = new Vehiculo(tipo,marca,modelo);

                    listaVehiculos.add(nuevoVehiculo);

                }

                main.act28(listaVehiculos);

                break;

            case 29:


               while (num == 0) {

                   num1 = 1;

                    System.out.println("Introduce el tipo de vehiculo para el " + num1 + " vehiculo");
                    tipo = teclado.nextLine();
                    System.out.println("Introduce la marca del vehiculo para el " + num1 + " vehiculo");
                    marca = teclado.nextLine();
                    System.out.println("Introduce el modelo de vehiculo para el " + num1 + " vehiculo");
                    modelo = teclado.nextLine();

                    Vehiculo nuevoVehiculo = new Vehiculo(tipo,marca,modelo);

                    listaVehiculos.add(nuevoVehiculo);


                   System.out.println("Introduce 0 si quieres introducir un vehiculo o 1 si quieres salir");
                   num = teclado.nextInt();
                   teclado.nextLine();
                    num1++;
                }

                main.act29(listaVehiculos);

                break;

            case 30:

            System.out.println("Para crear y ejecutar un .jar hay que hacer lo siguiente... Primero que todo si teneos alguna otra clase" +
                    "aparte del Main la cual este en otro paquete debemos importarla al main atraves del codigo <<import com.dam.rafa." +
                    "Vehiculo;>> donde com.dam.rafa es el paquete y Vehiulo el nombre de la clase. Depsues debemos abrir la line de " +
                    "comandos y ejecutar la siguiente el siguiente comando: javac((ruta hasta el paquete))*.java ejemplo : (( javac C:\\Users\\sanpa" +
                    "\\Desktop\\Dam2\\ProgramacioServeris\\UD1\\ActividadesT1PS\\src\\com\\dam\\rafa\\*.java)), creamos un archivo.txt llamado" +
                    "manifest.txt el cual añadimos este texto:  Main-Class: com.dam.rafa.Main      posteriormente abrimos la cmd y escribimos " +
                    "jar cvfm MiPrograma.jar Manifest.txt com/dam/rafa/Main.class com/dam/rafa/Vehiculo.class y finalemnte para ejecutar el comando" +
                    "        java -jar MiPrograma.jar");

                break;

        }

    }

    public  void act1 () {

        System.out.println("2 +2 = " + 2 + 2);

    }

    public  void act2 (String nombre) {

        System.out.println("Hola " + nombre);

    }

    public  void act3 (int num1, int num2) {

        int resultado = 0;

        resultado = num1 + num2;
        System.out.println("El resultado de la suama  de estos dos numeros enteros es: " + resultado);

    }

    public  void act4 (int num1, int num2) {

        int mayor = 0;

        if (num1 > num2) {

            System.out.println("El numero mayor es : " + num1);

        } else if (num2 > num1) {

            System.out.println("El numero mayor es : " + num2);

        } else {

            System.out.println("Los numeros son iguales");


        }

    }

    public  Boolean  act5 (int num1, int num2) {

        Boolean iguales = false;

       if (num1 == num2){

           iguales = true;

       }

        return iguales;
    }

    public  void act6 ( ArrayList<Integer> listaNumeros) {

      for (Integer i : listaNumeros) {

          System.out.println(i);

      }

    }

    public  void act7 ( ArrayList<Integer> listaNumeros) {

        for (Integer i : listaNumeros) {

            System.out.println(i);

        }

    }

    public  void act8 (int num1) {

            if (num1 == 1) {

                System.out.println("Enero");

            }
            if (num1 == 2) {

                System.out.println("Febrero");

            }
            if (num1 == 3) {

                System.out.println("Marzo");

            }
            if (num1 == 4) {

                System.out.println("Abril");

            }
            if (num1 == 5) {

                System.out.println("Mayo");

            }
            if (num1 == 6) {

                System.out.println("Junio");

            }
            if (num1 == 7) {

                System.out.println("Julio");

            }
            if (num1 == 8) {

                System.out.println("Agosto");

            }
            if (num1 == 9) {

                System.out.println("Septiembre");

            }
            if (num1 == 10) {

                System.out.println("Octubre");

            }
            if (num1 == 11) {

                System.out.println("Noviembre");

            }
            if (num1 == 12) {

                System.out.println("Diciembre");

            }

    }

    public  void act9 (int num1) {

        switch (num1) {

            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;

        }

    }

    public  void act10 (int num1) {

        if (num1 > 1 && num1 <= 12) {

            if (num1 == 1) {

                System.out.println("Enero");

            }
            if (num1 == 2) {

                System.out.println("Febrero");

            }
            if (num1 == 3) {

                System.out.println("Marzo");

            }
            if (num1 == 4) {

                System.out.println("Abril");

            }
            if (num1 == 5) {

                System.out.println("Mayo");

            }
            if (num1 == 6) {

                System.out.println("Junio");

            }
            if (num1 == 7) {

                System.out.println("Julio");

            }
            if (num1 == 8) {

                System.out.println("Agosto");

            }
            if (num1 == 9) {

                System.out.println("Septiembre");

            }
            if (num1 == 10) {

                System.out.println("Octubre");

            }
            if (num1 == 11) {

                System.out.println("Noviembre");

            }
            if (num1 == 12) {

                System.out.println("Diciembre");

            }

        } else {

            System.out.println("Recuerda que debe ser un numero entero entre el 1 y el 12");

        }

    }

    public  void act11 (int num1) {

        int resto = 0;

        resto = num1 % 23;

        System.out.println("El numero del DNI " + num1 + " es: ");

        switch (resto) {

            case 0:
                System.out.println("T");
                break;
            case 1:
                System.out.println("r");
                break;
            case 2:
                System.out.println("W");
                break;
            case 3:
                System.out.println("A");
                break;
            case 4:
                System.out.println("G");
                break;
            case 5:
                System.out.println("M");
                break;
            case 6:
                System.out.println("Y");
                break;
            case 7:
                System.out.println("F");
                break;
            case 8:
                System.out.println("P");
                break;
            case 9:
                System.out.println("D");
                break;
            case 10:
                System.out.println("X");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("N");
                break;
            case 13:
                System.out.println("J");
                break;
            case 14:
                System.out.println("Z");
                break;
            case 15:
                System.out.println("S");
                break;
            case 16:
                System.out.println("Q");
                break;
            case 17:
                System.out.println("V");
                break;
            case 18:
                System.out.println("H");
                break;
            case 19:
                System.out.println("L");
                break;
            case 20:
                System.out.println("C");
                break;
            case 21:
                System.out.println("K");
                break;
            case 22:
                System.out.println("E");
                break;

        }

    }

    public  void act12 (Double[] arrayNotas) {

        int sus = 0;
        int apr = 0;
        int not = 0;
        int sob = 0;
        int matr = 0;
        Double[] array = arrayNotas;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 5) {
                System.out.println("Estas suspendido");
                sus++;
            } else if (array[i] >= 5 && array[i] < 7) {
                System.out.println("Estas apobado");
                apr++;
            } else if (array[i] >= 7 && array[i] < 9) {
                System.out.println("Tu nota es notable");
                not++;

            } else if (array[i] >= 9) {
                System.out.println("Tu nota es sobresaliente");
                sob++;

            } else if (array[i] > 10) {
                System.out.println("Tu nota es matricula");
                matr++;

            }
        }

        System.out.println("");


    }

    public  void act13 (double grados) {

        double gradosC = grados;
        double gradosF = (gradosC*9/5) + 32;

        System.out.println(gradosC + "grados centigrados son " + gradosF + "Fahrenheit");

    }

    public  void act14 (double radio) {

        double diametro = 2 * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El diametro es " + diametro);
        System.out.println("El area es " + area);

    }

    public  void act15 (double radio) {

        double diametro = 2 * radio;
        double area = Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen es " + volumen);

    }

    public  void act16 (String fecha ) {

        int suma = 0;

        for (char c : fecha.toCharArray()) {
            suma += Character.getNumericValue(c);
        }

        while (suma > 9) {
            int temp = 0;
            while (suma > 0) {
                temp += suma % 10;
                suma /= 10;
            }
            suma = temp;
        }

    System.out.println("Tu numero de la suete es: " + suma);
    }


    public  void  act17 (String contrasena) {

        if (contrasena.length() < 5) {

            for (char c : contrasena.toCharArray()) {
                if (Character.isDigit(c)) {
                    if (Character.isUpperCase(c)) {
                        System.out.println("");
                    }    else System.out.println("No cumple las normas");
                }else System.out.println("No cumple las normas");

            }
        } else System.out.println("No cumple las normas");
    }

    public  void act18 (String contrasena, String contrasena2) {

        if (contrasena.length() < 5) {

            for (char c : contrasena.toCharArray()) {
                if (Character.isDigit(c)) {
                    if (Character.isUpperCase(c)) {
                        if (contrasena.equals(contrasena2)) {
                        }     else System.out.println("Las contraseñas no son iguales");
                    }    else System.out.println("No cumple las normas");
                }else System.out.println("No cumple las normas");

            }
        } else System.out.println("No cumple las normas");

    }

    public  void act19 () {

        for (int i = 0; i <= 127; i++) {
            System.out.printf("%-10d%-10c%n", i, (char) i);
        }

    }

    public  void act20 () {

        for (int i = 0; i <= 255; i++) {
            System.out.printf("%-10d%-10c%n", i, (char) i);
        }

    }



    public  void act28 (ArrayList<Vehiculo> listaVehiculos) {

        ArrayList<Vehiculo> alVehiculos = listaVehiculos;

        for (Vehiculo v: alVehiculos) {

            System.out.println(v.toString());

        }

    }

    public  void act29 (ArrayList<Vehiculo> listaVehiculos) {

        ArrayList<Vehiculo> alVehiculos = listaVehiculos;

        for (Vehiculo v: alVehiculos) {

            System.out.println(v.toString());

        }

    }

}