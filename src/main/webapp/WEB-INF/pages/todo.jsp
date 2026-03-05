<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Todo list</title>
    <style>
        /* Базовые настройки */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Arial, sans-serif;
            background-color: #e4e4e4;
            padding: 40px;
            display: flex;
            flex-direction: column;
            color: #333;
        }

        /* 1. Верхние кнопки (справа) */
        #header-buttons-todo {
            display: flex;
            justify-content: flex-end;
            gap: 12px;
            width: 100%;
            max-width: 800px;
            margin: 0 auto 40px auto;
        }

        /* Кнопка About me — Синяя */
        #about-me-todo {
            background-color: #3b82f6;
            color: white;
            border: 1px solid #2563eb;
            padding: 10px 20px;
            border-radius: 6px;
            font-weight: 500;
        }

        /* Кнопка Logout — Красная */
        #logout-todo {
            background-color: #ef4444;
            color: white;
            border: 1px solid #dc2626;
            padding: 10px 20px;
            border-radius: 6px;
            font-weight: 500;
        }

        /* 2. Приветствие */
        h1 {
            text-align: center;
            margin-bottom: 40px;
            font-size: 32px;
            font-weight: 500;
        }

        /* 3. Форма добавления задачи (Компактная) */
        #form-task-todo {
            width: 100%;
            max-width: 500px; /* Еще меньше ширина для компактности */
            margin: 0 auto 50px auto;
        }

        #form-task-todo form {
            display: flex;
            gap: 15px;
        }

        #input-task {
            flex: 1.5;
            padding: 10px 14px;
            border: 1px solid #333;
            border-radius: 6px;
            background: white;
            font-size: 15px;
        }

        /* Кнопка Add task — Зеленая */
        #task-button {
            flex: 1;
            padding: 10px 20px;
            background-color: #22c55e;
            color: white;
            border: 1px solid #16a34a;
            border-radius: 6px;
            font-weight: 600;
            white-space: nowrap;
        }

        /* 4. Список задач с нумерацией и рамкой */
        ol {
            width: 100%;
            max-width: 800px;
            margin: 0 auto;
            background: white;
            border: 2px solid #333;
            border-radius: 8px;
            padding: 20px 40px; /* Больше отступ слева для цифр */
            list-style-type: decimal; /* Включает нумерацию 1, 2, 3... */
        }

        ol li {
            display: list-item; /* Возвращаем стандартное поведение списка */
            margin-bottom: 15px;
            padding-bottom: 10px;
            border-bottom: 1px solid #eee;
        }

        ol li:last-child {
            border-bottom: none;
            margin-bottom: 0;
        }

        /* Контейнер внутри li для текста и кнопки удаления */
        ol li > p,
        ol li > form {
            display: inline-block;
            vertical-align: middle;
        }

        /* Чтобы кнопка Remove была справа внутри li */
        ol li {
            position: relative;
            min-height: 40px;
        }

        #delete-form {
            position: absolute;
            right: 0;
            top: 50%;
            transform: translateY(-50%);
        }

        #task-text {
            font-size: 18px;
            padding-left: 10px;
        }

        /* Кнопка Remove — Красная */
        #remove-button {
            background-color: #fee2e2; /* Светло-красный фон */
            color: #b91c1c; /* Темно-красный текст */
            border: 1px solid #ef4444;
            padding: 5px 12px;
            border-radius: 4px;
            font-size: 13px;
            font-weight: 500;
        }

        #remove-button:hover {
            background-color: #ef4444;
            color: white;
        }

        /* Общие стили кнопок */
        button {
            cursor: pointer;
            transition: opacity 0.2s;
        }

        button:hover {
            opacity: 0.85;
        }

        button:active {
            transform: translateY(1px);
        }

        h4 {
            text-align: center;
            color: #666;
        }

    </style>

</head>
<body>
<div id="header-buttons-todo">
    <form action="/about-me" method="get">
        <button type="submit" id="about-me-todo">About me</button>
    </form>
    <form action="/logout" method="post">
        <button type="submit" id="logout-todo">Logout</button>
    </form>
</div>

<c:if test="${username != null}">
    <h1>Hello ${username}</h1>
</c:if>

<div id="form-task-todo">
    <form action="/todo" method="post">
        <input type="text" id="input-task" name="addTask" placeholder="Enter your task" required>
        <button type="submit" id="task-button">Add task</button>
    </form>
</div>

<c:if test="${tasks == null || tasks.isEmpty()}">
    <h4>There are no tasks!</h4>
</c:if>

<ol>
    <c:forEach var="task" items="${tasks}">
        <li>
            <p id="task-text">${task}</p>
            <form action="/todo" method="post" id="delete-form">
                <input type="hidden" value="${task}" name="deleteTask">
                <button type="submit" id="remove-button">Remove</button>
            </form>
        </li>
    </c:forEach>
</ol>
</body>
</html>