import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormTela extends JFrame {

    public JPanel panelMain;
    private JTextField textNota1;
    private JTextField textNota2;
    private JButton loginButton;
    private JButton cadastrarSeButton;

    public FormTela() {


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FormTelaPosLogin formPosLogin = new FormTelaPosLogin();

                formPosLogin.setVisible(true);

            }
        });
        cadastrarSeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FormSegundaTela formSegundaTelaCadasto = new FormSegundaTela();
                formSegundaTelaCadasto.setContentPane(formSegundaTelaCadasto.PanelMainDois);
                formSegundaTelaCadasto.setVisible(true);
                formSegundaTelaCadasto.setSize(350, 350);
            }
        });
    }

}