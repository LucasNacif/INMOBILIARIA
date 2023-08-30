public class Propiedad {
    
    int id_Propiedad;
    String localidad;
    String ubicacion;
    String descripcion;
    int precio;
    int dimension;

    public Propiedad (int id_Propiedad, String localidad, String ubicacion, String descripcion, int precio, int dimension){
        this.id_Propiedad = id_Propiedad;
        this.localidad = localidad;
        this.ubicacion = ubicacion;
        this.descripcion =  descripcion;
        this.precio =  precio;
        this.dimension =  dimension;
    }

    public String toString() {
        return ("\n Id: " + this.id_Propiedad +
                "\n Localidad: " + this.localidad +
                "\n Ubicacion: " + this.ubicacion +
                "\n Descripcion: " + this.descripcion +
                "\n Precio: " + this.precio +
                "\n Metros Cuadrados: " + this.dimension
                
        );
    }
    

}
