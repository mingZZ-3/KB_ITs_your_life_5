<template>
  <div class="container">
      <ImageBox :img="img"/><br>
      <TableBox :name="baby.name" :age="baby.age" :gender="baby.gender"/>
  </div>
</template>

<script>
import ImageBox from './components/ImageBox.vue'
import TableBox from './components/TableBox.vue'

export default {
  name : 'app',
  components : { ImageBox, TableBox },
  data() {
    return {
      baby : {
        name : 'Cat baby',
        age : 1,
        gender : 'female',
      },
      img : "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtbncOUed31PlTwuzHht6a2QMlrP6JdYihTz_aUMJnlNVpFTTjun0fZGnRos7aRYq7-9M&usqp=CAU"
    }
  }
}
</script>