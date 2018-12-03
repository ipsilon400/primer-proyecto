package documentostributarios;

public class Boleta {
    int Numeracion;
    String RazonSocial;
    String Rut;
    String Domicilio;
    String Actividad;
    String Fecha;
    int Total;
    
    public void imprimir(){
        System.out.println(this.RazonSocial);
        System.out.println("Rut: " + this.Rut);
        System.out.println(this.Actividad);
        System.out.println(this.Domicilio);
        System.out.println("Boleta N° " + this.Numeracion);
        System.out.println("*******************");
        System.out.println("TOTAL = $" + this.Total );
        System.out.println("*******************");
        System.out.println("Fecha:" + this.Fecha );
    }
    
}
