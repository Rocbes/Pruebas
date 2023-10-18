package epe2;

public class Venta {
    private Libro compra;
    private int cantidad;
    private int total;
    private int ventas;
    
    public Venta(Libro compra, int cantidad, int total){
    this.compra = compra;
    this.cantidad = cantidad;
    this.total = total * compra.getPrecios();
}
public Libro getVendidos(){
    return compra;
}
public int getCantidad(){
return cantidad;
}
public int getTotal(){
return total;
}
public int getVentas(){
    return ventas;
}

}



