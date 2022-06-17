package co.edu.udea.reto3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Graciano
 */
public class Reto3 {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public static void main(String[] args) {
        try {
            Automovil automovil = new Automovil();
            automovil.setPlaca("78sdf");
            automovil.setMarca("Toyota");
            automovil.setModelo("dsdfsf");
            automovil.setKilometraje(7554);
            automovil.setColor("Negro");
            automovil.setPrecio(4353);
            automovil.setDescripcion("todo terreno");
            automovil.setFechaFabricacion(sdf.parse("15/06/2018"));

            System.out.println(automovil.usoAutomovil());
            System.out.println(automovil.consultarEstado());

            Vendedor vendedor = new Vendedor();
            vendedor.setNombres("Santiago");
            vendedor.setApellidos("Graciano David");
            vendedor.setEdad(24);
            vendedor.setTotalVendido(2000000);
            vendedor.setDescripcion("Proactivo");
            vendedor.setFechaIngreso(sdf.parse("15/06/2018"));

            System.out.println("El vendedor " + vendedor.getNombres() + " tiene años " + vendedor.consultarAntiguedad() + " en la empresa");
            System.out.println("El vendedor es: " + vendedor.totalVendido());
            System.out.println(vendedor.consultarEstado());
        } catch (ParseException ex) {
            Logger.getLogger(Reto3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
