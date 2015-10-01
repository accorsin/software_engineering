CREATE TABLE TransactionEntry (
	record_id		UUID PRIMARY KEY NOT NULL,
	transaction_id		int REFERENCES transaction(record_id),
	product_id		int REFERENCES product(product_id),
	price 			numeric REFERENCES product(price),
	quantity		int CHECK (quantity >= 0)
	);
