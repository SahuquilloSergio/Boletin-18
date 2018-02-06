package email;

import javax.swing.JOptionPane;

public class Email {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Buzon B1 = new Buzon();
        int opcion=0;
      int op;
do{
    op = Integer.parseInt(JOptionPane.showInputDialog("***MENÚ***\n"
                               + "1: Engadir Correo\n"
                               + "2: Eliminar Correo\n"
                               + "3: Leer Correo\n"
                               + "4: Primer Correo Por Leer\n"
                               + "5: Cantidad Total De Correos\n"
                               + "6: Correos Por Leer\n"
                               + "7: Salir\n"));
     switch(op){
         case 1: B1.engade(new Correos(JOptionPane.showInputDialog("Mensaje"), false));
                break;
         case 2: B1.elimina(Integer.parseInt(JOptionPane.showInputDialog("Correo A Eliminar")));
                break;
         case 3: JOptionPane.showMessageDialog(null, B1.amosar(Integer.parseInt(JOptionPane.showInputDialog("Correo a mostrar"))-1));
                break;
         case 4: JOptionPane.showMessageDialog(null, "Primeiro Correo non Lido:  "+B1.amosaPrimerNoLeido()); 
                break;
         case 5: JOptionPane.showMessageDialog(null, "Total de Correos:  "+B1.numeroDeCorreos());
                break;
         case 6: JOptionPane.showMessageDialog(null, "Correos por ler:  "+B1.porLer());
                break;
         case 7: System.exit(0);
                break;

}}while(op<=7);
    
    }
}
      


    