
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
 *         &lt;element name="DefineResult" type="{http://services.aonaware.com/webservices/}WordDefinition" minOccurs="0"/>
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
    "defineResult"
})
@XmlRootElement(name = "DefineResponse")
public class DefineResponse {

    @XmlElement(name = "DefineResult")
    protected WordDefinition defineResult;

    /**
     * Obtém o valor da propriedade defineResult.
     * 
     * @return
     *     possible object is
     *     {@link WordDefinition }
     *     
     */
    public WordDefinition getDefineResult() {
        return defineResult;
    }

    /**
     * Define o valor da propriedade defineResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WordDefinition }
     *     
     */
    public void setDefineResult(WordDefinition value) {
        this.defineResult = value;
    }

}
