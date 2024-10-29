𝐅𝐞𝐚𝐭𝐮𝐫𝐞𝐬
𝐒𝐭𝐮𝐝𝐞𝐧𝐭 𝐑𝐞𝐠𝐢𝐬𝐭𝐫𝐚𝐭𝐢𝐨𝐧:
    Add new students with details like name, roll number, and department.
Store data in the database for persistence.

𝐀𝐜𝐡𝐢𝐞𝐯𝐞𝐦𝐞𝐧𝐭 𝐄𝐧𝐭𝐫𝐲:
     Authorized users can add new achievements for registered students.
Each entry includes the type, description, and date of the achievement.

𝐀𝐜𝐡𝐢𝐞𝐯𝐞𝐦𝐞𝐧𝐭 𝐃𝐢𝐬𝐩𝐥𝐚𝐲:
    Display achievements by each student and enable filtering by type or date.
Use JTable for a clean tabular display of student achievements.

𝐒𝐞𝐚𝐫𝐜𝐡 & 𝐅𝐢𝐥𝐭𝐞𝐫:
     Search functionality based on student name, roll number, or achievement type.
Allow filtered views for easy tracking of specific achievements.

                                𝐒𝐭𝐞𝐩𝐬 𝐭𝐨 𝐈𝐦𝐩𝐥𝐞𝐦𝐞𝐧𝐭 𝐌𝐞𝐧𝐭𝐨𝐫/𝐀𝐝𝐦𝐢𝐧 𝐕𝐢𝐞𝐰 𝐟𝐨𝐫 𝐒𝐭𝐮𝐝𝐞𝐧𝐭 𝐀𝐜𝐡𝐢𝐞𝐯𝐞𝐦𝐞𝐧𝐭𝐬
𝐑𝐨𝐥𝐞-𝐁𝐚𝐬𝐞𝐝 𝐀𝐜𝐜𝐞𝐬𝐬:
    Define roles (e.g., “mentor” and “admin”) with specific access rights.
In a basic setup, you can use a String variable (role) to denote if a user is a “mentor” or “admin”.

𝐒𝐭𝐮𝐝𝐞𝐧𝐭 𝐚𝐧𝐝 𝐀𝐜𝐡𝐢𝐞𝐯𝐞𝐦𝐞𝐧𝐭 𝐃𝐚𝐭𝐚 𝐅𝐢𝐥𝐭𝐞𝐫𝐢𝐧𝐠:
     Allow admin users to view all student achievements.
Allow mentors to view achievements only for their assigned students.

𝐔𝐬𝐞𝐫 𝐂𝐥𝐚𝐬𝐬𝐞𝐬:
    Add an Admin and Mentor class (or use a User class with role field) to represent each type of user.
If using a database, you might have a table with a user_role field to store these roles.

𝗨𝗜 𝗖𝗼𝗺𝗽𝗼𝗻𝗲𝗻𝘁𝘀:
    Use a login system to identify the user and set the role.
Create a JTable in the View Achievements Tab to display filtered achievements based on the user’s role.
