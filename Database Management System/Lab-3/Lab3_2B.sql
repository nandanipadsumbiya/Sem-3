CREATE DATABASE CSE_3B_310
					-------part A--------
----1.Update deposit amount of all customers from 3000 to 5000. 
UPDATE DEPOSIT 
SET AMOUNT=5000
WHERE AMOUNT=3000

SELECT * FROM DEPOSIT

----2.Change branch name of ANIL from VRCE to C.G. ROAD.
UPDATE BORROW
SET BNAME='C.G.ROAD'
WHERE BNAME='VRACE'

----3. Update Account No of SANDIP to 111 & Amount to 5000. 
UPDATE DEPOSIT
SET ACTNO=111,AMOUNT=5000
WHERE CNAME='SANDIP'

-----4. Update amount of KRANTI to 7000.
UPDATE DEPOSIT
SET AMOUNT=7000
WHERE CNAME='KRANTI'

-----5. Update branch name from ANDHERI to ANDHERI WEST. 
UPDATE BRANCH
SET BNAME='ANDHERI WEST'
WHERE BNAME='ANDHERI'

-----6.Update branch name of MEHUL to NEHRU PALACE.
UPDATE DEPOSIT
SET BNAME='NEHRU PALACE'
WHERE CNAME='MEHUL'

SELECT * FROM DEPOSIT

----7. Update deposit amount of all depositors to 5000 whose account no between 103 & 107
UPDATE DEPOSIT
SET AMOUNT=5000
WHERE ACTNO BETWEEN 103 AND 107

----8.Update ADATE of ANIL to 1-4-95. 
UPDATE DEPOSIT
SET ADATE='1-APR-95'
WHERE CNAME='ANIL'

----9.Update the amount of MINU to 10000.
UPDATE DEPOSIT
SET AMOUNT=10000
WHERE CNAME='MINU'

----10. Update deposit amount of PRAMOD to 5000 and ADATE to 1-4-96
UPDATE DEPOSIT
SET AMOUNT=5000,ADATE='1-APR-96'
WHERE CNAME='PRAMOD'

						--------PART B-----------

----1.Give 10% Increment in Loan Amount.
UPDATE BORROW
SET AMOUNT=(AMOUNT * 0.1)+AMOUNT

----2.Customer deposits additional 20% amount to their account, update the same.
UPDATE DEPOSIT
SET  AMOUNT=(AMOUNT * 0.2)+AMOUNT



						-----------PART C---------

----1.Update amount of loan no 321 to NULL.
UPDATE BORROW
SET AMOUNT=NULL
WHERE AMOUNT=321

----2.Update branch name of KRANTI to NULL.
UPDATE BORROW
SET BNAME=NULL
WHERE CNAME='KRANTI'
SELECT * FROM BORROW

----3. Display the name of borrowers whose amount is NULL.
SELECT CNAME FROM BORROW
WHERE AMOUNT IS NULL

SELECT * FROM BORROW

----4.Display the Borrowers whose having branch.
SELECT * FROM BORROW
WHERE BNAME IS NOT NULL

----5.Update the Loan Amount to 5000, Branch to VRCE & Customer Name to Darshan whose loan no is 481.
UPDATE BORROW
SET AMOUNT=5000,BNAME='VRCE',CNAME='DARSHAN'
WHERE LOANNO=481

SELECT * FROM BORROW

----6.Update the Deposit table and set the date to 01-01-2021 for all the depositor whose amount is less than 2000.
UPDATE DEPOSIT
SET ADATE='01-JAN-2021'
WHERE AMOUNT<2000

---7.Update the Deposit table and set the date to NULL & Branch name to ‘ANDHERI whose Account No is 110. 
UPDATE DEPOSIT
SET ADATE=NULL,BNAME='ANDHERI'
WHERE ACTNO=110