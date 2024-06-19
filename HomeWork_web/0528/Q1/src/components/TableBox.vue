<template>
    <table class="table table-bordered">
        <tr>
            <td>name</td>
            <td>{{ name }}</td>
        </tr>

        <tr>
            <td>age</td>
            <td>{{ age }}</td>
        </tr>

        <tr>
            <td>gender</td>
            <td>{{ gender }}</td>
        </tr>
    </table>
</template>

<script>
export default {
    name : 'TableBox',
    props : {
        name : {
            type : String,
            required : true
        },
        age : {
            type : Number,
            required : true
        },
        gender : {
            type : String,
            required : true
        }
    }
}
</script>