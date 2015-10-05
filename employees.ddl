CREATE TABLE employees (
    record_id serial NOT NULL,
    first_name character varying,
    last_name character varying,
    employee_id integer,
    active_status boolean,
    classification character varying,
    manager integer,
    password character varying,
    created_on timestamp without time zone DEFAULT now(),
    CONSTRAINT valid_classification CHECK (((classification)::text = ANY ((ARRAY['gm'::character varying, 'sm'::character varying, 'c'::character varying])::text[])))
);

