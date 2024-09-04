package uz.tokhir.frauddetectionservice.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.simple.JdbcClient;

@Repository
@RequiredArgsConstructor
public class FraudRecordRepository {

    private final JdbcClient jdbcClient;


}
