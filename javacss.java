import org.openqa.Selenium.;
import org.openqa.Selenium.Chrome.;
import org.openqa.Selenium.By;                                import org.openqa.Selenium.Keys; 
public class SeleniumDemo {
	public static void main(String[]args)   {
		WebDriver driver=newChromeDriver();
		driver.get("https://prefeitura.pbh.gov.br/saude/licitacao/pregao.electronics-151-2020");
		try{
			driver.findElement(By.cssSelector("col-5m-6lbl-licitacao"));
		}
		catch(Exception e)
		try{
			driver.findElement(By.cssSelector("col-5m-6lbl-licitacao"));
		}
			catch(Exception e)
			try{
				driver.findElement(By.cssSelector("lbl-licitacao"));
			}
				catch(Expection e)
				try{
					driver.findElement(By.cssSelector("alert alert-info"));
				}
					catch(Expection e)
		{
			system.out.println("Element not found");
		}}}