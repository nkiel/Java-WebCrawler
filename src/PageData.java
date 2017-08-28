import java.net.URL;
import java.util.*;

public class PageData {
	URL pageURL;
	String pageName;
	String[] title;
	String[] h1;
	Map<String, String> altTags = new HashMap<String, String>();

	public PageData() {
	}

	public PageData(URL url) {
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
	}

	void addAltTag(String imgTitle, String altText) {
		altTags.put(imgTitle, altText);
		// System.out.println(altTags.get("dog"));
	}
}
