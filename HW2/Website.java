package HW2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collection;

public class Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasePage aboutPage = new AboutPage();
		prefillPage(aboutPage, "This is about page title", "http://bla_bla.com",
				"This is html content body of current Aboutpage");

		BasePage aboutPage2 = new AboutPage();
		prefillPage(aboutPage2, "This is about page title", "http://yo_ma_yo.com",
				"This is html content body of current Aboutpage2");

		BasePage forumPage = new ForumPage();
		prefillPage(forumPage, "This is forum page title", "http://bla_bla_furum.com",
				"This is html content body of current Forumpage");

		BasePage forumPage2 = new ForumPage();
		prefillPage(forumPage2, "This is forum2 page title", "http://bla_bla_furum2.com",
				"This is html content body of current Forumpage2");

		BasePage loginPage = new LoginPage();
		prefillPage(loginPage, "This is login page title", "http://login_page.com",
				"This is html content body of current Loginpage");

		BasePage homePage = new HomePage();
		prefillPage(homePage, "This is home page title", "http://home_page.com",
				"This is html content body of current Homepage");

		Collection<BasePage> collection = new ArrayList<>();

		collection.add(aboutPage);
		collection.add(aboutPage2);
		collection.add(forumPage);
		collection.add(forumPage2);
		collection.add(loginPage);
		collection.add(homePage);

		System.out.println(collection.size());
		pageCollectionPrint(collection);
		pageCollectionOpenChrome(collection);
		pageCollectionOpenFF(collection);
		pageCollectionHtmlbuilder(collection);
		uniqueTitles(collection);
		hashMapWithHtmlContentOfPages(collection);

	}

	public static void prefillPage(BasePage basePage, String title, String url, String htmlContent) {
		basePage.setTitle(title);
		basePage.setUrl(url);
		basePage.setHtmlContent(htmlContent);

	}

	public static void pageCollectionPrint(Collection<BasePage> collection) {

		for (BasePage basepage : collection) {
			System.out.println(basepage.getTitle() + " " + basepage.getUrl() + " " + basepage.getHtmlContent());
		}

	}

	public static void pageCollectionOpenChrome(Collection<BasePage> collection) {
		System.out.println("Collections of pages which open in Chrome ");
		for (BasePage basepage : collection) {
			if (basepage.isDisplayedChrome()) {

				System.out.println(basepage.getTitle());
			}

		}
	}

	public static void pageCollectionOpenFF(Collection<BasePage> collection) {
		System.out.println("Collections of pages which open in FF ");
		for (BasePage basepage : collection) {
			if (basepage.isDisplayedFF()) {

				System.out.println(basepage.getTitle());
			}

		}
	}

	public static void pageCollectionHtmlbuilder(Collection<BasePage> collection) {
		for (BasePage basepage : collection) {
			basepage.htmlBuilder();
			System.out.println(basepage.htmlBuilder());

		}
	}

	public static void uniqueTitles(Collection<BasePage> collection) {
		System.out.println("Task5");
		Collection<String> collection2 = new ArrayList<>();
		for (BasePage basepage : collection) {
			if (!collection2.contains(basepage.getTitle())) {
				collection2.add(basepage.getTitle());

				System.out.println(basepage.getTitle());
			}
		}
	}

	public static void hashMapWithHtmlContentOfPages(Collection<BasePage> collection) {

		HashMap<String, List<BasePage>> map = new HashMap<String, List<BasePage>>();

		for (BasePage basepage : collection) {
			String title = basepage.getTitle();
			if (map.containsKey(title)) {
				List<BasePage> val = map.get(title);
				val.add(basepage);

			} else {
				List<BasePage> list = new ArrayList<>();
				list.add(basepage);
				map.put(title, list);

			}

		}

		for (String key : map.keySet()) {

			for (BasePage value : map.get(key)) {

				System.out.println(value.getHtmlContent());
			}
			// i += key + map.get();
		}

	}

}
