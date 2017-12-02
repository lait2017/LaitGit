SELECT * FROM COUNTRIES;

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES ('SP','Spain','1')

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES ('AT','Austria','1')

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES ('CL','Chile','2')

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES ('PW','Poland','1')

SELECT DISTINCT COUNTRY_NAME FROM COUNTRIES;

SELECT DISTINCT REGION_ID FROM COUNTRIES;

SELECT DISTINCT * FROM COUNTRIES;

SELECT COUNTRY_ID ID_KRAJU, COUNTRY_NAME NAZWA_KRAJU, REGION_ID ID_REGIONU FROM COUNTRIES;

SELECT c.COUNTRY_NAME AS "Nazwa kraju" FROM COUNTRIES c;

SELECT EMPLOYEE_ID AS "ID Pracownika", FIRST_NAME AS Imie, LAST_NAME AS Nazwisko, EMAIL, PHONE_NUMBER AS "Nr. telefonu", HIRE_DATE AS "Data Zatrudnienia", JOB_ID AS "ID Oddzialu", SALARY AS Zarobki, COMMISSION_PCT AS "Co to", MANAGER_ID AS "ID Mene¿d¿era", DEPARTMENT_ID AS "ID Departamentu" 
FROM EMPLOYEES;

SELECT e.LAST_NAME AS "Nazwisko", e.EMPLOYEE_ID AS "ID Pracownika", e.PHONE_NUMBER AS "Nr. telefonu"
FROM EMPLOYEES e;
-- EmplId > 100 i Firstname zaczynajace sie od 'de'
SELECT *
FROM Employees
WHERE Employee_id>100 AND FIRST_NAME LIKE 'De%';
-- Last name = "chen" albo koñczace sie na 'et'
SELECT * 
FROM Employees 
WHERE employee_id > 100  AND last_name like 'Chen%' OR last_name like '%et';
-- Nie pokazywanie pracownikow z pensja powyzej 5000
SELECT *
FROM Employees
WHERE NOT Salary>5000;
-- Last name z 5 znaków i pensja ponizej 3000//
SELECT *
FROM Employees
WHERE LAST_NAME LIKE '_____' AND Salary<3000;
-- Nie pokazywanie pracownikow ktorych nazwisko zawiera 'ki'
SELECT *
FROM Employees
WHERE LAST_NAME NOT LIKE '%ki%' AND LAST_NAME NOT LIKE '%Ki%';


-- z tab departments wyswietl dep o id od 50 do 120
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID BETWEEN 50 AND 120;
-- z tab employees wyswietl pracownikow ktorych data zatrudnienia miesci sie w przedziale od 2 lutego 2002 do 25 grudnia 2003
SELECT *
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '02/02/02' AND '03/12/25';
-- Employees korzystajac z klauzuli IN wyswietl pracownikow z nazwiskiem lorentz i chen
SELECT *
FROM EMPLOYEES
WHERE LAST_NAME IN ('Lorentz', 'Chen');
-- Jobs - korzystaj¹c z klauzuli IN wyœwietl nazwy tych zawodów, które nie s¹ zawarte w zbiorze ("Stock Manager", "Stock Clerk")
SELECT *
FROM JOBS
WHERE JOB_TITLE NOT IN ('Stock Manager', 'Stock Clerk');


--Sortowanie
--Posortuj z tabeli job histury wzgledem end_date rosnaco
SELECT *
FROM JOB_HISTORY
ORDER BY END_DATE;
-- malejaco po end_date, sposob z numeracja elementu
SELECT EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID
FROM JOB_HISTORY
ORDER BY (3) DESC;
--
SELECT *
FROM JOB_HISTORY
ORDER BY 3 DESC;
--
--poprzednie zad z sortowaniem nazwiska malejaco
SELECT *
FROM Employees
WHERE LAST_NAME NOT LIKE '%ki%' AND LAST_NAME NOT LIKE '%Ki%'
ORDER BY LAST_NAME DESC;

---
SELECT *
FROM DEPARTMENTS
WHERE MANAGER_ID IS NULL;
---
SELECT *
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;
---
SELECT *
FROM REGIONS;

UPDATE REGIONS
SET REGION_NAME = 'Europa'
WHERE REGION_ID = 1
---
UPDATE EMPLOYEES
SET PHONE_NUMBER = '123.123.123'
WHERE HIRE_DATE BETWEEN '03/06/03' AND '06/12/22'

