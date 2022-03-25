 import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
public class mouse
{
public static void main(String[] args) 
{

int i = 0;
    while(true)
    {
      if(i>250)
      {
        break;
      }
    i++;

    try
    {
    Robot robot = new Robot();
    robot.mouseMove(58, 61);//移动鼠标到(10,20)点
    robot.delay(100);
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//按下右键
    robot.delay(100);
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);//释放右键
    robot.delay(120000);
    }
  catch (Exception ex)
  {
   ex.printStackTrace();
  }
    }

}   
}
   
