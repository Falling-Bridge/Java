package Java.elefantesrosados;

import javax.swing.*;
import java.awt.Dimension;

public class Interfaz {

    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Interfaz");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();

        // Crear un botón
        JButton boton = new JButton("Presionar");
        boton.setPreferredSize(new Dimension(150, 10)); // Ancho 150px, Alto 50px
        // Obtener el tamaño de la ventana y del botón
        Dimension tamañoVentana = ventana.getSize();
        Dimension tamañoBoton = boton.getSize();

        // Calcular las coordenadas del centro de la ventana
        int posicionx = (tamañoVentana.width - tamañoBoton.width) / 2;
        int posiciony = (tamañoVentana.height - tamañoBoton.height) / 2;

        // Centrar el botón
        boton.setLocation(posicionx, posiciony);

        // Agregar el botón al panel
        panel.add(boton);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Hacer visible la ventana
        ventana.setVisible(true);

        // Agregar acción al botón
        boton.addActionListener(e -> {
            // Mostrar un mensaje al presionar el botón
            JOptionPane.showMessageDialog(null, "Hola, mundo!");
        });
    }
}
