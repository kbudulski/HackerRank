SELECT
  *
FROM (
  SELECT
    MAX(salary * months) AS max_salary, COUNT(employee_id)
  FROM 
    Employee
  GROUP BY
    salary * months
  HAVING
    (salary * months) = MAX(salary * months)
  ORDER BY
    salary * months DESC
)
WHERE 
  ROWNUM = 1;