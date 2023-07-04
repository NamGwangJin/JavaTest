show tables;
select * from employees;
select * from departments;

select e.employee_id 사번, e.emp_name 이름, d.department_name 부서
from employees e join departments d on e.department_id = d.department_id;
