<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta charset="gb2312">
<title></title>
<link href="css/styles.css" rel="stylesheet">
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
<![endif]-->
</head>
<body>
<header>
 <nav id="nav">
   <ul>
    <li><a href="index.jsp">博客首页</a></li>
    
   </ul>
  <script src="js/silder.js"></script><!--获取当前页导航 高亮显示标题-->
 </nav>
 </header>
 <div class="mainContent">
    <aside>
      <div class="avatar">
        <a href="#"><span>这不是我</span></a>
      </div>
      <section class="topspaceinfo">
        <h1>刘丹的博客</h1>
        <p>敲代码。。。。。。</p>
      </section>
      <div class="userinfo"> 
        
          
      </div>
      <section class="newpic">
         <h2>最新照片</h2>
         <ul>
           <li><a href="/"><img src="images/01.jpg"></a></li>
           <li><a href="/"><img src="images/02.jpg"></a></li>
           <li><a href="/"><img src="images/03.jpg"></a></li>
           <li><a href="/"><img src="images/04.jpg"></a></li>
           <li><a href="/"><img src="images/05.jpg"></a></li>
           <li><a href="/"><img src="images/06.jpg"></a></li>
           <li><a href="/"><img src="images/07.jpg"></a></li>
           <li><a href="/"><img src="images/08.jpg"></a></li>
         </ul>
      </section>
      <section class="taglist">
         <h2>标签</h2>
         <ul>
           <li><a href="/">敲代码的</a></li>
        </ul>
      </section>
      <section class="taglist">
         <h2><a href="updateuser.jsp">个人设置</h2>
         
      </section>
      <section class="taglist">
        <h2>我的文章</h2>
         <ul>
         <li><c:forEach var="user" items="${ requestScope.list1 }">
							<tr>
								<td>${user.title }</td>
								
							</tr>
						</c:forEach>
						</li>
           <li><a href="addarticle.jsp">撰写博客</a></li>
        </ul>
      </section>
      <section class="taglist">
         <h2><a href="addarticle.jsp">撰写博客</h2>
         
      </section>
    </aside>
    <div class="blogitem">
      <article>
        <h2 class="title"><a href="/">陌上花开</a></h2>
        <ul class="text">
          <p>“陌上花开，可缓缓归矣。” 含义：（夫人），田间阡陌上的花开了，你可以一边赏花，一边慢慢地回来。</p>
          <p>“陌上花开，如果没有悄然伫立阡陌并为陌上风情所陶醉的人，那么花开也寂寞，风情也苍白....”喜欢这句话，是因为看了忍冬的作品《陌上花开缓缓归》</p>
          <p>阳春三月，风和日暖，信步城外，看阡陌之上的杨柳依依，野花绚烂，身心不由得轻爽而浪漫。“三月风情陌上花”，古远的诗句似乎随风从天边飘来，从历史的深处飘来，拂过阡陌，袭上心头，诗是属于清乾嘉诗人赵翼的，可昂首远望，眼前的陌上风情却是不折不扣的现代，由眼帘入心扉。</p>
          <p class="textimg"><img src="images/text02.jpg"></p>
          <p>漫步陌上，心情是诗意的那种，优雅而散淡，不惹匆促，只因陌上花开；花是自然的那种，朴素而恬淡，不落尘俗。“三月风情陌上花”，是花在其中生命得以璀璨，人在其中心情得以畅然的一种意境。三月陌上花，让人爱让人痴，恍惚人的骨子里头都沉淀了花的影子，花的风韵。</p>
          <p>陌上花开，如果没有了从俗累的生活中走出来，悄然伫立阡陌并为陌上风情所陶醉的人，那么花开也寂寞，风情也苍白。于是，一句“陌上花开，可缓缓归矣”不知被多少人吟诵了多少遍。人归缓缓，那花便有灵性，便开得执著，陌上风情也被撩拨得浓郁而热烈。</p>
          <p>缓缓归，缓缓归，披一袭“三月风情”，再采一束“陌上花”，缓缓归。</p>
          <p>缓缓归矣，我心已是陌上花开。</p>
        </ul>
        <div class="textfoot">
          <a href="/">阅读全文</a><a href="/">评论</a><a href="/">转载</a>
        </div>
      </article> 
      <article>
        <h2 class="title"><a href="/">岁月留痕――我的2018</a></h2>
        <ul class="text">
          <p>A面――岁月留痕之时光</p>
          <p>每逢新旧年交替时候，我就被笼罩在一股茫然的思绪里，逃也逃不脱，避也避不开，唯有让心事在静静流逝的时光里苍茫成河。</p>
          <p>是从什么时候开始的呢，我又变得如此感时伤怀？我很羡慕那些在年终盘点总结的人们，过去的一年于他们来说，是大刀阔斧的一年，是硕果累累的一年。再不济的话，也是豪情万丈的一年。而在我那逝去的时光里，平静如水，不起一丝波澜，一年又一年。我没有盘点，因为我没有波澜壮阔；我不会去总结，因为我的总结从来就没有逼近我的心灵。我知道这于我来说，显得多么无厘头。</p>
          <p class="textimg"><img src="images/text01.jpg"></p>
          <p>我喜欢这样安静地坐下来，想一些似有若无的心事。尽量不去想那些飞逝的时光，尽量不去想那些形色匆忙的脚步，似乎是在害怕，在这高速运转的时空里，自己有一天会化作一堆虚无。还记得那一部《岁月神偷》的电影吗？真是要感谢来自香港的导演罗启锐，影片给我们芸芸众生留下太多的唏嘘。在如水一般逝去的时光里，皱纹爬上你的眼角，白发蔓延我的双鬓。岁月才是最好的神偷，偷走了我的青春和你的美好。</p>
          <p>就任这时光慢慢流淌吧，对于大多数人来说，我们无非就是浩瀚时空的一些微尘。虎年走了又怎样</p>
        </ul>
        <div class="textfoot">
          <a href="/">阅读全文</a><a href="/">评论</a><a href="/">转载</a>
        </div>
      </article>
      <div class="pages"><span>1</span><a href="/" hidefocus="">2</a><a href="/" hidefocus="">3</a><a href="/" class="next">下一页&gt;&gt;</a></div>
    </div>
 </div>
<footer>
  
   <section class="visitor">
     <h2>最近访客</h2>
      <ul>
        <li><a href="/"><img src="images/s0.jpg"></a></li>
        <li><a href="/"><img src="images/s1.jpg"></a></li>
        <li><a href="/"><img src="images/s2.jpg"></a></li>
        <li><a href="/"><img src="images/s3.jpg"></a></li>
        <li><a href="/"><img src="images/s5.jpg"></a></li>
        <li><a href="/"><img src="images/s6.jpg"></a></li>
        <li><a href="/"><img src="images/s7.jpg"></a></li>
        <li><a href="/"><img src="images/s8.jpg"></a></li>
      </ul>
   </section>
   <div class="Copyright">
     <ul>
       <a href="/">帮助中心</a><a href="/">空间客服</a><a href="/">投诉中心</a><a href="/">空间协议</a>
     </ul>
   </div>
 </footer>
 
</body>
</html>