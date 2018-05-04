package com.yuuyoo.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private WebTestClient webTestClient;

	@Test
	public void testGetWriteToken() throws Exception {
		webTestClient.get().uri(String.format("/test"))
				.exchange()
				.expectStatus().is5xxServerError();
	}
}
