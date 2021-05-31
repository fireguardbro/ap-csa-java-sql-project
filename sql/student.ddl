### Table definition
CREATE TABLE STUDENT (
    ID serial PRIMARY KEY,
    NAME varchar(100) NOT NULL,
    GPA double precision NOT NULL,
    CREATED_DATE timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP
);
