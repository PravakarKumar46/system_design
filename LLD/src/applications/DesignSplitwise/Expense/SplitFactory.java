package applications.DesignSplitwise.Expense;

import applications.DesignSplitwise.Expense.Split.EqualExpenseSplit;
import applications.DesignSplitwise.Expense.Split.ExpenseSplit;
import applications.DesignSplitwise.Expense.Split.PercentageExpenseSplit;
import applications.DesignSplitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
