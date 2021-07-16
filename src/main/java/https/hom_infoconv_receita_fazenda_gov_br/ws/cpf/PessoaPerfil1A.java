
package https.hom_infoconv_receita_fazenda_gov_br.ws.cpf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PessoaPerfil1A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PessoaPerfil1A"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoCadastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidenteExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataInscricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoMunicipioNaturalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMunicipioNaturalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UFMunicipioNaturalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaPerfil1A", propOrder = {
    "cpf",
    "nome",
    "situacaoCadastral",
    "residenteExterior",
    "nomeMae",
    "dataAtualizacao",
    "dataInscricao",
    "codigoMunicipioNaturalidade",
    "nomeMunicipioNaturalidade",
    "ufMunicipioNaturalidade",
    "erro"
})
public class PessoaPerfil1A {

    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "SituacaoCadastral")
    protected String situacaoCadastral;
    @XmlElement(name = "ResidenteExterior")
    protected String residenteExterior;
    @XmlElement(name = "NomeMae")
    protected String nomeMae;
    @XmlElement(name = "DataAtualizacao")
    protected String dataAtualizacao;
    @XmlElement(name = "DataInscricao")
    protected String dataInscricao;
    @XmlElement(name = "CodigoMunicipioNaturalidade")
    protected String codigoMunicipioNaturalidade;
    @XmlElement(name = "NomeMunicipioNaturalidade")
    protected String nomeMunicipioNaturalidade;
    @XmlElement(name = "UFMunicipioNaturalidade")
    protected String ufMunicipioNaturalidade;
    @XmlElement(name = "Erro")
    protected String erro;

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the situacaoCadastral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    /**
     * Sets the value of the situacaoCadastral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoCadastral(String value) {
        this.situacaoCadastral = value;
    }

    /**
     * Gets the value of the residenteExterior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenteExterior() {
        return residenteExterior;
    }

    /**
     * Sets the value of the residenteExterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenteExterior(String value) {
        this.residenteExterior = value;
    }

    /**
     * Gets the value of the nomeMae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * Sets the value of the nomeMae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMae(String value) {
        this.nomeMae = value;
    }

    /**
     * Gets the value of the dataAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Sets the value of the dataAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtualizacao(String value) {
        this.dataAtualizacao = value;
    }

    /**
     * Gets the value of the dataInscricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInscricao() {
        return dataInscricao;
    }

    /**
     * Sets the value of the dataInscricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInscricao(String value) {
        this.dataInscricao = value;
    }

    /**
     * Gets the value of the codigoMunicipioNaturalidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMunicipioNaturalidade() {
        return codigoMunicipioNaturalidade;
    }

    /**
     * Sets the value of the codigoMunicipioNaturalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMunicipioNaturalidade(String value) {
        this.codigoMunicipioNaturalidade = value;
    }

    /**
     * Gets the value of the nomeMunicipioNaturalidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMunicipioNaturalidade() {
        return nomeMunicipioNaturalidade;
    }

    /**
     * Sets the value of the nomeMunicipioNaturalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMunicipioNaturalidade(String value) {
        this.nomeMunicipioNaturalidade = value;
    }

    /**
     * Gets the value of the ufMunicipioNaturalidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFMunicipioNaturalidade() {
        return ufMunicipioNaturalidade;
    }

    /**
     * Sets the value of the ufMunicipioNaturalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFMunicipioNaturalidade(String value) {
        this.ufMunicipioNaturalidade = value;
    }

    /**
     * Gets the value of the erro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErro() {
        return erro;
    }

    /**
     * Sets the value of the erro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErro(String value) {
        this.erro = value;
    }

}
