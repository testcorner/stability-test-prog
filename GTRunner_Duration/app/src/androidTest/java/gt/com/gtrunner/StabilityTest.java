package gt.com.gtrunner;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;



@RunWith(DurationTestRunner.class)
public class StabilityTest {
    @Test
    @Duration(s = 10 * 60)
    public void Stage1(){
        JUnitCore.runClasses("Test 1 class");
        System.out.println("Test case1");
    }
    @Test
    @Duration(s = 10)
        public void Stage2(){
        JUnitCore.runClasses("Test 2 class");
        System.out.println("Test case2");
    }
}