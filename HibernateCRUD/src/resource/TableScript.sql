DROP TABLE Customer;

CREATE TABLE Customer(
customerId NUMBER PRIMARY KEY,
customerName VARCHAR2(20),
dateOfBirth DATE,
address VARCHAR2(20),
phoneNumber NUMBER(10)
);

INSERT INTO Customer(customerId,customerName,dateOfBirth,address,phoneNumber)
VALUES('001','shivam','1997-12-09','patna','8557988735');

SELECT * FROM Customer;