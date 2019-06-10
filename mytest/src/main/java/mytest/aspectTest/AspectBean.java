package mytest.aspectTest;

public class AspectBean {
	private String aspectBean = "aspectBean";

	public String getAspectBean() {
		return aspectBean;
	}

	public void setAspectBean(String aspectBean) {
		this.aspectBean = aspectBean;
	}

	public void test() {
		System.out.println("test AspectBean!");
	}
}
