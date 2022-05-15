FROM ubuntu:focal
RUN apt-get update && apt-get install -y openjdk-11-jdk openjdk-11-jre
ENV PATH="/usr/lib/jvm/java-11-openjdk-arm64:${PATH}"

WORKDIR /usr/src/DoubleSlidedApp
COPY DoubleSlidedApp /usr/src/DoubleSlidedApp
RUN javac -cp src/ src/sp/Launcher.java
CMD ["java", "-cp", "src/", "sp/Launcher"]
