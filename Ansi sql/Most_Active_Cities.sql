SELECT city, COUNT(DISTINCT r.user_id) AS user_count
FROM events e
JOIN registrations r ON e.event_id = r.event_id
GROUP BY city
ORDER BY user_count DESC
LIMIT 5;