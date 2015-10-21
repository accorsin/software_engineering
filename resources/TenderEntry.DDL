--tender_entry table

CREATE TYPE Tender AS ENUM ('Cash', 'Giftcard', 'Mastercard', 'VISA', 'Discover', 'AMEX', 'Debit');

CREATE TABLE TenderEntry (
  record_id      UUID PRIMARY KEY NOT NULL,
  transaction_id UUID REFERENCES Transaction (record_id),
  tender_type    Tender,
  amount         MONEY,
  created        TIMESTAMP DEFAULT now()
);
