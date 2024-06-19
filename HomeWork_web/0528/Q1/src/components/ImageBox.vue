<template>
    <div>
        <img class="card-img"
            :src="img"/>
    </div>
</template>

<script>
export default {
    name : 'ImageBox',
    props : {
        img : {
            type : String,
            required : true
        }
    }
}
</script>