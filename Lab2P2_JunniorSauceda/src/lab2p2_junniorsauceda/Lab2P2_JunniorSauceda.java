/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_junniorsauceda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Junnior Sauceda
 */
public class Lab2P2_JunniorSauceda {

    static private int chefm, chefn, mesm, mesn, barm, barn, Mesas;
    static ArrayList<Chef> chefs = new ArrayList<>();
    static ArrayList<Mesero> meseros = new ArrayList<>();
    static ArrayList<Bartender> bartenders = new ArrayList<>();
    static ArrayList<Mesa> mesas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;
        boolean gerente = false;
        String usuario = "gerente";
        String contraseña = "g3r$nt0";
        do {
            do {
                System.out.println("""
                                  MENU
                               1.- Iniciar Sesion
                               2.- Salir
                               """);
                String Opcion = sc.nextLine();
                while (num(Opcion)) {
                    System.out.println("""
                                       Solo debe ingresar Numeros
                                          MENU
                                   1.- Iniciar Sesion
                                   2.- Salir
                                   """);
                    Opcion = sc.nextLine();
                }
                int opcion = 0;
                opcion = Integer.parseInt(Opcion);
                if (opcion == 1) {
                    System.out.print("Ingrese el nombre de usuario: ");
                    String Usuario = sc.nextLine();
                    System.out.println("");
                    System.out.print("Ingrese su contraseña: ");
                    String Contra = sc.nextLine();
                    System.out.println("");
                    if (Usuario.equals(usuario) && Contra.equals(contraseña)) {
                        gerente = true;
                    } else {
                        System.out.println("Usuario o contraseña incorrectas");
                        gerente=false;
                    }

                } else if (opcion == 2) {
                    gerente = true;
                    seguir = false;
                }
                else{
                    gerente=false;
                }
            } while (gerente == false);
            while (seguir) {
                System.out.println("""
                                      MENU
                                   1.- Chefs
                                   2.- Meseros
                                   3.- Bartenders
                                   4.- Mesas
                                   5.- Salir
                                   """);
                String Opcion = sc.nextLine();
                while (num(Opcion)) {
                    System.out.println("""
                                       Solo debe ingresar Numeros
                                           MENU
                                        1.- Chefs
                                        2.- Meseros
                                        3.- Bartenders
                                        4.- Mesas
                                        5.- Salir
                                   """);
                    Opcion = sc.nextLine();
                }
                int opcion = 0;
                opcion = Integer.parseInt(Opcion);
                while (opcion < 0 || opcion > 5) {
                    System.out.println("""
                                         Ingrese una Opcion VALIDA
                                          MENU
                                       1.- Chefs
                                       2.- Meseros
                                       3.- Bartenders
                                       4.- Mesas
                                       5.- Salir
                                       """);
                    Opcion = sc.nextLine();
                    while (num(Opcion)) {
                        System.out.println("""
                                           Solo debe ingresar Numeros
                                               MENU
                                            1.- Chefs
                                            2.- Meseros
                                            3.- Bartenders
                                            4.- Mesas
                                            5.- Salir
                                       """);
                        Opcion = sc.nextLine();
                    }
                    opcion = 0;
                    opcion = Integer.parseInt(Opcion);
                }
                switch (opcion) {
                    case 1: {
                        boolean submenu = true;
                        while (submenu) {
                            System.out.println("""
                                        MENU
                                     1.- Agregar chefs
                                     2.- Modoficar chefs
                                     3.- Listar chefs
                                     4.- Eliminar chefs
                                     5.- Salir
                                     """);
                            String Option = sc.nextLine();
                            while (num(Option)) {
                                System.out.println("""
                                                 Solo debe ingresar Numeros
                                                     MENU
                                                1.- Agregar chefs
                                                2.- Modoficar chefs
                                                3.- Listar chefs
                                                4.- Eliminar chefs
                                                5.- Salir
                                             """);
                                Option = sc.nextLine();
                            }
                            int option = 0;
                            option = Integer.parseInt(Option);
                            while (option < 0 || option > 5) {
                                System.out.println("""
                                                 Ingrese una opcion VALIDA
                                                     MENU
                                                1.- Agregar chefs
                                                2.- Modoficar chefs
                                                3.- Listar chefs
                                                4.- Eliminar chefs
                                                5.- Salir
                                             """);
                                Option = sc.nextLine();
                                while (num(Option)) {
                                    System.out.println("""
                                                 Solo debe ingresar Numeros
                                                     MENU
                                                1.- Agregar chefs
                                                2.- Modoficar chefs
                                                3.- Listar chefs
                                                4.- Eliminar chefs
                                                5.- Salir
                                             """);
                                    Option = sc.nextLine();
                                }
                                option = 0;
                                option = Integer.parseInt(Option);
                            }
                            switch (option) {
                                case 1: {
                                    addChef();
                                }
                                break;
                                case 2: {
                                    if (chefs.isEmpty()) {
                                        System.out.println("No hay chefs");
                                    } else {
                                        listarChefs();

                                        System.out.println("Ingrese el indice del chef que desea modificar");
                                        String Index = sc.nextLine();
                                        while (num(Index)) {
                                            System.out.println("Ingrese el indice del chef que desea modificar");
                                            Index = sc.nextLine();
                                        }
                                        int in = 0;
                                        in = Integer.parseInt(Index);
                                        while (in < 1 || in > chefs.size()) {
                                            System.out.println("Ingrese el indice del chef que desea modificar");
                                            Index = sc.nextLine();
                                            while (num(Index)) {
                                                System.out.println("Solo debe ingresar Numeros\nIngrese el indice del chef que desea modificar");
                                                Index = sc.nextLine();
                                            }
                                            in = 0;
                                            in = Integer.parseInt(Index);
                                        }
                                        modChef(in-1);
                                    }
                                }
                                break;
                                case 3: {
                                    if (chefs.isEmpty()) {
                                        System.out.println("No hay chefs");
                                    } else {
                                        listarChefs();
                                    }
                                }
                                break;
                                case 4: {
                                    if (chefs.isEmpty()) {
                                        System.out.println("No hay chefs");
                                    } else {
                                        listarChefs();
                                        System.out.println("Ingrese el indice del chef que desea eliminar");
                                        String Index = sc.nextLine();
                                        while (num(Index)) {
                                            System.out.println("Ingrese el indice del chef que desea eliminar");
                                            Index = sc.nextLine();
                                        }
                                        int in = 0;
                                        in = Integer.parseInt(Index);
                                        while (in < 1 || in > chefs.size()) {
                                            System.out.println("Ingrese el indice del chef que desea eliminar");
                                            Index = sc.nextLine();
                                            while (num(Index)) {
                                                System.out.println("Solo debe ingresar Numeros"
                                                        + "\nIngrese el indice del chef que desea eliminar");
                                                Index = sc.nextLine();
                                            }
                                            in = 0;
                                            in = Integer.parseInt(Index);
                                        }
                                        chefs.remove(in - 1);
                                    }

                                }
                                break;
                                case 5: {
                                    submenu = false;
                                }
                                break;
                            }
                        }
                    }
                    break;
                    case 2: {
                        boolean submenu = true;
                        while (submenu) {
                            System.out.println("""
                                                     MENU
                                                1.- Agregar Mesero
                                                2.- Modoficar Mesero
                                                3.- Listar Meseros
                                                4.- Eliminar Mesero
                                                5.- Salir
                                             """);
                            String Option = sc.nextLine();
                            while (num(Option)) {
                                System.out.println("""
                                                 Solo debe ingresar numeros
                                                     MENU
                                                1.- Agregar Mesero
                                                2.- Modoficar Mesero
                                                3.- Listar Meseros
                                                4.- Eliminar Mesero
                                                5.- Salir
                                             """);
                                Option = sc.nextLine();
                            }
                            int option = 0;
                            option = Integer.parseInt(Option);
                            while (option < 0 || option > 5) {
                                System.out.println("""
                                                 Ingrese una opcion VALIDA
                                                     MENU
                                                1.- Agregar Mesero
                                                2.- Modoficar Mesero
                                                3.- Listar Meseros
                                                4.- Eliminar Mesero
                                                5.- Salir
                                             """);
                                Option = sc.nextLine();
                                while (num(Option)) {
                                    System.out.println("""
                                                 Solo debe ingresar Numeros
                                                     MENU
                                                1.- Agregar Mesero
                                                2.- Modoficar Mesero
                                                3.- Listar Meseros
                                                4.- Eliminar Mesero
                                                5.- Salir
                                             """);
                                    Option = sc.nextLine();
                                }
                                option = 0;
                                option = Integer.parseInt(Option);
                            }
                            switch (option) {
                                case 1: {
                                    addMesero();
                                }
                                break;
                                case 2: {
                                    if (meseros.isEmpty()) {
                                        System.out.println("No hay meseros");
                                    } else {
                                        listarMeseros();
                                        System.out.println("Ingrese el indice del Mesero que desea modificar");
                                        String Index = sc.nextLine();
                                        while (num(Index)) {
                                            System.out.println("Ingrese el indice del Mesero que desea modificar");
                                            Index = sc.nextLine();
                                        }
                                        int in = 0;
                                        in = Integer.parseInt(Index);
                                        while (in < 1 || in > meseros.size()) {
                                            System.out.println("Ingrese el indice del Mesero que desea modificar");
                                            Index = sc.nextLine();
                                            while (num(Index)) {
                                                System.out.println("Solo debe ingresar Numeros"
                                                        + "\nIngrese el indice del Mesero que desea modificar");
                                                Index = sc.nextLine();
                                            }
                                            in = 0;
                                            in = Integer.parseInt(Index);
                                        }
                                        modMesero(in-1);
                                    }
                                }
                                break;
                                case 3: {
                                    if (meseros.isEmpty()) {
                                        System.out.println("No hay meseros");
                                    } else {
                                        listarMeseros();
                                    }
                                }
                                break;
                                case 4: {
                                    if (meseros.isEmpty()) {
                                        System.out.println("No hay meseros");
                                    } else {
                                        listarMeseros();
                                        System.out.println("Ingrese el indice del mesero que desea eliminar");
                                        String Index = sc.nextLine();
                                        while (num(Index)) {
                                            System.out.println("Ingrese el indice del mesero que desea eliminar");
                                            Index = sc.nextLine();
                                        }
                                        int in = 0;
                                        in = Integer.parseInt(Index);
                                        while (in < 1 || in > meseros.size()) {
                                            System.out.println("Ingrese el indice del mesero que desea eliminar");
                                            Index = sc.nextLine();
                                            while (num(Index)) {
                                                System.out.println("Solo debe ingresar Numeros"
                                                        + "\nIngrese el indice del mesero que desea eliminar");
                                                Index = sc.nextLine();
                                            }
                                            in = 0;
                                            in = Integer.parseInt(Index);
                                        }
                                        meseros.remove(in - 1);
                                    }
                                }
                                break;
                                case 5: {
                                    submenu = false;
                                }
                                break;
                            }
                        }
                    }
                    break;
                    case 3: {
                        boolean submenu = true;
                        while (submenu) {
                            System.out.println("""
                                                     MENU
                                                1.- Agregar Bartender
                                                2.- Modoficar Bartender
                                                3.- Listar Bartenders
                                                4.- Eliminar Bartender
                                                5.- Salir
                                             """);
                            String Option = sc.nextLine();
                            while (num(Option)) {
                                System.out.println("""
                                                 Solo debe ingresar Numeros
                                                     MENU
                                                1.- Agregar Bartender
                                                2.- Modoficar Bartender
                                                3.- Listar Bartenders
                                                4.- Eliminar Bartender
                                                5.- Salir
                                             """);
                                Opcion = sc.nextLine();
                            }
                            int option = 0;
                            option = Integer.parseInt(Option);
                            while (option < 0 || option > 5) {
                                System.out.println("""
                                                 Ingrese una Opcion VALIDA
                                                     MENU
                                                1.- Agregar Bartender
                                                2.- Modoficar Bartender
                                                3.- Listar Bartenders
                                                4.- Eliminar Bartender
                                                5.- Salir
                                             """);
                                Option = sc.nextLine();
                                while (num(Option)) {
                                    System.out.println("""
                                                 Solo debe ingresar Numeros
                                                     MENU
                                                1.- Agregar Bartender
                                                2.- Modoficar Bartender
                                                3.- Listar Bartenders
                                                4.- Eliminar Bartender
                                                5.- Salir
                                             """);
                                    Option = sc.nextLine();
                                }
                                option = 0;
                                option = Integer.parseInt(Option);
                            }
                            switch (option) {
                                case 1: {
                                    addBartender();
                                }
                                break;
                                case 2: {
                                    if (bartenders.isEmpty()) {
                                        System.out.println("No hay bartenders");
                                    } else {
                                        listarBartenders();
                                        System.out.println("Ingrese el indice del Bartender que desea modificar");
                                        String Index = sc.nextLine();
                                        while (num(Index)) {
                                            System.out.println("Ingrese el indice del Bartender que desea modificar");
                                            Index = sc.nextLine();
                                        }
                                        int in = 0;
                                        in = Integer.parseInt(Index);
                                        while (in < 1 || in > bartenders.size()) {
                                            System.out.println("Ingrese el indice del Bartender que desea modificar");
                                            Index = sc.nextLine();
                                            while (num(Index)) {
                                                System.out.println("Solo debe ingresar Numeros"
                                                        + "\nIngrese el indice del Bartender que desea modificar");
                                                Index = sc.nextLine();
                                            }
                                            in = 0;
                                            in = Integer.parseInt(Index);
                                        }
                                        modBartender(in-1);
                                    }
                                }
                                break;
                                case 3: {
                                    if (bartenders.isEmpty()) {
                                        System.out.println("No hay Bartenders");
                                    } else {
                                        listarBartenders();
                                    }
                                }
                                break;
                                case 4: {
                                    if (bartenders.isEmpty()) {
                                        System.out.println("No hay bartenders");
                                    } else {
                                        listarBartenders();
                                        System.out.println("Ingrese el indice del bartender que desea eliminar");
                                        String Index = sc.nextLine();
                                        while (num(Index)) {
                                            System.out.println("Ingrese el indice del bartender que desea eliminar");
                                            Index = sc.nextLine();
                                        }
                                        int in = 0;
                                        in = Integer.parseInt(Index);
                                        while (in < 1 || in > bartenders.size()) {
                                            System.out.println("Ingrese el indice del bartenders que desea eliminar");
                                            Index = sc.nextLine();
                                            while (num(Index)) {
                                                System.out.println("Solo debe ingresar Numeros"
                                                        + "\nIngrese el indice del bartender que desea eliminar");
                                                Index = sc.nextLine();
                                            }
                                            in = 0;
                                            in = Integer.parseInt(Index);
                                        }
                                        bartenders.remove(in - 1);
                                    }
                                }
                                break;
                                case 5: {
                                    submenu = false;
                                }
                                break;
                            }
                        }
                    }
                    break;
                    case 4: {
                        boolean submenu = true;
                        while (submenu) {
                            System.out.println("""
                                                     MENU
                                                1.- Agregar mesa
                                                2.- Modoficar mesa
                                                3.- Listar mesas
                                                4.- Eliminar mesa
                                                5.- Precio total de las mesas
                                                6.- Salir
                                             """);
                            String Option = sc.nextLine();
                            while (num(Option)) {
                                System.out.println("""
                                                 Solo debe ingresar Numeros
                                                     MENU
                                                1.- Agregar mesa
                                                2.- Modoficar mesa
                                                3.- Listar mesas
                                                4.- Eliminar mesa
                                                5.- Precio total de las mesas
                                                6.- Salir
                                             """);
                                Opcion = sc.nextLine();
                            }
                            int option = 0;
                            option = Integer.parseInt(Option);
                            while (option < 0 || option > 6) {
                                System.out.println("""
                                                 Ingrese una opcion VALIDA
                                                     MENU
                                                1.- Agregar mesa
                                                2.- Modoficar mesa
                                                3.- Listar mesas
                                                4.- Eliminar mesa
                                                5.- Precio total de las mesas
                                                6.- Salir
                                             """);
                                Option = sc.nextLine();
                                while (num(Option)) {
                                    System.out.println("""
                                                 Solo debe ingresar Numeros
                                                     MENU
                                                1.- Agregar mesa
                                                2.- Modoficar mesa
                                                3.- Listar mesas
                                                4.- Eliminar mesa
                                                5.- Precio total de las mesas
                                                6.- Salir
                                             """);
                                    Option = sc.nextLine();
                                }
                                option = 0;
                                option = Integer.parseInt(Option);
                            }
                            switch (option) {
                                case 1: {
                                    addMesa();
                                }
                                break;
                                case 2: {
                                    if (mesas.isEmpty()) {
                                        System.out.println("No hay mesas");
                                    } else {
                                        listarMesas();
                                        System.out.println("Ingrese el indice de la mesa que desea modificar");
                                        String Index = sc.nextLine();
                                        while (num(Index)) {
                                            System.out.println("Ingrese el indice de la mesa que desea modificar");
                                            Index = sc.nextLine();
                                        }
                                        int in = 0;
                                        in = Integer.parseInt(Index);
                                        while (in < 1 || in > mesas.size()) {
                                            System.out.println("Ingrese el indice de la mesa que desea modificar");
                                            Index = sc.nextLine();
                                            while (num(Index)) {
                                                System.out.println("Solo debe ingresar Numeros"
                                                        + "\nIngrese el indice de la mesa que desea modificar");
                                                Index = sc.nextLine();
                                            }
                                            in = 0;
                                            in = Integer.parseInt(Index);
                                        }
                                        modMesa(in-1);
                                        
                                    }
                                }
                                break;
                                case 3: {
                                    if (mesas.isEmpty()) {
                                        System.out.println("No hay mesas");
                                    } else {
                                        listarMesas();
                                    }
                                }
                                break;
                                case 4: {
                                    if (mesas.isEmpty()) {
                                        System.out.println("No hay mesas");
                                    } else {
                                        listarMesas();
                                        System.out.println("Ingrese el indice de la mesa que desea eliminar");
                                        String Index = sc.nextLine();
                                        while (num(Index)) {
                                            System.out.println("Ingrese el indice de la mesa que desea eliminar");
                                            Index = sc.nextLine();
                                        }
                                        int in = 0;
                                        in = Integer.parseInt(Index);
                                        while (in < 1 || in > mesas.size() ) {
                                            System.out.println("Ingrese el indice de la mesa que desea eliminar");
                                            Index = sc.nextLine();
                                            while (num(Index)) {
                                                System.out.println("Solo debe ingresar Numeros"
                                                        + "\nIngrese el indice de la mesa que desea eliminar");
                                                Index = sc.nextLine();
                                            }
                                            in = 0;
                                            in = Integer.parseInt(Index);
                                        }
                                        mesas.remove(in-1);
                                    }
                                }
                                break;
                                case 5: {
                                    mesasFinal();
                                }
                                break;
                                case 6:{
                                    submenu=false;
                                }
                                break;
                            }
                        }
                    }
                    break;
                    case 5: {
                        seguir = false;
                    }
                    break;
                }
            }
        } while (seguir);
        // TODO code application logic here
    }

    public static void listarChefs() {
        for (Chef chef : chefs) {
            System.out.println((chefs.indexOf(chef) + 1) + "- " + chef);
        }
    }

    public static void listarMeseros() {
        for (Mesero chef : meseros) {
            System.out.println((meseros.indexOf(chef) + 1) + "- " + chef);
        }
    }

    public static void listarBartenders() {
        for (Bartender chef : bartenders) {
            System.out.println((bartenders.indexOf(chef) + 1) + "- " + chef);
        }
    }

    public static void listarMesas() {
        for (Mesa chef : mesas) {
            System.out.println((mesas.indexOf(chef) + 1) + "- " + chef);
        }
    }
     public static void mesasFinal() {
        double total=0;
        for (Mesa chef : mesas) {
           total+=chef.getPrecio();
        }
        System.out.println("El precio total de todas las mesas es: "+total);
    }

    public static boolean num(String Num) {
        boolean valido = false;
        int cha = 0;
        for (int x = 0; x < Num.length(); x++) {
            char carac = Num.charAt(x);
            int ascii = carac;
            if (x == 0) {
                if (carac < 48 || carac > 57) {

                    cha++;

                }

            } else {
                if (ascii < 48 || ascii > 57) {
                    cha++;
                }
            }

        }
        if (cha > 0) {
            valido = true;
        }
        return valido;
    }

    public static void addChef() {
        if (chefm + chefn <= 14) {
            System.out.println("Ingrese el nombre del chef");
            String nombre = sc.nextLine();
            while (nombre.equals("")) {
                System.out.println("Ingrese un nombre valido");
                nombre = sc.nextLine();
            }
            System.out.println("Ingrese la edad del chef: ");
            String Edad = sc.nextLine();

            while (num(Edad)) {
                System.out.println("Ingrese una edad valida");
                Edad = sc.nextLine();
            }
            int edad = 0;
            edad = Integer.parseInt(Edad);
            while (edad < 1) {
                System.out.println("Ingrese una edad valida");
                System.out.println("Ingrese la edad del chef: ");
                Edad = sc.nextLine();

                while (num(Edad)) {
                    System.out.println("Ingrese una edad valida");
                    Edad = sc.nextLine();
                }
                edad = 0;
                edad = Integer.parseInt(Edad);
            }
            boolean turnos = true;
            System.out.println("Ingrese el turno del chef [despertino/vespertino] : ");
            String turno = sc.nextLine();
            boolean jornada = false;
            if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                jornada = true;
            }
            while (jornada == false) {
                System.out.println("Ingrese una jornada valida");
                System.out.println("Ingrese el turno del chef [despertino/vespertino]: ");
                turno = sc.nextLine();
                jornada = false;
                if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                    jornada = true;
                }
            }

            if (turno.equalsIgnoreCase("despertino")) {
                if (chefm <= 7) {
                    chefm++;
                } else {
                    turnos = false;
                }
            }
            if (turno.equalsIgnoreCase("vespertino")) {
                if (chefn <= 7) {
                    chefn++;
                } else {
                    turnos = false;
                }
            }
            if (turnos) {
                System.out.println("Ingrese la cantidad de estrellas Michelin del chef: ");
                String Star = sc.nextLine();

                while (num(Star)) {
                    System.out.println("Ingrese una cantidad valida");
                    Star = sc.nextLine();
                }
                int star = 0;
                star = Integer.parseInt(Star);
                while (star < 1) {
                    System.out.println("Ingrese una cantidad de estrellas valida");
                    System.out.println("Ingrese las estrellas Michelin del chef: ");
                    Star = sc.nextLine();

                    while (num(Star)) {
                        System.out.println("Ingrese una cantidad valida");
                        Star = sc.nextLine();
                    }
                    star = 0;
                    star = Integer.parseInt(Star);
                }
                System.out.println("Ingrese el sueldo del chef: ");
                String Pay = sc.nextLine();

                while (sueldo(Pay)) {
                    System.out.println("Ingrese una cantidad valida");
                    Pay = sc.nextLine();
                }
                double pay = 0;
                pay = Double.parseDouble(Pay);
                while (pay < 1) {
                    System.out.println("Amigo acaso usted es Gitano? no sea rata");
                    System.out.println("Ingrese el sueldo del chef: ");
                    Pay = sc.nextLine();

                    while (sueldo(Pay)) {
                        System.out.println("Ingrese un sueldo valido");
                        Pay = sc.nextLine();
                    }
                    pay = 0;
                    pay = Double.parseDouble(Pay);
                }
                chefs.add(new Chef(nombre, edad, turno, star, pay));
            } else {
                System.out.println("El turno ya esta lleno");
            }

        } else {
            System.out.println("Los 2 turnos ya estan llenos");
        }
    }

    public static void addMesero() {
        if (mesm + mesn <= 8) {
            System.out.println("Ingrese el nombre del Mesero");
            String nombre = sc.nextLine();
            while (nombre.equals("")) {
                System.out.println("Ingrese un nombre valido");
                nombre = sc.nextLine();
            }
            System.out.println("Ingrese la edad del mesero: ");
            String Edad = sc.nextLine();

            while (num(Edad)) {
                System.out.println("Ingrese una edad valida");
                Edad = sc.nextLine();
            }
            int edad = 0;
            edad = Integer.parseInt(Edad);
            while (edad < 1) {
                System.out.println("Ingrese una edad valida");
                System.out.println("Ingrese la edad del Mesero: ");
                Edad = sc.nextLine();

                while (num(Edad)) {
                    System.out.println("Ingrese una edad valida");
                    Edad = sc.nextLine();
                }
                edad = 0;
                edad = Integer.parseInt(Edad);
            }
            boolean turnos = true;
            System.out.println("Ingrese el turno del Mesero [despertino/vespertino] : ");
            String turno = sc.nextLine();
            boolean jornada = false;
            if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                jornada = true;
            }
            while (jornada == false) {
                System.out.println("Ingrese una jornada valida");
                System.out.println("Ingrese el turno del Mesero [despertino/vespertino]: ");
                turno = sc.nextLine();
                jornada = false;
                if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                    jornada = true;
                }
            }

            if (turno.equalsIgnoreCase("despertino")) {
                if (mesm <= 4) {
                    mesm++;
                } else {
                    turnos = false;
                }
            }
            if (turno.equalsIgnoreCase("vespertino")) {
                if (mesn <= 4) {
                    mesn++;
                } else {
                    turnos = false;
                }
            }
            if (turnos) {
                System.out.println("Ingrese la propina del Mesero: ");
                String Star = sc.nextLine();

                while (sueldo(Star)) {
                    System.out.println("Ingrese una cantidad valida");
                    Star = sc.nextLine();
                }
                double star = 0;
                star = Double.parseDouble(Star);
                while (star < 1) {
                    System.out.println("Amigo acaso usted es Gitano? no sea rata");
                    System.out.println("Ingrese la propina del Mesero: ");
                    Star = sc.nextLine();

                    while (sueldo(Star)) {
                        System.out.println("Ingrese una propina valida");
                        Star = sc.nextLine();
                    }
                    star = 0;
                    star = Double.parseDouble(Star);
                }

                System.out.println("Ingrese el sueldo del Mesero: ");
                String Pay = sc.nextLine();

                while (sueldo(Pay)) {
                    System.out.println("Ingrese una cantidad valida");
                    Pay = sc.nextLine();
                }
                double pay = 0;
                pay = Double.parseDouble(Pay);
                while (pay < 1) {
                    System.out.println("Amigo acaso usted es Gitano? no sea rata");
                    System.out.println("Ingrese el sueldo del Mesero: ");
                    Pay = sc.nextLine();

                    while (sueldo(Pay)) {
                        System.out.println("Ingrese un sueldo valido");
                        Pay = sc.nextLine();
                    }
                    pay = 0;
                    pay = Double.parseDouble(Pay);
                }
                meseros.add(new Mesero(nombre, edad, turno, star, pay));
            } else {
                System.out.println("El turno ya esta lleno");
            }

        } else {
            System.out.println("Los 2 turnos ya estan llenos");
        }
    }

    public static void addBartender() {
        if (barm + barn <= 4) {
            System.out.println("Ingrese el nombre del Bartender");
            String nombre = sc.nextLine();
            while (nombre.equals("")) {
                System.out.println("Ingrese un nombre valido");
                nombre = sc.nextLine();
            }
            System.out.println("Ingrese la edad del Bartender: ");
            String Edad = sc.nextLine();

            while (num(Edad)) {
                System.out.println("Ingrese una edad valida");
                Edad = sc.nextLine();
            }
            int edad = 0;
            edad = Integer.parseInt(Edad);
            while (edad < 1) {
                System.out.println("Ingrese una edad valida");
                System.out.println("Ingrese la edad del Bartender: ");
                Edad = sc.nextLine();

                while (num(Edad)) {
                    System.out.println("Ingrese una edad valida");
                    Edad = sc.nextLine();
                }
                edad = 0;
                edad = Integer.parseInt(Edad);
            }
            boolean turnos = true;
            System.out.println("Ingrese el turno del Bartender [despertino/vespertino] : ");
            String turno = sc.nextLine();
            boolean jornada = false;
            if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                jornada = true;
            }
            while (jornada == false) {
                System.out.println("Ingrese una jornada valida");
                System.out.println("Ingrese el turno del Bartender [despertino/vespertino]: ");
                turno = sc.nextLine();
                jornada = false;
                if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                    jornada = true;
                }
            }

            if (turno.equalsIgnoreCase("despertino")) {
                if (barm <= 2) {
                    barm++;
                } else {
                    turnos = false;
                }
            }
            if (turno.equalsIgnoreCase("vespertino")) {
                if (barn <= 2) {
                    barn++;
                } else {
                    turnos = false;
                }
            }
            if (turnos) {

                System.out.println("Ingrese el sueldo del Mesero: ");
                String Pay = sc.nextLine();

                while (sueldo(Pay)) {
                    System.out.println("Ingrese una cantidad valida");
                    Pay = sc.nextLine();
                }
                double pay = 0;
                pay = Double.parseDouble(Pay);
                while (pay < 1) {
                    System.out.println("Amigo acaso usted es Gitano? no sea rata");
                    System.out.println("Ingrese el sueldo del Mesero: ");
                    Pay = sc.nextLine();

                    while (sueldo(Pay)) {
                        System.out.println("Ingrese un sueldo valido");
                        Pay = sc.nextLine();
                    }
                    pay = 0;
                    pay = Double.parseDouble(Pay);
                }

                System.out.println("Ingrese la cantidad de licores disponibles: ");
                String Star = sc.nextLine();

                while (num(Star)) {
                    System.out.println("Ingrese una cantidad valida");
                    Star = sc.nextLine();
                }
                int star = 0;
                star = Integer.parseInt(Star);
                while (star < 1) {
                    System.out.println("Ingrese una cantidad de licores valida");
                    System.out.println("Ingrese la cantidad de licores disponibles: ");
                    Star = sc.nextLine();

                    while (num(Star)) {
                        System.out.println("Ingrese una cantidad valida");
                        Star = sc.nextLine();
                    }
                    star = 0;
                    star = Integer.parseInt(Star);
                }
                bartenders.add(new Bartender(nombre, edad, turno, pay, star));
            }else{
                System.out.println("El turno ya esta lleno");
            }
        }
        else{
            System.out.println("Los 2 turnos ya estan llenos");
        }
    }

    public static void addMesa() {
        if (Mesas <= 10) {
            System.out.println("Ingrese la cantidad de platos en la mesa: ");
            String Platos = sc.nextLine();

            while (num(Platos)) {
                System.out.println("Ingrese una cantidad valida");
                Platos = sc.nextLine();
            }
            int platos = 0;
            platos = Integer.parseInt(Platos);
            while (platos < 1) {
                System.out.println("Ingrese una cantidad de platos valida");
                System.out.println("Ingrese el numero de platos que hay en la mesa: ");
                Platos = sc.nextLine();

                while (num(Platos)) {
                    System.out.println("Ingrese una cantidad valida");
                    Platos = sc.nextLine();
                }
                platos = 0;
                platos = Integer.parseInt(Platos);
            }

            System.out.println("Ingrese el numero de utensilios que hay en la mesa ");
            String Star = sc.nextLine();

            while (num(Star)) {
                System.out.println("Ingrese una cantidad valida");
                Star = sc.nextLine();
            }
            int star = 0;
            star = Integer.parseInt(Star);
            while (star < 1) {
                System.out.println("Ingrese una cantidad de utensilios valida");
                System.out.println("Ingrese los utensilios que hay en la mesa: ");
                Star = sc.nextLine();

                while (num(Star)) {
                    System.out.println("Ingrese una cantidad valida");
                    Star = sc.nextLine();
                }
                star = 0;
                star = Integer.parseInt(Star);
            }
            System.out.println("Ingrese el precio de la Mesa: ");
            String Pay = sc.nextLine();

            while (sueldo(Pay)) {
                System.out.println("Ingrese un precio valido");
                Pay = sc.nextLine();
            }
            double pay = 0;
            pay = Double.parseDouble(Pay);
            while (pay < 1) {
                System.out.println("Ingrese un precio valido");
                System.out.println("Ingrese el precio de la mesa: ");
                Pay = sc.nextLine();

                while (sueldo(Pay)) {
                    System.out.println("Ingrese un precio valido");
                    Pay = sc.nextLine();
                }
                pay = 0;
                pay = Double.parseDouble(Pay);
            }
            mesas.add(new Mesa(platos, star, pay));
        } else {
            System.out.println("Ya no se pueden ingresar mas mesas");
        }
    }

    public static boolean sueldo(String Num) {
        boolean valido = false;
        int cha = 0;
        int pnt=0;
        for (int x = 0; x < Num.length(); x++) {
            char carac = Num.charAt(x);
            int ascii = carac;
            
                if (ascii < 48 || ascii > 57) {
                    if (ascii == 46&&pnt<2) {
                        pnt++;
                    } 
                    else {
                        cha++;
                    }

                }
            

        }
        if (cha > 0) {
            valido = true;
        }
        return valido;
    }

    public static void modChef(int index) {

        System.out.println("Ingrese el nombre del chef");
        String nombre = sc.nextLine();
        while (nombre.equals("")) {
            System.out.println("Ingrese un nombre valido");
            nombre = sc.nextLine();
        }
        System.out.println("Ingrese la edad del chef: ");
        String Edad = sc.nextLine();

        while (num(Edad)) {
            System.out.println("Ingrese una edad valida");
            Edad = sc.nextLine();
        }
        int edad = 0;
        edad = Integer.parseInt(Edad);
        while (edad < 1) {
            System.out.println("Ingrese una edad valida");
            System.out.println("Ingrese la edad del chef: ");
            Edad = sc.nextLine();

            while (num(Edad)) {
                System.out.println("Ingrese una edad valida");
                Edad = sc.nextLine();
            }
            edad = 0;
            edad = Integer.parseInt(Edad);
        }
        boolean turnos = true;
        System.out.println("Ingrese el turno del chef [despertino/vespertino] : ");
        String turno = sc.nextLine();
        boolean jornada = false;
        if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
            jornada = true;
        }
        while (jornada == false) {
            System.out.println("Ingrese una jornada valida");
            System.out.println("Ingrese el turno del chef [despertino/vespertino]: ");
            turno = sc.nextLine();
            jornada = false;
            if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                jornada = true;
            }
        }

        if (turno.equalsIgnoreCase("despertino")) {
            if (chefm <= 7) {
                chefm++;
            } else {
                turnos = false;
            }
        }
        if (turno.equalsIgnoreCase("vespertino")) {
            if (chefn <= 7) {
                chefn++;
            } else {
                turnos = false;
            }
        }
        if (turnos) {
            System.out.println("Ingrese la cantidad de estrellas Michelin del chef: ");
            String Star = sc.nextLine();

            while (num(Star)) {
                System.out.println("Ingrese una cantidad valida");
                Star = sc.nextLine();
            }
            int star = 0;
            star = Integer.parseInt(Star);
            while (star < 1) {
                System.out.println("Ingrese una cantidad de estrellas valida");
                System.out.println("Ingrese las estrellas Michelin del chef: ");
                Star = sc.nextLine();

                while (num(Star)) {
                    System.out.println("Ingrese una cantidad valida");
                    Star = sc.nextLine();
                }
                star = 0;
                star = Integer.parseInt(Star);
            }
            System.out.println("Ingrese el sueldo del chef: ");
            String Pay = sc.nextLine();

            while (sueldo(Pay)) {
                System.out.println("Ingrese una cantidad valida");
                Pay = sc.nextLine();
            }
            double pay = 0;
            pay = Double.parseDouble(Pay);
            while (pay < 1) {
                System.out.println("Amigo acaso usted es Gitano? no sea rata");
                System.out.println("Ingrese el sueldo del chef: ");
                Pay = sc.nextLine();

                while (sueldo(Pay)) {
                    System.out.println("Ingrese un sueldo valido");
                    Pay = sc.nextLine();
                }
                pay = 0;
                pay = Double.parseDouble(Pay);
            }
            chefs.get(index).setEdad(edad);
            chefs.get(index).setEstrellas(star);
            chefs.get(index).setNombre(nombre);
            chefs.get(index).setSueldo(pay);
            chefs.get(index).setTurno(turno);
        } else {
            System.out.println("El turno ya esta lleno");
        }

    }
    public static void modMesero(int i) {
        
            System.out.println("Ingrese el nombre del Mesero");
            String nombre = sc.nextLine();
            while (nombre.equals("")) {
                System.out.println("Ingrese un nombre valido");
                nombre = sc.nextLine();
            }
            System.out.println("Ingrese la edad del mesero: ");
            String Edad = sc.nextLine();

            while (num(Edad)) {
                System.out.println("Ingrese una edad valida");
                Edad = sc.nextLine();
            }
            int edad = 0;
            edad = Integer.parseInt(Edad);
            while (edad < 1) {
                System.out.println("Ingrese una edad valida");
                System.out.println("Ingrese la edad del Mesero: ");
                Edad = sc.nextLine();

                while (num(Edad)) {
                    System.out.println("Ingrese una edad valida");
                    Edad = sc.nextLine();
                }
                edad = 0;
                edad = Integer.parseInt(Edad);
            }
            boolean turnos = true;
            System.out.println("Ingrese el turno del Mesero [despertino/vespertino] : ");
            String turno = sc.nextLine();
            boolean jornada = false;
            if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                jornada = true;
            }
            while (jornada == false) {
                System.out.println("Ingrese una jornada valida");
                System.out.println("Ingrese el turno del Mesero [despertino/vespertino]: ");
                turno = sc.nextLine();
                jornada = false;
                if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                    jornada = true;
                }
            }

            if (turno.equalsIgnoreCase("despertino")) {
                if (mesm <= 4) {
                    mesm++;
                } else {
                    turnos = false;
                }
            }
            if (turno.equalsIgnoreCase("vespertino")) {
                if (mesn <= 4) {
                    mesn++;
                } else {
                    turnos = false;
                }
            }
            if (turnos) {
                System.out.println("Ingrese la propina del Mesero: ");
                String Star = sc.nextLine();

                while (sueldo(Star)) {
                    System.out.println("Ingrese una cantidad valida");
                    Star = sc.nextLine();
                }
                double star = 0;
                star = Double.parseDouble(Star);
                while (star < 1) {
                    System.out.println("Amigo acaso usted es Gitano? no sea rata");
                    System.out.println("Ingrese la propina del Mesero: ");
                    Star = sc.nextLine();

                    while (sueldo(Star)) {
                        System.out.println("Ingrese una propina valida");
                        Star = sc.nextLine();
                    }
                    star = 0;
                    star = Double.parseDouble(Star);
                }

                System.out.println("Ingrese el sueldo del Mesero: ");
                String Pay = sc.nextLine();

                while (sueldo(Pay)) {
                    System.out.println("Ingrese una cantidad valida");
                    Pay = sc.nextLine();
                }
                double pay = 0;
                pay = Double.parseDouble(Pay);
                while (pay < 1) {
                    System.out.println("Amigo acaso usted es Gitano? no sea rata");
                    System.out.println("Ingrese el sueldo del Mesero: ");
                    Pay = sc.nextLine();

                    while (sueldo(Pay)) {
                        System.out.println("Ingrese un sueldo valido");
                        Pay = sc.nextLine();
                    }
                    pay = 0;
                    pay = Double.parseDouble(Pay);
                }
                meseros.get(i).setNombre(nombre);
                meseros.get(i).setEdad(edad);
                meseros.get(i).setTurno(turno);
                meseros.get(i).setSueldo(pay);
                meseros.get(i).setPropina(star);
            } else {
                System.out.println("El turno ya esta lleno");
            }

        } 
    public static void modBartender(int i) {
        
            System.out.println("Ingrese el nombre del Bartender");
            String nombre = sc.nextLine();
            while (nombre.equals("")) {
                System.out.println("Ingrese un nombre valido");
                nombre = sc.nextLine();
            }
            System.out.println("Ingrese la edad del Bartender: ");
            String Edad = sc.nextLine();

            while (num(Edad)) {
                System.out.println("Ingrese una edad valida");
                Edad = sc.nextLine();
            }
            int edad = 0;
            edad = Integer.parseInt(Edad);
            while (edad < 1) {
                System.out.println("Ingrese una edad valida");
                System.out.println("Ingrese la edad del Bartender: ");
                Edad = sc.nextLine();

                while (num(Edad)) {
                    System.out.println("Ingrese una edad valida");
                    Edad = sc.nextLine();
                }
                edad = 0;
                edad = Integer.parseInt(Edad);
            }
            boolean turnos = true;
            System.out.println("Ingrese el turno del Bartender [despertino/vespertino] : ");
            String turno = sc.nextLine();
            boolean jornada = false;
            if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                jornada = true;
            }
            while (jornada == false) {
                System.out.println("Ingrese una jornada valida");
                System.out.println("Ingrese el turno del Bartender [despertino/vespertino]: ");
                turno = sc.nextLine();
                jornada = false;
                if (turno.equalsIgnoreCase("Vespertino") || turno.equalsIgnoreCase("despertino")) {
                    jornada = true;
                }
            }

            if (turno.equalsIgnoreCase("despertino")) {
                if (barm <= 2) {
                    barm++;
                } else {
                    turnos = false;
                }
            }
            if (turno.equalsIgnoreCase("vespertino")) {
                if (barn <= 2) {
                    barn++;
                } else {
                    turnos = false;
                }
            }
            if (turnos) {

                System.out.println("Ingrese el sueldo del Mesero: ");
                String Pay = sc.nextLine();

                while (sueldo(Pay)) {
                    System.out.println("Ingrese una cantidad valida");
                    Pay = sc.nextLine();
                }
                double pay = 0;
                pay = Double.parseDouble(Pay);
                while (pay < 1) {
                    System.out.println("Amigo acaso usted es Gitano? no sea rata");
                    System.out.println("Ingrese el sueldo del Mesero: ");
                    Pay = sc.nextLine();

                    while (sueldo(Pay)) {
                        System.out.println("Ingrese un sueldo valido");
                        Pay = sc.nextLine();
                    }
                    pay = 0;
                    pay = Double.parseDouble(Pay);
                }

                System.out.println("Ingrese la cantidad de licores disponibles: ");
                String Star = sc.nextLine();

                while (num(Star)) {
                    System.out.println("Ingrese una cantidad valida");
                    Star = sc.nextLine();
                }
                int star = 0;
                star = Integer.parseInt(Star);
                while (star < 1) {
                    System.out.println("Ingrese una cantidad de licores valida");
                    System.out.println("Ingrese la cantidad de licores disponibles: ");
                    Star = sc.nextLine();

                    while (num(Star)) {
                        System.out.println("Ingrese una cantidad valida");
                        Star = sc.nextLine();
                    }
                    star = 0;
                    star = Integer.parseInt(Star);
                }
                bartenders.get(i).setNombre(nombre);
                bartenders.get(i).setEdad(edad);
                bartenders.get(i).setTurno(turno);
                bartenders.get(i).setSueldo(pay);
                bartenders.get(i).setLicores(star);
                
            }
            else{
                System.out.println("El turno ya esta lleno");
            }
        
    }
    public static void modMesa(int i) {
       
            System.out.println("Ingrese la cantidad de platos en la mesa: ");
            String Platos = sc.nextLine();

            while (num(Platos)) {
                System.out.println("Ingrese una cantidad valida");
                Platos = sc.nextLine();
            }
            int platos = 0;
            platos = Integer.parseInt(Platos);
            while (platos < 1) {
                System.out.println("Ingrese una cantidad de platos valida");
                System.out.println("Ingrese el numero de platos que hay en la mesa: ");
                Platos = sc.nextLine();

                while (num(Platos)) {
                    System.out.println("Ingrese una cantidad valida");
                    Platos = sc.nextLine();
                }
                platos = 0;
                platos = Integer.parseInt(Platos);
            }

            System.out.println("Ingrese el numero de utensilios que hay en la mesa ");
            String Star = sc.nextLine();

            while (num(Star)) {
                System.out.println("Ingrese una cantidad valida");
                Star = sc.nextLine();
            }
            int star = 0;
            star = Integer.parseInt(Star);
            while (star < 1) {
                System.out.println("Ingrese una cantidad de utensilios valida");
                System.out.println("Ingrese los utensilios que hay en la mesa: ");
                Star = sc.nextLine();

                while (num(Star)) {
                    System.out.println("Ingrese una cantidad valida");
                    Star = sc.nextLine();
                }
                star = 0;
                star = Integer.parseInt(Star);
            }
            System.out.println("Ingrese el precio de la Mesa: ");
            String Pay = sc.nextLine();

            while (sueldo(Pay)) {
                System.out.println("Ingrese un precio valido");
                Pay = sc.nextLine();
            }
            double pay = 0;
            pay = Double.parseDouble(Pay);
            while (pay < 1) {
                System.out.println("Ingrese un precio valido");
                System.out.println("Ingrese el precio de la mesa: ");
                Pay = sc.nextLine();

                while (sueldo(Pay)) {
                    System.out.println("Ingrese un precio valido");
                    Pay = sc.nextLine();
                }
                pay = 0;
                pay = Double.parseDouble(Pay);
            }
            mesas.get(i).setPlatos(platos);
            mesas.get(i).setUtensilios(star);
            mesas.get(i).setPrecio(pay);
        } 

}
