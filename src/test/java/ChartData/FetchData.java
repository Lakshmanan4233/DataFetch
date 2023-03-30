package ChartData;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;

public class FetchData extends BaseClass{
	
	public static void main(String[] args) throws Exception {
		
		//sortFunction();
		sortDeepText();
		
		
		
		 
		
		
	}

	
	public static void sleeps(long sec) throws Exception {
		Thread.sleep(sec);

	}
	
	//Get the data from the chart
	public static void automateChart() throws Exception {


		getDriver(); implicitywaits(10);
		getUrl("");
		sendkeys(elementById("email"), "");
		sendkeys(elementById("password"), "");
		click(elementByXpath(""));
		sleeps(5000);
		click(elementByXpath("//h5[.='']"));
		sleeps(7000);
		click(elementByXpath(""));
		sleeps(5000);
		
		javaexecutorScrollDown(elementByXpath(""));
		sleeps(5000);
		
		WebElement text =  elementByXpath("");
		
		System.out.println(getText(text)); 

	}
	
	//Validate the sort function
	
	public static void sortFunction() throws Exception {
		
		getDriver();implicitywaits(30);getUrl("https://letcode.in/table");
		
		//Click the column
		click(elementByXpath("(//div[.='Dessert (100g)'])[2]"));
		sleeps(4000);
		
		List<WebElement> elementsByXpath = elementsByXpath("//tr[@class='ng-star-inserted']/child::td[2]");

		
		// Get Text Using for Loops
//		for(int i=0; i<elementsByXpath.size(); i++) {
//			
//			System.out.println(elementsByXpath.get(i).getText());
//		
//			
//		}
		
		//Sorted List
		
		 List<String> collect = elementsByXpath.stream().map(s->s.getText()).collect(Collectors.toList());
		 
//		 System.out.println(collect.get(0).getClass().getSimpleName());
//		 
//		 String string = collect.get(0);
//		 
//		 Object parseInt = Integer.parseInt(string);
//		 
//		 System.out.println(parseInt.getClass().getSimpleName());
//		
//		
//		List<String> sortedListfrjs = sortedListfrWeb.stream().sorted().collect(Collectors.toList());
//		
//		System.out.println((sortedListfrWeb.equals(sortedListfrjs)) ? "Sort Function working as expected": "sort function is not working properly");
//		
		
	}
	
	public static  void sortDeepText() throws Exception {
		

		getDriver(); implicitywaits(10);
		getUrl("");
		sendkeys(elementById("email"), "");
		sendkeys(elementById("password"), "");
		click(elementByXpath(""));
		sleeps(5000);
		click(elementByXpath(""));
		sleeps(7000);
		
		String sortTable = "";
		
		click(elementByXpath(sortTable));
		
		List<WebElement> elementsByXpath = elementsByXpath("");
		
		List<String> collectWeb = elementsByXpath.stream().map(d->d.getText()).collect(Collectors.toList());
		
		elementsByXpath.stream().map(d->d.getText()).forEach(d->System.out.println(d));
		
		List<String> collectJava = collectWeb.stream().sorted().collect(Collectors.toList());
		
		
		System.out.println((collectWeb.equals(collectJava)? "Sort function working fine" : "Sort function is not working"));
	}
	
	
	public static void fetchDatawithPagination(String projectName) throws Exception {
		
		getDriver(); implicitywaits(10);
		getUrl("");
		sendkeys(elementById("email"), "");
		sendkeys(elementById("password"), "");
		click(elementByXpath(""));
		sleeps(5000);
		click(elementByXpath(""));
		sleeps(7000);
		
		
		
		List<WebElement> elementsByXpath = elementsByXpath("");

		
	}
}
