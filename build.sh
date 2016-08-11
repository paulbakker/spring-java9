javac -mp mods -addmods spring.beans,spring.core -d out -modulesourcepath src $(find src -name '*.java')
cp src/bootstrap/services.xml out/bootstrap/services.xml
