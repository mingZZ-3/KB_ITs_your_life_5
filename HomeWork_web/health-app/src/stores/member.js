import { defineStore } from 'pinia'
import { ref } from 'vue'

export const useMemberStore = defineStore("member", () => {
    const member = ref({
        id : "kimMulti",
        pw : "1234",
        mname : "김민지",
        address : "서울시 광진구",
        phonenum : "010-1234-5678",
    })

    const editInfo = (addr, phone) => {
        member.value.address = addr;
        member.value.phonenum = phone;
    }

    return { member, editInfo };
})