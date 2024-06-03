<template>
    <div>
        <input type="checkbox" :checked="idol.checked"> {{ idol.id }} - {{ idol.name }}
    </div>
</template>

<script>
export default {
    name : 'CheckboxItem2',
    props : ['idol']
}

</script>