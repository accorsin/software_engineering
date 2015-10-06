--tender_entry table

CREATE TYPE Tender AS ENUM ('Cash', 'Giftcard', 'Mastercard', 'VISA', 'Discover', 'AMEX', 'Debit');

CREATE TABLE TenderEntry (
  record_id      INT PRIMARY KEY  NOT NULL,
  transaction_id INT REFERENCES Transaction (record_id), --Foreign key
  tender_type    tender,
  amount         MONEY,
  created        TIMESTAMP DEFAULT current_timestamp
);
