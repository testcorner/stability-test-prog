package gt.com.gtrunner;
/**
 * Created by EdenLai on 2017/7/11.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD})
public @interface Testorder {
    public int order();
}
