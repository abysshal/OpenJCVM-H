if "%OS%" == "Windows_NT" setlocal

if not "%JAVA_HOME%" == "" goto doit
	echo Please set the JAVA_HOME environment variable.
	goto end

:doit
set JC21_HOME = "..\..\..\tools"
set TOOLS_HOME = "..\..\..\tools"
set _CLASSES=.;..\..\..\tools\apduio.jar;..\..\..\tools\apdutool.jar;..\..\..\tools\converter.jar;..\..\..\tools\scriptgen.jar;..\..\..\tools\offcardverifier.jar;..\..\..\tools\capdump.jar;%CLASSPATH%;
set _CONVERTER = %JAVA_HOME%\bin\java -classpath %_CLASSES% com.sun.javacard.converter.Converter

%JAVA_HOME%\bin\javac -g java\lang\*.java
%JAVA_HOME%\bin\javac -g javacard\framework\*.java
%JAVA_HOME%\bin\javac -g javacard\security\*.java
%JAVA_HOME%\bin\javac -g javacardx\crypto\*.java
%JAVA_HOME%\bin\java -classpath %_CLASSES% com.sun.javacard.converter.Converter -config java/lang/lang.opt
%JAVA_HOME%\bin\java -classpath %_CLASSES% com.sun.javacard.converter.Converter -config javacard/framework/framework.opt
%JAVA_HOME%\bin\java -classpath %_CLASSES% com.sun.javacard.converter.Converter -config javacard/security/security.opt
%JAVA_HOME%\bin\java -classpath %_CLASSES% com.sun.javacard.converter.Converter -config javacardx/crypto/crypto.opt

%JAVA_HOME%\bin\java -classpath %_CLASSES% com.sun.javacard.jcasm.mask.Main -o..\vm_core\mask.c cref @packages.txt
goto end

:end
if "%OS%" == "Windows_NT" endlocal