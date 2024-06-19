<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2><br>
    <ul>
      <CheckBoxItem v-for="item in idols" :key="item.id"
                    :id="item.id" :name="item.name" :checked="item.checked"/>
    </ul>
    
  </div>
</template>

<script>
import CheckBoxItem from './components/CheckBoxItem.vue';

export default {
  name : 'app',
  components : {CheckBoxItem},
  data() {
    return {
      idols: [
        { id: 1, name: "New Jeans", checked: true },
        { id: 2, name: "Black Pink", checked: false },
        { id: 3, name: "Aespa", checked: false },
        { id: 4, name: "NMIX", checked: false },
      ]
    }
  }
}
</script>