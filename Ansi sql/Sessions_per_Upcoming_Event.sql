SELECT e.event_id, e.event_name, COUNT(s.session_id) AS session_count
FROM events e
LEFT JOIN sessions s ON e.event_id = s.event_id
WHERE e.event_date > CURRENT_DATE
GROUP BY e.event_id, e.event_name;