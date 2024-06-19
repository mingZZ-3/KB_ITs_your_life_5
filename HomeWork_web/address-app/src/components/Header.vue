<template>
    <header class="p-3 text-bg-dark">
        <div class="container">
          <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
              <img class="bi me-2" width="90" height="32" role="img" src="../assets/logo.png"/>
            </a>
    
            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
              <li><router-link class="nav-link px-2 text-white" to="/">Home</router-link></li>
              <li><router-link class="nav-link px-2 text-white" to="/boardList">Board List</router-link></li>
              <li><router-link class="nav-link px-2 text-white" to="/boardCreate">Board Create</router-link></li>
            </ul>
          </div>
        </div>
      </header>
</template>

<script setup>
import { RouterLink } from 'vue-router';


</script>