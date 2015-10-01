CREATE TYPE transaction_type AS ENUM ('sale','return','void');

CREATE TABLE transaction (
	record_id		UUID PRIMARY KEY NOT NULL,
	cashier_id	UUID REFERENCES employee(employee_id),
	amount		double;
	type			transaction_type NOT NULL;
	parent_id		UUID REFERENCES transaction(record_id),
	timestamp		timestamp
	);
