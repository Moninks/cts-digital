SELECT e.event_id, e.event_name, AVG(f.rating) AS average_rating
FROM events e
JOIN feedback f ON e.event_id = f.event_id
GROUP BY e.event_id, e.event_name
HAVING COUNT(f.feedback_id) >= 10
ORDER BY average_rating DESC;