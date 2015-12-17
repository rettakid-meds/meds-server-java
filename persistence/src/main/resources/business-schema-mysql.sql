DROP TABLE IF EXISTS LEAD_INPUTS;
DROP TABLE IF EXISTS LEAD_INPUTS_SEQ;

CREATE TABLE LEAD_INPUTS (
	ID BIGINT NOT NULL PRIMARY KEY,
	DATA BLOB
) type=InnoDB;
CREATE TABLE LEAD_INPUTS_SEQ (
	ID BIGINT NOT NULL PRIMARY KEY
) type=InnoDB;
INSERT INTO LEAD_INPUTS_SEQ (ID) VALUES (0);