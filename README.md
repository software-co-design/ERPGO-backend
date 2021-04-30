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

从 origin/main 分支创建并检出 lyw-0430 (名字缩写-日期)分支，作为你这次的代码开发分支

```bash
$ git checkout -b lyw-0430 origin/main
```

到这一步就可以看到你的 ERPGO-backend 文件夹下已经获取到代码了



## 代码编辑后推送到远程仓库：

代码编辑完成后，进入git bash环境，按照以下步骤一步步完成即可

将 工作区 的所有更改添加到 暂存区

``` bash
$ git add .
```

将 暂存区 添加的更改提交到 本地仓库，message一般填的是这次提交做了哪些更改，比如“完成登陆功能”

``` bash
$ git commit -m "message"
```

将本地分支的代码推送到远程仓库，**确定当前分支是你要推送的分支**，lyw-0430 换成你的分支名

``` bash
$ git push origin lyw-0430:lyw-0430
```



## 保持好习惯，每天编码前从仓库拉取最新代码：

切换到主分支main

``` bash
$ git checkout main
```

更新本地的主分支main

``` bash
$ git pull
```

创建并切换到新工作分支 lyw-0501 （以名称缩写-日期命名）

``` bash
$ git checkout -b lyw-0501
```

在该分支下完成代码编辑，完成任务后记得推送代码到远程仓库进行合并

> 代码推送见目录 **代码编辑后推送到远程仓库：**





## 创建 Pull Request 合并你的分支
1.new pull request

![image](https://user-images.githubusercontent.com/58586834/116671888-11b27100-a9d4-11eb-90b8-4d8e3da9cf40.png)

2.确认请求合并信息，从你的分支向main分支合并，点击create pull request即可
![image](https://user-images.githubusercontent.com/58586834/116672407-bc2a9400-a9d4-11eb-902e-a01a2abb7d3d.png)
















































