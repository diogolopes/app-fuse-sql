
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
 *         &lt;element name="ConsultarCPFP1TResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfil1" minOccurs="0"/&gt;
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
    "consultarCPFP1TResult"
})
@XmlRootElement(name = "ConsultarCPFP1TResponse")
public class ConsultarCPFP1TResponse {

    @XmlElement(name = "ConsultarCPFP1TResult")
    protected ArrayOfPessoaPerfil1 consultarCPFP1TResult;

    /**
     * Gets the value of the consultarCPFP1TResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfil1 }
     *     
     */
    public ArrayOfPessoaPerfil1 getConsultarCPFP1TResult() {
        return consultarCPFP1TResult;
    }

    /**
     * Sets the value of the consultarCPFP1TResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfil1 }
     *     
     */
    public void setConsultarCPFP1TResult(ArrayOfPessoaPerfil1 value) {
        this.consultarCPFP1TResult = value;
    }

}
