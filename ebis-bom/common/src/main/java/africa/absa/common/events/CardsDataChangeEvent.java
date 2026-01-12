package africa.absa.common.events;

import lombok.Data;

@Data
public class CardsDataChangeEvent {

    private String mobileNumber;
    private Long cardNumber;
}
