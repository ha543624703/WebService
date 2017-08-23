@echo off

echo 正在启动，请稍后....
echo path:%~dp0

set base=%~dp0

set class=%base%\out\production\WebService
::set libs=%base%\lib

set class_path=%class%;%libs%\*;

java -classpath %class_path% com.hyan.service.ServiceHello
@pause