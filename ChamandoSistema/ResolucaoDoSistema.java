import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {
    
    public static void main(String[] args) {
        
        Toolkit rs = Toolkit.getDefaultToolkit();
        Dimension d = rs.getScreenSize();
        System.out.println("Resolução do sistema: ");
        System.out.println(d.width + "x" + d.height);
    }
}