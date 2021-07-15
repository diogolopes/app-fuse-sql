package br.com.redhat.routes;

import java.util.stream.Collectors;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import br.com.redhat.model.Request;

@Component
public class MinhaRota extends RouteBuilder {
	private static final String CAMEL_SQL_CLAUSE = "CamelSqlClause";

	@Override
	public void configure() throws Exception {

		from("direct:executando-sql").routeId("rota-sql").log("[LENDO TABELA 2]")
				.wireTap("log:br.com.redhat.workshop?showAll=true&multiline=true").process(exchange -> {
					final Request body = exchange.getIn().getBody(Request.class);
					final String cnpjs = body.getPessoaJuridica().stream().map(e -> e.getCnpj())
							.collect(Collectors.joining(","));
					
					//final String cnpjs = body.getPessoaJuridica().stream().map(e -> String.format("'%s'", e.getCnpj())).collect(Collectors.joining(","));
					
					exchange.getIn().setHeader(CAMEL_SQL_CLAUSE, cnpjs);
				})
				// .to("sql:classpath:sql/select-tabela.sql?outputClass=br.com.redhat.model.Evento&outputType=SelectList")
				.to("sql:classpath:sql/select-tabela.sql?outputType=SelectList")
				.wireTap("log:br.com.redhat.workshop?showAll=true&multiline=true");

//		from("direct:findIn")
//		 .unmarshal(new JacksonDataFormat(Param.class))
//		 
//		 .process(exchange -> {	
//		
//				Param param = exchange.getIn().getBody(Param.class);
//				String parameterIN = param.getIds().stream().map( m -> m.toString() ).collect( Collectors.joining(","));
//				exchange.getIn().setHeader("parameterIN", parameterIN);			 
//			 
//		  })
//		
//		 		 
//		 .toD("sql://SELECT * FROM SYS.PERSON WHERE id IN (${header.parameterIN})?dataSource=#oracleDS")
//		 .log("### Result : ${body}");		

	}

}
