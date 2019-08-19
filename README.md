&ensp;&ensp;本项目为纳铁福报交系统后台JAVA工程

## 使用流程
1. 拷贝params_config.properties.example，为params_config.properties，并根据本地环境修改其中配置；
2. 拷贝jdbc.properties.example，为jdbc.properties，并根据开发环境修改其中配置;
3. 安装OJDBC依赖，在命令行进入项目的libs文件夹中，执行maven包安装指令
	mvn install:install-file -DgroupId=ojdbc -DartifactId=ojdbc6 -Dversion=11.2.0.4 -Dpackaging=jar -Dfile=ojdbc6.jar


## 开发规范
1. 项目前期所有开发人员再 dev 分支上进行开发；