package com.zebra.dataModel;

import java.sql.SQLException;
import java.util.UUID;

import com.zebra.dataModel.TransactionEntry;
import org.npc.dataaccess.repository.BaseRepository;
import org.npc.dataaccess.repository.DatabaseTable;
import org.npc.dataaccess.repository.helpers.PostgreFunctionType;
import org.npc.dataaccess.repository.helpers.SQLComparisonType;
import org.npc.dataaccess.repository.helpers.where.WhereClause;
import org.npc.dataaccess.repository.helpers.where.WhereContainer;
/* import PACKAGE for TransactionEntryRepositoryInterface*/
/* import PACKAGE for TransactionEntryFieldNames*/

public class TransactionEntryRepository extends BaseRepository<TransactionEntry> implements TransactionEntryRepositoryInterface {
	@Override
	public TransactionEntry byTransactionEntryId(UUID transID) {
		return this.firstOrDefaultWhere(
			new WhereContainer(
				(new WhereClause()).
					postgreFunction(PostgreFunctionType.LOWER).
					table(this.primaryTable).
					fieldName(TransactionEntryFieldNames.ID).
					comparison(SQLComparisonType.EQUALS)
			),
			(ts) -> {
				try {
					ts.setObject(1, transID);
				} catch (SQLException e) {}

				return ts;
			}
		);
	}
	
	@Override
	public TransactionEntry createOne() {
		return new TransactionEntry();
	}
	
	public TransactionEntryRepository() {
		super(DatabaseTable.ENTRY);
	}
}
