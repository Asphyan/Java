import javax.swing.*;
import java.awt.event.*;

public class Window {
    JFrame f;
    JButton b;
    JTextField tf;
    Window(){
        f = new JFrame("New Window"); //Instanciando JF(Janela).
        b = new JButton("Next"); //Instanciando JB(Botão).
        tf = new JTextField(); //Instanciando JT(Texto).

        //botões
        b.setBounds(200, 100, 100, 40);
        f.add(b);
        
        //janela.
        f.setSize(500, 400); //Largura e Altura.
        f.setLayout(null); //Usando sem gerenciadores de layout.
        f.setVisible(true); //Tornando o quadro visível.
    }
    public static void main(String[] args) throws Exception {
        new Window();
    }
}
