package com.zebra.transaction;

import com.zebra.dataModel.TransactionEntry;
import java.util.UUID;
import org.npc.dataaccess.repository.BaseRepositoryInterface;

public interface TransactionEntryRepositoryInterface extends BaseRepositoryInterface<TransactionEntry> {
	TransactionEntry byTransactionEntryId(UUID TransactionEntry_ID);
}
