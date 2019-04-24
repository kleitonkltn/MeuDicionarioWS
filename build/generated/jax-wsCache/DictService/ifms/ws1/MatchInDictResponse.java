
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
 *         &lt;element name="MatchInDictResult" type="{http://services.aonaware.com/webservices/}ArrayOfDictionaryWord" minOccurs="0"/>
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
    "matchInDictResult"
})
@XmlRootElement(name = "MatchInDictResponse")
public class MatchInDictResponse {

    @XmlElement(name = "MatchInDictResult")
    protected ArrayOfDictionaryWord matchInDictResult;

    /**
     * Obtém o valor da propriedade matchInDictResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDictionaryWord }
     *     
     */
    public ArrayOfDictionaryWord getMatchInDictResult() {
        return matchInDictResult;
    }

    /**
     * Define o valor da propriedade matchInDictResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDictionaryWord }
     *     
     */
    public void setMatchInDictResult(ArrayOfDictionaryWord value) {
        this.matchInDictResult = value;
    }

}
