package behavioural.strategyDP;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentService {

    private PaymentStrategy strategy;

    public void checkout(double amount) {
        strategy.pay(amount);
    }

}
