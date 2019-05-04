SELECT 
  a.company_code, 
  a.founder, 
  COUNT(DISTINCT b.lead_manager_code), 
  COUNT(DISTINCT c.senior_manager_code), 
  COUNT(DISTINCT d.manager_code), 
  COUNT(DISTINCT e.employee_code)
FROM 
  company a, 
  lead_manager b, 
  senior_manager c, 
  manager d, 
  employee e
WHERE 
      a.company_code = b.company_code
  AND b.company_code = c.company_code
  AND c.company_code = d.company_code
  AND d.company_code = e.company_code
GROUP BY 
  a.company_code, 
  founder
ORDER BY 
  a.company_code;