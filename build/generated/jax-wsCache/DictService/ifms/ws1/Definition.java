
package ifms.ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Definition complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dictionary" type="{http://services.aonaware.com/webservices/}Dictionary" minOccurs="0"/>
 *         &lt;element name="WordDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Definition", propOrder = {
    "word",
    "dictionary",
    "wordDefinition"
})
public class Definition {

    @XmlElement(name = "Word")
    protected String word;
    @XmlElement(name = "Dictionary")
    protected Dictionary dictionary;
    @XmlElement(name = "WordDefinition")
    protected String wordDefinition;

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
     * Obtém o valor da propriedade dictionary.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getDictionary() {
        return dictionary;
    }

    /**
     * Define o valor da propriedade dictionary.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setDictionary(Dictionary value) {
        this.dictionary = value;
    }

    /**
     * Obtém o valor da propriedade wordDefinition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordDefinition() {
        return wordDefinition;
    }

    /**
     * Define o valor da propriedade wordDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordDefinition(String value) {
        this.wordDefinition = value;
    }

}
