package servicio;

public abstract class EmpleadoBanco {
    private EmpleadoBanco sigEmpleadoBanco;
    public abstract void procesarSolicitud(Credito credito);
    public void setSigEmpleadoBanco(EmpleadoBanco emp) {
        sigEmpleadoBanco = emp;
    }
    public EmpleadoBanco getSigEmpleadoBanco() {
        return sigEmpleadoBanco;
    }

}
