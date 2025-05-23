package testpackage;
import org.testng.Assert;
import package1.App;
public class Apptest{
	
	public void test1() {
		App myapp= new App();
		Assert.assertEquals(0,myapp.userLogin("Luffy","New"));
	}
	public void test2() {
		App myapp2= new App();
		Assert.assertEquals(1,myapp2.userLogin("Luffy","New"));
	}
}