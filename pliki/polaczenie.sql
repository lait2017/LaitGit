select * from COUNTRIES;

select country_name from COUNTRIES;

select region_id from COUNTRIES;

select * from jobs;

insert into countries values ( COUNTRY_ID="PL",COUNTRY_NAME="POLAND",REGION_ID=1);
select * from countries;
insert into countries values ( COUNTRY_ID="PL",COUNTRY_NAME="POLAND",REGION_ID=1);
insert into countries values (COUNTRY_NAME="poland");
insert into countries ( country_id,COUNTRY_NAME,region_id) values ( 'PL','POLAND',1);
select * from countries;
insert into countries values ( 'PL1','POLAND1',1);
insert into countries values ('SP','Hiszpania',1);
insert into countries values ('AT','Austria',1);
insert into countries values ('CL','Chile',2);
insert into countries values ( 'PW','POLAND',1);
select * from COUNTRIES;
select DISTINCT country_name from countries;
select DISTINCT REGION_ID from countries;
select * from EMPLOYEES;
select EMPLOYEE_ID as "Id_pracownika",FIRST_NAME as "Imie",last_name as "Nazwisko", email as "adres email",phone_number as "numer telefonu",
hire_date as "data zatrudnienia", job_id as "ID pracy" , salary as Zarobki, commission_pct as prowizja , manager_id as "ID managera
", department_id as "ID departamentu" from employees;

select ee.last_name,ee.phone_number,ee.employee_id from EMPLOYEES  ee; 

select * from EMPLOYEES where MANAGER_ID=100;
select * from EMPLOYEES where EMPLOYEE_ID>100;






