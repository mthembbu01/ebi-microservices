package africa.absa.common.events;

import lombok.Data;

@Data
public class AccountsDataChangeEvent {
    private String mobileNumber;
    private Long accountNumber;
}
