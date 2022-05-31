package plogin;

import javax.swing.JOptionPane;

/**
 *
 * @author NARVAEZ
 */
public class Seguridad {
    frmLogin login = new frmLogin();
    String res;
    
    public void validarUsuario(String usuarios[], String user, String pwd, int intentos) {
        boolean encontrado = false;
        
        for (int i = 0; i < usuarios.length; i++) {
            if ((usuarios[i].equalsIgnoreCase(user) && usuarios[i + 1].equals(pwd))) {
                res = "Bienvenido " + user;
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, " Inicio de Sesión ", JOptionPane.INFORMATION_MESSAGE);
                intentos=0;
                login.setIntentos(intentos);
                //nos lleve al form papa
                new frmPapa().setVisible(true);
                break;
            }
            
        }//fin del para
        if (encontrado == false) {
            res = " clave y/o usuario erróneos van " + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res, " Inicio de Sesión ", JOptionPane.ERROR_MESSAGE);
        }
        if (intentos > 2) {
            JOptionPane.showMessageDialog(null, "3 intentos fallidos, esto se serrará", " Inicio de Sesión ", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
    }
    
}
