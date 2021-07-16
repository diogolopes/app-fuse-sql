
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
 *         &lt;element name="ConsultarCNPJP1TResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/}ArrayOfCNPJPerfil1" minOccurs="0"/&gt;
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
    "consultarCNPJP1TResult"
})
@XmlRootElement(name = "ConsultarCNPJP1TResponse")
public class ConsultarCNPJP1TResponse {

    @XmlElement(name = "ConsultarCNPJP1TResult")
    protected ArrayOfCNPJPerfil1 consultarCNPJP1TResult;

    /**
     * Gets the value of the consultarCNPJP1TResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCNPJPerfil1 }
     *     
     */
    public ArrayOfCNPJPerfil1 getConsultarCNPJP1TResult() {
        return consultarCNPJP1TResult;
    }

    /**
     * Sets the value of the consultarCNPJP1TResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCNPJPerfil1 }
     *     
     */
    public void setConsultarCNPJP1TResult(ArrayOfCNPJPerfil1 value) {
        this.consultarCNPJP1TResult = value;
    }

}
