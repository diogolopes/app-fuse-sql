
package https.hom_infoconv_receita_fazenda_gov_br.ws.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPessoaPerfil1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPessoaPerfil1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PessoaPerfil1" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}PessoaPerfil1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPessoaPerfil1", propOrder = {
    "pessoaPerfil1"
})
public class ArrayOfPessoaPerfil1 {

    @XmlElement(name = "PessoaPerfil1", nillable = true)
    protected List<PessoaPerfil1> pessoaPerfil1;

    /**
     * Gets the value of the pessoaPerfil1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaPerfil1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaPerfil1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaPerfil1 }
     * 
     * 
     */
    public List<PessoaPerfil1> getPessoaPerfil1() {
        if (pessoaPerfil1 == null) {
            pessoaPerfil1 = new ArrayList<PessoaPerfil1>();
        }
        return this.pessoaPerfil1;
    }

}
