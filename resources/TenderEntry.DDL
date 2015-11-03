--tender_entry table

CREATE TYPE Tender AS ENUM ('CASH', 'GIFTCARD', 'MASTERCARD', 'VISA', 'DISCOVER', 'AMEX', 'DEBIT');

CREATE TABLE TenderEntry (
  record_id      UUID PRIMARY KEY NOT NULL,
  transaction_id UUID REFERENCES Transaction (record_id),
  tender_type    Tender,
  amount         MONEY,
  created        TIMESTAMP DEFAULT now()
);
