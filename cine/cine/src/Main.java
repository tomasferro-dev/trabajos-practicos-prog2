public class Main {
    public static void main(String[] args) {
        // Crear un Cine
        Cine cinemark = new Cine("Cinemark");

        // Crear varias Salas
        Sala sala1 = new Sala(1, 100, cinemark);
        Sala sala2 = new Sala(2, 120, cinemark);
        Sala sala3 = new Sala(3, 150, cinemark);

        // Asociar las salas al cine
        cinemark.agregarSala(sala1);
        cinemark.agregarSala(sala2);
        cinemark.agregarSala(sala3);

        // crear sala VIP
        SalaVIP vip1 = new SalaVIP(1000, 55, cinemark, "Asientos reclinables y refill de gaseosas");

        // Asociar esta sala vip al cine
        cinemark.agregarSala(vip1);

        // mostrar info del cine
        System.out.println(cinemark);

        // Mostrar todas las salas y filtrar cuáles son VIP
        cinemark.mostrarSalasPorTipo();

    }
}