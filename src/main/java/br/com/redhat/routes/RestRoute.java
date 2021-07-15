package br.com.redhat.routes;

import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import br.com.redhat.model.Request;

@Component
public class RestRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		restConfiguration().host("0.0.0.0").port(8080).bindingMode(RestBindingMode.auto);

		rest("/consulta").post("/cnpj").type(Request.class).outType(List.class).consumes("application/json")
				.produces("application/json")
				// .param()
				// .name("request").type(RestParamType.body).dataType("string").required(true)
				// .endParam()
				.route().routeId("rest-consulta")
		.to("direct:executando-sql").endRest();

	}
}
