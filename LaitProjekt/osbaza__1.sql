
SELECT DEPARTMENTS
FROM EMPLOYEES
WHERE DEPARTMENT_ID BETWEEN 50 AND 120;

SELECT*
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '2002/02/02' AND '2003/12/05';

SELECT*
FROM EMPLOYEES
WHERE LAST_NAME IN ('LORENTZ','CHEN');

SELECT *
FROM job_history
ORDER BY 2 desc;

select*
from EMPLOYEES
where LAST_NAME not like '%ki%'
order by last_name desc;

select*
from departments
where manager_id is null;

select*
from EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;



UPDATE REGIONS
SET REGION_NAME='EUROPA'
WHERE REGION_ID=1;
SELECT*
FROM REGIONS


DELETE from COUNTRIES
WHERE COUNTRY_ID IN ('ZW','ZM','KW','PW');

SELECT * FROM  COUNTRIES;


DELETE FROM EMPLOYESS
WHERE PHONE_NUMBER LIKE '515%' AND FIRST_NAME LIKE 'D%';

CREATE TABLE WOJEWODZTWA (
id_wojewodztwa int,
nazwa_wojewodztwa varchar (30),
stolica_wojewodztwa varchar(30),
powierzchnia number (38),
zabytki varchar (300)
);

select*
from wojewodztwa



CREATE TABLE MIASTO (
id_ulicy int NOT NULL,
nazwa_ulicy varchar (30) NOT NULL,
liczba_domow varchar(30) NOT NULL,
powierzchnia number (38) NOT NULL,
zabytki varchar (300) NOT NULL,
CONSTRAINT PK_MIASTO PRIMARY KEY (ID_ULICY)
);

SELECT*
FROM MIASTO;

