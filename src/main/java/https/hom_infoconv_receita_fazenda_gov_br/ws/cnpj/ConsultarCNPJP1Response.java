
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
 *         &lt;element name="ConsultarCNPJP1Result" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/}ArrayOfCNPJPerfil1" minOccurs="0"/&gt;
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
    "consultarCNPJP1Result"
})
@XmlRootElement(name = "ConsultarCNPJP1Response")
public class ConsultarCNPJP1Response {

    @XmlElement(name = "ConsultarCNPJP1Result")
    protected ArrayOfCNPJPerfil1 consultarCNPJP1Result;

    /**
     * Gets the value of the consultarCNPJP1Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCNPJPerfil1 }
     *     
     */
    public ArrayOfCNPJPerfil1 getConsultarCNPJP1Result() {
        return consultarCNPJP1Result;
    }

    /**
     * Sets the value of the consultarCNPJP1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCNPJPerfil1 }
     *     
     */
    public void setConsultarCNPJP1Result(ArrayOfCNPJPerfil1 value) {
        this.consultarCNPJP1Result = value;
    }

}
