import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class Gui extends JFrame{
    GridBagConstraints constraints = new GridBagConstraints();
    GridBagLayout layout = new GridBagLayout();
    JTextField jtNome = new JTextField();
    JTextField jtPais = new JTextField();
    JTextField jtAtrativos = new JTextField();
    JTextField jtNota = new JTextField();
    JButton jbAdicionar = new JButton("Adicionar");
    JButton jbExcluir = new JButton("Excluir");
    JButton jbProximo = new JButton(">");
   
}
