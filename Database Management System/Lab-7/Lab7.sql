CREATE DATABASE  CSE_3B_310

CREATE TABLE EMP
(
	EID INT,
	ENAME VARCHAR(50),
	DEPARTMENT VARCHAR(50),
	SALARY INT,
	JOININGDATE DATETIME,
	CITY VARCHAR(50)
)

INSERT INTO EMP(EID,ENAME,DEPARTMENT,SALARY,JOININGDATE,CITY)
VALUES
(101,'RAHUL','ADMIN',56000,'1-JAN-1990','RAJKOT'),
(102,'HARDIK','IT',18000,'25-SEP-1990','AHMENDABAD'),
(103,'BHAVIN','HR',25000,'14-MAY-1991','BARODA'),
(104,'BHOOMI','ADMIN',39000,'8-FEB-1991','RAJKOT'),
(105,'ROHIT','IT',17000,'23-JUL-1990','JAMNAGAR'),
(106,'PRIYA','IT',9000,'18-OCT-1990','AHMENDABAD'),
(107,'BHOOMI','HR',34000,'25-DEC-1991','RAJKOT')

SELECT * FROM EMP
DROP TABLE EMP

---------------------------------PART A-----------------------------------------

--1.Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
SELECT MAX(SALARY) AS MAX_SALARY ,MIN(SALARY) AS MIN_SALARY
FROM EMP

--2.. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,respectively.
SELECT SUM(SALARY) AS TOTAL_SAL ,AVG(SALARY) AS AVERAGE_SAL
FROM EMP

--3. Find total number of employees of EMPLOYEE table
SELECT COUNT(EID) ASNUMBER_IFEMPLOYEES
FROM EMP

--4.Find highest salary from Rajkot city.
SELECT MAX(SALARY) 
FROM EMP
WHERE CITY='RAJKOT'

--5.Give maximum salary from IT department.SELECT MAX(SALARY) FROM EMPWHERE DEPARTMENT='IT'--6.Count employee whose joining date is after 8-feb-91SELECT COUNT(ENAME)FROM EMPWHERE JOININGDATE>'8-FEB-1991'--7.Display average salary of Admin department.SELECT AVG(SALARY) FROM EMPWHERE DEPARTMENT='ADMIN'--8.Display total salary of HR department.SELECT SUM(SALARY) FROM EMPWHERE DEPARTMENT='HR'--9.. Count total number of cities of employee without duplication.SELECT COUNT(DISTINCT CITY)FROM EMP--10.Count unique departments.SELECT COUNT(DISTINCT DEPARTMENT)FROM EMP--11.Give minimum salary of employee who belongs to AhmedabadSELECT MIN(SALARY) FROM EMPWHERE CITY='AHMENDABAD'--12.Find city wise highest salarySELECT MAX(SALARY) AS HIGHEST_SAL,CITYFROM EMPGROUP BY CITY--13.Find department wise lowest salarySELECT MIN(SALARY) AS LOWEST_EMPLOYEES,DEPARTMENTFROM EMPGROUP BY DEPARTMENT--14.Display city with the total number of employees belonging to each city.SELECT COUNT(EID) AS TOTAL_EMPLOYEES,CITYFROM EMPGROUP BY CITY--15.Give total salary of each department of EMP table.SELECT SUM(SALARY) AS TOTAL_SAL FROM EMPGROUP BY DEPARTMENT--16.Give average salary of each department of EMP table without displaying the respective department name.SELECT AVG(SALARY) FROM EMPGROUP BY DEPARTMENT------------------------PART B-------------------------------1. Count the number of employees living in Rajkot.SELECT COUNT(EID) AS TOTAL_EMPLOYEESFROM EMPWHERE CITY='RAJKOT';--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.SELECT MAX(SALARY) AS MAX_SALARY ,MIN(SALARY) AS MIN_SALARYFROM EMP--3. Display the total number of employees hired before 1st January, 1991.SELECT COUNT(EID) AS TOTAL_EMPLOYEESFROM EMPWHERE JOININGDATE<'1-JAN-1991'-------------------------------PART C----------------------1. Count the number of employees living in Rajkot or Baroda.SELECT COUNT(EID) AS TOTAL_EMPLOYEESFROM EMPWHERE CITY='RAJKOT'OR CITY='BARODA'--2. Display the total number of employees hired before 1st January, 1991 in IT department.SELECT COUNT(EID) AS TOTAL_EMPLOYEESFROM EMPWHERE JOININGDATE<'1-JAN-1991' AND DEPARTMENT='IT'--3. Find the Joining Date wise Total Salaries.SELECT SUM(SALARY) AS TOTAL_SALARY,JOININGDATEFROM EMPGROUP BY JOININGDATE--4. Find the Maximum salary department & city wise in which city name starts with �R�.SELECT MAX(SALARY) AS MAX_SALARY ,CITYFROM EMPGROUP BY CITY HAVING CITY='R%'