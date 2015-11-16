package com.zebra.transaction;

import com.zebra.dataModel.Transaction;
import java.util.UUID;
import org.npc.dataaccess.repository.BaseRepositoryInterface;

public interface TransactionRepositoryInterface extends BaseRepositoryInterface<Transaction> {
	Transaction byTransactionId(UUID Transaction_ID);
}
