package com.android.calculator2;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.concurrent.TimeUnit;

public class DurationRule implements TestRule {

    private static class RepeatStatement extends Statement {

        private final int times;
        private final Statement statement;

        private RepeatStatement( int times, Statement statement ) {
            this.times = times;
            this.statement = statement;
        }

        @Override
        public void evaluate() throws Throwable {
            int timeset = times/1000;
            long timeMillis = System.currentTimeMillis();
            long timeStart = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
            long timeEnd = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
            long timeloop = timeStart + timeset;
          // if (timeEnd > timeloop)
           //{
              for( long i = timeEnd; i < timeloop; i++ ) {
                  statement.evaluate();
              }
              // System.out.println("END");
          // }
        }
    }

    @Override
    public Statement apply( Statement statement, Description description ) {
        Statement result = statement;
        Duration duration = description.getAnnotation(Duration.class);
        if( duration != null ) {
            int times = duration.s();
            result = new RepeatStatement( times, statement );
        }
        return result;
    }
}