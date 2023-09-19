import com.codebase.WaterBottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
// Declaring an instance of WaterBottle
  private WaterBottle bottle; // null

  @Before
  public void before() {
    bottle = new WaterBottle();
  }

  @Test
  public void hasVolume() {
    assertEquals(100, bottle.getVolume());
  }

  @Test
  public void letsDrink() {
    bottle.drink();
    assertEquals(90, bottle.getVolume());
  }

  @Test
  public void letsFill() {
    bottle.fill();
    assertEquals(100, bottle.getVolume());
  }
  @Test
  public void letsEmpty() {
    bottle.empty();
    assertEquals(0, bottle.getVolume());
  }
}



