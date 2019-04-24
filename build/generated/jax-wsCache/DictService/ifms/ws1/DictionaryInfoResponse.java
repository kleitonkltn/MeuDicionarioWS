
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
 *         &lt;element name="DictionaryInfoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dictionaryInfoResult"
})
@XmlRootElement(name = "DictionaryInfoResponse")
public class DictionaryInfoResponse {

    @XmlElement(name = "DictionaryInfoResult")
    protected String dictionaryInfoResult;

    /**
     * Obtém o valor da propriedade dictionaryInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryInfoResult() {
        return dictionaryInfoResult;
    }

    /**
     * Define o valor da propriedade dictionaryInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryInfoResult(String value) {
        this.dictionaryInfoResult = value;
    }

}
