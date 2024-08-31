package uz.tokhir.loanservice.repository;

import io.micrometer.observation.annotation.Observed;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Observed
public class LoanRepository {

    private final JdbcClient jdbcClient;

}
