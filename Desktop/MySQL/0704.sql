show tables;
select * from employees;
select * from jobs;

select e.employee_id 사번, e.emp_name 이름, d.department_name 부서
from employees e join departments d on d.department_id=e.DEPARTMENT_ID;

select e.EMPLOYEE_ID 사번, e.EMP_NAME 이름, j.job_title 직무
from employees e join jobs j on j.job_id = e.job_id
order by 직무;

select e.employee_id 사번, e.emp_name 이름, d.department_name 부서, j.job_title 직무
from employees e join departments d on d.department_id=e.DEPARTMENT_ID
				 join jobs j on j.job_id = e.job_id
order by 부서;

select * from sales limit 1,1000;
select * from products;
select * from customers;

select p.PROD_NAME, c.cust_name
from sales s join products p on s.prod_id = p.prod_id
		     join customers c on s.cust_id = c.cust_id
limit 1,100;

select a.employee_id, a.emp_name, b.emp_name manager
from employees a join employees b on a.MANAGER_ID=b.EMPLOYEE_ID
order by a.EMPLOYEE_ID;

select a.DEPARTMENT_ID 부서코드, a.department_name 부서명, b.department_name 상위부서
from departments a join departments b on a.parent_id = b.department_id
order by 부서코드;

select * from employees;
select * from departments;

select a.DEPARTMENT_ID 부서코드, a.department_name 부서명, b.department_name 상위부서, c.emp_name 매니저명
from departments a join departments b on a.parent_id = b.department_id
				   join employees c on a.manager_id = c.employee_id
order by 부서코드;