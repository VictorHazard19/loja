package br.com.alura.loja;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;



public class Servidor {

	public static void main(String[] args) throws IOException {

		URI uri = URI.create("http://localhost:8080");
		ResourceConfig config = new ResourceConfig().packages("br.com.lojas");
		
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer (uri, config);
		
		  System.out.println("Servidor Rodando");
	      System.in.read();
	      server.stop();
	}

}
