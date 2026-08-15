# Write your MySQL query statement below
UPDATE Salary
SET sex = CASE
WHEN sex='m' then 'f'
WHEN sex='f' then 'm'
END;