import java.net.*;
import java.io.*;

public class Parser {

	public URL getURL(String urlString) {
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
