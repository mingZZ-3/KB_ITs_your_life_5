<template>
    <div>
        <input type="checkbox" :checked="idol.checked"> {{ idol.id }} - {{ idol.name }}
    </div>
</template>

<script>
import Idol from '../Idol.js'

export default {
    name : 'CheckboxItem3',
    props : {
        idol : Idol
    }
}

</script>