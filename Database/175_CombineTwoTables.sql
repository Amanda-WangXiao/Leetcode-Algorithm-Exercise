# Write your MySQL query statement below	#	276 ms	0 B
SELECT Person.FirstName,Person.LastName,Address.City,Address.State
FROM Person
LEFT JOIN Address
ON Person.PersonId = Address.PersonId    