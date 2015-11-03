CREATE TABLE Product (
  ID   UUID PRIMARY KEY DEFAULT uuid_generate_v4() NOT NULL,
  DESCRIPTION          VARCHAR,
  ITEM_LOOKUP_CODE     VARCHAR,
  PRICE                MONEY,
  ITEM_TYPE            INTEGER,
  COST                 MONEY,
  QUANTITY             INTEGER,
  REORDER_POINT        INTEGER,
  RESTOCK_LEVEL        INTEGER,
  PARENT_ITEM          UUID,
  EXTENDED_DESCRIPTION VARCHAR,
  ACTIVE_STATUS        BOOLEAN,
  MSRP                 MONEY,
  DATE_CREATED TIMESTAMP DEFAULT now()
);


--Use this to import the product data into your database. You'll need set the path to the file on your system
COPY product (description, price, cost, reorder_point, restock_level, extended_description, active_status, msrp, date_created)
FROM 'SET_ME/ProductData.csv' CSV HEADER;