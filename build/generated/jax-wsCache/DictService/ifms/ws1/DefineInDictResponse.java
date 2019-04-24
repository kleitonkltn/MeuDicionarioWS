
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
 *         &lt;element name="DefineInDictResult" type="{http://services.aonaware.com/webservices/}WordDefinition" minOccurs="0"/>
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
    "defineInDictResult"
})
@XmlRootElement(name = "DefineInDictResponse")
public class DefineInDictResponse {

    @XmlElement(name = "DefineInDictResult")
    protected WordDefinition defineInDictResult;

    /**
     * Obtém o valor da propriedade defineInDictResult.
     * 
     * @return
     *     possible object is
     *     {@link WordDefinition }
     *     
     */
    public WordDefinition getDefineInDictResult() {
        return defineInDictResult;
    }

    /**
     * Define o valor da propriedade defineInDictResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WordDefinition }
     *     
     */
    public void setDefineInDictResult(WordDefinition value) {
        this.defineInDictResult = value;
    }

}
