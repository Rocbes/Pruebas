
package ep1;

import java.util.Scanner;

public class Ep1T {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        System.out.println("================");
        System.out.println("Gestión de una granja");
        System.out.println("================\n");
        System.out.println("Instrucciones de uso: Para poder iniciar su programa debe indicar cual es el nombre de su granja y el presupuesto con el que cuenta hasta este momento\n");
        System.out.println("Ingrese el nombre de su granja");
        String nomG = scN.nextLine();
        System.out.println("\nIngrese su presupuesto inicial");
        int presupuesto = scN.nextInt();
        int contador=1;
        String animal1="",animal2="",animal3="";
        int cantA1=0,cantA2=0,cantA3=0,cantAnimalVT=0,cantAnimaCT=0, precioC1=0,montoAnimalC=0,montoAnimalV=0,opReportes=0,precioC2=0,precioC3=0,montoTotalV=0, precioV1=0,precioV2=0,precioV3=0,opM=0,cantTotalA=0, opAnimal=0,cantAnimalV=0,presupuestoC=0,opAnimal2=0, cantAnimalC=0, opAnimalC=0;
       
        while(contador<=3){
            System.out.println("================");
            System.out.println("Registro de animales "+contador);
            System.out.println("================\n");
            System.out.println("Ingrese el tipo de animal que desea registrar (Ejemplo: Vaca, perro, gato, pato, etc.)");
            animal1 = scL.nextLine();
            System.out.println("\nIngrese la cantidad que desea registrar");
            cantA1 = scN.nextInt();
            System.out.println("\nIngrese el precio de compra de este animal");
            precioC1 = scN.nextInt();
            System.out.println("Ingrese el precio de venta de este animal");
            precioV1 = scN.nextInt();
            cantTotalA+=cantA1;
            contador++;
            
            System.out.println("================");
            System.out.println("Registro de animales " +contador);
            System.out.println("================\n");
            System.out.println("Ingrese el tipo de animal que desea registrar (Ejemplo: Vaca, perro, gato, pato, etc.)");
            animal2 = scL.nextLine();
            System.out.println("\nIngrese la cantidad que desea registrar");
            cantA2 = scN.nextInt();
            System.out.println("\nIngrese el precio de compra de este animal");
            precioC2 = scN.nextInt();
            System.out.println("Ingrese el precio de venta de este animal");
            precioV2 = scN.nextInt();
            cantTotalA+=cantA2;
            contador++;
            
            System.out.println("================");
            System.out.println("Registro de animales "+contador);
            System.out.println("================\n");
            System.out.println("Ingrese el tipo de animal que desea registrar (Ejemplo: Vaca, perro, gato, pato, etc.)");
            animal3 = scL.nextLine();
            System.out.println("\nIngrese la cantidad que desea registrar");
            cantA3 = scN.nextInt();
            System.out.println("\nIngrese el precio de compra de este animal");
            precioC3 = scN.nextInt();
            System.out.println("Ingrese el precio de venta de este animal");
            precioV3 = scN.nextInt();
            cantTotalA+=cantA3;
            contador++;
        }
        
