package Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos {
    public Eventos(){
        JLabel pidemensaje = new JLabel("Di algo");
        pidemensaje.setBounds(35,20,200,30);
        JTextField campo = new JTextField(150);
        JTextField campo2 = new JTextField(150);
        campo.setBounds(35,60,180,30);
        campo2.setBounds(35,120,180,30);
        JButton boton = new JButton("Haz Click");
        boton.setBounds(35,200,150,30);
        JLabel muestramensaje = new JLabel();
        muestramensaje.setBounds(50,200,250,50);
        ActionListener escuchador = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campo2.setText("dijiste esto :" + campo.getText());

            }
        };
        ///with addActionlistener we can add obj that will show all done on him
        boton.addActionListener(escuchador);



    }

}
