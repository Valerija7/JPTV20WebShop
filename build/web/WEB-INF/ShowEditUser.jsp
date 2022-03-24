<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <form action="createAccountBox" method="POST" >
        <div class="w-100 d-flex justify-content-center">
            <div class="card border-primary mb-3" style="max-width: 20rem;">
                <div class="card-header">Личные данные</div>
                <div class="card-body">
                    <div class="form-group">
                        <label class="col-form-label mt-4">Имя</label>
                        <input type="text" class="form-control" id="inputDefault" value="${firstName}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label mt-4">Фамилия</label>
                        <input type="text" class="form-control" id="inputDefault" value="${sureName}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label mt-4">Телефон</label>
                        <input type="text" class="form-control" id="inputDefault" value="${phone}">
                    </div>
                </div>
            </div>
            <div class="card border-primary mb-3" style="max-width: 20rem;">
                <div class="card-header">Данные аккаунта</div>
                <div class="card-body">
                    <div class="form-group">
                        <label class="col-form-label mt-4">Логин</label>
                        <input type="text" class="form-control" id="inputDefault" value="${loginEdit}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label mt-4">Старый пароль</label>
                        <input type="text" class="form-control" id="inputDefault" value="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label mt-4">Новый пароль</label>
                        <input type="text" class="form-control" id="inputDefault" value="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label mt-4">Подтвердите новый пароль</label>
                        <input type="text" class="form-control" id="inputDefault">
                    </div>

                </div>
            </div>
        </div>
        <input class="btn btn-success mt-5" type="submit" value="Подтвердить изменения">
    </form>
</div>