# try_Cucumber

## 環境構築(WSL)

```
$ echo 'deb http://archive.ubuntu.com/ubuntu focal-updates universe' >> /etc/apt/sources.list
$ sudo apt install openjdk-17-jdk
$ java --version
openjdk 17.0.12 2024-07-16
OpenJDK Runtime Environment (build 17.0.12+7-Ubuntu-1ubuntu222.04)
OpenJDK 64-Bit Server VM (build 17.0.12+7-Ubuntu-1ubuntu222.04, mixed mode, sharing)
$ sudo apt install maven
$ mvn -v
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 17.0.12, vendor: Ubuntu, runtime: /usr/lib/jvm/java-17-openjdk-arm64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "5.15.153.1-microsoft-standard-wsl2", arch: "aarch64", family: "unix"
$
```

- VSCode には「Extension Pack for Java」を入れる

- [No arm64 support for openjdk-17-jdk?](https://askubuntu.com/questions/1483336/no-arm64-support-for-openjdk-17-jdk)
- [VSCodeでJava開発をするための環境構築方法をまとめてみた！](https://note.com/liber_grp/n/n88f3f0a6fdf1)
