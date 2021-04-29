# ERPGO 系统开发使用说明

## 环境配置：

git环境，自行下载配置 (不建议使用  GitDesktop)

## 本地仓库初始化配置及代码获取：

新建一个文件夹 ERPGO-backend 作为你的本地仓库

文件夹中右键选择 Git Bash Here 进入git 命令行界面

初始化本地仓库

```bash
$ git init
```
与本项目的远程仓库建立连接

```bash
$ git remote add origin https://github.com/software-co-design/ERPGO-backend.git
```
抓取所有的远程分支

```bash
$ git fetch
```
查看所有分支，如果抓取成功，可以看到 origin/main 这个分支

``` bash
$ git branch -a
```

从 origin/main 分支创建并检出 lyw (换成你自己的名字缩写)分支，作为以后你的工作分支

```bash
$ git checkout -b lyw origin/main
```

到这一步就可以看到你的 ERPGO-backend 文件夹下已经获取到代码了



## 代码编辑后推送到远程仓库：

按照以下步骤一步步完成即可

将 工作区 的所有更改添加到 暂存区

``` bash
$ git add .
```

将 暂存区 添加的更改提交到 本地仓库，message一般填的是这次提交做了哪些更改，比如“完成登陆功能”

``` bash
$ git commit -m "message"
```

将本地仓库的代码推送到远程仓库，**确定当前分支是你要推送的分支**

- 第一次推送，远程仓库没有你的分支，使用下面这个命令，lyw换成你的分支名

``` bash
$ git push origin lyw:lyw
```

- 之后的推送，远程仓库中已有你的分支，使用下面这个命令直接推送

``` bash
$ git push
```



## 保持好习惯，每天编码前从仓库拉取最新代码

//TODO



## 创建PR 合并从分支到主分支上

1.New pull request

![image-20210429115442424](C:/Users/Administrator/AppData/Roaming/Typora/typora-user-images/image-20210429115442424.png?lastModify=1619675799)

2.确认合并的分支信息，是从你的工作分支合并到 main 分支

![image-20210429115613737](C:/Users/Administrator/AppData/Roaming/Typora/typora-user-images/image-20210429115613737.png)





































































