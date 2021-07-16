
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
 *         &lt;element name="ConsultarCPFPD2Result" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfilD2" minOccurs="0"/&gt;
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
    "consultarCPFPD2Result"
})
@XmlRootElement(name = "ConsultarCPFPD2Response")
public class ConsultarCPFPD2Response {

    @XmlElement(name = "ConsultarCPFPD2Result")
    protected ArrayOfPessoaPerfilD2 consultarCPFPD2Result;

    /**
     * Gets the value of the consultarCPFPD2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfilD2 }
     *     
     */
    public ArrayOfPessoaPerfilD2 getConsultarCPFPD2Result() {
        return consultarCPFPD2Result;
    }

    /**
     * Sets the value of the consultarCPFPD2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfilD2 }
     *     
     */
    public void setConsultarCPFPD2Result(ArrayOfPessoaPerfilD2 value) {
        this.consultarCPFPD2Result = value;
    }

}
