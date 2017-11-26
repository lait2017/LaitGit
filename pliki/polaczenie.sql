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

delete  from countries where country_id in ( 'ZW','PW','ZM','KW');

delete from employees where phone_number like '515%' and first_name like 'd%';

delete from locations where state_province is null;

create table wojewodztwa ( id_wojewodztwa int,
nazwa_wojewodztwa varchar(255),
stolica_wojewodztwa varchar(255),
powierzchnia number(10,2),
zabytki varchar(255)
);

create table miasto ( id_miasta int not null,
nazwa_miasta varchar(50) not null,
liczba_mieszkancow int,
powierzchnia_miasta number(10,2),
kod_pocztowy varchar(6) not null,
constraint klucz_glowny primary key (id_miasta)
);

drop table miasto;

alter table miasto add kraj varchar(20) not null
add wojewodztwo varchar(20) not null; 

alter table miasto add kraj varchar(20); 

alter table miasto drop  (kraj,wojewodztwo);

alter table miasto modify ( kraj null , wojewodztwo null);

alter table miasto add id_kraju varchar(5) not null;

alter table miasto modify id_kraju char(2);
alter table miasto add constraint idkraju_countryid foreign key (id_kraju) references countries(country_id);

select first_name,last_name,hire_date as "data zatrudnienia" from employees where hire_date=(select max(hire_date)from EMPLOYEES);

select first_name,last_name,max (hire_date) from employees group by first_name,last_name
order by max(hire_date);

select count(*) from employees;
select count(*) from employees
where salary > 10000;

select round(avg(salary),2) from EMPLOYEEs where hire_date between '04/11/04' and '07/11/04';

select sum(max_salary) from jobs where job_title like 'Adm%';
 
