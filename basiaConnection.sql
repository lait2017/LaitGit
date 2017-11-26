insert into COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
values ('PL', 'POLAND', 1);

SELECT * FROM COUNTRIES

insert into COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
values ('SP', 'SPAIN', 1);

insert into COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
values ('AT', 'AUSTRIA', 1);

insert into COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
values ('CL', 'CHILE', 2);

insert into COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
values ('PW', 'POLAND', 1);

select distinct country_name from Countries;
select distinct region_id from Countries;

select*from EMPLOYEES;

select employee_id as "ID pracownika", FIRST_NAME as "Imiê", LAST_NAME as "Nazwisko", phone_number as "Numer telefonu",
HIRE_DATE as "Data zatrudnienia", JOB_ID as "ID zatrudnienia", salary as "Pensja",
COMMISSION_PCT as "Prowizja", MANAGER_ID as "ID MENED¯ERA", department_id as "ID departamentu"
from employees;

select*from  employees where manager_ID=100;

select*from employees where Employee_id>100;

select*from employees where employee_ID>100 and first_name like 'De%';
select *from employees where last_name like 'Chen' or last_name like '%et';
select *from employees where not salary>5000; 
select*from employees where last_name like '_____' and salary<3000;
select* from employees where not last_name like '%ki%'and last_name not like 'Ki%';

select*from departments where department_id between 50 and 120;
select*from employees where hire_date between '2002/02/02' and '2003/12/25';
select*from employees where last_name in ('Lorentz','Chen');
select*from jobs where not job_title in('Stock Manager', 'Stock Clerk');

select*from job_history order by end_date;
select*from job_history order by 2 DESC;
select* from employees where not last_name like '%ki%'and last_name not like 'Ki%' and
where last_name order by DESC;

select*from departments where MANAGER_ID IS NULL;
SELECT*FROM EMPLOYEES where commission_pct is not null;
 
select*from regions;
update regions 
set region_name ='Europa';

update employees
set phone_number='123123123' 
where hire_date between '03/03/03' and '06/12/22';
select*from employees;
select*from employees where rownum<=5;

delete from countries where country_id in ('PW', 'ZM', 'ZW');

delete from employees where phone_number like '515%' and first_name like 'd%';

delete from locations where state_province is null;

create table Wojewodztwa (id_wojewodztwa int, 
nazwa_województwa varchar(255),
stolica_wojewodztwa varchar(255),
powierzchnia number(10,2),
zabytki varchar(255)
);


create table MIASTA (
ID_MIASTA int not null , 
NAZWA_MIASTA varchar(50),
LICZBA_MIESZKAÑCÓW int,
POWIERZCHNIA number(10,2),
CONSTRAINT PK_MIASTA PRIMARY KEY(ID_MIASTA)
);

DROP TABLE MIASTA;

ALTER TABLE MIASTA ADD 
KRAJ VARCHAR(50) ADD WOJEWODZTWO varchar(50);

ALTER TABLE MIASTA DROP (KRAJ, WOJEWODZTWO);

ALTER TABLE MIASTA MODIFY 
(KRAJ varchar(50) is null, WOJEWODZTWO varchar(50)is null);


Alter table miasta modify id_kraju char(2);

alter table MIASTA ADD CONSTRAINT FK_KRAJU foreign key (ID_KRAJU) REFERENCES COUNTRIES(COUNTRY_ID);

SELECT first_name,last_name,hire_date
  FROM employees;
select max (hire_date)from employees;

SELECT MAX(HIRE_DATE) AS OSTANI_ZATRUDNIONY FROM EMPLOYEES;
SELECT *
FROM employees
WHERE HIRE_DATE = (SELECT MAX(HIRE_DATE)
                FROM employees
                WHERE ROWNUM <= 1
               );
               
               SELECT FIRST_NAME, LAST_NAME, MAX (hire_date)  As data_zatr_ost_prac FROM EMPLOYEES 
GROUP BY LAST_NAME, FIRST_NAME
ORDER BY LAST_NAME DESC;




select count (*) from employees;

select count (*)from employees where salary>10000;


4/11/2004 do 4/11/2007

select round (AVG (salary),2)
from employees where hire_date between '04/11/04' and '07/11/04';

SELECT AVG(SALARY) AS SREDNIE_ZAROBKI FROM EMPLOYEES WHERE HIRE_DATE BETWEEN '04/11/04' AND '07/11/04';

select SUM (max_salary) from jobs where job_id like 'AD%';





















