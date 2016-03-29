CREATE TABLE staff (
    staff_id     integer,
    first_name    varchar(40),
    last_name    varchar(40),
    department_id     integer,
    PRIMARY KEY(staff_id)
);


CREATE TABLE department (
    department_id     integer,
    department_name    varchar(40),
    PRIMARY KEY(department_id)
);


CREATE SEQUENCE staff_seq START 1;
CREATE SEQUENCE department_seq START 1;