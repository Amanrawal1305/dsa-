-- 
SELECT A.name AS "Employee"
FROM Employee AS A , Employee AS B
WHERE 
    A.managerId IS NOT NULL 
    AND
    A.managerId = B.id
    AND
    A.salary > B.salary
;