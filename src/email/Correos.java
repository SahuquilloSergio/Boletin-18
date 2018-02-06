package email;

public class Correos {
    String Mensaje;
    boolean Confirmacion;

    public Correos() {
    }

    public Correos(String Mensaje, boolean Confirmacion) {
        this.Mensaje = Mensaje;
        this.Confirmacion = Confirmacion;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public boolean isConfirmacion() {
        return Confirmacion;
    }

    public void setConfirmacion(boolean Confirmacion) {
        this.Confirmacion = Confirmacion;
    }


    @Override
    public String toString() {
        return "Correos{" + "Correo=" + Mensaje + ", Confirmacion=" + Confirmacion + '}';
    }
    
}
