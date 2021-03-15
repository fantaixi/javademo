<template>
  <div id="app">
    <h1>aaaaa</h1>
      <router-link to="/content">sss</router-link>
    <router-view></router-view>
  </div>
</template>

<script>
import Content from "./components/Content";
export default {
  name: 'App',
  contents: {
      Content
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
