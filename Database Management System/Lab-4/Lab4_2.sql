CREATE DATABASE  CSE_3B_310

SELECT * FROM DEPOSIT_DETAIL

--------------------------------------- PART A------------------------------
--1
DELETE FROM DEPOSIT_DETAIL 
WHERE AMOUNT>=4000

--2.
DELETE FROM DEPOSIT_DETAIL
WHERE BNAME='CHANDI'

--3.
DELETE FROM DEPOSIT_DETAIL
WHERE ANO>105

--4.
TRUNCATE TABLE DEPOSIT_DETAIL

--5
DROP TABLE DEPOSIT_DETAIL



---------------------------------------------------- PART B-------------------------------------------
CREATE TABLE EMPLOYEE_MASTER
(
	EMPNO INT,
	EMPNAME VARCHAR(25),
	JOININGDATE DATETIME,
	SALARY DECIMAL(8,2),
	CITY VARCHAR(20)
)


INSERT INTO EMPLOYEE_MASTER(EMPNO,EMPNAME,JOININGDATE,SALARY,CITY)
VALUES
(101,'KEYUR','2002-01-05',12000,'RAJKOT'),
(102,'HARDIK','15-FEB-2004',14000,'AHMEDABAD'),
(103,'KAJAL','14-MAR-2006',15000,'BARODA'),
(104,'BHOOMI','23-JUN-05',12500,'AHMEDABAD'),
(105,'HARMIT','15-FEB-04',14000,'RAJKOT'),
(106,'MITESH','25-SEP-01',5000,'JAMNAGER'),
(107,'MEERA',NULL,7000,'MORBI'),
(108,'KISHAN','2003-02-06',10000,NULL)

SELECT * FROM EMPLOYEE_MASTER  

DELETE FROM  EMPLOYEE_MASTER
WHERE EMPNO=103

--1
DELETE FROM EMPLOYEE_MASTER
WHERE SALARY>14000

--2
DELETE FROM EMPLOYEE_MASTER
WHERE CITY='RAJKOT'

--3
DELETE FROM EMPLOYEE_MASTER
WHERE JOININGDATE>'01-JAN-2007'

--4
DELETE FROM EMPLOYEE_MASTER
WHERE JOININGDATE IS NULL AND EMPNAME IS NULL

--5
DELETE FROM EMPLOYEE_MASTER
WHERE SALARY=(20000*0.5)

--6
DELETE FROM EMPLOYEE_MASTER
WHERE CITY IS NULL

--7
TRUNCATE TABLE EMPLOYEE_MASTER

--8
DROP TABLE EMPLOYEE_MASTER








