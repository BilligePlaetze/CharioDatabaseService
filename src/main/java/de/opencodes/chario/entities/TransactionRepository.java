package de.opencodes.chario.entities;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "transaction", path = "transaction")
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, TransactionId> {

    List<Transaction> findByTransactionIdAgentIdAndState(@Param("agentId") String agentId, String state);

    List<Transaction> findByTransactionIdDonationCode(@Param("donationCode") String donationCode);

}