# ERPGO 系统开发使用说明

### 环境配置：

git环境，自行下载配置，

[参考]: https://blog.csdn.net/cat_hate_fish/article/details/107580495?spm=1001.2014.3001.5501



### 仓库配置及代码获取：

新建一个文件夹 ERPGO-backend 作为你的本地仓库

文件夹中右键选择 Git Bash Here 进入git 命令行界面

初始化本地仓库

```bash
git init
```
与本项目的远程仓库建立连接

```bash
git remote add origin https://github.com/software-co-design/ERPGO-backend.git
```
抓取所有远程分支，这一步会下载所有分支，会比较慢，
网络波动较大的时候可能会失败，多试几次直到成功

```bash
git fetch
```
查看所有分支，如果抓取成功，可以看到 origin/main 这个分支

``` bash
git branch -a
```

检出你所要用的分支，本项目 ERPGO-backend 以 main 为主分支，所以检出 main 分支

```bash
git checkout -b main origin/main
```

到这一步就可以看到你的 ERPGO 文件夹下已经获取到代码了，打开IDEA开始编辑吧

### 代码提交：

//TODO