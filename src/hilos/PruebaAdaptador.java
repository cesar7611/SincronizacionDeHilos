import javax.swing.*;
import java.awt.event.*;

public class PruebaAdaptador extends JFrame {

    private static final long serialVersionUID = 1L;
    
    public PruebaAdaptador() {
        JButton boton = new JButton("Pasa el mouse por aquí");
        boton.setBounds(50, 50, 200, 50);
        
        // AQUÍ USAMOS LA CLASE ADAPTADORA
        // En lugar de implementar los 7 métodos, solo usamos el que queremos
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("¡Evento detectado! El mouse entró al botón.");
                // Aquí podrías poner la lógica para controlar tus hilos
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("El mouse salió del botón.");
            }
        });

        this.add(boton);
        this.setSize(300, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new PruebaAdaptador();
    }
}
