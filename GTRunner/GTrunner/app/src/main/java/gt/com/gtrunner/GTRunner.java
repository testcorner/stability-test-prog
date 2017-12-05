package gt.com.gtrunner;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;


/**
 * Created by EdenLai on 2017/10/19.
 */

public class GTRunner extends GTTestRunner{
    public GTRunner(Class<?> type) throws InitializationError {
        super(type);
    }
    @Override
    public void run(RunNotifier notifier) {
        notifier.addListener(new JUnitExecutionListener());
        super.run(notifier);

    }
}