        do{
        System.out.println("\n================");
        System.out.println("Menú opciones granja: "+nomG);
        System.out.println("================\n");
        System.out.println("1.- Contar animales\n2.- Vender animales\n3.- Comprar animales\n4.- Reportes\n0.- Salir");
        opM = scN.nextInt();
        switch(opM){
            case 1:
                System.out.println("\nLa cantidad total de animales que dispone su granja es de: "+cantTotalA);
                System.out.println("Tipos de animales:");
                System.out.println("1.- "+animal1+" = "+cantA1);
                System.out.println("2.- "+animal2+" = "+cantA2);
                System.out.println("3.- "+animal3+" = "+cantA3);
                break;
            case 2:
                System.out.println("\n¿Que animal quiere vender? ");
                System.out.println("1.- "+animal1+"\n2.- "+animal2+"\n3.- "+animal3);
                opAnimal = scN.nextInt();
                System.out.println("Ingrese la cantidad que quiere vender");
                cantAnimalV = scN.nextInt();
                
                    switch(opAnimal){
                        case 1:
                            if(cantAnimalV<cantA1-1){
                                cantA1-=cantAnimalV;
                                presupuesto+= (precioV1*cantAnimalV);
                                montoTotalV+=(precioV1*cantAnimalV);
                                cantAnimalVT+=cantAnimalV;
                                cantTotalA-=cantAnimalV;
                                System.out.println("Venta de animales exitosa");
                            }else{
                                System.out.println("Mínimo deben quedar 2 ejemplares en su granja, venta invalidada");
                            }
                            break;
                        case 2:
                            if(cantAnimalV<cantA2-1){
                                cantA2-=cantAnimalV;
                                presupuesto+= (precioV2*cantAnimalV);
                                montoTotalV+=(precioV2*cantAnimalV);
                                cantAnimalVT+=cantAnimalV;
                                cantTotalA-=cantAnimalV;
                                System.out.println("Venta de animales exitosa");
                            }else{
                                System.out.println("Mínimo deben quedar 2 ejemplares en su granja, venta invalidada");
                            }
                            break;
                        case 3:
                            if(cantAnimalV<cantA3-1){
                                cantA3-=cantAnimalV;
                                presupuesto+= (precioV3*cantAnimalV);
                                montoTotalV+=(precioV3*cantAnimalV);
                                cantAnimalVT+=cantAnimalV;
                                cantTotalA-=cantAnimalV;
                                System.out.println("Venta de animales exitosa");
                            }else{
                                System.out.println("Mínimo deben quedar 2 ejemplares en su granja, venta invalidada");
                                break;
                            }default:
                                System.out.println("Ingrese una opción válida");
                    }
                    break;
            case 3:
                System.out.println("\n=======================");
                System.out.println("¿Qué animal quiere comprar?");
                System.out.println("=======================\n");
                System.out.println("1.- "+animal1+"\n2.- "+animal2+"\n3.- "+animal3);
                opAnimal2 = scN.nextInt();
                System.out.println("Ingrese la cantidad de animales que quiere comprar");
                cantAnimalC = scN.nextInt();
                
                    switch(opAnimal2){
                        case 1:
                           
                            presupuestoC=presupuesto - (cantAnimalC*precioC1);
                            if(presupuestoC>=0){
                            cantA1+=cantAnimalC;
                            cantAnimaCT+=cantAnimalC;
                            montoAnimalC+=(cantAnimalC*precioC1);
                            cantTotalA+=cantAnimalC;
                            presupuesto-=(cantAnimalC*precioC1);
                                System.out.println("Compra de animales exitosa");
                            }else{
                                System.out.println("Ha excedido el presupuesto de su granja, su saldo es de: $"+presupuesto+" intente con una cantidad menor");
                            }
                            break;
                        case 2:
                            presupuestoC=presupuesto - (cantAnimalC*precioC2);
                            if(presupuestoC>=0){
                            cantA2+=cantAnimalC;
                            cantAnimaCT+=cantAnimalC;
                            montoAnimalC+=(cantAnimalC*precioC1);
                            cantTotalA+=cantAnimalC;
                            presupuesto-=(cantAnimalC*precioC1);
                            System.out.println("Compra de animales exitosa");
                            }else{
                                System.out.println("Ha excedido el presupuesto de su granja, su saldo es de: $"+presupuesto+" intente con una cantidad menor");
                            }
                            break;
                        case 3:
                            presupuestoC=presupuesto - (cantAnimalC*precioC3);
                            if(presupuestoC>=0){
                            cantA3+=cantAnimalC;
                            cantAnimaCT+=cantAnimalC;
                            montoAnimalC+=(cantAnimalC*precioC1);
                            cantTotalA+=cantAnimalC;
                            presupuesto-=(cantAnimalC*precioC1);
                            System.out.println("Compra de animales exitosa");
                            }else{
                                System.out.println("Ha excedido el presupuesto de su granja, su saldo es de: $"+presupuesto+" intente con una cantidad menor");
                            }
                    }
                    break;
            case 4:
                System.out.println("==========================");
                System.out.println("Reporte de la gestión de su granja");
                System.out.println("==========================\n");
                System.out.println("1.- Ventas generales\n2.- Compras generales\n3.- Presupuesto actual de la granja");
                opReportes= scN.nextInt();
                    switch(opReportes){
                        case 1:
                            System.out.println("El monto total de animales vendidos es: "+montoTotalV);
                            System.out.println("La cantidad de animales vendidos es: "+cantAnimalVT);
                            break;
                        case 2:
                            System.out.println("La cantidad de animales comprados es: "+cantAnimaCT);
                            System.out.println("El monto total de los animales comprados es: "+montoAnimalC);
                            break;
                        case 3:
                            System.out.println(presupuesto);
                            if(presupuesto<=1000000){
                                System.out.println("El presupuesto de la granja es bajo");
                            }else if(presupuesto>1000000 && presupuesto<10000000){
                                System.out.println("Actualmente la economía de la granja es estable");
                            }else{
                                System.out.println("Puedes invertir comprando más animales");
                            }
                    }
                
        }
        }while(opM!=0);
    }
}
