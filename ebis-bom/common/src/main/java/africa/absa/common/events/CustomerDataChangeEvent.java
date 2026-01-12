package africa.absa.common.events;

import lombok.Data;

@Data
public class CustomerDataChangeEvent {
    private String name;
    private String mobileNumber;
    private Boolean activeSw;
}
