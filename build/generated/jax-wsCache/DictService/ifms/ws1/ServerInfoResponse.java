
package ifms.ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServerInfoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serverInfoResult"
})
@XmlRootElement(name = "ServerInfoResponse")
public class ServerInfoResponse {

    @XmlElement(name = "ServerInfoResult")
    protected String serverInfoResult;

    /**
     * Obtém o valor da propriedade serverInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerInfoResult() {
        return serverInfoResult;
    }

    /**
     * Define o valor da propriedade serverInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerInfoResult(String value) {
        this.serverInfoResult = value;
    }

}
