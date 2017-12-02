SELECT *
FROM JOBS
WHERE JOB_TITLE NOT IN ('Stock Manager', 'Stock Clerk');

SELECT *
FROM EMPLOYEES
WHERE LAST_NAME IN ('Lorentz', 'Chen');

select hire_date from EMPLOYEES;

SELECT * FROM EMPLOYEES where HIRE_DATE between '02/02/17' and '25/12/21';

select * from JOB_HISTORY order by END_DATE asc;

select * from JOB_HISTORY order by 2 desc;

select * from EMPLOYEES where not LAST_NAME like '%ki%' order by LAST_NAME desc;

select * from DEPARTMENTS where MANAGER_ID is null;

select * from EMPLOYEES where COMMISSION_PCT is not null;

update REGIONS set REGION_NAME = 'Europa' where REGION_NAME = 'Europe';

update EMPLOYEES set PHONE_NUMBER = '123123123';

delete from countries where country_id in ('ZM','ZW','KW');

delete from EMPLOYEES where FIRST_NAME like 'd%';

delete from LOCATIONS where STATE_PROVINCE is null;

create table WOJEWODZTWA (
id_wojewodztwa int,
nazwa_wojewodztwa varchar(50),
stolica_wojewodztwa varchar(50),
powierzchnia number(10,0),
zabytek varchar(20)
);

create table Miasta (
id_miasta int not null,
nazwa_miasta varchar(50) not null,
powierzchnia number(10,0),
ilosc_zabytkow varchar(20),
CONSTRAINT klucz_glowny primary key (id_miasta)
);

drop table Miasta;

create table Miasta (
id_miasta int not null,
nazwa_miasta varchar(50) not null,
powierzchnia number(10,0),
liczba_mieszkancow number(10,0),
ilosc_zabytkow varchar(20),
CONSTRAINT idmiasta_pk primary key (id_miasta)
);

alter table Miasta 
add Kraj varchar(30)
add Wojewodztwo varchar(30);

alter table Miasta
drop (Wojewodztwo,Kraj);

alter table Miasta 
add Kraj varchar(30)
add Wojewodztwo varchar(30);

ALTER TABLE Miasta
MODIFY (Kraj not null, Wojewodztwo not null);

ALTER TABLE Miasta
ADD id_kraju varchar(2);

ALTER TABLE Miasta
ADD CONSTRAINT FK_idkraju
FOREIGN KEY (id_kraju) REFERENCES countries(country_id);

ALTER TABLE Miasta
MODIFY id_kraju CHAR(2) not null;

ALTER TABLE Miasta
ADD CONSTRAINT FK_idkraju
FOREIGN KEY (id_kraju) REFERENCES countries(country_id);

SELECT FIRST_NAME, LAST_NAME, MAX (hire_date)  As data_zatr_ost_prac FROM EMPLOYEES
GROUP BY LAST_NAME, FIRST_NAME
ORDER BY data_zatr_ost_prac DESC;

SELECT COUNT(EMPLOYEE_ID)
FROM EMPLOYEES;

SELECT COUNT (*)
FROM EMPLOYEES
WHERE SALARY>10000;

SELECT round(AVG(Salary),2)
FROM EMPLOYEES
where HIRE_DATE BETWEEN '04/11/04' and '07/11/04';

SELECT SUM(max_salary)
FROM JOBS
WHERE JOB_TITLE like 'Administration%';