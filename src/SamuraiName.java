import javax.swing.JOptionPane;

/**
 *
 * @author LWY
 */
public class SamuraiName {

    public String samuraiName(String nombre) {

        //separamos el nombre en letras
        char toWords[] = nombre.toCharArray();

        //seleccionamos solo las consonates
        String newWord = "";
        for (int i = 0; i < toWords.length; i++) {
            if (toWords[i] == 'a' || toWords[i] == 'e' || toWords[i] == 'i' || toWords[i] == 'o' || toWords[i] == 'u') {

            } else {
                newWord = newWord + String.valueOf(toWords[i]);
            }
        }

        //capturamos y contamos la cantidad de caracteres del texto
        int cantLetras = newWord.length();

        //creamos un vector con el mismo tamaño del texto
        char[] vec = new char[cantLetras];

        //llenamos el vector con cada una de las letras del texto              
        for (int i = 0; i < cantLetras; i++) {
            vec[i] = newWord.charAt(i);
        }

        String[] vec3 = new String[cantLetras];

        for (int i = 0; i < cantLetras; i++) {

            switch (vec[i]) {
                case ' ':
                    vec3[i] = " ";
                    break;
                case 'b':
                    vec3[i] = "zu";
                    break;
                case 'c':
                    vec3[i] = "mi";
                    break;
                case 'd':
                    vec3[i] = "ku";
                    break;
                case 'f':
                    vec3[i] = "ka";
                    break;
                case 'g':
                    vec3[i] = "ji";
                    break;
                case 'h':
                    vec3[i] = "ri";
                    break;
                case 'j':
                    vec3[i] = "zu";
                    break;
                case 'k':
                    vec3[i] = "ki";
                    break;
                case 'l':
                    vec3[i] = "ta";
                    break;
                case 'm':
                    vec3[i] = "rin";
                    break;
                case 'n':
                    vec3[i] = "to";
                    break;
                case 'p':
                    vec3[i] = "no";
                    break;
                case 'q':
                    vec3[i] = "ke";
                    break;
                case 'r':
                    vec3[i] = "shi";
                    break;
                case 's':
                    vec3[i] = "ari";
                    break;
                case 't':
                    vec3[i] = "chi";
                    break;
                case 'v':
                    vec3[i] = "ru";
                    break;
                case 'w':
                    vec3[i] = "mei";
                    break;
                case 'x':
                    vec3[i] = "na";
                    break;
                case 'y':
                    vec3[i] = "fu";
                    break;
                case 'z':
                    vec3[i] = "zi";
                    break;
                default:
                    break;
            }
        }

        String nomNinja = "";

        for (int i = 0; i < cantLetras; i++) {
            nomNinja = nomNinja + vec3[i];
        }
        return nomNinja;
    }

    public static void main(String[] args) {

        SamuraiName sn = new SamuraiName();

        String res = " ";

        while (!"".equals(res)) {
            res = sn.samuraiName(JOptionPane.showInputDialog(null, "INSERT YOUR NAME"));
            if (!"".equals(res)) {
                JOptionPane.showMessageDialog(null, "Your Samurai name is '" + res.toUpperCase() + "'");
            }
        }
    }
}
