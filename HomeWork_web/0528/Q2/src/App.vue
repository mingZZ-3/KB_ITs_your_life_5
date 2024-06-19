<template>
  <div>
      <Sender/><br>
      <Receiver/>
  </div>
</template>

<script>
import Receiver from './components/Receiver.vue'
import Sender from './components/Sender.vue'
export default {
  name : 'app',
  components :  { Receiver, Sender }
}

</script>