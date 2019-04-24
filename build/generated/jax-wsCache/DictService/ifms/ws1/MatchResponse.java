
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
 *         &lt;element name="MatchResult" type="{http://services.aonaware.com/webservices/}ArrayOfDictionaryWord" minOccurs="0"/>
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
    "matchResult"
})
@XmlRootElement(name = "MatchResponse")
public class MatchResponse {

    @XmlElement(name = "MatchResult")
    protected ArrayOfDictionaryWord matchResult;

    /**
     * Obtém o valor da propriedade matchResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDictionaryWord }
     *     
     */
    public ArrayOfDictionaryWord getMatchResult() {
        return matchResult;
    }

    /**
     * Define o valor da propriedade matchResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDictionaryWord }
     *     
     */
    public void setMatchResult(ArrayOfDictionaryWord value) {
        this.matchResult = value;
    }

}
