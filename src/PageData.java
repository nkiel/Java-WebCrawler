import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class PageData {
	URL pageURL;
	String pageName;
	String[] title;
	String[] h1;
	Map<String, String> altTags = new HashMap<String, String>();

	/*
	 * Default Constructor
	 */
	public PageData() {
	}

	/*
	 * Lazy man's Constuctor - will build the entire thing from a URL object.
	 */
	public PageData(URL url) throws IOException {
		pageURL = url;
		// System.out.println("protocol = " + aURL.getProtocol());
		// System.out.println("authority = " + aURL.getAuthority());
		// System.out.println("host = " + aURL.getHost());
		// System.out.println("port = " + aURL.getPort());
		// System.out.println("path = " + aURL.getPath());
		// System.out.println("query = " + aURL.getQuery());
		// System.out.println("filename = " + aURL.getFile());
		// System.out.println("ref = " + aURL.getRef());
		// protocol = http
		// authority = example.com:80
		// host = example.com
		// port = 80
		// path = /docs/books/tutorial/index.html
		// query = name=networking
		// filename = /docs/books/tutorial/index.html?name=networking
		// ref = DOWNLOADING
		pageName = url.getPath();

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	}

	void addAltTag(String imgTitle, String altText) {
		altTags.put(imgTitle, altText);
		// System.out.println(altTags.get("dog"));
	}
}
