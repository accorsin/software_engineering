CREATE TABLE Employee (
  record_id      UUID PRIMARY KEY NOT NULL,
  first_name     CHARACTER VARYING,
  last_name      CHARACTER VARYING,
  employee_id    UUID,
  active_status  BOOLEAN,
  classification CHARACTER VARYING,
  manager        UUID,
  password       CHARACTER VARYING,
  created_on     TIMESTAMP DEFAULT now(),
  CONSTRAINT valid_classification CHECK (((classification) :: TEXT = ANY
                                          ((ARRAY ['gm' :: CHARACTER VARYING, 'sm' :: CHARACTER VARYING, 'c' :: CHARACTER VARYING]) :: TEXT [])))
);

