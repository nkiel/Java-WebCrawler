import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Parser {
	String domain;
	ArrayList<String> pagesToBeIndexed;
	ArrayList<PageData> pageData;

	public Parser(String domain){
		domain = this.domain;
	}
	
	public PageData getPageData(String path){
		PageData data = new PageData();
		
		return data;
	}
	
	public URL getURLobj(String urlString) {
		URL url = null;
		try {
			url = new URL(urlString);
		} catch (MalformedURLException e) {
			// exception handler code here
			// ...
		}
		return url;
	}

	public String getURLString(URL url) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
		return inputLine;
	}
}
