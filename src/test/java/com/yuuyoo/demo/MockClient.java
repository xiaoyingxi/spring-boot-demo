package com.yuuyoo.demo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.ClassPathResource;
import java.io.IOException;

public class MockClient {

//  public static void main(String[] args) throws Exception {
//    WireMock.configureFor(8080);
//    WireMock.removeAllMappings();
//
//    mock("/order/1", "01");
//    mock("/order/2", "02");
//  }
//
//  private static void mock(String url, String file) throws IOException {
//    ClassPathResource resource = new ClassPathResource("mock/response/" + file + ".txt");
//    String content = StringUtils.join(FileUtils.readLines(resource.getFile(), "UTF-8").toArray(), "\n");
//    WireMock.stubFor(WireMock.get(WireMock.urlPathEqualTo(url)).willReturn(WireMock.aResponse().withBody(content).withStatus(200)));
//  }

}
