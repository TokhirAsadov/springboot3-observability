package uz.tokhir.loanservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.tokhir.loanservice.client.FraudDetectionClient;
import uz.tokhir.loanservice.dto.LoanDto;
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
}
