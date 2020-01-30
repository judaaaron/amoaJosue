package personalmio;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PersonalMio {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList gerente = new ArrayList();
        ArrayList aseadores = new ArrayList();
        ArrayList cajeros = new ArrayList();
        ArrayList seguridad = new ArrayList();

        char resp = 's';

        while (resp == 's' || resp == 'S') {

            System.out.println(" 1. Registro de empleados");
            System.out.println(" 2. Despedir empleados");
            System.out.println(" 3. Ascender cajero");
            System.out.println(" 4. Listar empleados ");
            System.out.println(" 5 Modificar empleados");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    String nombre,
                     apellido;
                    int edad;
                    char genero;
                    double altura,
                     peso;
                    String titulo,
                     cargo;
                    System.out.println("         Bienvenido, Por favor registre empleado en los siguientes campos");
                    System.out.print(" Ingrese nombre: ");
                    nombre = leer.next();
                    System.out.print(" Ingrese apellido: ");
                    apellido = leer.next();
                    System.out.print(" Ingrese edad: ");
                    edad = leer.nextInt();
                    System.out.print(" Ingrese genero: [M/F]: ");
                    genero = leer.next().charAt(0);
                    System.out.print(" Ingrese altura: ");
                    altura = leer.nextDouble();
                    System.out.print(" Ingrese peso: ");
                    peso = leer.nextDouble();
                    System.out.print(" Ingrese titulo: ");
                    titulo = leer.next();
                    System.out.println(" Ingrese cargo: ");
                    System.out.println(" a. Gerente");
                    System.out.println(" b. Aseador");
                    System.out.println(" c. Cajeros");
                    System.out.println(" d. Seguridad");
                    cargo = leer.next();
                    switch (cargo) {
                        case "a":

                            gerente.add(new Empleados(nombre, apellido, edad, genero, altura, peso, titulo, cargo));
                            System.out.println(" Ha sido registrado como gerente con exito");
                            System.out.println();
                            break;

                        case "b":
                            aseadores.add(new Empleados(nombre, apellido, edad, genero, altura, peso, titulo, cargo));

                            break;

                        case "c":
                            cajeros.add(new Empleados(nombre, apellido, edad, genero, altura, peso, titulo, cargo));

                            break;

                        case "d":
                            seguridad.add(new Empleados(nombre, apellido, edad, genero, altura, peso, titulo, cargo));

                            break;
                        default:

                            System.out.println(" Opcion incorrecta");
                            System.out.println("");
                    }
                    break;

                case 2:
                    System.out.println(" Ingrese lista donde desea despedir empleado");
                    System.out.println(" 1. Gerente");
                    System.out.println(" 2. Aseador");
                    System.out.println(" 3. Cajeros");
                    System.out.println(" 4. Seguridad");
                    int listt = leer.nextInt();
                    switch (listt) {
                        case 1:
                            String salida = "";
                            if (gerente.isEmpty()) {
                                System.out.println(" No hay gerentes en la lista por el momento");
                                System.out.println();
                                break;

                            } else {
                                System.out.println("       Listado de gerentes");
                                for (Object o : gerente) {
                                    if (o instanceof Empleados) {
                                        salida += " [" + gerente.indexOf(o) + "] " + o + "\n";
                                        System.out.println(salida);

                                    }

                                }

                            }
                            int posicion;
                            System.out.print(" Ingrese posicion para despedir empleado: ");
                            posicion = leer.nextInt();
                            gerente.remove(posicion);
                            System.out.println(" Gerente despedido ");
                            System.out.println();

                            break;
                        default:
                            System.out.println(" Opcion incorrecta");
                    }

                    break;

                case 3:
                    if (gerente.size() < 3) {
                        System.out.println("ingrese posicion para ascender ");
                        int pos = leer.nextInt();
                        ((Empleados) cajeros.get(pos)).setCargo("gerente");
                        gerente.add(cajeros.get(pos));
                        System.out.println(" Ascenso con exito");
                        cajeros.remove(pos);

                    } else {
                        System.out.println(" vacantes llenas");
                    }

                    break;

                case 4:
                    System.out.println(" Ingrese la lista que desea visualizar: ");
                    System.out.println(" 1. Gerente");
                    System.out.println(" 2. Aseador");
                    System.out.println(" 3. Cajeros");
                    System.out.println(" 4. Seguridad");
                    int listas = leer.nextInt();
                    switch (listas) {
                        case 1:
                            String salida = "";
                            if (gerente.isEmpty()) {
                                System.out.println(" No hay gerentes en la lista por el momento");
                                System.out.println();
                                break;

                            } else {
                                System.out.println("       Listado de gerentes");
                                for (Object o : gerente) {
                                    if (o instanceof Empleados) {
                                        salida += " [" + gerente.indexOf(o) + "] " + o + "\n";

                                    }

                                }
                                System.out.println(salida);

                            }

                            break;

                        case 2:

                            break;

                        case 3:
                            String salidas = "";
                            if (cajeros.isEmpty()) {
                                System.out.println(" No hay cajeros en la lista por el momento");
                                System.out.println();
                                break;

                            } else {
                                System.out.println("       Listado de cajeros");
                                for (Object o : cajeros) {
                                    if (o instanceof Empleados) {
                                        salidas += " [" + cajeros.indexOf(o) + "] " + o + "\n";
                                        System.out.println(salidas);

                                    }

                                }

                            }

                            break;
                        default:
                            System.out.println(" Opcion incorrecta");
                            System.out.println("");
                    }
                    break;

                case 5:
                    System.out.println(" Ingrese lista que desea modificar: ");
                    System.out.println(" 1. Gerente");
                    System.out.println(" 2. Aseador");
                    System.out.println(" 3. Cajeros");
                    System.out.println(" 4. Seguridad");
                    int modi = leer.nextInt();
                    switch (modi) {
                        case 1:
                            String salida = "";
                            System.out.println("       Listado de gerentes");
                            for (Object o : gerente) {
                                if (o instanceof Empleados) {
                                    salida += " [" + gerente.indexOf(o) + "] " + o + "\n";
                                    System.out.println(salida);

                                }

                            }
                            System.out.println(" Ingrese opcion para modificar: ");
                            System.out.println(" 1. Nombre");
                            System.out.println(" 2. apellido");
                            System.out.println(" 3. edad");
                            System.out.println(" 4. genero");
                            System.out.println(" 5. altura");
                            System.out.println(" 6. peso");
                            System.out.println(" 7. titulo");
                            System.out.println(" 8. cargo");
                            int opciones = leer.nextInt();
                            switch (opciones) {
                                case 1:
                                    System.out.println(" Opcion: Modificar Nombre");
                                    int posicion;
                                    String newNombre;
                                    System.out.print(" Ingrese posicion donde desea modificar: ");
                                    posicion = leer.nextInt();

                                    if (gerente.get(posicion) instanceof Empleados) {
                                        System.out.print(" Ingrese nuevo nombre: ");
                                        newNombre = leer.next();
                                        System.out.println();
                                        ((Empleados) gerente.get(posicion)).setNombre(newNombre);
                                        System.out.println(" Nombre ha sido modificado con exito");
                                        System.out.println("");

                                    } else {
                                        System.out.println(" Error al modificar ");
                                    }

                                    break;
                                default:
                                    System.out.println(" error al modificar");
                            }

                            break;
                        default:
                            throw new AssertionError();
                    }

                    break;

                default:
                    System.out.println(" opcion incorrecta");
                    System.out.println();
            }
            
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }

    }
}
