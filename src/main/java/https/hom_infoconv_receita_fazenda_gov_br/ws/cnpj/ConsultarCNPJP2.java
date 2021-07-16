
package https.hom_infoconv_receita_fazenda_gov_br.ws.cnpj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPFUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cnpj",
    "cpfUsuario"
})
@XmlRootElement(name = "ConsultarCNPJP2")
public class ConsultarCNPJP2 {

    @XmlElement(name = "CNPJ")
    protected String cnpj;
    @XmlElement(name = "CPFUsuario")
    protected String cpfUsuario;

    /**
     * Gets the value of the cnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Sets the value of the cnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * Gets the value of the cpfUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPFUsuario() {
        return cpfUsuario;
    }

    /**
     * Sets the value of the cpfUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPFUsuario(String value) {
        this.cpfUsuario = value;
    }

}
