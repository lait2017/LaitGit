
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

DROP TABLE MIASTO;


ALTER TABLE  MIASTO
ADD (wojewodztwa varchar (30), kraje varchar (30));

ALTER TABLE MIASTO
MODIFY wojewodztwa null

ALTER TABLE MIASTO
MODIFY kraje not null;


ALTER TABLE MIASTO DROP (WOJEWODZTA, KRAJE);



CONSTRAINT PK_MIASTO PRIMARY KEY (ID_ULICY

alter table miasto
ADD CONSTRAINT pk_miasto
FOREIGN KEY (kraje_id) REFERENCES countries(country_id);

alter table MIASTO
ADD COUNTRY1 CHAR (2 BYTE) NULL;

ALTER TABLE MIASTO MODIFY NAZWA_ULICY CHAR (2);

alter table MIASTO
ADD CONSTRAINT FK_COUNTRYMIASTO
FOREIGN KEY (COUNTRY1) REFERENCES countries(country_id);




SELECT*
FROM MIASTO;


SELECT FIRST_NAME, LAST_NAME, MAX (HIRE_DATE)
FROM EMPLOYEES
GROUP BY FIRST_NAME, LAST_NAME
ORDER BY FIRST_NAME,LAST_NAME DESC;


SELECT *
FROM employees
WHERE HIRE_DATE = (SELECT MAX(HIRE_DATE)
                FROM employees
                WHERE ROWNUM <= 1
               );

SELECT MAX(HIRE_DATE) AS OSTANI_ZATRUDNIONY FROM EMPLOYEES;



SELECT COUNT(*)
FROM EMPLOYEES
WHERE SALARY>1000;



SELECT LAST_NAME AS "Nazwisko", FIRST_NAME AS "Imie", HIRE_DATE AS "Ostatnia Data Zatrudnienia"
FROM employees
WHERE ROWNUM <= 1 AND HIRE_DATE = 
(SELECT MAX(HIRE_DATE)
FROM employees
);


SELECT AVG (SALARY) AS "SREDNIA PENSJA",
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN = '04/11/2004' AND '04/11/2008';

SELECT AVG(SALARY) AS SREDNIE_ZAROBKI FROM EMPLOYEES WHERE HIRE_DATE BETWEEN '04/11/04' AND '07/11/04';

SELECT SUM(MAX_SALARY) FROM JOBS WHERE JOB_ID LIKE 'AD%'; 

select countries.country_id, regions.region_id
from countries;
inner join countries on countries.region_id = countries.countryid;

select c.Country_Name, r.region_name
from countries c
join regions r
on c.region_id = r.Region_id
order by 1;

insert into COUNTRIES (COUNTRY_ID, REGION_ID)
values ('WW',1);
insert into COUNTRIES (COUNTRY_ID, REGION_ID)
values ('WX',1);
insert into COUNTRIES (COUNTRY_ID, REGION_ID)
values ('WV',1);

select c.Country_Name, r.region_name
from countries c
left join regions r
on c.region_id = r.Region_id
order by 1;

select e.employee_id e.first_name, e.last_name, d.department_id, d.department_name
from employees e
join departments d
on.e.department_id = d.department_id
order by 1;


select e.first_name, e.last_name, d.department_name 
from employees e left join departments d 
on e.department_id = d.department_id
where e.department_id is null or d.department_id is null
order by 3;

SELECT E.Employee_Id, E.First_Name, E.Last_Name, D.Department_Id, D.Department_Name
FROM Employees E
Full JOIN Departments D ON E.EMPLOYEE_ID = D.Department_Id
Order by Employee_ID;

select e.first_name, e.last_name, d.department_name 
from employees e left join departments d 
on e.department_id = d.department_id
order by 3;




SELECT E.FIRST_NAME, E.LAST_NAME, E.EMPLOYEE_ID, E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E
LEFT JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
ORDER BY 3;

------------------------------wszystkie nulle---------------------------------

SELECT E.FIRST_NAME, E.LAST_NAME, E.EMPLOYEE_ID, E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E
FULL OUTER JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
WHERE E.DEPARTMENT_ID IS NULL OR D.DEPARTMENT_ID IS NULL
ORDER BY 3;

-----------------------------------------------------

SELECT E.FIRST_NAME, E.LAST_NAME, E.EMPLOYEE_ID, E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E
LEFT JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
WHERE D.DEPARTMENT_ID IS NULL
ORDER BY 3;

------------------------


SELECT E.FIRST_NAME, E.LAST_NAME, E.EMPLOYEE_ID, E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E
right JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
WHERE E.DEPARTMENT_ID IS NULL
ORDER BY 3;

select d.department_name, e.first_name, e.last_name
from departments d
join employees e 
on d.manager_id = e.employee_id
order by 1;


select d.department_name, e.first_name, e.last_name 
from departments d join employees e
on d.manager_id = e.employee_id
order by 1;

select e.first_name, e.last_name, e.manager_id, e.department_id, d.department_name, d.manager_id
from employees e
join departments d
on e.manager_id = d.department_id;
order by 5;

select d.department_name, e.first_name, e.last_name 
from departments d join employees e
on d.manager_id = e.employee_id
order by 1;

select e.EMPLOYEE_ID,e.FIRST_NAME,e.LAST_NAME, d.department_id, d.department_name, d.manager_id
from departments d
inner join employees e
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
where d.manager_id is not null; 

select*
into nowa_tabela
from regions;

create table1 as select*from countries

cerate table myk(
id_myk not null unique
nazwa varchar (23)


	

);

select *
from countries


select* from number;

select country_id 
from countries 
where rownum <= 6 and region_id = 1 ;

SELECT * FROM countries
WHERE Country_id = 'Argentyna' AND ROWNUM <= 3

select *
from employees;

select
count (salary) from employees;

SELECT AVG(salary)
FROM employees;

SELECT SUM(salary)
FROM employees;




