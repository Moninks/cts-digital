SELECT e.event_id, e.event_name
FROM events e
JOIN registrations r ON e.event_id = r.event_id
LEFT JOIN feedback f ON e.event_id = f.event_id
GROUP BY e.event_id, e.event_name
HAVING COUNT(DISTINCT r.user_id) > 0 AND COUNT(f.feedback_id) = 0;