
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
 *         &lt;element name="ConsultarCNPJP2TResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/}ArrayOfCNPJPerfil2" minOccurs="0"/&gt;
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
    "consultarCNPJP2TResult"
})
@XmlRootElement(name = "ConsultarCNPJP2TResponse")
public class ConsultarCNPJP2TResponse {

    @XmlElement(name = "ConsultarCNPJP2TResult")
    protected ArrayOfCNPJPerfil2 consultarCNPJP2TResult;

    /**
     * Gets the value of the consultarCNPJP2TResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCNPJPerfil2 }
     *     
     */
    public ArrayOfCNPJPerfil2 getConsultarCNPJP2TResult() {
        return consultarCNPJP2TResult;
    }

    /**
     * Sets the value of the consultarCNPJP2TResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCNPJPerfil2 }
     *     
     */
    public void setConsultarCNPJP2TResult(ArrayOfCNPJPerfil2 value) {
        this.consultarCNPJP2TResult = value;
    }

}
