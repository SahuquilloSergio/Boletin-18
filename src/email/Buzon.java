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
        String var = null;
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).Confirmacion != true) {
                var = mails.get(i).Mensaje;
            }
            mails.get(i).Confirmacion = true;
            break;
        }
        if (var == null) {
            return "Todos los correos leidos";
        } else {
            return var;
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
