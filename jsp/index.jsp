<!DOCTYPE html>
<html>
<head>
    <title>Refugio de Mascotas</title>
    <style>
        h1 {
            text-align: center;
        }
        h2 {
            margin-top: 20px;
        }
        ul {
            list-style: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
            border: 1px solid #ccc;
            padding: 10px;
            background-color: #f7f7f7;
        }
    </style>
</head>
<body>
    <h1>Refugio de Mascotas</h1>
    <h2>Mascotas Disponibles</h2>
    <ul>
        <c:forEach items="${mascotas}" var="mascota">
            <li>
                <strong>${mascota.getNombre()}</strong><br>
                <span>Raza: ${mascota.getRaza()}</span><br>
                <span>Color: ${mascota.getColor()}</span><br>
                <span>Edad: ${mascota.getEdad()} años</span>
            </li>
        </c:forEach>
    </ul>
</body>
</html>

