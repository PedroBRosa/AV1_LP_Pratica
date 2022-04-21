package Ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel calculadoraDeCss;
    private JFormattedTextField idFormattedTextField;
    private JFormattedTextField classeFormattedTextField;
    private JFormattedTextField tagsFormattedTextField;
    private JButton calcularButton;

    public Main() {

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ids= Integer.parseInt(idFormattedTextField.getText());
                int classe= Integer.parseInt(classeFormattedTextField.getText());
                int tags= Integer.parseInt(tagsFormattedTextField.getText());
                ids=ids*100;
                classe=classe*10;
                tags=tags*1;
                int total=ids+classe+tags;
                JOptionPane.showMessageDialog(null, String.format("A quantidade total de pontos é : %d \nIds = %d \nClasses = %d \nTags = %d",total,ids,classe,tags));
            }
        });
    }

    public static void main(String[] args) {
        Main calculadora = new Main();
        calculadora.setContentPane(calculadora.calculadoraDeCss);
        calculadora.setTitle("Calculadora de CSS");
        calculadora.setSize(450, 300);
        calculadora.setVisible(true);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
