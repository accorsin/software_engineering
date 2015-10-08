CREATE TYPE TransactionType AS ENUM ('sale', 'return', 'void');

CREATE TABLE Transaction (
  record_id  UUID PRIMARY KEY NOT NULL,
  cashier_id UUID REFERENCES Employee (record_id),
  amount     MONEY,
  type       TransactionType  NOT NULL,
  parent_id  UUID,
  timestamp  TIMESTAMP DEFAULT now()
);
