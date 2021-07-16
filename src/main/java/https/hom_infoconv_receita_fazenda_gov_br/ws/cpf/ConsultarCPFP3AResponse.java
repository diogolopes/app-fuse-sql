
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
 *         &lt;element name="ConsultarCPFP3AResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfil3A" minOccurs="0"/&gt;
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
    "consultarCPFP3AResult"
})
@XmlRootElement(name = "ConsultarCPFP3AResponse")
public class ConsultarCPFP3AResponse {

    @XmlElement(name = "ConsultarCPFP3AResult")
    protected ArrayOfPessoaPerfil3A consultarCPFP3AResult;

    /**
     * Gets the value of the consultarCPFP3AResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfil3A }
     *     
     */
    public ArrayOfPessoaPerfil3A getConsultarCPFP3AResult() {
        return consultarCPFP3AResult;
    }

    /**
     * Sets the value of the consultarCPFP3AResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfil3A }
     *     
     */
    public void setConsultarCPFP3AResult(ArrayOfPessoaPerfil3A value) {
        this.consultarCPFP3AResult = value;
    }

}
