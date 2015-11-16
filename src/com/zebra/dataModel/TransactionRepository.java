package com.zebra.transaction;

import java.sql.SQLException;

import org.npc.dataaccess.repository.BaseRepository;
import org.npc.dataaccess.repository.DatabaseTable;
import org.npc.dataaccess.repository.helpers.PostgreFunctionType;
import org.npc.dataaccess.repository.helpers.SQLComparisonType;
import org.npc.dataaccess.repository.helpers.where.WhereClause;
import org.npc.dataaccess.repository.helpers.where.WhereContainer;
import org.npc.testmodel.models.Product;
import org.npc.testmodel.models.fieldnames.ProductFieldNames;
import org.npc.testmodel.repositories.interfaces.ProductRepositoryInterface;
/* import PACKAGE for TransactionRepositoryInterface*/
/* import PACKAGE for TransactionFieldNames*/

public class TransactionRepository extends BaseRepository<Product> implements TransactionRepositoryInterface {
	@Override
	public Transaction byTransactionID (UUID transID) {
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