<template>
  <div>
    <NoSlotTest/><br>
    <SlotTest/><br>
    <NamedSlotTest/>
  </div>
</template>


<script>
import NoSlotTest from './components/NoSlotTest.vue'
import SlotTest from './components/SlotTest.vue'
import NamedSlotTest from './components/NamedSlotTest.vue'

export default {
  name : 'app',
  components : { NoSlotTest, SlotTest, NamedSlotTest }
}
</script>