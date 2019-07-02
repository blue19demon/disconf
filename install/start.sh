#!/bin/bash

echo "启动开发环境apollo服务..."
F:/softs/apollo-master/app/runtimes/apollo/dev/configservice/configservice/scripts/startup.sh
F:/softs/apollo-master/app/runtimes/apollo/dev/adminservice/adminservice/scripts/startup.sh

echo "启动测试环境apollo服务..."
F:/softs/apollo-master/app/runtimes/apollo/sit/configservice/configservice/scripts/startup.sh
F:/softs/apollo-master/app/runtimes/apollo/sit/adminservice/adminservice/scripts/startup.sh

echo "启动UAT环境apollo服务..."
F:/softs/apollo-master/app/runtimes/apollo/uat/configservice/configservice/scripts/startup.sh
F:/softs/apollo-master/app/runtimes/apollo/uat/adminservice/adminservice/scripts/startup.sh

echo "启动PRO环境apollo服务..."
F:/softs/apollo-master/app/runtimes/apollo/pro/configservice/configservice/scripts/startup.sh
F:/softs/apollo-master/app/runtimes/apollo/pro/adminservice/adminservice/scripts/startup.sh

echo "启动apollo的protal服务..."
F:/softs/apollo-master/app/runtimes/apollo/portal/portal/scripts/startup.sh