CREATE TABLE MIASTO (
ID_DZIELNICY INT NOT NULL,
NAZWA_DZIELNICY VARCHAR (250) NOT NULL,
POWIERZCHNIA_DZIELNICY NUMBER(5,5) NOT NULL,
ZABYTKI_DZIELNICY VARCHAR (250)DEFAULT NULL,
CONSTRAINT ID_1 PRIMARY KEY (ID_DZIELNICY)
);
)

SELECT *
FROM MIASTO;

alter table MIASTA ADD CONSTRAINT FK_KRAJU foreign key (ID_KRAJU) REFERENCES COUNTRIES(COUNTRY_ID);

ALTER TABLE  MIASTO
ADD (wojewodztwa varchar (30), kraje varchar (30));

ALTER TABLE MIASTO
MODIFY wojewodztwa null

ALTER TABLE MIASTO
MODIFY kraje not null;


ALTER TABLE MIASTO DROP (WOJEWODZTA, KRAJE);

ALTER TABLE MIASTO
MODIFY  VARCHAR

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

-----------------------------------


SELECT MAX(SALARY), MIN(SALARY)
FROM EMPLOYEES;

SELECT MAX(HIRE_DATE)
FROM EMPLOYEES;

-------------------ostatni zatrudniony pracownik--------------------------------
SELECT LAST_NAME AS "Nazwisko", FIRST_NAME AS "Imie", HIRE_DATE AS "Ostatnia Data Zatrudnienia"
FROM employees
WHERE ROWNUM <= 1 AND HIRE_DATE = 
(SELECT MAX(HIRE_DATE)
FROM employees
);

------------------------wszyscy pracownicy----------------------------------
SELECT COUNT(*)
FROM employees;

----------------------liczba pracownikow powyzej 10000$-----------------------
SELECT COUNT(*)
FROM employees
WHERE SALARY>10000;

-------œrednie zarobki osób zatrudnionych od 4.11.2004 do 4.11.2007------------
SELECT ROUND(AVG(EMPLOYEES.SALARY),2) AS "Srednia zarobkow"
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '04/11/04' AND '07/11/04';

--------------suma max. plac dla osob z administracji--------------------------
SELECT SUM(MAX_SALARY)
FROM JOBS
WHERE JOB_ID LIKE '%AD%';

----wypisz nazwy krajów i nazwy regionów----------
=-----------------------------------------------------------------
SELECT C.COUNTRY_NAME, R.REGION_NAME
FROM COUNTRIES C
JOIN REGIONS R
ON C.REGION_ID = R.REGION_ID
ORDER BY 1;

-----------------------------------------------------------------
insert into COUNTRIES (COUNTRY_ID, REGION_ID)
values ('WW',1);
insert into COUNTRIES (COUNTRY_ID, REGION_ID)
values ('WX',1);
insert into COUNTRIES (COUNTRY_ID, REGION_ID)
values ('WV',1);

-----------------------------------------------------------------
SELECT C.COUNTRY_NAME, R.REGION_NAME
FROM COUNTRIES C
LEFT JOIN REGIONS R
ON C.REGION_ID = R.REGION_ID
ORDER BY COUNTRY_NAME;
 ---------wszystkich pracowników nawet tych z department id null
------------ employe id, department id, last name , first name, department name

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
RIGHT JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
WHERE E.DEPARTMENT_ID IS NULL
ORDER BY 3;

-----------wszystkie deprtamenty ktore maja menedzera id i wyswietlenie imienia i nazwiska

select d.department_name, e.first_name, e.last_name 
from departments d join employees e
on d.manager_id = e.employee_id
order by 1;

---------wszyscy pracownicy, ktorzy maja departament zarzadzany przez managera
-----------imie, nazwisko, id i nazwa dep, id i imie nazwisko managera---

select e.EMPLOYEE_ID,e.FIRST_NAME, e.LAST_NAME, d.department_id, d.department_name, d.manager_id
from departments d
inner join employees e
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
where d.manager_id is not null;


----------------having warunkowe grupowanie, najpierw grupujemy, zawsze po group by

ALTER TABLE COUNTR1 (
id_COUNTR1 int UNIQUE
);