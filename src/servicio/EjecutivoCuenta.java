package servicio;

public class EjecutivoCuenta extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(Credito credito) {
        if (credito.getMonto() < 60000)
            System.out.println("Yo me encargo de gestionarlo.Ejecutivo de cuentas");
        else if (getSigEmpleadoBanco() != null)
            getSigEmpleadoBanco().procesarSolicitud(credito);
    }

}
