
package ifms.ws1;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

/**
 *
 * @author NVIDIA
 */
public class ServidorMeuDicionario {

    public static void main(String[] args) throws IOException {

        DicionarioWS dicionarioWS = new DicionarioWS();
        String url = "http://localhost:8080/dicionario";
        JOptionPane.showMessageDialog(null, "dicionarioWS rodando/ " + url + "?WSDL");
        System.out.println("dicionarioWS rodando/ " + url + "?WSDL");
        Endpoint.publish(url, dicionarioWS);
        java.awt.Desktop.getDesktop().open( new File( "C:/Users/NVIDIA/Documents/NetBeansProjects/clienteMeuDicionario/dist/clienteMeuDicionario.jar" ) );

    }

}
