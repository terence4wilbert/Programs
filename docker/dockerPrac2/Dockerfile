FROM debian:latest
MAINTAINER example@example.com

RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -yq apt-utils
RUN DEBIAN_FRONTEND=noninteractive apt-get install -yq htop
RUN apt-get clean

# CMD ["htop"]
#CMD ["ls",  "-l"]

# 3 - WORKDIR and ENV (WORKDIR - puts us into the working directory that is defined ) (ENV - enviroment and run)
WORKDIR /root
ENV DZ version1

# 4 - ADD
ADD run.sh /root/run.sh
#CMD ["./run.sh"]

# 5 - ENTRYPOINT (vs CMD)(Non overridable entry point to the program)(passed as a parameter to the entry point) one entrypoint per file.
ENTRYPOINT ["./run.sh"]
CMD ["arg1"]