import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class PageDataTest {

	@Test
	public void test_title() throws IOException {
		// firstly create doc
		PageData data = new PageData("http://www.kielcoplus.com/");
		assertEquals("www.kielcoplus.com", data.title);
		PageData data2 = new PageData("http://www.desmoineshomeswithnora.com/");
		assertEquals("Nora Crosthwaite, Keller Williams Realty, Greater Des Moines", data2.title);
	}

	@Test
	public void test_h1() throws IOException {
		// firstly create doc
		PageData data = new PageData(
				"http://www.desmoineshomeswithnora.com/property/ia/50323/urbandale/-/15427-ridgemont-drive/5911d52430e08a4045000011/");
		System.out.println(data.h1.length);
		System.out.printf("%s", data.h1[0]);
		assertEquals("15427 Ridgemont Drive Urbandale IA 50323 $320,000", data.h1[0]);
	}

	@Test
	public void test_altTags() {

	}
}
