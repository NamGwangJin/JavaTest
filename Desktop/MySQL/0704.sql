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

