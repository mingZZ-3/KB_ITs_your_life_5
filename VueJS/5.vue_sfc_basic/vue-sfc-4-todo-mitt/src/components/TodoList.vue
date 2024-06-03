<template>
    <ul class="list-group">
        <TodoListItem v-for="item in todoList" :key="item.id"
                        :id="item.id" :todo="item.todo" :completed="item.completed" />
    </ul>
</template>
<script>
import TodoListItem from './TodoListItem.vue'
export default {
    name : 'TodoList',
    components : {TodoListItem},
    props : {
        todoList : {
            type : Array,
            required : true
        }
    }
}
</script>