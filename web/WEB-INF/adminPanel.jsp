<%-- 
    Document   : adminPanel
    Created on : Mar 23, 2022, 10:29:21 AM
    Author     : pupil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Панель администратора</h1>
        <a href="index.jsp">Главная страница</a>
        <p>${info}</p>
<form action="changeRole" method="POST">
            <div class="mb-3">
                <label for="users" class="form-label">Пользователи</label>
                <select name="userId" id="userId" class="form-select">
                    <c:forEach var="entry" items="${mapUsers}">
                        <option value="${entry.key.id}">
                            ${entry.key.reader.firstname} ${entry.key.reader.lastname}. ${entry.key.login}. ${entry.value}
                        </option>
                    </c:forEach>
                </select>
                <label for="roleId" class="form-label">Роли</label>
                <select name="roleId" id="roleId" class="form-select">
                    <c:forEach var="role" items="${roles}">
                        <option value="${role.id}">${role.roleName}</option>
                    </c:forEach>
                </select>
            </div>
            <input class="btn btn-primary mt-3" type="submit" value="Изменить роль">
        </form>
    </div>
    