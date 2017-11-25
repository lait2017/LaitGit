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