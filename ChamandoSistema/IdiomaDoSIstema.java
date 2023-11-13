import java.util.Locale;

public class IdiomaDoSIstema{

    public static void main(String[] args) {
        Locale id = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(id.getLanguage());
        System.out.println(id.getDisplayLanguage());
        System.out.println(id.getLanguage() + "->" + id.getDisplayLanguage());
    }
}