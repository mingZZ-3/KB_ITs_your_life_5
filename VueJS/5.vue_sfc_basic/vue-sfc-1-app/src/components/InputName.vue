<template>
    <div style="border: solid 1px black; padding: 5px;">
        이름 : <input type="text" v-model="name">
        <button @click="$emit('nameChanged', {name})">이벤트 발신</button>
    </div>
</template>

<script>
// https://ko.vuejs.org/guide/components/events
export default {
    name : 'InputName',
    // emits : 외부 레이아웃을 전달할(emits=방출할) 이벤트
    // 1. 가장 간단한 전달 방법
    // emits : [ 'nameChanged' ],  --> 오 안되냐
    // 2. type 체크 이후 전달하는 과정
    emits : {
        nameChanged:(e) => {
            return e.name && typef(e.name) === 'string' && e.name.trim().length >= 3 ?
                    true : false;
        }
    },
    data() {
        return {
            name : '홍길동'
        }
    }
}

</script>