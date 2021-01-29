
package lab2_ronyestrada;

import javax.swing.JOptionPane;


public class password {
    String Name ;
    int Password;

    public password(String Name) {
        if (Name!="David" ){this.Name = Name;}else {JOptionPane.showMessageDialog(null, "Nombre incorrecto");
        grupointur.main(null);
        
        
    }

    
    }public password(int Password) {
    if (Password==99){this.Password=Password; 
    grupointur.pass=true;
    }else{
    JOptionPane.showMessageDialog(null, "Nombre incorrecto");
    }
    }
}
