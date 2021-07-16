
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
 *         &lt;element name="ConsultarCPFPDResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfilD" minOccurs="0"/&gt;
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
    "consultarCPFPDResult"
})
@XmlRootElement(name = "ConsultarCPFPDResponse")
public class ConsultarCPFPDResponse {

    @XmlElement(name = "ConsultarCPFPDResult")
    protected ArrayOfPessoaPerfilD consultarCPFPDResult;

    /**
     * Gets the value of the consultarCPFPDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfilD }
     *     
     */
    public ArrayOfPessoaPerfilD getConsultarCPFPDResult() {
        return consultarCPFPDResult;
    }

    /**
     * Sets the value of the consultarCPFPDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfilD }
     *     
     */
    public void setConsultarCPFPDResult(ArrayOfPessoaPerfilD value) {
        this.consultarCPFPDResult = value;
    }

}
