CREATE TABLE TransactionEntry (
  record_id      UUID PRIMARY KEY NOT NULL,
  transaction_id UUID REFERENCES Transaction (record_id),
  product_id     UUID REFERENCES Product (product_id),
  price          MONEY REFERENCES Product (price),
  quantity       INT CHECK (quantity >= 0)
);
