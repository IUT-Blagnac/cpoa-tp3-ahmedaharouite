//package main;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.runner.RunWith;
//
//import static io.cucumber.java.en.Given;
//import static io.cucumber.java.en.Then;
//import static io.cucumber.java.en.When;
//import static io.cucumber.junit.Cucumber;
//import static io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
//public class RunCucumberTest {
//	private Pizzeria pizzeriaBrest;
//	private Pizza PF;
//	private Pizza PG;
//	private Pizza PP;
//
//	@Given("1 PizzaFromage PF and 1 PizzaGrecque PG and 1 PizzaPoivrons PP")
//	public void a_controller_a_and_a_controller_b() {
//		pizzeriaBrest = new PizzeriaBrest();
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("PF, PG et PP sont commandées")
//	public void a_is_ordered_to_fill_and_boil() {
//		PF = pizzeriaBrest.commanderPizza("Fromage");
//		PG = pizzeriaBrest.commanderPizza("Grecque");
//		PP = pizzeriaBrest.commanderPizza("Poivrons");
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("return 1 Pizza and 1 PizzaFromage and 1 PizzaGrecque and 1 PizzaPoivrons")
//	public void b_cannot_boil() {
//		assertEquals("",PF.getNom());
//		throw new io.cucumber.java.PendingException();
//	}
//}