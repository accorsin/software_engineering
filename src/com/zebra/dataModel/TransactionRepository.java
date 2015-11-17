package com.zebra.dataModel;

import java.sql.SQLException;
import java.util.UUID;

import org.npc.dataaccess.repository.BaseRepository;
import org.npc.dataaccess.repository.DatabaseTable;
import org.npc.dataaccess.repository.helpers.PostgreFunctionType;
import org.npc.dataaccess.repository.helpers.SQLComparisonType;
import org.npc.dataaccess.repository.helpers.where.WhereClause;
import org.npc.dataaccess.repository.helpers.where.WhereContainer;
/* import PACKAGE for TransactionRepositoryInterface*/
/* import PACKAGE for TransactionFieldNames*/

public class TransactionRepository extends BaseRepository<Transaction> implements TransactionRepositoryInterface {
	@Override
	public Transaction byTransactionId(UUID transID) {
		return this.firstOrDefaultWhere(
			new WhereContainer(
				(new WhereClause()).
					postgreFunction(PostgreFunctionType.LOWER).
					table(this.primaryTable).
					fieldName(TransactionFieldNames.ID).
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
	public Transaction createOne() {
		return new Transaction();
	}
	
	public TransactionRepository() {
		super(DatabaseTable.TRANSACTION);
	}
}
