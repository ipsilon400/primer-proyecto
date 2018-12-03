package documentostributarios;

public class DocumentosTributarios {

    public static void main(String[] args) {
        // TODO code application logic here
        Boleta ejemplo = new Boleta();
        ejemplo.RazonSocial = "Gonzalo Adnrés Múñoz";
        ejemplo.Rut = "76.371.844-1";
        ejemplo.Actividad = "juguetería";
        ejemplo.Numeracion = 1;
        ejemplo.Domicilio = "jjperez #8422";
        ejemplo.Fecha = "02/05/2018";
        ejemplo.Total = 1500;
        ejemplo.imprimir();
    }
    
}
