package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import appium.Appium;
import io.appium.java_client.android.AndroidDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;
import io.appium.java_client.MobileElement;


public class Appium {

	private static AndroidDriver<MobileElement> driver;


	@Test
	public void ConfiAppium() throws InterruptedException, Exception {
		
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("udid", "HAAZB600X236CSZ");
		capabilities.setCapability("deviceName", "ASUS_Z01KD");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.0");
		capabilities.setCapability("automationName", "UIAutomator");
		//capabilities.setCapability( "appPackage", "com.android.chrome" );
		//capabilities.setCapability("bundleId", "com.android.chrome");
		capabilities.setCapability("browserName", "chrome");
		//Instancia o driver do Android apontando para o ip do servidor Appium e
		//passando as configuracoes defindas acima
		//driver = new AndroidDriver(new URL("http://127.0.0.1:8001/wd/hub"),capabilities);
		//return driver;
		//Setando local do chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\745093\\Documents\\driver\\chromedriver.exe");
		//Instanciando o Appium Driver
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:8001/wd/hub"), capabilities);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}

		//Abrindo URL no Chrome Browser
		driver.get("http://testapp.galenframework.com/");
		CRhomePageLayoutTest();
		CRMyNotesLayoutTest();
		CREventTest();
		

	}

	

	// **********************************************************************************************
	// **********************************TESTE 1° Chrome*********************************************
	// **********************************************************************************************
	public static void CRhomePageLayoutTest() throws Exception {

		
		//Create a layoutReport object
		//CheckLayout function checks the layout and returns a LayoutReport object
		LayoutReport layoutReport = Galen.checkLayout(driver, "specs/homepage.gspec", Arrays.asList("mobile"));
		
		//Scroll da página para baixo
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,250)", "");

		//Criando a lista com GalenTestInfo
		List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

		//Estanciando o objeto do GalenTestInfo
		GalenTestInfo test = GalenTestInfo.fromString("CRhomepage layout");

		//Selecionando com get para check layout
		test.getReport().layout(layoutReport, "check CRhomepage layout");

		//Add test object to the tests list
		tests.add(test);

		//Estanciando o objeto do htmlReportBuilder
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		//Criando reportbuild em target
		htmlReportBuilder.build(tests, "target");

		//If para validar se o layout retornar erros
		if (layoutReport.errors() > 0) {
			Assert.fail("Layout test failed");
		}
	}

	// **********************************************************************************************
	// ***********************************TESTE 2° Chrome********************************************
	// **********************************************************************************************
	public static void CRMyNotesLayoutTest() throws Exception, InterruptedException {

		
		//Clicar o botao login na welcomepage
		WebElement Botao = driver.findElement(By.cssSelector("button"));
		Botao.click();

		//Realizar o login na pagina
		WebElement usuario = driver.findElement(By.name("login.username"));
		WebElement senha = driver.findElement(By.name("login.password"));
		WebElement Button = driver.findElement(By.cssSelector("button"));

		usuario.sendKeys("testuser@example.com");
		senha.sendKeys("test123");
		Button.click();

		Thread.sleep(1000);
		//Create a layoutReport object
		//CheckLayout function checks the layout and returns a LayoutReport object
		LayoutReport layoutReport = Galen.checkLayout(driver, "specs/mynotes.gspec", Arrays.asList("desktop"));

		//Criando a lista com GalenTestInfo
		List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

		//Estanciando o objeto do GalenTestInfo
		GalenTestInfo test = GalenTestInfo.fromString("CRmynotes layout");

		//Selecionando com get para check layout
		test.getReport().layout(layoutReport, "check CRmynotes layout");

		//Add test object to the tests list
		tests.add(test);

		//Estanciando o objeto do htmlReportBuilder
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		//Criando reportbuild em target
		htmlReportBuilder.build(tests, "target");

	}

	// **********************************************************************************************
	// ************************************TESTE 3° Chrome*******************************************
	// **********************************************************************************************
	public static void CREventTest() throws Exception, InterruptedException {

		//Scroll da página para baixo
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,250)", "");

		//Ainda na mynotes realizar o teste abaixo
		//Mover o cursor em cima do botao
		WebElement searchBtn = driver.findElement(By.cssSelector("button"));
		Actions action = new Actions(driver);
		action.moveToElement(searchBtn).perform();
		Thread.sleep(3000);

		//Create a layoutReport object
		//CheckLayout function checks the layout and returns a LayoutReport object
		LayoutReport layoutReport = Galen.checkLayout(driver, "specs/eventTeste.gspec", Arrays.asList("desktop"));

		//Criando a lista com GalenTestInfo
		List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

		//Estanciando o objeto do GalenTestInfo
		GalenTestInfo test = GalenTestInfo.fromString("CReventTeste layout");

		//Selecionando com get para check layout
		test.getReport().layout(layoutReport, "check CReventTest layout");

		//Add test object to the tests list
		tests.add(test);

		//Estanciando o objeto do htmlReportBuilder
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		//Criando reportbuild em target
		htmlReportBuilder.build(tests, "target");

		//If para validar se o layout retornar erros
		if (layoutReport.errors() > 0) {
			Assert.fail("Layout test failed");
		}

		Thread.sleep(3000);

	}

	//Para fechar o navegador
	@After
	public void CRtearDown() {
		driver.quit();
	}

}
