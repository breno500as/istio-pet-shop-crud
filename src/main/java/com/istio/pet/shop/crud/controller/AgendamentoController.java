package com.istio.pet.shop.crud.controller;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agendamentos")
public class AgendamentoController {

	@PostMapping
	public ResponseEntity<String> criaAgendamento() throws ClientProtocolException, IOException {
		
		CloseableHttpClient client = HttpClientBuilder.create().build();

		//o host deve ser o mesmo nome do atributo name do service
		CloseableHttpResponse response = client.execute(new HttpPost("http://pet-shop-finances/financa/pagamentos"));
		
		System.out.println(response.getStatusLine().getStatusCode());
		
		String bodyAsString = EntityUtils.toString(response.getEntity());
		
		System.out.println(bodyAsString);

		return ResponseEntity.ok("Agendado");
	}

}
