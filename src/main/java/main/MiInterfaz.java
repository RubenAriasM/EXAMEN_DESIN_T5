package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiInterfaz extends JFrame {

    private JCheckBox opcion1, opcion2, opcion3;
    private JLabel resultadoLabel;
    private ButtonGroup group;

    public MiInterfaz() {


        setTitle("Interfaz EXAMEN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLayout(null);


        JLabel titulo = new JLabel("Comprueba cual es tu favorito");
        titulo.setBounds(100, 10, 200, 20);
        add(titulo);


        opcion1 = new JCheckBox("Apache Netbeans");
        opcion1.setBounds(20, 50, 100, 20);
        opcion2 = new JCheckBox("Eclipse");
        opcion2.setBounds(20, 80, 100, 20);
        opcion3 = new JCheckBox("IntelliJ");
        opcion3.setBounds(20, 110, 100, 20);


        group = new ButtonGroup();
        group.add(opcion1);
        group.add(opcion2);
        group.add(opcion3);


        add(opcion1);
        add(opcion2);
        add(opcion3);


        JButton revisarButton = new JButton("Revisar");
        revisarButton.setBounds(180, 80, 90, 30);
        add(revisarButton);


        resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(100, 180, 100, 20);
        resultadoLabel.setVisible(false);
        add(resultadoLabel);


        revisarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (opcion1.isSelected()) {
                    resultadoLabel.setText("Esta bien");
                } else if (opcion2.isSelected()) {
                    resultadoLabel.setText("Horrible");
                } else if (opcion3.isSelected()) {
                    resultadoLabel.setText("El mejor de los 3");
                } else {
                    resultadoLabel.setText("No has seleccionado nada.");
                }

                resultadoLabel.setVisible(true);

            }

        });

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MiInterfaz miInterfaz = new MiInterfaz();
            miInterfaz.setVisible(true);
        });

    }

}