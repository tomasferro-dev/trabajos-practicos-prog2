import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Lucas");
        Reserva reserva1 = new Reserva(new Date());
        Prestamo prestamo1 = new Prestamo("1/4");

        usuario1.agregarPrestamo(prestamo1);
        usuario1.agregarReserva(reserva1);

        reserva1.crearDocumento("reserva1a");
        reserva1.crearDocumento("reserva1b");
        reserva1.crearDocumento("reserva1c");

        reserva1.eliminarDocumento("reserva1b");
        reserva1.eliminarDocumento("reserva1d");

        prestamo1.crearDocumento("prestamo1a");
        prestamo1.crearDocumento("prestamo1b");
        prestamo1.crearDocumento("prestamo1c");

        prestamo1.eliminarDocumento("prestamo1c");
        prestamo1.eliminarDocumento("prestamo1d");



        System.out.println(usuario1);
    }
}