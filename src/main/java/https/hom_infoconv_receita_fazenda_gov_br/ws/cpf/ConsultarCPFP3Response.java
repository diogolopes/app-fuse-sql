
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
 *         &lt;element name="ConsultarCPFP3Result" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfil3" minOccurs="0"/&gt;
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
    "consultarCPFP3Result"
})
@XmlRootElement(name = "ConsultarCPFP3Response")
public class ConsultarCPFP3Response {

    @XmlElement(name = "ConsultarCPFP3Result")
    protected ArrayOfPessoaPerfil3 consultarCPFP3Result;

    /**
     * Gets the value of the consultarCPFP3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfil3 }
     *     
     */
    public ArrayOfPessoaPerfil3 getConsultarCPFP3Result() {
        return consultarCPFP3Result;
    }

    /**
     * Sets the value of the consultarCPFP3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfil3 }
     *     
     */
    public void setConsultarCPFP3Result(ArrayOfPessoaPerfil3 value) {
        this.consultarCPFP3Result = value;
    }

}
