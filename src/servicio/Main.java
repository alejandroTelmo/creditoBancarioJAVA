package servicio;

public class Main {
    public static void main(String[] args) {
        EmpleadoBanco empleado1 = new EjecutivoCuenta();
        EmpleadoBanco empleado2 = new Gerente();
        EmpleadoBanco empleado3 = new Director();
        Credito cre1=new Credito(78000);
        Credito cre2=new Credito(178000);
        Credito cre3=new Credito(278000);
        Credito cre4=new Credito(58000);
        empleado2.setSigEmpleadoBanco(empleado3);
        empleado1.setSigEmpleadoBanco(empleado2);
        empleado1.procesarSolicitud(cre1);
        empleado1.procesarSolicitud(cre2);
        empleado1.procesarSolicitud(cre3);
        empleado1.procesarSolicitud(cre4);
    }


}
