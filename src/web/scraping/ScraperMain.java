package web.scraping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class ScraperMain {
	

	public static void main(String[] args) {
		try {
			String query = "";
			URL example = new URL("http://www.example.com");
			BufferedReader in = new BufferedReader(new InputStreamReader(example.openStream()));
			
			String line;
			String src = null;
			
			while ((line = in.readLine()) != null) {
				src += line + "\n";
			}
			
			
			
			
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
