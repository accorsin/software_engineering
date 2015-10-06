CREATE TABLE TransactionEntry (
  record_id      UUID PRIMARY KEY NOT NULL,
  transaction_id INT REFERENCES Transaction (record_id),
  product_id     INT REFERENCES Product (product_id),
  price          NUMERIC REFERENCES Product (price),
  quantity       INT CHECK (quantity >= 0)
);
