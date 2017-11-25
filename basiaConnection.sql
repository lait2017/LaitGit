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















