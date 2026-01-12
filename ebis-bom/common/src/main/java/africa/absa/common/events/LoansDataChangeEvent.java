package africa.absa.common.events;


import lombok.Data;

@Data
public class LoansDataChangeEvent {
    private String mobileNumber;
    private Long loanNumber;
}
