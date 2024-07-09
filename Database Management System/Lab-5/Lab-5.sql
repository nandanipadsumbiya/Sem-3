CREATE DATABASE  CSE_3B_310

 CREATE TABLE STUDENT
(
	STUID INT,
	FIRSTNAME VARCHAR(25),
	LASTNAME VARCHAR(25),
	WEBSITE VARCHAR(50),
	CITY VARCHAR(25),
	ADDRESS VARCHAR(100)
)

INSERT INTO STUDENT(STUID,FIRSTNAME,LASTNAME,WEBSITE,CITY,ADDRESS)
VALUES
(1011,'KEYUR','PATEL','TECHONTHENET.COM','RAJKOT','A-303  VASANT KUNJ RAJKOT'),
(1022,'HARDIK','SHAH','DIGMINECRAFT.COM','AHEMDABAD','RSM KRUPA RAIYA ROAD'),
(1033,'KAJAL','TRIVEDI','BIGACTIVITIES.COM','BARODA','RAJ BHAVAN PLOT NEAR GARDEN'),
(1044,'BHOOMI','GAJERA','CHECKYOURMATH.COM','AHEMDABAD','JIGS HOME NAROL'),
(1055,'HARMIT','MITAL','@ME.DARSHAN.COM','RAJKOT','B-55 RAJ RESIDENCY'),
(1066,'ASHOK','JANI','NULL','BARODA','A502 CLUD HOUSE BUILDING')

SELECT * FROM STUDENT

DROP TABLE STUDENT

--------------------------------- PART A--------------------------------

--1.Display the name of students whose name starts with �k�.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE 'K%'

--2.Display the name of students whose name consists of five characters.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE '_____'

--3.Retrieve the first name & last name of students whose city name ends with a & contains six characters.
SELECT FIRSTNAME,LASTNAME FROM STUDENT
WHERE CITY LIKE '%A'
AND CITY LIKE '______'//?


--4. Display all the students whose last name ends with �tel�
SELECT LASTNAME FROM STUDENT
WHERE LASTNAME LIKE '%TRL'

--5. Display all the students whose first name starts with �ha� & ends with�t�.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE 'HA%'
AND FIRSTNAME LIKE '%T'


--6.Display all the students whose first name starts with �k� and third character is �y�.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE 'K%'
AND FIRSTNAME LIKE '__Y%'

--7. Display the name of students having no website and name consists of five characters.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE '_____'
AND WEBSITE  IS NULL  *

--8.Display all the students whose last name consist of �jer�. 
SELECT LASTNAME FROM STUDENT
WHERE LASTNAME LIKE '%JER%'

--9. Display all the students whose city name starts with either �r� or �b�
SELECT CITY FROM STUDENT 
WHERE CITY LIKE '[R,B]%'


--10. Display all the name students having websites.