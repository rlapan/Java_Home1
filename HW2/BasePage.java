package HW2;

public class BasePage implements IPageble {

	private String title;
	private String url;
	private String htmlContent;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	@Override
	public boolean isDisplayedChrome() {
		// TODO Auto-generated method stub

		return true;
	}

	@Override
	public boolean isDisplayedFF() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getHtmlChrome() {
		if (isDisplayedChrome()) {
			return htmlContent;
		} else {
			return null;
		}

	}

	@Override
	public String getHtmlFF() {
		if (isDisplayedFF()) {
			return htmlContent;
		} else {
			return null;
		}
	}
	
	public String htmlBuilder() {
		//System.out.println(getHtmlContent());
		return getHtmlContent();
	}
	

}
