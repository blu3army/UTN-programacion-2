/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fifthweek;
import java.time.LocalDate;

/**
 *
 * @author nikolai
 */
public class FifthWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1
        Pasaporte pasaporte = new Pasaporte("YC21312CD", LocalDate.now(),  "profile", "png");
        Titular persona = new Titular("Nicolas Bressan", "32512758");        
        pasaporte.setTitular(persona);        
        pasaporte.mostrar();
        //2
        Bateria bateria = new Bateria("Hitachi", 98.5);
        Celular celular = new Celular("12i3l23jlj2l4l2k35", "iPhone", "12", bateria);
        Usuario usuario = new Usuario("Nicolas", "32512758");
        celular.setUsuario(usuario);        
        celular.mostrar();
        
        //3
        Autor autor = new Autor("Haruki Murakami", "Japonesa");
        Editorial editorial = new Editorial("A thousand books for you", "New York");
        Libro libro = new Libro("La muerte del Commendatore", "1231241", editorial);
        libro.setAutor(autor);
        libro.mostrar();
        
        //4
        Banco banco = new Banco("Banco Francés", "30101010102");
        Cliente cliente = new Cliente("Nicolas Bressan", "32512758");
        TarjetaDeCredito tarjetaFrances = new TarjetaDeCredito("123456789", LocalDate.now(), banco);
        tarjetaFrances.setCliente(cliente);        
        
        tarjetaFrances.mostrar();
        
        //5
        Propietario propietario = new Propietario("Erik", "3232323212");
        Computadora compu = new Computadora("Dell", "1234", "AMD Ryzer", "12312k");        
        propietario.setComputadora(compu);       
        compu.mostrar();
        
        //6
        Mesa mesa = new Mesa("20", 6);
        ClienteMesa clienteMesa = new ClienteMesa("Daniel Gomez", "21414141241");
        
        Reserva reserva = new Reserva("16/10/25", "18:00", mesa);
        reserva.setCliente(clienteMesa);
        reserva.mostrar();
        
        //7
        Conductor conductor = new Conductor("Gustavo Gomez", "B2");
        Motor motor = new Motor("142421aksf213", "V8");
        Vehiculo vehiculo = new Vehiculo("AB 200 ZZ", "Ford Mondeo", motor);
        conductor.setVehiculo(vehiculo);
        
        vehiculo.mostrar();
        
        
        //8
        UsuarioDocumento usuarioDoc = new UsuarioDocumento("Adrian Camargo", "camargo@gmail.com");
        Documento documento = new Documento("Decreto 814", "100 páginas", "3@!$!@afsf", "17/10/25", usuarioDoc);
        
        documento.mostrar();
        
        //9
        Paciente paciente = new Paciente("Jorge Gregorio", "OSDE");
        Profesional profesional = new Profesional("Adrian Lopez", "Cardiologo");
        CitaMedica cita = new CitaMedica("22/10/25", "17:00");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        cita.mostrar();
        
        //10
        TitularCuenta titularCuenta = new TitularCuenta("Nicolas Bressan", "32512758");
        CuentaBancaria cuentaBancaria = new CuentaBancaria("32165498745231654987", 100500.20, "12345678");
        titularCuenta.setCuentaBancaria(cuentaBancaria);
        
        cuentaBancaria.mostrar();
        
        //11
        Cancion cancion = new Cancion("Learning to fly");
        Artista artista = new Artista("Pink Floyd", "Rock Progresivo");
        cancion.setArtista(artista);
        
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
        
        //12
        Contribuyente contribuyente = new Contribuyente("Nicolas Bressan", "32512758");
        Impuesto impuesto = new Impuesto("IVA", 1500000, 0.21);
        impuesto.setContribuyente(contribuyente);
        
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
        
        //13
        UsuarioQR usuarioQR = new UsuarioQR("Nicolas Bressan", "nicolasbressan00@gmail.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("aslkfjq30894", usuarioQR);
        
        //14
        Proyecto proyecto = new Proyecto("Video musical", 5.3);
        EditorVideo editorVideo = new EditorVideo();
        editorVideo.exportar(".MOV", proyecto);
        
    }
    
}
