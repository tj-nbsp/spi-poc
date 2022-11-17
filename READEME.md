 ## 执行
1. 将 spi-interface 生成 jar，然后给到 spi-provider 依赖；
2. 将 spi-provider 生成 jar；
3. 将 spi-interface.jar 和 scf-provider.jar 给到 spi-poc 依赖，执行 spi-poc 中的 Main 方法；