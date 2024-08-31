package uz.tokhir.loanservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Loan {

    private Long id;
    private String loanId;
    private String customerName;
    private int customerId;
    private BigDecimal amount;
    private LoanStatus loanStatus;

}
