package br.com.redhat.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MinhaRota extends RouteBuilder {
	private static final String CAMEL_SQL_CLAUSE = "CamelSqlClause";

	@Override
	public void configure() throws Exception {

//		from("direct:executando-sql").routeId("rota-sql").log("[LENDO TABELA 2]")
//				.wireTap("log:br.com.redhat.workshop?showAll=true&multiline=true").process(exchange -> {
//					final Request body = exchange.getIn().getBody(Request.class);
//					final String cnpjs = body.getPessoaJuridica().stream().map(e -> e.getCnpj())
//							.collect(Collectors.joining(","));
//					
//					exchange.getIn().setHeader(CAMEL_SQL_CLAUSE, cnpjs);
//				})
//				.to("sql:classpath:sql/select-tabela.sql?outputType=SelectList")
//				.wireTap("log:br.com.redhat.workshop?showAll=true&multiline=true");

	}

}
