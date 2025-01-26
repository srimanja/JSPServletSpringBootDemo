<!DOCTYPE html>
<html>
<head>
    <title>Account Creation Form</title>
    <script>
        function validateForm() {
            const firstName = document.getElementById("firstName").value.trim();
            const lastName = document.getElementById("lastName").value.trim();
            const email = document.getElementById("email").value.trim();
            const phone = document.getElementById("phone").value.trim();
            const address = document.getElementById("address").value.trim();
            const username = document.getElementById("username").value.trim();

            if (!firstName || !lastName || !email || !phone || !address || !username) {
                alert("All fields are required.");
                return false;
            }

            const phoneRegex = /^\d{10}$/;
            if (!phoneRegex.test(phone)) {
                alert("Phone number must be exactly 10 digits.");
                return false;
            }

            // Simulating username uniqueness check
            const existingUsernames = ["user1", "admin", "testuser"];
            if (existingUsernames.includes(username)) {
                alert("Username is already taken. Please choose another one.");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
    <h1>Account Creation Form</h1>
    <form action="/submitAccount" method="post" onsubmit="return validateForm();">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required>
        <br><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>
        <br><br>

        <label for="email">Email Address:</label>
        <input type="email" id="email" name="email" required>
        <br><br>

        <label for="phone">Phone Number:</label>
        <input type="text" id="phone" name="phone" required>
        <br><br>

        <label for="address">Address:</label>
        <textarea id="address" name="address" rows="4" cols="30" required></textarea>
        <br><br>

        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <br><br>

        <button type="submit">Create Account</button>
    </form>
</body>
</html>
