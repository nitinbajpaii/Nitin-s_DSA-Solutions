# Write your MySQL query statement below
SELECT name AS Customers
FROM customers a
LEFT JOIN orders b
ON a.id = b.customerId
WHERE b.customerId IS NULL;