public class Cliente {

    int id_Cliente;
    String nombre;
    String apellido;
    String telefono;

    public Cliente (int id_Cliente, String nombre, String apelido, String telefono){
        this.id_Cliente = id_Cliente;
        this.nombre = nombre;
        this.apellido = apelido;
        this.telefono =  telefono;
    }

    public String toString() {
        return ("\n Id: " + this.id_Cliente +
                "\n Nombre: " + this.nombre +
                "\n Apellido: " + this.apellido +
                "\n Telefono: " + this.telefono
        );
    }

}
