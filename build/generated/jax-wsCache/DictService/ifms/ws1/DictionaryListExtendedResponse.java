
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
 *         &lt;element name="DictionaryListExtendedResult" type="{http://services.aonaware.com/webservices/}ArrayOfDictionary" minOccurs="0"/>
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
    "dictionaryListExtendedResult"
})
@XmlRootElement(name = "DictionaryListExtendedResponse")
public class DictionaryListExtendedResponse {

    @XmlElement(name = "DictionaryListExtendedResult")
    protected ArrayOfDictionary dictionaryListExtendedResult;

    /**
     * Obtém o valor da propriedade dictionaryListExtendedResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDictionary }
     *     
     */
    public ArrayOfDictionary getDictionaryListExtendedResult() {
        return dictionaryListExtendedResult;
    }

    /**
     * Define o valor da propriedade dictionaryListExtendedResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDictionary }
     *     
     */
    public void setDictionaryListExtendedResult(ArrayOfDictionary value) {
        this.dictionaryListExtendedResult = value;
    }

}
