# 《矩阵潜袭》国服对战平台开发指南

## 简介

`netrunner-arena` 是 [mtgred/netrunner](https://github.com/mtgred/netrunner)，即 [Jinteki.net](https://www.jinteki.net/) 的国服 fork 分支。

## 分支说明

本项目的分支使用规则如下：

* `master`：主分支，不允许进行任何修改与提交。此分支仅用于同步上游改动。
* `netrunner-arena/dev`：开发分支，所有修改与提交都提交到该分支上，用于进行本地测试。
* `netrunner-arena/prod`：稳定分支，不允许进行任何修改与提交。在 `dev` 分支上验证通过的功能以及 `master` 分支上同步的上游改动合并到此分支，并定期添加 Release 发行版，用于线上生产环境部署。

## 部署流程

```shell
# 国服使用中文卡图
lein fetch --no-card-images
lein create-indexes
npm ci
npm run release
lein uberjar
```

## 启动命令

```shell
java -XX:-OmitStackTraceInFastThrow -jar target/netrunner-standalone.jar
```