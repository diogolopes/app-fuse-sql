package br.com.redhat.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import https.hom_infoconv_receita_fazenda_gov_br.ws.cpf.ArrayOfPessoaPerfil1;
import https.hom_infoconv_receita_fazenda_gov_br.ws.cpf.ConsultarCPF;
import https.hom_infoconv_receita_fazenda_gov_br.ws.cpf.PessoaPerfil1;


@Component
public class InfoconvRoute extends RouteBuilder {

	private static String CPF_CONSULTANTE = "79506240949";
	
	@Override
	public void configure() throws Exception {
	
		 from("timer://foo?fixedRate=true&period=5000")
		 .routeId("infoconvSoapEndpoint")		 
		 
		 .process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				ConsultarCPF consultarCPF = new ConsultarCPF();
				ArrayOfPessoaPerfil1 aPerfil1 = consultarCPF.getConsultarCPFSoap().consultarCPFP1("", CPF_CONSULTANTE);
				PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);

				System.out.println(pessoa.getNome());
		
			}
		});
		     
		
	}
}
