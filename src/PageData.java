import java.util.*;

public class PageData {
	String pageName;
	String[] title;
	String[] h1;
	Map<String, String> altTags = new HashMap<String, String>();

	void addAltTag(String imgTitle, String altText) {
		altTags.put(imgTitle, altText);
		//System.out.println(altTags.get("dog"));
	}
}
