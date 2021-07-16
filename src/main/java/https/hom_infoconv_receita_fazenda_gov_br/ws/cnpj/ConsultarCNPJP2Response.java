
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
 *         &lt;element name="ConsultarCNPJP2Result" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/}ArrayOfCNPJPerfil2" minOccurs="0"/&gt;
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
    "consultarCNPJP2Result"
})
@XmlRootElement(name = "ConsultarCNPJP2Response")
public class ConsultarCNPJP2Response {

    @XmlElement(name = "ConsultarCNPJP2Result")
    protected ArrayOfCNPJPerfil2 consultarCNPJP2Result;

    /**
     * Gets the value of the consultarCNPJP2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCNPJPerfil2 }
     *     
     */
    public ArrayOfCNPJPerfil2 getConsultarCNPJP2Result() {
        return consultarCNPJP2Result;
    }

    /**
     * Sets the value of the consultarCNPJP2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCNPJPerfil2 }
     *     
     */
    public void setConsultarCNPJP2Result(ArrayOfCNPJPerfil2 value) {
        this.consultarCNPJP2Result = value;
    }

}
