package uz.tokhir.frauddetectionservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.tokhir.frauddetectionservice.repository.FraudRecordRepository;

@Service
@RequiredArgsConstructor
public class FraudDetectionService {

    private final FraudRecordRepository fraudRecordRepository;

}
