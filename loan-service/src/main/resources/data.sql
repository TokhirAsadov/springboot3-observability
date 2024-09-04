truncate table loans;
ALTER TABLE loans AUTO_INCREMENT = 1;
INSERT INTO loans (id, loanId, customerName, customerId, amount, loanStatus)
VALUES (1, UUID(), 'Tokhir', 101, 5000.00, 'APPROVED'),
       (2, UUID(), 'Umid', 102, 7500.00, 'APPROVED'),
       (3, UUID(), 'Aziz', 103, 3000.00, 'REJECTED');