SELECT * FROM countries;
INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('PL', 'Poland', 1);

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('SP', 'Spain', 1);

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('AT', 'Austria', 1);

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('CL', 'Chile', 2);

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('PW', 'Poland', 1);

SELECT distinct country_name FROM countries;
select distinct region_id from countries;

SELECT * FROM EMPLOYEES;
SELECT EMPLOYEE_ID AS "ID pracownika", 
first_name as "Imi?", 
last_name as "Nazwisko", 
phone_number as "numer telefonu", 
hire_date as "data zatrudnienia", 
job_id as "ID pracy", 
salary as "wynagrodzenie" FROM EMPLOYEES;



SELECT e.last_name, e.phone_number, e.employee_id from EMPLOYEES e;

SELECT *
FROM employees
WHERE Employee_id >100; 


SELECT *
FROM employees
WHERE Employee_id >100 and First_name like 'De%';

SELECT *
FROM employees
WHERE Last_Name like 'Chen' or last_name like '%et';

SELECT *
FROM employees
WHERE not Salary>5000;

SELECT *
FROM employees
WHERE Last_Name like '_____' and salary<3000;

SELECT *
FROM employees
WHERE Last_name not like '%ki%' and Last_name not like '%Ki%';


SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID BETWEEN 50 AND 120; 

SELECT *
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '02-FEB-02' AND '25-DEC-03';

SELECT *
FROM EMPLOYEES
WHERE LAST_NAME in ('Lorentz', 'Chen');

SELECT *
FROM JOBS
WHERE JOB_TITLE not in ('Stock Manager', 'Stock Clerk');


SELECT *
FROM job_history
ORDER BY end_date ASC;

SELECT *
FROM job_history
ORDER BY 2 DESC;

SELECT *
FROM EMPLOYEES
ORDER BY LAST_NAME DESC;

SELECT *
FROM DEPARTMENTS
WHERE MANAGER_ID IS NULL; 

SELECT *
FROM EMPLOYEES
WHERE commission_pct IS NOT NULL; 



Select * from REGIONS;
UPDATE Regions
SET Region_name = 'Europa'
WHERE region_name = 'Europe'; 

Select * from EMPLOYEES;
UPDATE EMPLOYEES
SET PHONE_NUMBER = '123123123'
WHERE hire_date BETWEEN '03-jun-2003' and '22-dec-2006'; 


select * from countries;

DELETE FROM countries
WHERE country_id in ('ZW', 'ZM', 'PW', 'KW');


select * from LOCATIONS;
DELETE FROM LOCATIONS
WHERE STATE_PROVINCE is null;


CREATE TABLE WOJEWODZTWA (
    ID_WOJEWODZTWA int,
    NAZWA_WOJEWODZTWA varchar(40),
    STOLICA_WOJEWODZTWA varchar(40),
    POWIERZCHNIA NUMBER,
    ZABYTKI varchar(40)
);

SELECT*FROM WOJEWODZTWA;

CREATE TABLE MIASTO (
    ID_MIASTA int NOT NULL,
    NAZWA_MIASTA varchar(40)NOT NULL,
    POWIERZCHNIA NUMBER NOT NULL,
    ZABYTKI varchar(40)NOT NULL,
    CONSTRAINT PK_MIASTO PRIMARY KEY (ID_MIASTA)
);

ALTER TABLE MIASTO
ADD KRAJ VARCHAR (40);

ALTER TABLE MIASTO
ADD WOJEWODZTWO VARCHAR (40);

ALTER TABLE MIASTO
DROP COLUMN column_KRAJ; 

ALTER TABLE MIASTO
MODIFY KRAJ NOT NULL;

ALTER TABLE MIASTO
MODIFY wojewodztwo NOT NULL;

ALTER TABLE MIASTO
MODIFY nazwa_miasta char (2);

ALTER TABLE MIASTO add CONSTRAINT nazwa_fk foreign KEY (nazwa_miasta) references countries (country_id);

SELECT first_name, last_name, MAX(hire_date)
FROM EMPLOYEES group by first_name, last_name order by max(hire_date) desc;

SELECT COUNT (*)
FROM employees
WHERE salary>10000;

SELECT round( AVG(salary), 2)
FROM EMPLOYEES
WHERE hire_date between '04-NOV-04' and '04-nov-07'; 

SELECT SUM(max_salary)
FROM Jobs
WHERE Job_title like '%Administration%'; 









