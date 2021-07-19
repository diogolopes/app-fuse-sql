package br.com.redhat.routes;

import java.io.FileNotFoundException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.infoconv.cpf.ArrayOfPessoaPerfil1;
import com.infoconv.cpf.ConsultarCPF;
import com.infoconv.cpf.ConsultarCPFSoap;

@Component
public class InfoconvRoute extends RouteBuilder {

	private static String CPF_CONSULTANTE = "79506240949";
	private static String LISTA_CPFS = "31544622287;31544630115;31544649304;31544886268;31580572200;31581676468;33722277353;33760241387;83121064053;00305727036;31545688834;31545866791;31547931000;31548660787;31549080806;31549756834;31549861700;31545912300;31550630768;31561900125;31544622104;31544622368;31544622791;31544622872;31544630700;31544649215;31544649487;31544649649;31544657234;31544657668;31546153772;31546986715;31547869887;31548180815;31554172853;31555195849;31556221800;31544894791;31553737768;31558410872;31545190097;31545220263;31545840644;31546650300;31549578472;31549713787;31551521091;31552218791;31553907787;31554652553;31544622520;31544649134;31544690363;31544827253;31544886349;31545033820;31545041504;31545068100;31545122253;31545165300;31648991220;33433763020;33533024091;34013750759;34118730278;34155279720;34354301849;34354476800;34504125315;34687041191;31545262268;31545521700;31547087315;31549136291;31550576291;31556590334;31558852387;31559620706;31560989220;31562523015";

	@Override
	public void configure() throws Exception {

		secureRoute();

		// getContext().addComponent("undertow", getUndertowComponent(getContext()));

		from("timer://foo?fixedRate=true&period=50000").routeId("infoconvSoapEndpoint")

				.process(new Processor() {

					@Override
					public void process(Exchange exchange) throws Exception {
						ConsultarCPF consultarCPF = new ConsultarCPF();

						// ConsultarCPFSoap consultarCPFSoap12 = consultarCPF.getConsultarCPFSoap12();
						ConsultarCPFSoap consultarCPFSoap = consultarCPF.getConsultarCPFSoap12();

						ArrayOfPessoaPerfil1 aPerfil1 = consultarCPFSoap.consultarCPFP1T(LISTA_CPFS, CPF_CONSULTANTE);
						
						aPerfil1.getPessoaPerfil1().stream().forEach(p -> System.out.println("Erro=[" + p.getErro() + "], Nome=[" + p.getNome() + "]"));
					}
				});

	}

	private void secureRoute() throws FileNotFoundException {
		System.setProperty("javax.net.ssl.keyStore",
				ResourceUtils.getURL("classpath:store/SOAKeystoreV2.jks").getPath());
		System.setProperty("javax.net.ssl.keyStorePassword", "123456");
		System.setProperty("javax.net.ssl.keyStoreType", "JKS");
//		System.setProperty("javax.net.ssl.trustStore", "/home/jrsalvador/IdeaProjects/infoconv-consumer/infoconv-ws/src/main/resources/META-INF/store/banparaTrust.jks");
//		System.setProperty("javax.net.ssl.trustStorePassword", "Dqm50vnc");
//		System.setProperty("javax.net.ssl.trustStoreType", "JKS");
		// System.setProperty("javax.net.debug", "all");
		System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
	}

//	private UndertowComponent getUndertowComponent(CamelContext context) throws Exception {
//		UndertowComponent uc = new UndertowComponent(context);
//		UndertowHostOptions uho = new UndertowHostOptions();
//		uho.setHttp2Enabled(true);
//		uc.setHostOptions(uho);
//		// uc.setUseGlobalSslContextParameters(true);
//		// to enabled SSL support on undertow
//		setupSSLConext(uc);
//
//		return uc;
//	}

//	private void setupSSLConext(UndertowComponent uc) throws Exception {
//
//		KeyStoreParameters keyStoreParameters = new KeyStoreParameters();
//		// Change this path to point to your truststore/keystore as jks files
//		// mudar para pegar direto do resources
//		keyStoreParameters.setResource("/home/dilopes/Downloads/mykey.p12");
//		keyStoreParameters.setPassword("Dqm50vnc");
//
//		KeyManagersParameters keyManagersParameters = new KeyManagersParameters();
//		keyManagersParameters.setKeyStore(keyStoreParameters);
//		keyManagersParameters.setKeyPassword("Dqm50vnc");
//
//		TrustManagersParameters trustManagersParameters = new TrustManagersParameters();
//		trustManagersParameters.setKeyStore(keyStoreParameters);
//
//		
//		
//		
//		
//		SSLContextParameters sslContextParameters = new SSLContextParameters();
//		sslContextParameters.setKeyManagers(keyManagersParameters);
//		sslContextParameters.setTrustManagers(trustManagersParameters);
//
//		SSLContextServerParameters scsp = new SSLContextServerParameters();
//		scsp.setClientAuthentication("REQUIRE");
//		SSLContextParameters scp = new SSLContextParameters();
//		scp.setServerParameters(scsp);
//		scp.setKeyManagers(keyManagersParameters);
//
//		SSLContext context = scp.createSSLContext();
//		// SSLEngine engine = scp.createSSLEngine();
//		uc.setSslContextParameters(scp);
//
//	}
}
