package Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://northwoodtechnology.ie/");
		
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		
//		driver.close();

		
	}

}
