FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY build/libs/clientapp-*-all.jar clientapp.jar
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar clientapp.jar