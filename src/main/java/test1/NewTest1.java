package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
	int a = 10;
	int b = 5;
  @Test(priority=1)
  public void add() {
	  int c = a+b;
	  Assert.assertEquals(c, 15);
  }
  @Test(priority=2)
  public void sub() {
	  int c = a-b;
	  Assert.assertEquals(c, 5);
  }
  @Test(priority=3)
  public void mul() {
	  int c = a*b;
	  Assert.assertEquals(c, 50);
  }
  @Test(priority=4)
  public void div() {
	  int c = a/b;
	  Assert.assertEquals(c, 2);
  }
  
}
