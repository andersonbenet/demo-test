package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Autor: Anderson da Cruz Benet
*/
public class EcommerceSteps {
	
	private WebDriver driver;
	private String produtoSelecinado;
	private String produtoCarrinho;
	
	@Before
	public void beforeScenario(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Benet\\Documents\\Projetos Automated\\demo-test\\src\\test\\resources\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();		
	}
	
	@After
    public void afterScenario() throws InterruptedException{
		driver.close();        
    }
	
	@Given("^tenha acessado a pagina$")
	public void tenhaAcessadoAPagina() throws Throwable {
		driver.get("http://demo.cs-cart.com/");
		driver.manage().window().maximize();
	}

	@When("^informo o \"([^\"]*)\" no campo procurar produtos$")
	public void informoONoCampoProcurarProdutos(String produto) throws Throwable {
		driver.findElement(By.id("search_input")).sendKeys(produto);	
	}
	
	@When("^clico no icone pesquisar$")
	public void clicoNoIconePesquisar() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button/i")).click();
	} 

	@When("^seleciono um produto na lista de produtos apresentados$")
	public void selecionoUmProdutoNaListaDeProdutosApresentados() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//*[@id=\"pagination_contents\"]/div[2]/div[1]/div/form/div[1]")).click();
	}

	@When("^clico no botao adicionar ao carrinho$")
	public void clicoNoBotaoAdicionarAoCarrinho() throws Throwable {
		driver.findElement(By.xpath(".//button[text()='Adicionar ao carrinho' and @type='submit']")).click();	
		produtoSelecinado = driver.findElement(By.xpath(".//*[@id='tygh_main_container']/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/form/h1/bdi")).getText();
	}

	@When("^clico no icone carrinho de compras$")
	public void clicoNoIconeCarrinhoDeCompras() throws Throwable {
		Thread.sleep(9000);

		driver.findElement(By.xpath("//*[@id=\"sw_dropdown_8\"]/a/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown_8\"]/div/div[2]/div[1]/a")).click();
	}

	@Then("^vejo o produto no carrinho de compras$")
	public void vejoOProdutoNoCarrinhoDeCompras() throws Throwable {	
		produtoCarrinho = driver.findElement(By.className("ty-cart-content__product-title")).getText();
		
		Assert.assertEquals(produtoSelecinado, produtoCarrinho);
	}

}

