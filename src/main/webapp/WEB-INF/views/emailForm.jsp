<!DOCTYPE html>
<html>
<head>
    <title>Email Form</title>
</head>
<body>
    <h1>Email Form</h1>
    <form action="/submitEmail" method="post">
        <label for="email">Email Address:</label>
        <input type="email" id="email" name="email" required>
        <br><br>

        <label for="message">Message:</label>
        <textarea id="message" name="message" rows="4" cols="30" required></textarea>
        <br><br>

        <button type="submit">Send</button>
    </form>
</body>
</html>
