package servicio;

public class Gerente extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(Credito credito) {
        if (credito.getMonto() >= 60000 && credito.getMonto() <= 200000)
            System.out.println("Yo me encargo de gestionarlo.Gerente");
        else if (getSigEmpleadoBanco() != null)
            getSigEmpleadoBanco().procesarSolicitud(credito);
    }
}
