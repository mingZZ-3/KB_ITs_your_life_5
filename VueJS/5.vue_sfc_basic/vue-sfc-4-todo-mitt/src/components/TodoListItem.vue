<template>
    <li class="list-group-item" 
        :class="{'list-group-item-success' : completed}"
        @click="emitter.emit('toggle-completed', id);">
        <span class="pointer" :class="{'todo-done' : completed}"> 
            {{ todo }} {{ completed ? '(완료)' : '' }}
        </span>
        <span class="float-end badge bg-secondary ointer"
            @click.stop="emitter.emit('delete-todo', id);">삭제</span>
    </li>
</template>

<script>
import { compile } from 'vue';

export default {
    name : 'TodoListItem',
    props : {
        id : {
            type : Number,
            required : true,
        },
        todo : {
            type : String,
            required : true,
        },
        completed : {
            type : Boolean,
            required : false,
            default : false
        }
    }
}
</script>
