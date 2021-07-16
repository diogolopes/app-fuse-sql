
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
 *         &lt;element name="ConsultarCPFP2TResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfil2" minOccurs="0"/&gt;
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
    "consultarCPFP2TResult"
})
@XmlRootElement(name = "ConsultarCPFP2TResponse")
public class ConsultarCPFP2TResponse {

    @XmlElement(name = "ConsultarCPFP2TResult")
    protected ArrayOfPessoaPerfil2 consultarCPFP2TResult;

    /**
     * Gets the value of the consultarCPFP2TResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfil2 }
     *     
     */
    public ArrayOfPessoaPerfil2 getConsultarCPFP2TResult() {
        return consultarCPFP2TResult;
    }

    /**
     * Sets the value of the consultarCPFP2TResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfil2 }
     *     
     */
    public void setConsultarCPFP2TResult(ArrayOfPessoaPerfil2 value) {
        this.consultarCPFP2TResult = value;
    }

}
