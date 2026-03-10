# Trackstage

Trackstage是一个正在开发中的项目，基于ANTE，添加了一些功能并优化了GUI逻辑。<br/>
Aphrodite's Nemo's Transit Expansion (MTR-ANTE) 是一个基于Minecraft Transit Railway Mod的实验性功能扩展，基于MTR-NTE。

## 支持

[文档](https://aphrodite281.github.io/mtr-ante/#/)、QQ群(836291719)

## 下载
[Releases](https://github.com/aphrodite281/mtr-ante/releases) 、 [Modrinth](https://modrinth.com/mod/mtr-ante/)

## 构建

在执行`build`任务前须先执行`setupLibrary`，可以用类似-PbuildVersion="`<version>`"参数指定版本(1.17.1 1.18.2 1.19.4 1.20.1 1.21.1)，默认为1.20.1。
以1.21.1为例，  
第一次构建前执行：  

- `./gradlew setupLibrary -PbuildVersion="1.21.1"`   

每次构建时执行：  

- `./gradlew build -PbuildVersion="1.21.1"`  