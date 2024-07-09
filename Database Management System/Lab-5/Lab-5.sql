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

--1.Display the name of students whose name starts with ‘k’.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE 'K%'

--2.Display the name of students whose name consists of five characters.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE '_____'

--3.Retrieve the first name & last name of students whose city name ends with a & contains six characters.
SELECT FIRSTNAME,LASTNAME FROM STUDENT
WHERE CITY LIKE '%A'
AND CITY LIKE '______'//?


--4. Display all the students whose last name ends with ‘tel’
SELECT LASTNAME FROM STUDENT
WHERE LASTNAME LIKE '%TRL'

--5. Display all the students whose first name starts with ‘ha’ & ends with‘t’.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE 'HA%'
AND FIRSTNAME LIKE '%T'


--6.Display all the students whose first name starts with ‘k’ and third character is ‘y’.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE 'K%'
AND FIRSTNAME LIKE '__Y%'

--7. Display the name of students having no website and name consists of five characters.
SELECT FIRSTNAME FROM STUDENT
WHERE FIRSTNAME LIKE '_____'
AND WEBSITE  IS NULL  *

--8.Display all the students whose last name consist of ‘jer’. 
SELECT LASTNAME FROM STUDENT
WHERE LASTNAME LIKE '%JER%'

--9. Display all the students whose city name starts with either ‘r’ or ‘b’
SELECT CITY FROM STUDENT 
WHERE CITY LIKE '[R,B]%'


--10. Display all the name students having websites.SELECT FIRSTNAME FROM STUDENTWHERE WEBSITE IS NOT NULL *--11. Display all the students whose name starts from alphabet A to H.SELECT FIRSTNAME FROM STUDENT WHERE FIRSTNAME LIKE '[A-H]%'--12. Display all the students whose name’s second character is vowel.SELECT FIRSTNAME FROM STUDENTWHERE FIRSTNAME LIKE '_[A,E,I,O,U]%'--13.Display the name of students having no website and name consists of minimum five charactersSELECT FIRSTNAME FROM STUDENT WHERE WEBSITE LIKE'NULL'AND FIRSTNAME LIKE '_____%'--14.  Display all the students whose last name starts with ‘Pat’. SELECT LASTNAME FROM STUDENTWHERE LASTNAME LIKE 'PAT%'--15. Display all the students whose city name does not starts with ‘b’.SELECT CITY FROM STUDENTWHERE CITY NOT LIKE 'B%'--------------------------- PART B -------------------------1. Display all the students whose name starts from alphabet A or H.SELECT FIRSTNAME FROM STUDENTWHERE FIRSTNAME LIKE '[A-H]%'--2.Display all the students whose name’s second character is vowel and of and start with H.SELECT FIRSTNAME FROM STUDENTWHERE FIRSTNAME LIKE '_[A,E,I,O,U]%'AND FIRSTNAME LIKE 'H%'--3. Display all the students whose last name does not ends with ‘a’.SELECT LASTNAME FROM STUDENTWHERE LASTNAME NOT LIKE '%A'--4. Display all the students whose first name starts with consonant.SELECT FIRSTNAME FROM STUDENTWHERE FIRSTNAME LIKE '[A-Z]%'--5. Display all the students whose website contains .net.//?------------------------- PART C -----------------------------1.Display all the students whose address consist of -.--2.Display all the students whose address contains single quote or double quote.--3. Display all the students whose website contains @.--4. Display all the names those are either four or five characters.