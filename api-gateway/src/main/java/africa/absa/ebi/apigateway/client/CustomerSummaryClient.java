package africa.absa.ebi.apigateway.client;

import africa.absa.ebi.apigateway.dto.AccountsDto;
import africa.absa.ebi.apigateway.dto.CardsDto;
import africa.absa.ebi.apigateway.dto.CustomerDto;
import africa.absa.ebi.apigateway.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

public interface CustomerSummaryClient {

    @GetExchange(value = "/ebi/customer/api/fetch",accept = "application/json")
    Mono<ResponseEntity<CustomerDto>> fetchCustomerDetails(@RequestParam(value = "mobileNumber") String mobileNumber);

    @GetExchange(value = "/ebi/accounts/api/fetch",accept = "application/json")
    Mono<ResponseEntity<AccountsDto>> fetchAccountDetails(@RequestParam(value = "mobileNumber") String mobileNumber);

    @GetExchange(value = "/ebi/loans/api/fetch",accept = "application/json")
    Mono<ResponseEntity<LoansDto>> fetchLoanDetails(@RequestParam(value = "mobileNumber") String mobileNumber);

    @GetExchange(value = "/ebi/cards/api/fetch",accept = "application/json")
    Mono<ResponseEntity<CardsDto>> fetchCardDetails(@RequestParam(value = "mobileNumber") String mobileNumber);
}
