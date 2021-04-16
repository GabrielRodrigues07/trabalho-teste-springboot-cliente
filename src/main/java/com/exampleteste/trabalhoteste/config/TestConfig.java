package com.exampleteste.trabalhoteste.config;

import java.time.Instant;
import java.util.Arrays;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exampleteste.trabalhoteste.entities.Cliente;
import com.exampleteste.trabalhoteste.entities.Endereco;
import com.exampleteste.trabalhoteste.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		Cliente cliente1 = new Cliente(null, "Gabriel", Instant.parse("1998-01-07T19:53:07Z"), "9999999999", new Endereco("Gaspar Lemos 275", "Fortaleza", "CE", "Pici", "60440530"));
		Cliente cliente2 = new Cliente(null, "Jose", Instant.parse("1994-12-08T19:53:07Z"), "55555555555", new Endereco("Mister hall 2000", "Fortaleza", "CE", "aaaaaa", "000000000"));
		
		produtoRepository.saveAll(Arrays.asList(cliente1, cliente2));
	}
}
