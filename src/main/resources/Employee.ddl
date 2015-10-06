CREATE TABLE Employee (
  record_id      SERIAL NOT NULL,
  first_name     CHARACTER VARYING,
  last_name      CHARACTER VARYING,
  employee_id    INTEGER,
  active_status  BOOLEAN,
  classification CHARACTER VARYING,
  manager        INTEGER,
  password       CHARACTER VARYING,
  created_on     TIMESTAMP WITHOUT TIME ZONE DEFAULT now(),
  CONSTRAINT valid_classification CHECK (((classification) :: TEXT = ANY
                                          ((ARRAY ['gm' :: CHARACTER VARYING, 'sm' :: CHARACTER VARYING, 'c' :: CHARACTER VARYING]) :: TEXT [])))
);

