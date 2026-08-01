//Question 1
SELECT employee_id,
       last_name,
       job_id,
       hire_date AS STARTDATE
FROM employees;
//Question 2
SELECT last_name,
       salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000;
//Question 3
SELECT last_name,
       job_id,
       hire_date
FROM employees
WHERE last_name IN ('Matos', 'Taylor')
ORDER BY hire_date ASC;

SELECT last_name,
       job_id,
       hire_date
FROM employees
WHERE last_name IN ('Matos', 'Taylor')
ORDER BY hire_date ASC;
//Question 4
SELECT last_name,
       hire_date
FROM employees
WHERE EXTRACT(YEAR FROM hire_date) = 1994;
//Question 5
SELECT e.last_name,
       j.job_title
FROM employees e
JOIN jobs j
ON e.job_id = j.job_id
WHERE e.manager_id IS NULL;
//Question 6
SELECT last_name
FROM employees
WHERE last_name LIKE '%a%'
AND last_name LIKE '%e%';
//Question 7
INSERT INTO employees
VALUES (
    207,
    'Michael',
    'Hartstein',
    'MHARTST',
    '515.123.4567',
    DATE '2026-08-01',
    'IT_PROG',
    13000,
    NULL,
    103,
    60
);
SELECT *
FROM employees
WHERE employee_id = 207;
COMMIT;

//Question 8

 SELECT employee_id
FROM employees
WHERE employee_id >= 300
ORDER BY employee_id;

SELECT employee_id,
       first_name,
       last_name,
       email,
       salary
FROM employees
WHERE employee_id = 301;

INSERT INTO employees
(employee_id, first_name, last_name, email, phone_number,
 hire_date, job_id, manager_id, department_id)
VALUES
(302, 'Susan', 'Mavris', 'SMAV302', '515.123.4569',
 DATE '2026-08-01', 'IT_PROG', 103, 40);
 SELECT employee_id,
       first_name,
       last_name,
       department_id,
       salary
FROM employees
WHERE employee_id IN (301, 302);
COMMIT;

//Question 9
UPDATE employees
SET salary = salary * 1.10
WHERE department_id = 90;
SELECT employee_id,
       first_name,
       last_name,
       department_id,
       salary
FROM employees
WHERE department_id = 90;
COMMIT;

//Question 10
DELETE FROM employees
WHERE first_name LIKE '%man%'
   OR last_name LIKE '%man%';
   
   SELECT employee_id,
       first_name,
       last_name
FROM employees
WHERE first_name LIKE '%man%'
   OR last_name LIKE '%man%';
   
SELECT employee_id,
       first_name,
       last_name
FROM employees
WHERE employee_id IN (112, 123, 204);

SELECT employee_id,
       first_name,
       last_name,
       manager_id
FROM employees
WHERE manager_id = 123;

//Question 11
//Creating Department Table
CREATE TABLE dept (
    department_id NUMBER(4),
    department_name VARCHAR2(30)
);
//inserting rows
INSERT INTO dept (department_id, department_name)
SELECT department_id, department_name
FROM departments;
//verifying
SELECT *
FROM dept;
INSERT INTO dept (department_id, department_name)
VALUES (10, 'Accounts');