
package epe2;
public class Libro {
    private String titulos;
    private int isbns;
    private String autores;
    private int precios;
    private int stocks;


    public Libro(String titulo, int isbn, String autor, int precio, int stock) {
        this.titulos = titulo;
        this.isbns = isbn;
        this.autores = autor;
        this.precios = precio;
        this.stocks = stock;
    }

    public String getTitulos() {
        return titulos;
    }

    public int getIsbns() {
        return isbns;
    }

    public String getAutores() {
        return autores;
    }

    public int getPrecios() {
        return precios;
    }

    public int getStocks() {
        return stocks;
    }
    public void setStocks(int stocksActualizado){
        this.stocks= stocksActualizado; 
    }
}

