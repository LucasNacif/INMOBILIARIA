public class Venta {

    int id_Venta;
    int importe;
    String fecha;


    public Venta (int id_Venta, int importe, String fecha){
        this.id_Venta = id_Venta;
        this.importe = importe;
        this.fecha = fecha;
    }

    public String toString() {
        return ("\n Id: " + this.id_Venta +
                "\n Importe: " + this.importe +
                "\n Fecha: " + this.fecha

        );
    }

}
