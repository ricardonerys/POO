import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaJanela extends JFrame{

    public MinhaJanela(){
        setLayout(new FlowLayout());
        JLabel label = new JLabel("clique no botão:");
        JButton botao = new JButton("clique aqui");

        add(label);
        add(botao);

        setTitle("minha janela swing");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}