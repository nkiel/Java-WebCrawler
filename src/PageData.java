import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PageData {
	Document page;
	String pageName;
	String title;
	String[] h1;
	Map<String, String> altTags = new HashMap<String, String>(); // URL - ALT
	ArrayList<String> urls = new ArrayList<String>();

	/*
	 * Default Constructor
	 */
	public PageData() {
	}

	/*
	 * Lazy man's Constructor - will build the entire SEO from a url String.
	 */
	public PageData(String url) throws IOException {
		// Title
		page = Jsoup.connect(url).get();
		title = page.title();
		// H1
		Elements h1Tags = page.select("h1");
		h1 = new String[h1Tags.size()];
		for (int i = 0; i < h1Tags.size(); i++) {
			System.out.println(h1Tags.get(i));
			h1[i] = h1Tags.get(i).text();
		}
		// img alt Tags
		Elements imgTags = page.select("img");
		for (int i = 0; i < imgTags.size(); i++) {
			altTags.put(imgTags.get(i).attr("src"), imgTags.get(i).attr("alt"));
		}
		// URLs
		Elements links = page.select("a");
		for (int i = 0; i < links.size(); i++) {
			urls.add(links.get(i).attr("href"));
		}
	}
}
