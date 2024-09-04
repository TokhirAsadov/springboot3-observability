package uz.tokhir.frauddetectionservice.entity;

public record FraudRecord(Long id, String fraudRecordId, int customerId, LoanStatus loanStatus)  {
}
