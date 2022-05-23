package servicio;


    public class Director extends EmpleadoBanco {
        @Override
        public void procesarSolicitud(Credito credito) {
            if (credito.getMonto() > 200000)
                System.out.println("Yo me encargo de gestionarlo.Director");
            else if (getSigEmpleadoBanco() != null)
                getSigEmpleadoBanco().procesarSolicitud(credito);
        }

    }
