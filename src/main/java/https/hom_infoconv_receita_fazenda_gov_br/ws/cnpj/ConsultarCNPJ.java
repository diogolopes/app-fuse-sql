package https.hom_infoconv_receita_fazenda_gov_br.ws.cnpj;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-07-16T16:25:03.689-03:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "ConsultarCNPJ",
                  wsdlLocation = "file:/home/dilopes/repo/spring-boot/app-fuse/src/main/resources/wsdl/cnpj_hom.wsdl",
                  targetNamespace = "https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/")
public class ConsultarCNPJ extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/", "ConsultarCNPJ");
    public final static QName ConsultarCNPJSoap12 = new QName("https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/", "ConsultarCNPJSoap12");
    public final static QName ConsultarCNPJSoap = new QName("https://hom-infoconv.receita.fazenda.gov.br/ws/cnpj/", "ConsultarCNPJSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/dilopes/repo/spring-boot/app-fuse/src/main/resources/wsdl/cnpj_hom.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConsultarCNPJ.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/dilopes/repo/spring-boot/app-fuse/src/main/resources/wsdl/cnpj_hom.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ConsultarCNPJ(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsultarCNPJ(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarCNPJ() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ConsultarCNPJ(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ConsultarCNPJ(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ConsultarCNPJ(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJSoap12")
    public ConsultarCNPJSoap getConsultarCNPJSoap12() {
        return super.getPort(ConsultarCNPJSoap12, ConsultarCNPJSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJSoap12")
    public ConsultarCNPJSoap getConsultarCNPJSoap12(WebServiceFeature... features) {
        return super.getPort(ConsultarCNPJSoap12, ConsultarCNPJSoap.class, features);
    }


    /**
     *
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJSoap")
    public ConsultarCNPJSoap getConsultarCNPJSoap() {
        return super.getPort(ConsultarCNPJSoap, ConsultarCNPJSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJSoap")
    public ConsultarCNPJSoap getConsultarCNPJSoap(WebServiceFeature... features) {
        return super.getPort(ConsultarCNPJSoap, ConsultarCNPJSoap.class, features);
    }

}
