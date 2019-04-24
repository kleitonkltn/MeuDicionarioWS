
package ifms.ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WordDefinition complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WordDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Definitions" type="{http://services.aonaware.com/webservices/}ArrayOfDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordDefinition", propOrder = {
    "word",
    "definitions"
})
public class WordDefinition {

    @XmlElement(name = "Word")
    protected String word;
    @XmlElement(name = "Definitions")
    protected ArrayOfDefinition definitions;

    /**
     * Obtém o valor da propriedade word.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWord() {
        return word;
    }

    /**
     * Define o valor da propriedade word.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWord(String value) {
        this.word = value;
    }

    /**
     * Obtém o valor da propriedade definitions.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDefinition }
     *     
     */
    public ArrayOfDefinition getDefinitions() {
        return definitions;
    }

    /**
     * Define o valor da propriedade definitions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDefinition }
     *     
     */
    public void setDefinitions(ArrayOfDefinition value) {
        this.definitions = value;
    }

}
