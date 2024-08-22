function addTodo() {
    const todoInput = document.getElementById('todoInput');
    const todoList = document.getElementById('todoList');

    const task = todoInput.value.trim();

    if (task !== '') {
        const listItem = document.createElement('li');
        listItem.textContent = task;

        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'Delete';
        deleteButton.onclick = function() {
            todoList.removeChild(listItem);
        };

        listItem.appendChild(deleteButton);
        todoList.appendChild(listItem);

        todoInput.value = '';
    }
}
