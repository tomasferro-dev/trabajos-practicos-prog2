import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Prestamo prestamo1 = new Prestamo("1/4");
        Usuario usuario1 = new Usuario("Lucas");
        Reserva reserva1 = new Reserva(new Date());

        usuario1.agregarPrestamo(prestamo1);
        usuario1.agregarReserva(reserva1);

        reserva1.crearDocumento("reserva1a");
        reserva1.crearDocumento("reserva1b");
        reserva1.crearDocumento("reserva1c");

        reserva1.eliminarDocumento("reserva1b");
        reserva1.eliminarDocumento("reserva1d");



        System.out.println(usuario1);
    }
}