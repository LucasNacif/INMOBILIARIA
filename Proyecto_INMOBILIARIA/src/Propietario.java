public class Propietario {

    int id_Propietario;
    String nombre;
    String apellido;
    String telefono;

    public Propietario (int id_Propietario, String nombre, String apelido, String telefono){
        this.id_Propietario = id_Propietario;
        this.nombre = nombre;
        this.apellido = apelido;
        this.telefono =  telefono;
    }

    public String toString() {
        return ("\n Id: " + this.id_Propietario +
                "\n Nombre: " + this.nombre +
                "\n Apellido: " + this.apellido +
                "\n Telefono: " + this.telefono
        );
    }

}
