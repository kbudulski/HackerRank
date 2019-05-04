SELECT 
  Name || '(' || REGEXP_SUBSTR(Occupation, '^[ADPS]') || ')'
FROM 
  OCCUPATIONS
ORDER BY 
   Name;

SELECT 
  'There are a total of ' || COUNT(Occupation) || ' ' || LOWER(Occupation) || 's.'
FROM 
 OCCUPATIONS
GROUP BY 
  Occupation
ORDER BY 
  COUNT(Occupation), 
  Occupation;