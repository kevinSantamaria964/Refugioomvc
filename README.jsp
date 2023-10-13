<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
    <display-name>Modelo</display-name>
    <servlet>
        <servlet-name>MascotaController</servlet-name>
        <servlet-class>Modelo.MascotaController</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>MascotaController</servlet-name>
        <url-pattern>/mascotas</url-pattern>
    </servlet-mapping>
</web-app>
