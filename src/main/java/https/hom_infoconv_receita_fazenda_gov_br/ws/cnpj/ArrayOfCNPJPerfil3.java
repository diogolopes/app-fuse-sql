
package https.hom_infoconv_receita_fazenda_gov_br.ws.cnpj;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCNPJPerfil3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCNPJPerfil3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CNPJPerfil3" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/}CNPJPerfil3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCNPJPerfil3", propOrder = {
    "cnpjPerfil3"
})
public class ArrayOfCNPJPerfil3 {

    @XmlElement(name = "CNPJPerfil3", nillable = true)
    protected List<CNPJPerfil3> cnpjPerfil3;

    /**
     * Gets the value of the cnpjPerfil3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnpjPerfil3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCNPJPerfil3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CNPJPerfil3 }
     * 
     * 
     */
    public List<CNPJPerfil3> getCNPJPerfil3() {
        if (cnpjPerfil3 == null) {
            cnpjPerfil3 = new ArrayList<CNPJPerfil3>();
        }
        return this.cnpjPerfil3;
    }

}
