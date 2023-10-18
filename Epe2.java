
package epe2;

import java.util.Scanner;

public class Epe2 {
    static Libro[] libros = new Libro[100];
    static Venta[] venta = new Venta[100];
    static int registro = 0;
    static int carrito = 0;
    static int inventariado = 0;
    static int compra=0;

    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        int op =0;
        int opA =0;
        int opC = 0;
        int opV = 0;
        int ventaN = 1;
        do{
            if(registro==0){
                System.out.println("===================================================================================");
                System.out.println("Para iniciar el programa es necesario que ingrese stock inicial a su inventario");
                System.out.println("===================================================================================\n");
                ingreso(scN, scL);
            }
            System.out.println("Menú biblioteca\n");
            System.out.println("1.- Menú Administrador");
            System.out.println("2.- Menú cliente");
             op = scN.nextInt();
        
        switch (op) {
            case 1:
                do{
                    System.out.println("Bienvenido Administrador ¿Que operación desea realizar?");
                    System.out.println("1.- Ingresar libro");
                    System.out.println("2.- Reportes");
                    System.out.println("0.- Salir");
                    opA = scN.nextInt();
                    switch(opA){
                        case 1:
                            ingreso(scN, scL);
                            break;
                        case 2:
                            inventario();
                            break;
                    }  
                }while (opA !=0);
                break;
                
            case 2:
                do{
                    System.out.println("Bienvenido ¿Que operación desea realizar?");
                    System.out.println("1.- Mostrar inventario de libros disponibles ");
                    System.out.println("2.- Comprar libro mediante ISBN");
                    System.out.println("0.- Salir");
                    opC = scN.nextInt();
                    
                    
                    switch(opC){
                        case 1: 
                            inventario();
                            break;
                        case 2:
                            do{
                                 ventas(scN);
                                 int indice=1;
                                 int num=1;
                                 System.out.println("------------------------------------");
                                 System.out.println("Venta N° "+ (num));
                                 System.out.println("------------------------------------");
                                 System.out.println(indice+".- "+libros[inventariado].getTitulos()+" x "+ compra+" $"+libros[inventariado].getPrecios());
                                 indice++;
                                 System.out.println("------------------------------------\n");
                                 
                                 System.out.println("¿Desea agregar otro libro o finaliza su compra?\n 1.- Agregar\n 2.- Finalizar");
                                 opV = scN.nextInt();

                            }while(opV!=2);
                           break;
                        
                }
                }while (opC!=0);
                
        }
        }while(op!=0);
        
    }

    public static void ingreso(Scanner scN, Scanner scL) {
        System.out.println("Registro de libros a inventario\n");
        if (registro < 100) {
            System.out.println("Ingrese ISBN");
            int isbn = scN.nextInt();
            boolean isbnRepetido = false;
            String titulo = "";
            String autor = "";
            int precio = 0;
            int stock = 0;
            for (int i = 0; i < registro; i++) {
                if (libros[inventariado].getIsbns() == isbn && libros[inventariado] != null){
                isbnRepetido = true;
                break;
                }
            }
            if(isbnRepetido){
                    System.out.println("El ISBN de su libro ya esta registrado, favor de ingresar nuevamente\n");
                }else{
                    System.out.println("Ingresar título del libro");
                    titulo = scL.nextLine();
                    System.out.println("Ingresar autor del libro");
                    autor = scL.nextLine();
                    System.out.println("Ingresar precio");
                    precio = scN.nextInt();
                    System.out.println("Ingresar Stock inicial");
                    stock = scN.nextInt();
                    libros[registro] = new Libro(titulo, isbn, autor, precio, stock);
                    registro++;
                    System.out.println("\nEl libro ha sido registrado en la base de datos");
                }
            
        } else {
            System.out.println("El inventario esta en su capacidad máxima, no se pueden añadir mas titulos\n");
        }
    }
    

    public static void inventario() {
        if (registro > 0) {
            for (int inventariado = 0; inventariado < registro; inventariado++) {
                System.out.println("=======================");
                System.out.println("ISBN: " + libros[inventariado].getIsbns());
                System.out.println("Título: " + libros[inventariado].getTitulos());
                System.out.println("Autor: " + libros[inventariado].getAutores());
                System.out.println("Precio: " + libros[inventariado].getPrecios());
                System.out.println("Stock: " + libros[inventariado].getStocks());
                System.out.println("=======================\n ");
            }
        } else {
            System.out.println("El inventario está vacío.");
        }
    }
    
    public static void ventas(Scanner scN ){
         System.out.println("Buscar libro mediante ISBN");
         
         int isbnValidacion = scN.nextInt();
         for (int inventariado = 0; inventariado < registro; inventariado++) {
             
             if(libros[inventariado] != null &&  libros[inventariado].getIsbns() == isbnValidacion){
                 
                 System.out.println("Nombre: "+libros[inventariado].getTitulos()+"\n Precio:  "+ libros[inventariado].getPrecios()+"\n Cantidad disponibles: "+ libros[inventariado].getStocks());
                 System.out.println("Libro disponible es stock. ¿Cuantas copias desea comprar?");
                 compra = scN.nextInt();
                 if(compra > 0 && libros[inventariado].getStocks() >= compra){
                libros[inventariado].setStocks(libros[inventariado].getStocks() - compra);
                System.out.println("Libro añadido a su compra");                                       
                }else{
                System.out.println("La cantidad ingresada no es válida, digite bien o no exceda el stock disponible");
              
            }
                 
                 
    }
 }
                
    }
 
    }

