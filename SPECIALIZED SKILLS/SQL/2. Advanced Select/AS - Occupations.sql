SELECT d,p,s,a
  FROM (
    SELECT 
      Name,
      Occupation, RANK() OVER(PARTITION BY Occupation ORDER BY Name) AS rank
    FROM 
      OCCUPATIONS 
)
PIVOT
(
    MIN(Name)
    FOR Occupation
    IN ('Doctor' as d,'Professor' as p,'Singer' as s,'Actor' as a)  
)
ORDER BY rank;