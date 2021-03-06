# 新闻Remix混合 安卓原生应用

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

# 使用的相关技术

Rxjava, Retrofit, Room, Fresco, etc

# 主要构架和组件 

小型单进程应用

由三个activities, 两个services, 两个 broadcast receivers 其中 主Activity 含有4个fragments, 1 个 自定义 View (Flowlayout)

Future task: 采用多进程 run 后台service

# 主要API

网易云 (Netease cloud api) 和 News break open api： (Netease music cloud api and News break open api)


问题: 由于api不够完善, 采用少量数据不断重复来模拟无限加载列表 (这个app 主要是加强对各种组件的掌握和使用)

(Use minor data to mock infi loading list)


Future task: 自己完善 API 重新设计   (Need optimation on the api)

# 主要Features

1 下拉加载浏览功能  (Infinite loading list)

2 播放 暂停 Remix音乐, timer 显示进度  (Music playing throuch MediaPlayer api while using timer to show progress)


3 点赞 Remix 功能和 收藏功能 (Like/Dislike feature)


4 通过网易云 id 添加 Remix (Music/Remix adding feature)


5 浏览少量新闻 summary, api 只提供 summary 这里主要只是为了练习. (News Reading feature)


6 切换音乐播放 的 生命周期。允许 边看新闻边听歌  (Remix mode switch feature)

7 新闻加载完毕 notification  (News notifications)

# Playstore 下载


https://play.google.com/store/apps/details?id=zhengzhou.individual.interview （SSL error）


# 截图

<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617340605.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617570407.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617341928.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617340619.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617340624.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617340629.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617340651.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1618116239.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617342042.png" width = "210" height = "375" alt="图片名称" align=center />
<img src="https://github.com/zhouz88/Playstore/blob/addFeature/images/Screenshot_1617342053.png" width = "210" height = "375" alt="图片名称" align=center />





