CREATE TYPE TransactionType AS ENUM ('sale', 'return', 'void');

CREATE TABLE Transaction (
  record_id  UUID PRIMARY KEY NOT NULL,
  cashier_id UUID REFERENCES Employee (employee_id),
  amount     DOUBLE,
  type       TransactionType  NOT NULL,
  parent_id  UUID REFERENCES transaction (record_id),
  timestamp  TIMESTAMP
);
