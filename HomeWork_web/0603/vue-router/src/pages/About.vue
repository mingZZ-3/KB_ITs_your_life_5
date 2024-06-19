<template>
  <div class="card card-body">
    <h2>About {{ user.name }}</h2>
    <p>Tel : {{ user.tel }}</p>
    <p>Address : {{ user.address }}</p>
  </div>
</template>

<script setup>
import { reactive } from "vue";

const user = reactive({ no: 0, name: "", tel: "", address: "" });
const url = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101";
const response = await fetch(url);
const jsonObj = await response.json()

const movieObj = jsonObj.boxOfficeResult.dailyBoxOfficeList[0];
user.no = movieObj.rank;
user.name = movieObj.movieNm;
user.tel = movieObj.openDt;
user.address = movieObj.salesAmt;
</script>
