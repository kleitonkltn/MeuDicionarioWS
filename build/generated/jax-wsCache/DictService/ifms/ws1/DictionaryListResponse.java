
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
 *         &lt;element name="DictionaryListResult" type="{http://services.aonaware.com/webservices/}ArrayOfDictionary" minOccurs="0"/>
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
    "dictionaryListResult"
})
@XmlRootElement(name = "DictionaryListResponse")
public class DictionaryListResponse {

    @XmlElement(name = "DictionaryListResult")
    protected ArrayOfDictionary dictionaryListResult;

    /**
     * Obtém o valor da propriedade dictionaryListResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDictionary }
     *     
     */
    public ArrayOfDictionary getDictionaryListResult() {
        return dictionaryListResult;
    }

    /**
     * Define o valor da propriedade dictionaryListResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDictionary }
     *     
     */
    public void setDictionaryListResult(ArrayOfDictionary value) {
        this.dictionaryListResult = value;
    }

}
