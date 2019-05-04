SELECT
  h.hacker_id,
  h.name
FROM 
  hackers h, 
  difficulty d,
  challenges c, 
  submissions s
WHERE
  s.challenge_id = c.challenge_id
  AND c.difficulty_level = d.difficulty_level
  AND s.hacker_id = h.hacker_id
  AND s.score = d.score
GROUP BY
  h.hacker_id,
  h.name
HAVING 
  COUNT(s.hacker_id) > 1
ORDER BY  
  COUNT(h.hacker_id) DESC, 
  h.hacker_id;