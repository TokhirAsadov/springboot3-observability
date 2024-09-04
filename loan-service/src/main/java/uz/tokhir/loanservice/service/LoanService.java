package uz.tokhir.loanservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.tokhir.loanservice.client.FraudDetectionClient;
import uz.tokhir.loanservice.dto.LoanDto;
import uz.tokhir.loanservice.entity.Loan;
import uz.tokhir.loanservice.entity.LoanStatus;
import uz.tokhir.loanservice.repository.LoanRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanService {

    private final LoanRepository loanRepository;
    private final FraudDetectionClient fraudDetectionClient;

    public List<LoanDto> listAllLoans() {
        return loanRepository.findAll()
                .stream()
                .map(LoanDto::from)
                .toList();
    }

    public String applyLoan(LoanDto loanDto) {
        var loan = Loan.from(loanDto);
        LoanStatus loanStatus = fraudDetectionClient.evaluateLoan(loan.getCustomerId());
        loan.setLoanStatus(loanStatus);
        if (loanStatus.equals(LoanStatus.APPROVED)) {
            loanRepository.save(loan);
            return "Loan applied successfully";
        }
        return "Sorry! Your loan was not approved";
    }
}
