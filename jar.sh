$JAVA_HOME/bin/jar --create --file mlib/bootstrap@1.0.jar --module-version=1.0 -C out/bootstrap .

java -Dorg.slf4j.simpleLogger.defaultLogLevel=info -mp mods:mlib -addmods spring.aop,spring.beans,spring.core,java.sql,spring.expression,spring.jdbc,spring.orm,spring.tx,slf4j.api,slf4j.simple,jcl.over.slf4j -m bootstrap/demo.bootstrapper.Main
