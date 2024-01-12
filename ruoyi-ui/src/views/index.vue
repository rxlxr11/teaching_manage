<template>
  <div class="body">
    <div class="shell">
      <img src="http://test.rxlxr.com/images/ujslogo.png" alt="" class="cover">
      <div class="head">
        <div class="data">
          <div class="title1">江苏大学<span>UJS</span></div>
          <div class="title2">教学管理系统</div>
        </div>
      </div>
      <div class="foot">
        <div class="tags">
          <span class="tag">#VUE</span>
          <span class="tag">#SpringBoot</span>
          <br>
          <span class="tag">#Mybatis</span>
          <span class="tag">#Mysql</span>
          <span class="tag">#ElementUI</span>
        </div>
        <div class="introduce">
          <p>
            江苏大学是2001年8月经教育部批准，由原江苏理工大学、镇江医学院、镇江师范专科学校合并组建的重点综合性大学，是江苏省人民政府和教育部、农业农村部共建高校，以及首批江苏省高水平大学建设高校、全国本科教学工作水平优秀高校、首批全国50所毕业生就业典型经验高校、全国创新创业典型经验高校、首批全国来华留学质量认证高校、全国“三全育人”综合改革试点高校。
          </p>
        </div>
      </div>
    </div>
  </div>

</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.8.7"
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    }
  }
};
</script>

<style scoped lang="scss">


* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}

.body {
  width: 100%;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background-image: linear-gradient(to top, #71c4ef 0%, #2e8b57 100%);
}

.shell {
  width: 780px;
  height: 580px;
  background: #ffffff;
  position: relative;
}

.head {
  height: 340px;
  position: relative;
  overflow: hidden;
  z-index: 1;
}

.head::before {
  content: '';
  width: 100%;
  height: 100%;
  position: absolute;
  background: url("http://test.rxlxr.com/images/gk1.jpg");
  background-size: cover;
  z-index: -1;
  transform: skewY(-4deg);
  transform-origin: 0 0;
}

.cover {
  position: absolute;
  top: 190px;
  left: 25px;
  width: 220px;
  z-index: 2;
  border-radius: 500px;
  border: 10px #fff solid;
  box-shadow: 0 5px 10px #00000065;
}

.data {
  padding: 190px 0 0 280px;
  text-shadow: 0 0 20px #000;
}

.data .title1 {
  color: white;
  font-size: 50px;
  font: 900 50px '';
  margin-bottom: 5px;
  position: relative;
}

.data .title1 span {
  position: absolute;
  top: 17px;
  margin-left: 12px;
  background: #ffe44c;
  border-radius: 5px;
  color: #000000;
  font-size: 14px;
  padding: 0px 4px;
}

.data .title2 {
  color: #fff;
  font: 500 24px '';
}

.foot {
  line-height: 26px;
  color: #444;
}

.tags {
  padding-left: 30px;
  padding-top: 100px;
  width: 250px;
  float: left;
  text-align: center;
}

.tag {
  background: rgb(149, 178, 255);
  color: #fff;
  border-radius: 10px;
  padding: 3px 8px;
  font-size: 14px;
  margin-right: 4px;
  line-height: 35px;
  cursor: pointer;
}

.tag:hover {
  background: #eee4ad;
  color: #444;
}

.introduce {
  padding: 25px 0 0 35px;
  width: 480px;
  float: left;
}
</style>

