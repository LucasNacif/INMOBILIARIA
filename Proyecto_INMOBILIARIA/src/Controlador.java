public class Controlador {
        public static void main(String[] args) {


            //PRUEBA DE QUE ANDA---->

            Cliente cliente = new Cliente(1, "Lucas", "Nacif", "2613628979");
            Propietario propietario = new Propietario(1, "Alejo", "Montuori", "2613628979");
            Propiedad propiedad = new Propiedad(1,"Lavalle", "Barrio Solares", "Ta re bueno el terreno", 99999, 200);
            Venta venta = new Venta(1, 999, "1/09/2023");

            System.out.println("Cliente");
            System.out.println(cliente);
            System.out.println("---------------");

            System.out.println("Propietario");
            System.out.println(propietario);
            System.out.println("---------------");

            System.out.println("Propiedad");
            System.out.println(propiedad);
            System.out.println("---------------");

            System.out.println("Venta");
            System.out.println(venta);


            }
    }

