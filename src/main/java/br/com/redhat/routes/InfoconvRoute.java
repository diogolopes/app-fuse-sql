package br.com.redhat.routes;

import javax.net.ssl.SSLContext;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.undertow.UndertowComponent;
import org.apache.camel.component.undertow.UndertowHostOptions;
import org.apache.camel.util.jsse.KeyManagersParameters;
import org.apache.camel.util.jsse.KeyStoreParameters;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.apache.camel.util.jsse.SSLContextServerParameters;
import org.apache.camel.util.jsse.TrustManagersParameters;
import org.springframework.stereotype.Component;

import https.hom_infoconv_receita_fazenda_gov_br.ws.cpf.ArrayOfPessoaPerfil1;
import https.hom_infoconv_receita_fazenda_gov_br.ws.cpf.ConsultarCPF;
import https.hom_infoconv_receita_fazenda_gov_br.ws.cpf.ConsultarCPFSoap;
import https.hom_infoconv_receita_fazenda_gov_br.ws.cpf.PessoaPerfil1;

@Component
public class InfoconvRoute extends RouteBuilder {

	private static String CPF_CONSULTANTE = "79506240949";

	@Override
	public void configure() throws Exception {

		setupSSLConext();

		getContext().addComponent("undertow", getUndertowComponent(getContext()));

		from("timer://foo?fixedRate=true&period=50000").routeId("infoconvSoapEndpoint")

				.process(new Processor() {

					@Override
					public void process(Exchange exchange) throws Exception {
						ConsultarCPF consultarCPF = new ConsultarCPF();

						// ConsultarCPFSoap consultarCPFSoap12 = consultarCPF.getConsultarCPFSoap12();
						ConsultarCPFSoap consultarCPFSoap = consultarCPF.getConsultarCPFSoap();

						ArrayOfPessoaPerfil1 aPerfil1 = consultarCPFSoap.consultarCPFP1("", CPF_CONSULTANTE);
						PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);

						System.out.println(pessoa.getNome());

					}
				});

	}

	private UndertowComponent getUndertowComponent(CamelContext context) {
		UndertowComponent uc = new UndertowComponent(context);
		UndertowHostOptions uho = new UndertowHostOptions();
		uho.setHttp2Enabled(true);
		uc.setHostOptions(uho);
		// uc.setUseGlobalSslContextParameters(true);
		// to enabled SSL support on undertow
		configureSSLforUndertow(uc);

		return uc;
	}

	private void configureSSLforUndertow(UndertowComponent uc) {
		KeyStoreParameters trust_ksp = new KeyStoreParameters();

		//mudar para pegar direto do resources
		trust_ksp.setResource("/home/dilopes/repo/spring-boot/app-fuse/src/main/resources/store/keystore.jks");
		trust_ksp.setPassword("123456");

		TrustManagersParameters trustp = new TrustManagersParameters();
		trustp.setKeyStore(trust_ksp);

		SSLContextParameters scp = new SSLContextParameters();
		scp.setTrustManagers(trustp);
		uc.setSslContextParameters(scp);
	}

	private void setupSSLConext() throws Exception {

		KeyStoreParameters keyStoreParameters = new KeyStoreParameters();
		// Change this path to point to your truststore/keystore as jks files
		//mudar para pegar direto do resources
		keyStoreParameters.setResource("/home/dilopes/repo/spring-boot/app-fuse/src/main/resources/store/keystore.jks");
		keyStoreParameters.setPassword("123456");		
		
		KeyManagersParameters keyManagersParameters = new KeyManagersParameters();
		keyManagersParameters.setKeyStore(keyStoreParameters);
		keyManagersParameters.setKeyPassword("123456");

		TrustManagersParameters trustManagersParameters = new TrustManagersParameters();
		trustManagersParameters.setKeyStore(keyStoreParameters);

		SSLContextParameters sslContextParameters = new SSLContextParameters();
		sslContextParameters.setKeyManagers(keyManagersParameters);
		sslContextParameters.setTrustManagers(trustManagersParameters);

		SSLContextServerParameters scsp = new SSLContextServerParameters();
		scsp.setClientAuthentication("REQUIRE");
		SSLContextParameters scp = new SSLContextParameters();
		scp.setServerParameters(scsp);
		scp.setKeyManagers(keyManagersParameters);

		SSLContext context = scp.createSSLContext();
		//SSLEngine engine = scp.createSSLEngine();

	}
}
