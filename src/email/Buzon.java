package email;

import java.util.ArrayList;

public class Buzon {

    ArrayList<Correos> mails = new ArrayList<>();

    public int numeroDeCorreos() {
        return mails.size();

    }

    public void engade(Correos c) {
        mails.add(c);
    }

    public boolean porLer() {
        boolean si = false;
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).Confirmacion != true) {
                si = true;
            }
        }
        return si;
    }

    public String amosaPrimerNoLeido() {
        String porLeer = null;
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).Confirmacion != true) {
                porLeer = mails.get(i).Mensaje;
            }
            mails.get(i).Confirmacion = true;
            break;
        }
        if (porLeer == null) {
            return "Todos los correos leidos";
        } else {
            return porLeer;
        }
    }

    public String amosar(int k) {
        if (k > mails.size()) {
            System.out.println("Correo Inexistente");
        } else {
            mails.get(k).Confirmacion = true;
        }
        return mails.get(k).Mensaje;
    }

    public void elimina(int k) {
        if (k > mails.size()) {
            System.out.println("Correo Inexistente");
        } else {
            mails.remove(k);
        }
    }
}
