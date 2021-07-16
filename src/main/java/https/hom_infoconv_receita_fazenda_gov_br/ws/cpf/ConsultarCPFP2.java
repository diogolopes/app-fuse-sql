
package https.hom_infoconv_receita_fazenda_gov_br.ws.cpf;

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
 *         &lt;element name="ListaDeCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "listaDeCPF",
    "cpfUsuario"
})
@XmlRootElement(name = "ConsultarCPFP2")
public class ConsultarCPFP2 {

    @XmlElement(name = "ListaDeCPF")
    protected String listaDeCPF;
    @XmlElement(name = "CPFUsuario")
    protected String cpfUsuario;

    /**
     * Gets the value of the listaDeCPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaDeCPF() {
        return listaDeCPF;
    }

    /**
     * Sets the value of the listaDeCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaDeCPF(String value) {
        this.listaDeCPF = value;
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