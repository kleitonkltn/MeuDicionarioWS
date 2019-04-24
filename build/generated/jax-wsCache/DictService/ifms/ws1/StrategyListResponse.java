
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
 *         &lt;element name="StrategyListResult" type="{http://services.aonaware.com/webservices/}ArrayOfStrategy" minOccurs="0"/>
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
    "strategyListResult"
})
@XmlRootElement(name = "StrategyListResponse")
public class StrategyListResponse {

    @XmlElement(name = "StrategyListResult")
    protected ArrayOfStrategy strategyListResult;

    /**
     * Obtém o valor da propriedade strategyListResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStrategy }
     *     
     */
    public ArrayOfStrategy getStrategyListResult() {
        return strategyListResult;
    }

    /**
     * Define o valor da propriedade strategyListResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStrategy }
     *     
     */
    public void setStrategyListResult(ArrayOfStrategy value) {
        this.strategyListResult = value;
    }

}
