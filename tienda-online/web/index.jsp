

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Inicio de Sesion</title>
    <meta charset="UTF-8">
</head>
<body>

    <h2>Iniciar Sesion</h2>

    <form action="Inicio" method="post">
        <label>Usuario:</label>
        <input type="text" name="usuario" required><br><br>

        <label>Contraseña:</label>
        <input type="password" name="password" required><br><br>

        <button type="submit">Entrar</button>
    </form>

</body>
</html>
