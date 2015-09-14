package com.company;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by isa on 9/14/15.
 */
public class LineProcessor {
    
    Calculator calculator = new Calculator();
    
    public void processLine(String[] lineInfo) {
        switch (processDate(lineInfo[0])) {
            case 2:
                calculator.add(lineInfo[1]);
                calculator.setDivisor(1);
                break;
            case 3:
                calculator.add(lineInfo[1]);
                calculator.setDivisor(2);
                break;
            case 4:
                calculator.add(lineInfo[1]);
                calculator.setDivisor(3);
                break;
            case 5:
                calculator.add(lineInfo[1]);
                calculator.setDivisor(4);
                break;
            case 6:
                calculator.add(lineInfo[1]);
                calculator.setDivisor(5);
                break;
        }

        float result = calculator.calculateAverage();
        System.out.println(result);
    }

    private int processDate(String date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(date));
        //print week year
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
