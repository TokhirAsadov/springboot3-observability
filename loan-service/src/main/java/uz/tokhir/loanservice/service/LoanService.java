package uz.tokhir.loanservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.tokhir.loanservice.client.FraudDetectionClient;
import uz.tokhir.loanservice.repository.LoanRepository;

@Service
@RequiredArgsConstructor
public class LoanService {

    private final LoanRepository loanRepository;
    private final FraudDetectionClient fraudDetectionClient;

}
