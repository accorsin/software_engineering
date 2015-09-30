--tender_entry table

CREATE TYPE tender AS ENUM ('Cash', 'Giftcard', 'Mastercard', 'VISA', 'Discover', 'AMEX', 'Debit');

CREATE TABLE tender_entry(
	record_id 		int 	PRIMARY KEY 	NOT NULL,	
	transaction_id  int references TRANSACTION(record_id), --Foreign key
	tender_type		tender,
	amount			money,
	created			timestamp	DEFAULT current_timestamp		
);
